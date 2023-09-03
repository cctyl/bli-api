package bilibili.app.playerunite.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 统一视频url
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/playerunite/v1/playerunite.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlayerGrpc {

  private PlayerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.playerunite.v1.Player";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.playerunite.v1.PlayViewUniteReq,
      bilibili.app.playerunite.v1.PlayViewUniteReply> getPlayViewUniteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayViewUnite",
      requestType = bilibili.app.playerunite.v1.PlayViewUniteReq.class,
      responseType = bilibili.app.playerunite.v1.PlayViewUniteReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playerunite.v1.PlayViewUniteReq,
      bilibili.app.playerunite.v1.PlayViewUniteReply> getPlayViewUniteMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playerunite.v1.PlayViewUniteReq, bilibili.app.playerunite.v1.PlayViewUniteReply> getPlayViewUniteMethod;
    if ((getPlayViewUniteMethod = PlayerGrpc.getPlayViewUniteMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getPlayViewUniteMethod = PlayerGrpc.getPlayViewUniteMethod) == null) {
          PlayerGrpc.getPlayViewUniteMethod = getPlayViewUniteMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playerunite.v1.PlayViewUniteReq, bilibili.app.playerunite.v1.PlayViewUniteReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayViewUnite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playerunite.v1.PlayViewUniteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playerunite.v1.PlayViewUniteReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("PlayViewUnite"))
              .build();
        }
      }
    }
    return getPlayViewUniteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerStub>() {
        @java.lang.Override
        public PlayerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerStub(channel, callOptions);
        }
      };
    return PlayerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerBlockingStub>() {
        @java.lang.Override
        public PlayerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerBlockingStub(channel, callOptions);
        }
      };
    return PlayerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerFutureStub>() {
        @java.lang.Override
        public PlayerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerFutureStub(channel, callOptions);
        }
      };
    return PlayerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 统一视频url
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 视频地址
     * </pre>
     */
    default void playViewUnite(bilibili.app.playerunite.v1.PlayViewUniteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playerunite.v1.PlayViewUniteReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayViewUniteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Player.
   * <pre>
   * 统一视频url
   * </pre>
   */
  public static abstract class PlayerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PlayerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Player.
   * <pre>
   * 统一视频url
   * </pre>
   */
  public static final class PlayerStub
      extends io.grpc.stub.AbstractAsyncStub<PlayerStub> {
    private PlayerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频地址
     * </pre>
     */
    public void playViewUnite(bilibili.app.playerunite.v1.PlayViewUniteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playerunite.v1.PlayViewUniteReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayViewUniteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Player.
   * <pre>
   * 统一视频url
   * </pre>
   */
  public static final class PlayerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PlayerBlockingStub> {
    private PlayerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频地址
     * </pre>
     */
    public bilibili.app.playerunite.v1.PlayViewUniteReply playViewUnite(bilibili.app.playerunite.v1.PlayViewUniteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayViewUniteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Player.
   * <pre>
   * 统一视频url
   * </pre>
   */
  public static final class PlayerFutureStub
      extends io.grpc.stub.AbstractFutureStub<PlayerFutureStub> {
    private PlayerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频地址
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playerunite.v1.PlayViewUniteReply> playViewUnite(
        bilibili.app.playerunite.v1.PlayViewUniteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayViewUniteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY_VIEW_UNITE = 0;

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
        case METHODID_PLAY_VIEW_UNITE:
          serviceImpl.playViewUnite((bilibili.app.playerunite.v1.PlayViewUniteReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playerunite.v1.PlayViewUniteReply>) responseObserver);
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
          getPlayViewUniteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playerunite.v1.PlayViewUniteReq,
              bilibili.app.playerunite.v1.PlayViewUniteReply>(
                service, METHODID_PLAY_VIEW_UNITE)))
        .build();
  }

  private static abstract class PlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.playerunite.v1.Playerunite.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Player");
    }
  }

  private static final class PlayerFileDescriptorSupplier
      extends PlayerBaseDescriptorSupplier {
    PlayerFileDescriptorSupplier() {}
  }

  private static final class PlayerMethodDescriptorSupplier
      extends PlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PlayerMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PlayerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerFileDescriptorSupplier())
              .addMethod(getPlayViewUniteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
