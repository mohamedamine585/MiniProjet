package io.grpc.examples.chatservice;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;



import java.util.ArrayList;
import java.util.List;

public class ChatServiceServer {
    private Server server;

    private void start() throws Exception {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new ChatServiceImpl())
                .build()
                .start();

        System.out.println("Server started, listening on port " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** Shutting down gRPC server since JVM is shutting down");
            ChatServiceServer.this.stop();
            System.err.println("*** Server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {
        final ChatServiceServer server = new ChatServiceServer();
        server.start();
        server.blockUntilShutdown();
    }

    private static class ChatServiceImpl extends ChatserviceGrpc.ChatserviceImplBase {
        ArrayList<Message> messages = new ArrayList<>(10000);
        @Override
        public void sendMessage(SendMessageRequest request, StreamObserver<SendMessageResponse> responseObserver) {
            messages.add(request.getMessage());

            SendMessageResponse response = SendMessageResponse.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getMessages(GetMessageRequest request, StreamObserver<GetMessageResponse> responseObserver) {
            int userid = request.getUserid();
            List<Message> UsermessagesList = new ArrayList<>();
            for(Message message : messages ){
                if(message.getRecieverid() == userid){
                    UsermessagesList.add(message);
                }
            }
            GetMessageResponse response = GetMessageResponse.newBuilder()
                    .addAllMessages(UsermessagesList)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
