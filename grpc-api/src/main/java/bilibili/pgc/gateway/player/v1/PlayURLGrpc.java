package bilibili.pgc.gateway.player.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 播放地址
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/pgc/gateway/player/v1/playurl.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlayURLGrpc {

  private PlayURLGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.pgc.gateway.player.v1.PlayURL";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq,
      bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply> getPlayViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayView",
      requestType = bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq.class,
      responseType = bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq,
      bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply> getPlayViewMethod() {
    io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq, bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply> getPlayViewMethod;
    if ((getPlayViewMethod = PlayURLGrpc.getPlayViewMethod) == null) {
      synchronized (PlayURLGrpc.class) {
        if ((getPlayViewMethod = PlayURLGrpc.getPlayViewMethod) == null) {
          PlayURLGrpc.getPlayViewMethod = getPlayViewMethod =
              io.grpc.MethodDescriptor.<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq, bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayURLMethodDescriptorSupplier("PlayView"))
              .build();
        }
      }
    }
    return getPlayViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq,
      bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply> getProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Project",
      requestType = bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq.class,
      responseType = bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq,
      bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply> getProjectMethod() {
    io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq, bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply> getProjectMethod;
    if ((getProjectMethod = PlayURLGrpc.getProjectMethod) == null) {
      synchronized (PlayURLGrpc.class) {
        if ((getProjectMethod = PlayURLGrpc.getProjectMethod) == null) {
          PlayURLGrpc.getProjectMethod = getProjectMethod =
              io.grpc.MethodDescriptor.<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq, bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Project"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayURLMethodDescriptorSupplier("Project"))
              .build();
        }
      }
    }
    return getProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq,
      bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply> getLivePlayViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LivePlayView",
      requestType = bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq.class,
      responseType = bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq,
      bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply> getLivePlayViewMethod() {
    io.grpc.MethodDescriptor<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq, bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply> getLivePlayViewMethod;
    if ((getLivePlayViewMethod = PlayURLGrpc.getLivePlayViewMethod) == null) {
      synchronized (PlayURLGrpc.class) {
        if ((getLivePlayViewMethod = PlayURLGrpc.getLivePlayViewMethod) == null) {
          PlayURLGrpc.getLivePlayViewMethod = getLivePlayViewMethod =
              io.grpc.MethodDescriptor.<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq, bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LivePlayView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayURLMethodDescriptorSupplier("LivePlayView"))
              .build();
        }
      }
    }
    return getLivePlayViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayURLStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayURLStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayURLStub>() {
        @java.lang.Override
        public PlayURLStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayURLStub(channel, callOptions);
        }
      };
    return PlayURLStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayURLBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayURLBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayURLBlockingStub>() {
        @java.lang.Override
        public PlayURLBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayURLBlockingStub(channel, callOptions);
        }
      };
    return PlayURLBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayURLFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayURLFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayURLFutureStub>() {
        @java.lang.Override
        public PlayURLFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayURLFutureStub(channel, callOptions);
        }
      };
    return PlayURLFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 播放地址
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 播放页信息
     * </pre>
     */
    default void playView(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq request,
        io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayViewMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取投屏地址
     * </pre>
     */
    default void project(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq request,
        io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * 直播播放页信息
     * </pre>
     */
    default void livePlayView(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq request,
        io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLivePlayViewMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PlayURL.
   * <pre>
   * 播放地址
   * </pre>
   */
  public static abstract class PlayURLImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PlayURLGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PlayURL.
   * <pre>
   * 播放地址
   * </pre>
   */
  public static final class PlayURLStub
      extends io.grpc.stub.AbstractAsyncStub<PlayURLStub> {
    private PlayURLStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayURLStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayURLStub(channel, callOptions);
    }

    /**
     * <pre>
     * 播放页信息
     * </pre>
     */
    public void playView(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq request,
        io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取投屏地址
     * </pre>
     */
    public void project(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq request,
        io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 直播播放页信息
     * </pre>
     */
    public void livePlayView(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq request,
        io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLivePlayViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PlayURL.
   * <pre>
   * 播放地址
   * </pre>
   */
  public static final class PlayURLBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PlayURLBlockingStub> {
    private PlayURLBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayURLBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayURLBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 播放页信息
     * </pre>
     */
    public bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply playView(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayViewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取投屏地址
     * </pre>
     */
    public bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply project(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 直播播放页信息
     * </pre>
     */
    public bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply livePlayView(bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLivePlayViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PlayURL.
   * <pre>
   * 播放地址
   * </pre>
   */
  public static final class PlayURLFutureStub
      extends io.grpc.stub.AbstractFutureStub<PlayURLFutureStub> {
    private PlayURLFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayURLFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayURLFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 播放页信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply> playView(
        bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayViewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取投屏地址
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply> project(
        bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 直播播放页信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply> livePlayView(
        bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLivePlayViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY_VIEW = 0;
  private static final int METHODID_PROJECT = 1;
  private static final int METHODID_LIVE_PLAY_VIEW = 2;

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
        case METHODID_PLAY_VIEW:
          serviceImpl.playView((bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply>) responseObserver);
          break;
        case METHODID_PROJECT:
          serviceImpl.project((bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply>) responseObserver);
          break;
        case METHODID_LIVE_PLAY_VIEW:
          serviceImpl.livePlayView((bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply>) responseObserver);
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
          getPlayViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReq,
              bilibili.pgc.gateway.player.v1.PlayurlRpcProto.PlayViewReply>(
                service, METHODID_PLAY_VIEW)))
        .addMethod(
          getProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReq,
              bilibili.pgc.gateway.player.v1.PlayurlRpcProto.ProjectReply>(
                service, METHODID_PROJECT)))
        .addMethod(
          getLivePlayViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReq,
              bilibili.pgc.gateway.player.v1.PlayurlRpcProto.LivePlayViewReply>(
                service, METHODID_LIVE_PLAY_VIEW)))
        .build();
  }

  private static abstract class PlayURLBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayURLBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.pgc.gateway.player.v1.PlayurlRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlayURL");
    }
  }

  private static final class PlayURLFileDescriptorSupplier
      extends PlayURLBaseDescriptorSupplier {
    PlayURLFileDescriptorSupplier() {}
  }

  private static final class PlayURLMethodDescriptorSupplier
      extends PlayURLBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PlayURLMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PlayURLGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayURLFileDescriptorSupplier())
              .addMethod(getPlayViewMethod())
              .addMethod(getProjectMethod())
              .addMethod(getLivePlayViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
