// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package io.grpc.examples.chatservice;

public interface GetMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chatservice.GetMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chatservice.Message messages = 1;</code>
   */
  java.util.List<io.grpc.examples.chatservice.Message> 
      getMessagesList();
  /**
   * <code>repeated .chatservice.Message messages = 1;</code>
   */
  io.grpc.examples.chatservice.Message getMessages(int index);
  /**
   * <code>repeated .chatservice.Message messages = 1;</code>
   */
  int getMessagesCount();
  /**
   * <code>repeated .chatservice.Message messages = 1;</code>
   */
  java.util.List<? extends io.grpc.examples.chatservice.MessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <code>repeated .chatservice.Message messages = 1;</code>
   */
  io.grpc.examples.chatservice.MessageOrBuilder getMessagesOrBuilder(
      int index);
}
