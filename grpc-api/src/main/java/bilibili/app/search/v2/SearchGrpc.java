package bilibili.app.search.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/search/v2/search.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchGrpc {

  private SearchGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.search.v2.Search";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq,
      bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply> getCancelChatTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelChatTask",
      requestType = bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq.class,
      responseType = bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq,
      bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply> getCancelChatTaskMethod() {
    io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq, bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply> getCancelChatTaskMethod;
    if ((getCancelChatTaskMethod = SearchGrpc.getCancelChatTaskMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getCancelChatTaskMethod = SearchGrpc.getCancelChatTaskMethod) == null) {
          SearchGrpc.getCancelChatTaskMethod = getCancelChatTaskMethod =
              io.grpc.MethodDescriptor.<bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq, bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelChatTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("CancelChatTask"))
              .build();
        }
      }
    }
    return getCancelChatTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.GetChatResultReq,
      bilibili.broadcast.message.main.SearchRpcProto.ChatResult> getGetChatResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChatResult",
      requestType = bilibili.app.search.v2.SearchRpcProto.GetChatResultReq.class,
      responseType = bilibili.broadcast.message.main.SearchRpcProto.ChatResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.GetChatResultReq,
      bilibili.broadcast.message.main.SearchRpcProto.ChatResult> getGetChatResultMethod() {
    io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.GetChatResultReq, bilibili.broadcast.message.main.SearchRpcProto.ChatResult> getGetChatResultMethod;
    if ((getGetChatResultMethod = SearchGrpc.getGetChatResultMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getGetChatResultMethod = SearchGrpc.getGetChatResultMethod) == null) {
          SearchGrpc.getGetChatResultMethod = getGetChatResultMethod =
              io.grpc.MethodDescriptor.<bilibili.app.search.v2.SearchRpcProto.GetChatResultReq, bilibili.broadcast.message.main.SearchRpcProto.ChatResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChatResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.search.v2.SearchRpcProto.GetChatResultReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.main.SearchRpcProto.ChatResult.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("GetChatResult"))
              .build();
        }
      }
    }
    return getGetChatResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.SearchEggReq,
      bilibili.app.search.v2.SearchRpcProto.SearchEggReply> getSearchEggMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchEgg",
      requestType = bilibili.app.search.v2.SearchRpcProto.SearchEggReq.class,
      responseType = bilibili.app.search.v2.SearchRpcProto.SearchEggReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.SearchEggReq,
      bilibili.app.search.v2.SearchRpcProto.SearchEggReply> getSearchEggMethod() {
    io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.SearchEggReq, bilibili.app.search.v2.SearchRpcProto.SearchEggReply> getSearchEggMethod;
    if ((getSearchEggMethod = SearchGrpc.getSearchEggMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSearchEggMethod = SearchGrpc.getSearchEggMethod) == null) {
          SearchGrpc.getSearchEggMethod = getSearchEggMethod =
              io.grpc.MethodDescriptor.<bilibili.app.search.v2.SearchRpcProto.SearchEggReq, bilibili.app.search.v2.SearchRpcProto.SearchEggReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchEgg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.search.v2.SearchRpcProto.SearchEggReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.search.v2.SearchRpcProto.SearchEggReply.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("SearchEgg"))
              .build();
        }
      }
    }
    return getSearchEggMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq,
      bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply> getSubmitChatTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitChatTask",
      requestType = bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq.class,
      responseType = bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq,
      bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply> getSubmitChatTaskMethod() {
    io.grpc.MethodDescriptor<bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq, bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply> getSubmitChatTaskMethod;
    if ((getSubmitChatTaskMethod = SearchGrpc.getSubmitChatTaskMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSubmitChatTaskMethod = SearchGrpc.getSubmitChatTaskMethod) == null) {
          SearchGrpc.getSubmitChatTaskMethod = getSubmitChatTaskMethod =
              io.grpc.MethodDescriptor.<bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq, bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitChatTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("SubmitChatTask"))
              .build();
        }
      }
    }
    return getSubmitChatTaskMethod;
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
     * <pre>
     * 
     * </pre>
     */
    default void cancelChatTask(bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq request,
        io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelChatTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void getChatResult(bilibili.app.search.v2.SearchRpcProto.GetChatResultReq request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.SearchRpcProto.ChatResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChatResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void searchEgg(bilibili.app.search.v2.SearchRpcProto.SearchEggReq request,
        io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.SearchEggReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchEggMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void submitChatTask(bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq request,
        io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitChatTaskMethod(), responseObserver);
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
     * <pre>
     * 
     * </pre>
     */
    public void cancelChatTask(bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq request,
        io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelChatTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void getChatResult(bilibili.app.search.v2.SearchRpcProto.GetChatResultReq request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.SearchRpcProto.ChatResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChatResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void searchEgg(bilibili.app.search.v2.SearchRpcProto.SearchEggReq request,
        io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.SearchEggReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchEggMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void submitChatTask(bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq request,
        io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitChatTaskMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply cancelChatTask(bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelChatTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.broadcast.message.main.SearchRpcProto.ChatResult getChatResult(bilibili.app.search.v2.SearchRpcProto.GetChatResultReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChatResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.search.v2.SearchRpcProto.SearchEggReply searchEgg(bilibili.app.search.v2.SearchRpcProto.SearchEggReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchEggMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply submitChatTask(bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitChatTaskMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply> cancelChatTask(
        bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelChatTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.broadcast.message.main.SearchRpcProto.ChatResult> getChatResult(
        bilibili.app.search.v2.SearchRpcProto.GetChatResultReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChatResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.search.v2.SearchRpcProto.SearchEggReply> searchEgg(
        bilibili.app.search.v2.SearchRpcProto.SearchEggReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchEggMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply> submitChatTask(
        bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitChatTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CANCEL_CHAT_TASK = 0;
  private static final int METHODID_GET_CHAT_RESULT = 1;
  private static final int METHODID_SEARCH_EGG = 2;
  private static final int METHODID_SUBMIT_CHAT_TASK = 3;

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
        case METHODID_CANCEL_CHAT_TASK:
          serviceImpl.cancelChatTask((bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply>) responseObserver);
          break;
        case METHODID_GET_CHAT_RESULT:
          serviceImpl.getChatResult((bilibili.app.search.v2.SearchRpcProto.GetChatResultReq) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.SearchRpcProto.ChatResult>) responseObserver);
          break;
        case METHODID_SEARCH_EGG:
          serviceImpl.searchEgg((bilibili.app.search.v2.SearchRpcProto.SearchEggReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.SearchEggReply>) responseObserver);
          break;
        case METHODID_SUBMIT_CHAT_TASK:
          serviceImpl.submitChatTask((bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply>) responseObserver);
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
          getCancelChatTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReq,
              bilibili.app.search.v2.SearchRpcProto.CancelChatTaskReply>(
                service, METHODID_CANCEL_CHAT_TASK)))
        .addMethod(
          getGetChatResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.search.v2.SearchRpcProto.GetChatResultReq,
              bilibili.broadcast.message.main.SearchRpcProto.ChatResult>(
                service, METHODID_GET_CHAT_RESULT)))
        .addMethod(
          getSearchEggMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.search.v2.SearchRpcProto.SearchEggReq,
              bilibili.app.search.v2.SearchRpcProto.SearchEggReply>(
                service, METHODID_SEARCH_EGG)))
        .addMethod(
          getSubmitChatTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReq,
              bilibili.app.search.v2.SearchRpcProto.SubmitChatTaskReply>(
                service, METHODID_SUBMIT_CHAT_TASK)))
        .build();
  }

  private static abstract class SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.search.v2.SearchRpcProto.getDescriptor();
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
              .addMethod(getCancelChatTaskMethod())
              .addMethod(getGetChatResultMethod())
              .addMethod(getSearchEggMethod())
              .addMethod(getSubmitChatTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
