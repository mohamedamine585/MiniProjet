package io.grpc.examples.chatservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: chat.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChatserviceGrpc {

  private ChatserviceGrpc() {}

  public static final String SERVICE_NAME = "chatservice.Chatservice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chatservice.SendMessageRequest,
      io.grpc.examples.chatservice.SendMessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = io.grpc.examples.chatservice.SendMessageRequest.class,
      responseType = io.grpc.examples.chatservice.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chatservice.SendMessageRequest,
      io.grpc.examples.chatservice.SendMessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chatservice.SendMessageRequest, io.grpc.examples.chatservice.SendMessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = ChatserviceGrpc.getSendMessageMethod) == null) {
      synchronized (ChatserviceGrpc.class) {
        if ((getSendMessageMethod = ChatserviceGrpc.getSendMessageMethod) == null) {
          ChatserviceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.chatservice.SendMessageRequest, io.grpc.examples.chatservice.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatservice.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatservice.SendMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatserviceMethodDescriptorSupplier("SendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chatservice.GetMessageRequest,
      io.grpc.examples.chatservice.GetMessageResponse> getGetMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessages",
      requestType = io.grpc.examples.chatservice.GetMessageRequest.class,
      responseType = io.grpc.examples.chatservice.GetMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chatservice.GetMessageRequest,
      io.grpc.examples.chatservice.GetMessageResponse> getGetMessagesMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chatservice.GetMessageRequest, io.grpc.examples.chatservice.GetMessageResponse> getGetMessagesMethod;
    if ((getGetMessagesMethod = ChatserviceGrpc.getGetMessagesMethod) == null) {
      synchronized (ChatserviceGrpc.class) {
        if ((getGetMessagesMethod = ChatserviceGrpc.getGetMessagesMethod) == null) {
          ChatserviceGrpc.getGetMessagesMethod = getGetMessagesMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.chatservice.GetMessageRequest, io.grpc.examples.chatservice.GetMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatservice.GetMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatservice.GetMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatserviceMethodDescriptorSupplier("GetMessages"))
              .build();
        }
      }
    }
    return getGetMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatserviceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatserviceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatserviceStub>() {
        @java.lang.Override
        public ChatserviceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatserviceStub(channel, callOptions);
        }
      };
    return ChatserviceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatserviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatserviceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatserviceBlockingStub>() {
        @java.lang.Override
        public ChatserviceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatserviceBlockingStub(channel, callOptions);
        }
      };
    return ChatserviceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatserviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatserviceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatserviceFutureStub>() {
        @java.lang.Override
        public ChatserviceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatserviceFutureStub(channel, callOptions);
        }
      };
    return ChatserviceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendMessage(io.grpc.examples.chatservice.SendMessageRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatservice.SendMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     */
    default void getMessages(io.grpc.examples.chatservice.GetMessageRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatservice.GetMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Chatservice.
   */
  public static abstract class ChatserviceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ChatserviceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Chatservice.
   */
  public static final class ChatserviceStub
      extends io.grpc.stub.AbstractAsyncStub<ChatserviceStub> {
    private ChatserviceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatserviceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatserviceStub(channel, callOptions);
    }

    /**
     */
    public void sendMessage(io.grpc.examples.chatservice.SendMessageRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatservice.SendMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessages(io.grpc.examples.chatservice.GetMessageRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatservice.GetMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Chatservice.
   */
  public static final class ChatserviceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ChatserviceBlockingStub> {
    private ChatserviceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatserviceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatserviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.chatservice.SendMessageResponse sendMessage(io.grpc.examples.chatservice.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.chatservice.GetMessageResponse getMessages(io.grpc.examples.chatservice.GetMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Chatservice.
   */
  public static final class ChatserviceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ChatserviceFutureStub> {
    private ChatserviceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatserviceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatserviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chatservice.SendMessageResponse> sendMessage(
        io.grpc.examples.chatservice.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chatservice.GetMessageResponse> getMessages(
        io.grpc.examples.chatservice.GetMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_GET_MESSAGES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((io.grpc.examples.chatservice.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chatservice.SendMessageResponse>) responseObserver);
          break;
        case METHODID_GET_MESSAGES:
          serviceImpl.getMessages((io.grpc.examples.chatservice.GetMessageRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chatservice.GetMessageResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSendMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.chatservice.SendMessageRequest,
              io.grpc.examples.chatservice.SendMessageResponse>(
                service, METHODID_SEND_MESSAGE)))
        .addMethod(
          getGetMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.chatservice.GetMessageRequest,
              io.grpc.examples.chatservice.GetMessageResponse>(
                service, METHODID_GET_MESSAGES)))
        .build();
  }

  private static abstract class ChatserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatserviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.chatservice.ChatProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Chatservice");
    }
  }

  private static final class ChatserviceFileDescriptorSupplier
      extends ChatserviceBaseDescriptorSupplier {
    ChatserviceFileDescriptorSupplier() {}
  }

  private static final class ChatserviceMethodDescriptorSupplier
      extends ChatserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatserviceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatserviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatserviceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getGetMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
