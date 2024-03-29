
# Grpc Chat Application

This is a simple chat application implemented using gRPC, where clients can send messages to each other and receive messages sent to them.

Usage

1-Connect to the server:


1-Choose the "Send Message" option in the client application.
Enter the receiver's user ID and the message text when prompted.
Receive messages:

2-Choose the "Get Messages" option in the client application.
Enter your user ID to retrieve messages sent to you.


# Sockets: Chat Server
Chat Server and Client Application

This Java application implements a simple chat server and client using UDP and socket communication. Clients can connect to the server using either UDP or socket-based protocols to exchange messages in a chat room environment.

Usage

Run the client Application and type message to broadcast to room

# RMI Task Management Application

This project demonstrates a simple implementation of a task list using Java RMI (Remote Method Invocation). The project consists of two main classes: RMIClient for the client-side and RMIServer for the server-side.

Usage
Once the RMI server and client are running, follow the prompts on the client-side command line interface (CLI) to interact with the task list. Available commands are:

ajouter: Add a task to the list.
supprimer: Remove a task from the list.
liste: View the list of tasks.
exit: Exit the program.

Code Overview
RMIClient.java: This class handles the client-side logic. It connects to the RMI server, reads user input, and communicates with the remote task list object.
RMIServer.java: This class implements the RMI server. It creates a registry, instantiates the task list implementation (TaskListImpl), and binds it to the registry for remote access.
TaskList.java and TaskListImpl.java: These interface and implementation classes define the methods for managing tasks in the list.