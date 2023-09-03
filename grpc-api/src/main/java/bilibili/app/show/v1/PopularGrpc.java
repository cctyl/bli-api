package bilibili.app.show.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 热门
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/show/popular/v1/popular.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PopularGrpc {

  private PopularGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.show.v1.Popular";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.show.v1.PopularResultReq,
      bilibili.app.show.v1.PopularReply> getIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Index",
      requestType = bilibili.app.show.v1.PopularResultReq.class,
      responseType = bilibili.app.show.v1.PopularReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.show.v1.PopularResultReq,
      bilibili.app.show.v1.PopularReply> getIndexMethod() {
    io.grpc.MethodDescriptor<bilibili.app.show.v1.PopularResultReq, bilibili.app.show.v1.PopularReply> getIndexMethod;
    if ((getIndexMethod = PopularGrpc.getIndexMethod) == null) {
      synchronized (PopularGrpc.class) {
        if ((getIndexMethod = PopularGrpc.getIndexMethod) == null) {
          PopularGrpc.getIndexMethod = getIndexMethod =
              io.grpc.MethodDescriptor.<bilibili.app.show.v1.PopularResultReq, bilibili.app.show.v1.PopularReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Index"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.v1.PopularResultReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.v1.PopularReply.getDefaultInstance()))
              .setSchemaDescriptor(new PopularMethodDescriptorSupplier("Index"))
              .build();
        }
      }
    }
    return getIndexMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PopularStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PopularStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PopularStub>() {
        @java.lang.Override
        public PopularStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PopularStub(channel, callOptions);
        }
      };
    return PopularStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PopularBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PopularBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PopularBlockingStub>() {
        @java.lang.Override
        public PopularBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PopularBlockingStub(channel, callOptions);
        }
      };
    return PopularBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PopularFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PopularFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PopularFutureStub>() {
        @java.lang.Override
        public PopularFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PopularFutureStub(channel, callOptions);
        }
      };
    return PopularFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 热门
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 热门列表
     * </pre>
     */
    default void index(bilibili.app.show.v1.PopularResultReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.v1.PopularReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Popular.
   * <pre>
   * 热门
   * </pre>
   */
  public static abstract class PopularImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PopularGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Popular.
   * <pre>
   * 热门
   * </pre>
   */
  public static final class PopularStub
      extends io.grpc.stub.AbstractAsyncStub<PopularStub> {
    private PopularStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PopularStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PopularStub(channel, callOptions);
    }

    /**
     * <pre>
     * 热门列表
     * </pre>
     */
    public void index(bilibili.app.show.v1.PopularResultReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.v1.PopularReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Popular.
   * <pre>
   * 热门
   * </pre>
   */
  public static final class PopularBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PopularBlockingStub> {
    private PopularBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PopularBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PopularBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 热门列表
     * </pre>
     */
    public bilibili.app.show.v1.PopularReply index(bilibili.app.show.v1.PopularResultReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Popular.
   * <pre>
   * 热门
   * </pre>
   */
  public static final class PopularFutureStub
      extends io.grpc.stub.AbstractFutureStub<PopularFutureStub> {
    private PopularFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PopularFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PopularFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 热门列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.show.v1.PopularReply> index(
        bilibili.app.show.v1.PopularResultReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INDEX = 0;

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
        case METHODID_INDEX:
          serviceImpl.index((bilibili.app.show.v1.PopularResultReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.show.v1.PopularReply>) responseObserver);
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
          getIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.show.v1.PopularResultReq,
              bilibili.app.show.v1.PopularReply>(
                service, METHODID_INDEX)))
        .build();
  }

  private static abstract class PopularBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PopularBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.show.v1.PopularOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Popular");
    }
  }

  private static final class PopularFileDescriptorSupplier
      extends PopularBaseDescriptorSupplier {
    PopularFileDescriptorSupplier() {}
  }

  private static final class PopularMethodDescriptorSupplier
      extends PopularBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PopularMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PopularGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PopularFileDescriptorSupplier())
              .addMethod(getIndexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
