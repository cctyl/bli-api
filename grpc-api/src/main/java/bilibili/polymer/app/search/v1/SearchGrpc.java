package bilibili.polymer.app.search.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/polymer/app/search/v1/search.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchGrpc {

  private SearchGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.polymer.app.search.v1.Search";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchAllRequest,
      bilibili.polymer.app.search.v1.SearchAllResponse> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = bilibili.polymer.app.search.v1.SearchAllRequest.class,
      responseType = bilibili.polymer.app.search.v1.SearchAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchAllRequest,
      bilibili.polymer.app.search.v1.SearchAllResponse> getSearchAllMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchAllRequest, bilibili.polymer.app.search.v1.SearchAllResponse> getSearchAllMethod;
    if ((getSearchAllMethod = SearchGrpc.getSearchAllMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSearchAllMethod = SearchGrpc.getSearchAllMethod) == null) {
          SearchGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.app.search.v1.SearchAllRequest, bilibili.polymer.app.search.v1.SearchAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.search.v1.SearchAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.search.v1.SearchAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchByTypeRequest,
      bilibili.polymer.app.search.v1.SearchByTypeResponse> getSearchByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByType",
      requestType = bilibili.polymer.app.search.v1.SearchByTypeRequest.class,
      responseType = bilibili.polymer.app.search.v1.SearchByTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchByTypeRequest,
      bilibili.polymer.app.search.v1.SearchByTypeResponse> getSearchByTypeMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchByTypeRequest, bilibili.polymer.app.search.v1.SearchByTypeResponse> getSearchByTypeMethod;
    if ((getSearchByTypeMethod = SearchGrpc.getSearchByTypeMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSearchByTypeMethod = SearchGrpc.getSearchByTypeMethod) == null) {
          SearchGrpc.getSearchByTypeMethod = getSearchByTypeMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.app.search.v1.SearchByTypeRequest, bilibili.polymer.app.search.v1.SearchByTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.search.v1.SearchByTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.search.v1.SearchByTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("SearchByType"))
              .build();
        }
      }
    }
    return getSearchByTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchComicRequest,
      bilibili.polymer.app.search.v1.SearchComicResponse> getSearchComicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchComic",
      requestType = bilibili.polymer.app.search.v1.SearchComicRequest.class,
      responseType = bilibili.polymer.app.search.v1.SearchComicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchComicRequest,
      bilibili.polymer.app.search.v1.SearchComicResponse> getSearchComicMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.app.search.v1.SearchComicRequest, bilibili.polymer.app.search.v1.SearchComicResponse> getSearchComicMethod;
    if ((getSearchComicMethod = SearchGrpc.getSearchComicMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSearchComicMethod = SearchGrpc.getSearchComicMethod) == null) {
          SearchGrpc.getSearchComicMethod = getSearchComicMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.app.search.v1.SearchComicRequest, bilibili.polymer.app.search.v1.SearchComicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchComic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.search.v1.SearchComicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.search.v1.SearchComicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("SearchComic"))
              .build();
        }
      }
    }
    return getSearchComicMethod;
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
     * 搜索所有类型结果
     * </pre>
     */
    default void searchAll(bilibili.polymer.app.search.v1.SearchAllRequest request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * 搜索指定类型结果
     * </pre>
     */
    default void searchByType(bilibili.polymer.app.search.v1.SearchByTypeRequest request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchByTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchByTypeMethod(), responseObserver);
    }

    /**
     */
    default void searchComic(bilibili.polymer.app.search.v1.SearchComicRequest request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchComicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchComicMethod(), responseObserver);
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
     * 搜索所有类型结果
     * </pre>
     */
    public void searchAll(bilibili.polymer.app.search.v1.SearchAllRequest request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索指定类型结果
     * </pre>
     */
    public void searchByType(bilibili.polymer.app.search.v1.SearchByTypeRequest request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchByTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchByTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchComic(bilibili.polymer.app.search.v1.SearchComicRequest request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchComicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchComicMethod(), getCallOptions()), request, responseObserver);
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
     * 搜索所有类型结果
     * </pre>
     */
    public bilibili.polymer.app.search.v1.SearchAllResponse searchAll(bilibili.polymer.app.search.v1.SearchAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索指定类型结果
     * </pre>
     */
    public bilibili.polymer.app.search.v1.SearchByTypeResponse searchByType(bilibili.polymer.app.search.v1.SearchByTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchByTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.polymer.app.search.v1.SearchComicResponse searchComic(bilibili.polymer.app.search.v1.SearchComicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchComicMethod(), getCallOptions(), request);
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
     * 搜索所有类型结果
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.app.search.v1.SearchAllResponse> searchAll(
        bilibili.polymer.app.search.v1.SearchAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索指定类型结果
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.app.search.v1.SearchByTypeResponse> searchByType(
        bilibili.polymer.app.search.v1.SearchByTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchByTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.app.search.v1.SearchComicResponse> searchComic(
        bilibili.polymer.app.search.v1.SearchComicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchComicMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_ALL = 0;
  private static final int METHODID_SEARCH_BY_TYPE = 1;
  private static final int METHODID_SEARCH_COMIC = 2;

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
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((bilibili.polymer.app.search.v1.SearchAllRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchAllResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_TYPE:
          serviceImpl.searchByType((bilibili.polymer.app.search.v1.SearchByTypeRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchByTypeResponse>) responseObserver);
          break;
        case METHODID_SEARCH_COMIC:
          serviceImpl.searchComic((bilibili.polymer.app.search.v1.SearchComicRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.app.search.v1.SearchComicResponse>) responseObserver);
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
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.app.search.v1.SearchAllRequest,
              bilibili.polymer.app.search.v1.SearchAllResponse>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getSearchByTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.app.search.v1.SearchByTypeRequest,
              bilibili.polymer.app.search.v1.SearchByTypeResponse>(
                service, METHODID_SEARCH_BY_TYPE)))
        .addMethod(
          getSearchComicMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.app.search.v1.SearchComicRequest,
              bilibili.polymer.app.search.v1.SearchComicResponse>(
                service, METHODID_SEARCH_COMIC)))
        .build();
  }

  private static abstract class SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.getDescriptor();
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
              .addMethod(getSearchAllMethod())
              .addMethod(getSearchByTypeMethod())
              .addMethod(getSearchComicMethod())
              .build();
        }
      }
    }
    return result;
  }
}
