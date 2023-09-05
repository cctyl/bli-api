package bilibili.app.show.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 排行榜
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/show/rank/v1/rank.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RankGrpc {

  private RankGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.show.v1.Rank";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.show.v1.RankRpcProto.RankAllResultReq,
      bilibili.app.show.v1.RankRpcProto.RankListReply> getRankAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RankAll",
      requestType = bilibili.app.show.v1.RankRpcProto.RankAllResultReq.class,
      responseType = bilibili.app.show.v1.RankRpcProto.RankListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.show.v1.RankRpcProto.RankAllResultReq,
      bilibili.app.show.v1.RankRpcProto.RankListReply> getRankAllMethod() {
    io.grpc.MethodDescriptor<bilibili.app.show.v1.RankRpcProto.RankAllResultReq, bilibili.app.show.v1.RankRpcProto.RankListReply> getRankAllMethod;
    if ((getRankAllMethod = RankGrpc.getRankAllMethod) == null) {
      synchronized (RankGrpc.class) {
        if ((getRankAllMethod = RankGrpc.getRankAllMethod) == null) {
          RankGrpc.getRankAllMethod = getRankAllMethod =
              io.grpc.MethodDescriptor.<bilibili.app.show.v1.RankRpcProto.RankAllResultReq, bilibili.app.show.v1.RankRpcProto.RankListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RankAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.v1.RankRpcProto.RankAllResultReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.v1.RankRpcProto.RankListReply.getDefaultInstance()))
              .setSchemaDescriptor(new RankMethodDescriptorSupplier("RankAll"))
              .build();
        }
      }
    }
    return getRankAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.show.v1.RankRpcProto.RankRegionResultReq,
      bilibili.app.show.v1.RankRpcProto.RankListReply> getRankRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RankRegion",
      requestType = bilibili.app.show.v1.RankRpcProto.RankRegionResultReq.class,
      responseType = bilibili.app.show.v1.RankRpcProto.RankListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.show.v1.RankRpcProto.RankRegionResultReq,
      bilibili.app.show.v1.RankRpcProto.RankListReply> getRankRegionMethod() {
    io.grpc.MethodDescriptor<bilibili.app.show.v1.RankRpcProto.RankRegionResultReq, bilibili.app.show.v1.RankRpcProto.RankListReply> getRankRegionMethod;
    if ((getRankRegionMethod = RankGrpc.getRankRegionMethod) == null) {
      synchronized (RankGrpc.class) {
        if ((getRankRegionMethod = RankGrpc.getRankRegionMethod) == null) {
          RankGrpc.getRankRegionMethod = getRankRegionMethod =
              io.grpc.MethodDescriptor.<bilibili.app.show.v1.RankRpcProto.RankRegionResultReq, bilibili.app.show.v1.RankRpcProto.RankListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RankRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.v1.RankRpcProto.RankRegionResultReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.v1.RankRpcProto.RankListReply.getDefaultInstance()))
              .setSchemaDescriptor(new RankMethodDescriptorSupplier("RankRegion"))
              .build();
        }
      }
    }
    return getRankRegionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RankStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RankStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RankStub>() {
        @java.lang.Override
        public RankStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RankStub(channel, callOptions);
        }
      };
    return RankStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RankBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RankBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RankBlockingStub>() {
        @java.lang.Override
        public RankBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RankBlockingStub(channel, callOptions);
        }
      };
    return RankBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RankFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RankFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RankFutureStub>() {
        @java.lang.Override
        public RankFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RankFutureStub(channel, callOptions);
        }
      };
    return RankFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 排行榜
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 全站排行榜
     * </pre>
     */
    default void rankAll(bilibili.app.show.v1.RankRpcProto.RankAllResultReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.v1.RankRpcProto.RankListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRankAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * 分区排行榜
     * </pre>
     */
    default void rankRegion(bilibili.app.show.v1.RankRpcProto.RankRegionResultReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.v1.RankRpcProto.RankListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRankRegionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Rank.
   * <pre>
   * 排行榜
   * </pre>
   */
  public static abstract class RankImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RankGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Rank.
   * <pre>
   * 排行榜
   * </pre>
   */
  public static final class RankStub
      extends io.grpc.stub.AbstractAsyncStub<RankStub> {
    private RankStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RankStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RankStub(channel, callOptions);
    }

    /**
     * <pre>
     * 全站排行榜
     * </pre>
     */
    public void rankAll(bilibili.app.show.v1.RankRpcProto.RankAllResultReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.v1.RankRpcProto.RankListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRankAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 分区排行榜
     * </pre>
     */
    public void rankRegion(bilibili.app.show.v1.RankRpcProto.RankRegionResultReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.v1.RankRpcProto.RankListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRankRegionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Rank.
   * <pre>
   * 排行榜
   * </pre>
   */
  public static final class RankBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RankBlockingStub> {
    private RankBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RankBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RankBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 全站排行榜
     * </pre>
     */
    public bilibili.app.show.v1.RankRpcProto.RankListReply rankAll(bilibili.app.show.v1.RankRpcProto.RankAllResultReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRankAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 分区排行榜
     * </pre>
     */
    public bilibili.app.show.v1.RankRpcProto.RankListReply rankRegion(bilibili.app.show.v1.RankRpcProto.RankRegionResultReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRankRegionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Rank.
   * <pre>
   * 排行榜
   * </pre>
   */
  public static final class RankFutureStub
      extends io.grpc.stub.AbstractFutureStub<RankFutureStub> {
    private RankFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RankFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RankFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 全站排行榜
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.show.v1.RankRpcProto.RankListReply> rankAll(
        bilibili.app.show.v1.RankRpcProto.RankAllResultReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRankAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 分区排行榜
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.show.v1.RankRpcProto.RankListReply> rankRegion(
        bilibili.app.show.v1.RankRpcProto.RankRegionResultReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRankRegionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RANK_ALL = 0;
  private static final int METHODID_RANK_REGION = 1;

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
        case METHODID_RANK_ALL:
          serviceImpl.rankAll((bilibili.app.show.v1.RankRpcProto.RankAllResultReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.show.v1.RankRpcProto.RankListReply>) responseObserver);
          break;
        case METHODID_RANK_REGION:
          serviceImpl.rankRegion((bilibili.app.show.v1.RankRpcProto.RankRegionResultReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.show.v1.RankRpcProto.RankListReply>) responseObserver);
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
          getRankAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.show.v1.RankRpcProto.RankAllResultReq,
              bilibili.app.show.v1.RankRpcProto.RankListReply>(
                service, METHODID_RANK_ALL)))
        .addMethod(
          getRankRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.show.v1.RankRpcProto.RankRegionResultReq,
              bilibili.app.show.v1.RankRpcProto.RankListReply>(
                service, METHODID_RANK_REGION)))
        .build();
  }

  private static abstract class RankBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RankBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.show.v1.RankRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rank");
    }
  }

  private static final class RankFileDescriptorSupplier
      extends RankBaseDescriptorSupplier {
    RankFileDescriptorSupplier() {}
  }

  private static final class RankMethodDescriptorSupplier
      extends RankBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RankMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RankGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RankFileDescriptorSupplier())
              .addMethod(getRankAllMethod())
              .addMethod(getRankRegionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
