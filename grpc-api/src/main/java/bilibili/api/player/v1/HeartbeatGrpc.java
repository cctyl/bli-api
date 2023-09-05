package bilibili.api.player.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 心跳上报
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/api/player/v1/player.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HeartbeatGrpc {

  private HeartbeatGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.api.player.v1.Heartbeat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq,
      bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply> getMobileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mobile",
      requestType = bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq.class,
      responseType = bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq,
      bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply> getMobileMethod() {
    io.grpc.MethodDescriptor<bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq, bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply> getMobileMethod;
    if ((getMobileMethod = HeartbeatGrpc.getMobileMethod) == null) {
      synchronized (HeartbeatGrpc.class) {
        if ((getMobileMethod = HeartbeatGrpc.getMobileMethod) == null) {
          HeartbeatGrpc.getMobileMethod = getMobileMethod =
              io.grpc.MethodDescriptor.<bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq, bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mobile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply.getDefaultInstance()))
              .setSchemaDescriptor(new HeartbeatMethodDescriptorSupplier("Mobile"))
              .build();
        }
      }
    }
    return getMobileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeartbeatStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartbeatStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartbeatStub>() {
        @java.lang.Override
        public HeartbeatStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartbeatStub(channel, callOptions);
        }
      };
    return HeartbeatStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeartbeatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartbeatBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartbeatBlockingStub>() {
        @java.lang.Override
        public HeartbeatBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartbeatBlockingStub(channel, callOptions);
        }
      };
    return HeartbeatBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeartbeatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartbeatFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartbeatFutureStub>() {
        @java.lang.Override
        public HeartbeatFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartbeatFutureStub(channel, callOptions);
        }
      };
    return HeartbeatFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 心跳上报
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 客户端心跳上报
     * </pre>
     */
    default void mobile(bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq request,
        io.grpc.stub.StreamObserver<bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMobileMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Heartbeat.
   * <pre>
   * 心跳上报
   * </pre>
   */
  public static abstract class HeartbeatImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HeartbeatGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Heartbeat.
   * <pre>
   * 心跳上报
   * </pre>
   */
  public static final class HeartbeatStub
      extends io.grpc.stub.AbstractAsyncStub<HeartbeatStub> {
    private HeartbeatStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartbeatStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartbeatStub(channel, callOptions);
    }

    /**
     * <pre>
     * 客户端心跳上报
     * </pre>
     */
    public void mobile(bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq request,
        io.grpc.stub.StreamObserver<bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMobileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Heartbeat.
   * <pre>
   * 心跳上报
   * </pre>
   */
  public static final class HeartbeatBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HeartbeatBlockingStub> {
    private HeartbeatBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartbeatBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartbeatBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 客户端心跳上报
     * </pre>
     */
    public bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply mobile(bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMobileMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Heartbeat.
   * <pre>
   * 心跳上报
   * </pre>
   */
  public static final class HeartbeatFutureStub
      extends io.grpc.stub.AbstractFutureStub<HeartbeatFutureStub> {
    private HeartbeatFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartbeatFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartbeatFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 客户端心跳上报
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply> mobile(
        bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMobileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOBILE = 0;

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
        case METHODID_MOBILE:
          serviceImpl.mobile((bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq) request,
              (io.grpc.stub.StreamObserver<bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply>) responseObserver);
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
          getMobileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.player.v1.PlayerRpcProto.HeartbeatReq,
              bilibili.api.player.v1.PlayerRpcProto.HeartbeatReply>(
                service, METHODID_MOBILE)))
        .build();
  }

  private static abstract class HeartbeatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeartbeatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.api.player.v1.PlayerRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Heartbeat");
    }
  }

  private static final class HeartbeatFileDescriptorSupplier
      extends HeartbeatBaseDescriptorSupplier {
    HeartbeatFileDescriptorSupplier() {}
  }

  private static final class HeartbeatMethodDescriptorSupplier
      extends HeartbeatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HeartbeatMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HeartbeatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeartbeatFileDescriptorSupplier())
              .addMethod(getMobileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
