package bilibili.app.playeronline.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 在线人数
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/playeronline/v1/playeronline.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlayerOnlineGrpc {

  private PlayerOnlineGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.playeronline.v1.PlayerOnline";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq,
      bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply> getPlayerOnlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayerOnline",
      requestType = bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq.class,
      responseType = bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq,
      bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply> getPlayerOnlineMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq, bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply> getPlayerOnlineMethod;
    if ((getPlayerOnlineMethod = PlayerOnlineGrpc.getPlayerOnlineMethod) == null) {
      synchronized (PlayerOnlineGrpc.class) {
        if ((getPlayerOnlineMethod = PlayerOnlineGrpc.getPlayerOnlineMethod) == null) {
          PlayerOnlineGrpc.getPlayerOnlineMethod = getPlayerOnlineMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq, bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayerOnline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerOnlineMethodDescriptorSupplier("PlayerOnline"))
              .build();
        }
      }
    }
    return getPlayerOnlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq,
      bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply> getPremiereInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PremiereInfo",
      requestType = bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq.class,
      responseType = bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq,
      bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply> getPremiereInfoMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq, bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply> getPremiereInfoMethod;
    if ((getPremiereInfoMethod = PlayerOnlineGrpc.getPremiereInfoMethod) == null) {
      synchronized (PlayerOnlineGrpc.class) {
        if ((getPremiereInfoMethod = PlayerOnlineGrpc.getPremiereInfoMethod) == null) {
          PlayerOnlineGrpc.getPremiereInfoMethod = getPremiereInfoMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq, bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PremiereInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerOnlineMethodDescriptorSupplier("PremiereInfo"))
              .build();
        }
      }
    }
    return getPremiereInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq,
      bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply> getReportWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportWatch",
      requestType = bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq.class,
      responseType = bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq,
      bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply> getReportWatchMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq, bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply> getReportWatchMethod;
    if ((getReportWatchMethod = PlayerOnlineGrpc.getReportWatchMethod) == null) {
      synchronized (PlayerOnlineGrpc.class) {
        if ((getReportWatchMethod = PlayerOnlineGrpc.getReportWatchMethod) == null) {
          PlayerOnlineGrpc.getReportWatchMethod = getReportWatchMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq, bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportWatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerOnlineMethodDescriptorSupplier("ReportWatch"))
              .build();
        }
      }
    }
    return getReportWatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerOnlineStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerOnlineStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerOnlineStub>() {
        @java.lang.Override
        public PlayerOnlineStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerOnlineStub(channel, callOptions);
        }
      };
    return PlayerOnlineStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerOnlineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerOnlineBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerOnlineBlockingStub>() {
        @java.lang.Override
        public PlayerOnlineBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerOnlineBlockingStub(channel, callOptions);
        }
      };
    return PlayerOnlineBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerOnlineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerOnlineFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerOnlineFutureStub>() {
        @java.lang.Override
        public PlayerOnlineFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerOnlineFutureStub(channel, callOptions);
        }
      };
    return PlayerOnlineFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 在线人数
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取在线人数
     * </pre>
     */
    default void playerOnline(bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayerOnlineMethod(), responseObserver);
    }

    /**
     */
    default void premiereInfo(bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPremiereInfoMethod(), responseObserver);
    }

    /**
     */
    default void reportWatch(bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportWatchMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PlayerOnline.
   * <pre>
   * 在线人数
   * </pre>
   */
  public static abstract class PlayerOnlineImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PlayerOnlineGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PlayerOnline.
   * <pre>
   * 在线人数
   * </pre>
   */
  public static final class PlayerOnlineStub
      extends io.grpc.stub.AbstractAsyncStub<PlayerOnlineStub> {
    private PlayerOnlineStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerOnlineStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerOnlineStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取在线人数
     * </pre>
     */
    public void playerOnline(bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayerOnlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void premiereInfo(bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPremiereInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reportWatch(bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportWatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PlayerOnline.
   * <pre>
   * 在线人数
   * </pre>
   */
  public static final class PlayerOnlineBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PlayerOnlineBlockingStub> {
    private PlayerOnlineBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerOnlineBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerOnlineBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取在线人数
     * </pre>
     */
    public bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply playerOnline(bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayerOnlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply premiereInfo(bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPremiereInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply reportWatch(bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportWatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PlayerOnline.
   * <pre>
   * 在线人数
   * </pre>
   */
  public static final class PlayerOnlineFutureStub
      extends io.grpc.stub.AbstractFutureStub<PlayerOnlineFutureStub> {
    private PlayerOnlineFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerOnlineFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerOnlineFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取在线人数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply> playerOnline(
        bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayerOnlineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply> premiereInfo(
        bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPremiereInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply> reportWatch(
        bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportWatchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAYER_ONLINE = 0;
  private static final int METHODID_PREMIERE_INFO = 1;
  private static final int METHODID_REPORT_WATCH = 2;

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
        case METHODID_PLAYER_ONLINE:
          serviceImpl.playerOnline((bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply>) responseObserver);
          break;
        case METHODID_PREMIERE_INFO:
          serviceImpl.premiereInfo((bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply>) responseObserver);
          break;
        case METHODID_REPORT_WATCH:
          serviceImpl.reportWatch((bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply>) responseObserver);
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
          getPlayerOnlineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReq,
              bilibili.app.playeronline.v1.PlayeronlineRpcProto.PlayerOnlineReply>(
                service, METHODID_PLAYER_ONLINE)))
        .addMethod(
          getPremiereInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReq,
              bilibili.app.playeronline.v1.PlayeronlineRpcProto.PremiereInfoReply>(
                service, METHODID_PREMIERE_INFO)))
        .addMethod(
          getReportWatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playeronline.v1.PlayeronlineRpcProto.ReportWatchReq,
              bilibili.app.playeronline.v1.PlayeronlineRpcProto.NoReply>(
                service, METHODID_REPORT_WATCH)))
        .build();
  }

  private static abstract class PlayerOnlineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerOnlineBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.playeronline.v1.PlayeronlineRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlayerOnline");
    }
  }

  private static final class PlayerOnlineFileDescriptorSupplier
      extends PlayerOnlineBaseDescriptorSupplier {
    PlayerOnlineFileDescriptorSupplier() {}
  }

  private static final class PlayerOnlineMethodDescriptorSupplier
      extends PlayerOnlineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PlayerOnlineMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PlayerOnlineGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerOnlineFileDescriptorSupplier())
              .addMethod(getPlayerOnlineMethod())
              .addMethod(getPremiereInfoMethod())
              .addMethod(getReportWatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
