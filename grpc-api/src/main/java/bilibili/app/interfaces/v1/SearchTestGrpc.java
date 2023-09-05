package bilibili.app.interfaces.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/interfaces/v1/search.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchTestGrpc {

  private SearchTestGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.interfaces.v1.SearchTest";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req,
      bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> getNotExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotExist",
      requestType = bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req.class,
      responseType = bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req,
      bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> getNotExistMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req, bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> getNotExistMethod;
    if ((getNotExistMethod = SearchTestGrpc.getNotExistMethod) == null) {
      synchronized (SearchTestGrpc.class) {
        if ((getNotExistMethod = SearchTestGrpc.getNotExistMethod) == null) {
          SearchTestGrpc.getNotExistMethod = getNotExistMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req, bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply.getDefaultInstance()))
              .setSchemaDescriptor(new SearchTestMethodDescriptorSupplier("NotExist"))
              .build();
        }
      }
    }
    return getNotExistMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchTestStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchTestStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchTestStub>() {
        @java.lang.Override
        public SearchTestStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchTestStub(channel, callOptions);
        }
      };
    return SearchTestStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchTestBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchTestBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchTestBlockingStub>() {
        @java.lang.Override
        public SearchTestBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchTestBlockingStub(channel, callOptions);
        }
      };
    return SearchTestBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchTestFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchTestFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchTestFutureStub>() {
        @java.lang.Override
        public SearchTestFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchTestFutureStub(channel, callOptions);
        }
      };
    return SearchTestFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void notExist(bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req request,
        io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotExistMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SearchTest.
   */
  public static abstract class SearchTestImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SearchTestGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SearchTest.
   */
  public static final class SearchTestStub
      extends io.grpc.stub.AbstractAsyncStub<SearchTestStub> {
    private SearchTestStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTestStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchTestStub(channel, callOptions);
    }

    /**
     */
    public void notExist(bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req request,
        io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotExistMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SearchTest.
   */
  public static final class SearchTestBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SearchTestBlockingStub> {
    private SearchTestBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTestBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchTestBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply notExist(bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotExistMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SearchTest.
   */
  public static final class SearchTestFutureStub
      extends io.grpc.stub.AbstractFutureStub<SearchTestFutureStub> {
    private SearchTestFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTestFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchTestFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply> notExist(
        bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotExistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOT_EXIST = 0;

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
        case METHODID_NOT_EXIST:
          serviceImpl.notExist((bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply>) responseObserver);
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
          getNotExistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Req,
              bilibili.app.interfaces.v1.SearchRpcProto.SuggestionResult3Reply>(
                service, METHODID_NOT_EXIST)))
        .build();
  }

  private static abstract class SearchTestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchTestBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.interfaces.v1.SearchRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchTest");
    }
  }

  private static final class SearchTestFileDescriptorSupplier
      extends SearchTestBaseDescriptorSupplier {
    SearchTestFileDescriptorSupplier() {}
  }

  private static final class SearchTestMethodDescriptorSupplier
      extends SearchTestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SearchTestMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SearchTestGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchTestFileDescriptorSupplier())
              .addMethod(getNotExistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
