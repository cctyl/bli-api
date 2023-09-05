package bilibili.app.interfaces.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 搜索
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/interfaces/v1/search.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchGrpc {

  private SearchGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.interfaces.v1.Search";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req,
      bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> getSuggest3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suggest3",
      requestType = bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req.class,
      responseType = bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req,
      bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> getSuggest3Method() {
    io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req, bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> getSuggest3Method;
    if ((getSuggest3Method = SearchGrpc.getSuggest3Method) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSuggest3Method = SearchGrpc.getSuggest3Method) == null) {
          SearchGrpc.getSuggest3Method = getSuggest3Method =
              io.grpc.MethodDescriptor.<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req, bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Suggest3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("Suggest3"))
              .build();
        }
      }
    }
    return getSuggest3Method;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq,
      bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply> getDefaultWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefaultWords",
      requestType = bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq.class,
      responseType = bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq,
      bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply> getDefaultWordsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq, bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply> getDefaultWordsMethod;
    if ((getDefaultWordsMethod = SearchGrpc.getDefaultWordsMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getDefaultWordsMethod = SearchGrpc.getDefaultWordsMethod) == null) {
          SearchGrpc.getDefaultWordsMethod = getDefaultWordsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq, bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DefaultWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("DefaultWords"))
              .build();
        }
      }
    }
    return getDefaultWordsMethod;
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
   * <pre>
   * 搜索
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取搜索建议
     * </pre>
     */
    default void suggest3(bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req request,
        io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggest3Method(), responseObserver);
    }

    /**
     */
    default void defaultWords(bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefaultWordsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Search.
   * <pre>
   * 搜索
   * </pre>
   */
  public static abstract class SearchImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SearchGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Search.
   * <pre>
   * 搜索
   * </pre>
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
     * 获取搜索建议
     * </pre>
     */
    public void suggest3(bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req request,
        io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggest3Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void defaultWords(bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefaultWordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Search.
   * <pre>
   * 搜索
   * </pre>
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
     * 获取搜索建议
     * </pre>
     */
    public bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply suggest3(bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggest3Method(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply defaultWords(bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefaultWordsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Search.
   * <pre>
   * 搜索
   * </pre>
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
     * 获取搜索建议
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> suggest3(
        bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggest3Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply> defaultWords(
        bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefaultWordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST3 = 0;
  private static final int METHODID_DEFAULT_WORDS = 1;

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
        case METHODID_SUGGEST3:
          serviceImpl.suggest3((bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply>) responseObserver);
          break;
        case METHODID_DEFAULT_WORDS:
          serviceImpl.defaultWords((bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply>) responseObserver);
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
          getSuggest3Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req,
              bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply>(
                service, METHODID_SUGGEST3)))
        .addMethod(
          getDefaultWordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReq,
              bilibili.app.interfaces.v1.SearchRpcProto.DefaultWordsReply>(
                service, METHODID_DEFAULT_WORDS)))
        .build();
  }

  private static abstract class SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.interfaces.v1.SearchRpcProto.getDescriptor();
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
              .addMethod(getSuggest3Method())
              .addMethod(getDefaultWordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
