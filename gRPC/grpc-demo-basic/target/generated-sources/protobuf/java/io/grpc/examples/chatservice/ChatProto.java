// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package io.grpc.examples.chatservice;

public final class ChatProto {
  private ChatProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_SendMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chatservice_SendMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_SendMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chatservice_SendMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_GetMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chatservice_GetMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_GetMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chatservice_GetMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chatservice_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nchat.proto\022\013chatservice\";\n\022SendMessage" +
      "Request\022%\n\007message\030\001 \001(\0132\024.chatservice.M" +
      "essage\"%\n\023SendMessageResponse\022\016\n\006userid\030" +
      "\001 \001(\t\"#\n\021GetMessageRequest\022\016\n\006userid\030\001 \001" +
      "(\005\"<\n\022GetMessageResponse\022&\n\010messages\030\001 \003" +
      "(\0132\024.chatservice.Message\"+\n\007Message\022\022\n\nr" +
      "ecieverid\030\002 \001(\005\022\014\n\004text\030\003 \001(\t2\263\001\n\013Chatse" +
      "rvice\022R\n\013SendMessage\022\037.chatservice.SendM" +
      "essageRequest\032 .chatservice.SendMessageR" +
      "esponse\"\000\022P\n\013GetMessages\022\036.chatservice.G" +
      "etMessageRequest\032\037.chatservice.GetMessag" +
      "eResponse\"\000B2\n\034io.grpc.examples.chatserv" +
      "iceB\tChatProtoP\001\242\002\004Chatb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_chatservice_SendMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chatservice_SendMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chatservice_SendMessageRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_chatservice_SendMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chatservice_SendMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chatservice_SendMessageResponse_descriptor,
        new java.lang.String[] { "Userid", });
    internal_static_chatservice_GetMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chatservice_GetMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chatservice_GetMessageRequest_descriptor,
        new java.lang.String[] { "Userid", });
    internal_static_chatservice_GetMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chatservice_GetMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chatservice_GetMessageResponse_descriptor,
        new java.lang.String[] { "Messages", });
    internal_static_chatservice_Message_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chatservice_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chatservice_Message_descriptor,
        new java.lang.String[] { "Recieverid", "Text", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}