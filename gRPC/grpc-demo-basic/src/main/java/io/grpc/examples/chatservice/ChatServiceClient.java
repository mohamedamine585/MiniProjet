package io.grpc.examples.chatservice;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Scanner;

public class ChatServiceClient {
    private final ManagedChannel channel;
    private final ChatserviceGrpc.ChatserviceBlockingStub blockingStub;

    public ChatServiceClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = ChatserviceGrpc.newBlockingStub(channel);
    }

    public void sendMessage(Message message) {
        SendMessageRequest request = SendMessageRequest.newBuilder()
                .setMessage(message)
                .build();

        try {
            SendMessageResponse response = blockingStub.sendMessage(request);
            System.out.println("Message sent successfully");
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void getMessages(int userId) {
        GetMessageRequest request = GetMessageRequest.newBuilder()
                .setUserid(userId)
                .build();

        try {
            GetMessageResponse response = blockingStub.getMessages(request);
            System.out.println("Messages received from server:");
            for (Message message : response.getMessagesList()) {
                System.out.println("Sender ID: " + message.getRecieverid());
                System.out.println("Text: " + message.getText());
            }
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void shutdown() {
        channel.shutdown();
    }

    public static void main(String[] args) {
        ChatServiceClient client = new ChatServiceClient("localhost", 50051);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Send message");
            System.out.println("2. Receive messages");
            System.out.println("3. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (option == 1) {
                System.out.println("Enter receiver ID:");
                int receiverId = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                System.out.println("Enter message text:");
                String text = scanner.nextLine();

                Message message = Message.newBuilder()
                        .setRecieverid(receiverId)
                        .setText(text)
                        .build();

                client.sendMessage(message);
            } else if (option == 2) {
                System.out.println("Enter your user ID:");
                int userId = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                client.getMessages(userId);
            } else if (option == 3) {
                client.shutdown();
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
