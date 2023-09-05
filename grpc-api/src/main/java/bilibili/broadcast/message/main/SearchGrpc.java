package bilibili.broadcast.message.main;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/message/main/search.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchGrpc {

  private SearchGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.message.main.Search";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.main.SearchRpcProto.ChatResult> getChatResultPushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChatResultPush",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.main.SearchRpcProto.ChatResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.main.SearchRpcProto.ChatResult> getChatResultPushMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.main.SearchRpcProto.ChatResult> getChatResultPushMethod;
    if ((getChatResultPushMethod = SearchGrpc.getChatResultPushMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getChatResultPushMethod = SearchGrpc.getChatResultPushMethod) == null) {
          SearchGrpc.getChatResultPushMethod = getChatResultPushMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.main.SearchRpcProto.ChatResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChatResultPush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.main.SearchRpcProto.ChatResult.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("ChatResultPush"))
              .build();
        }
      }
    }
    return getChatResultPushMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchStub>() {
        @java.lang.Override
        public SearchStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchStub(channel, callOptions);
        }
      };
    return SearchStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchBlockingStub>() {
        @java.lang.Override
        public SearchBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchBlockingStub(channel, callOptions);
        }
      };
    return SearchBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchFutureStub>() {
        @java.lang.Override
        public SearchFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchFutureStub(channel, callOptions);
        }
      };
    return SearchFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void chatResultPush(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.SearchRpcProto.ChatResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChatResultPushMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Search.
   */
  public static abstract class SearchImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SearchGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Search.
   */
  public static final class SearchStub
      extends io.grpc.stub.AbstractAsyncStub<SearchStub> {
    private SearchStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchStub(channel, callOptions);
    }

    /**
     */
    public void chatResultPush(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.SearchRpcProto.ChatResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getChatResultPushMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Search.
   */
  public static final class SearchBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SearchBlockingStub> {
    private SearchBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<bilibili.broadcast.message.main.SearchRpcProto.ChatResult> chatResultPush(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getChatResultPushMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Search.
   */
  public static final class SearchFutureStub
      extends io.grpc.stub.AbstractFutureStub<SearchFutureStub> {
    private SearchFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHAT_RESULT_PUSH = 0;

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
        case METHODID_CHAT_RESULT_PUSH:
          serviceImpl.chatResultPush((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.SearchRpcProto.ChatResult>) responseObserver);
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
          getChatResultPushMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.main.SearchRpcProto.ChatResult>(
                service, METHODID_CHAT_RESULT_PUSH)))
        .build();
  }

  private static abstract class SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.message.main.SearchRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Search");
    }
  }

  private static final class SearchFileDescriptorSupplier
      extends SearchBaseDescriptorSupplier {
    SearchFileDescriptorSupplier() {}
  }

  private static final class SearchMethodDescriptorSupplier
      extends SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SearchMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SearchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchFileDescriptorSupplier())
              .addMethod(getChatResultPushMethod())
              .build();
        }
      }
    }
    return result;
  }
}
