package bilibili.broadcast.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * broadcast操作，对应每个target_path
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/v1/broadcast.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BroadcastGrpc {

  private BroadcastGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.v1.Broadcast";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.broadcast.v1.AuthReq,
      bilibili.broadcast.v1.AuthResp> getAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Auth",
      requestType = bilibili.broadcast.v1.AuthReq.class,
      responseType = bilibili.broadcast.v1.AuthResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.broadcast.v1.AuthReq,
      bilibili.broadcast.v1.AuthResp> getAuthMethod() {
    io.grpc.MethodDescriptor<bilibili.broadcast.v1.AuthReq, bilibili.broadcast.v1.AuthResp> getAuthMethod;
    if ((getAuthMethod = BroadcastGrpc.getAuthMethod) == null) {
      synchronized (BroadcastGrpc.class) {
        if ((getAuthMethod = BroadcastGrpc.getAuthMethod) == null) {
          BroadcastGrpc.getAuthMethod = getAuthMethod =
              io.grpc.MethodDescriptor.<bilibili.broadcast.v1.AuthReq, bilibili.broadcast.v1.AuthResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Auth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.AuthReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.AuthResp.getDefaultInstance()))
              .setSchemaDescriptor(new BroadcastMethodDescriptorSupplier("Auth"))
              .build();
        }
      }
    }
    return getAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.broadcast.v1.HeartbeatReq,
      bilibili.broadcast.v1.HeartbeatResp> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heartbeat",
      requestType = bilibili.broadcast.v1.HeartbeatReq.class,
      responseType = bilibili.broadcast.v1.HeartbeatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.broadcast.v1.HeartbeatReq,
      bilibili.broadcast.v1.HeartbeatResp> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<bilibili.broadcast.v1.HeartbeatReq, bilibili.broadcast.v1.HeartbeatResp> getHeartbeatMethod;
    if ((getHeartbeatMethod = BroadcastGrpc.getHeartbeatMethod) == null) {
      synchronized (BroadcastGrpc.class) {
        if ((getHeartbeatMethod = BroadcastGrpc.getHeartbeatMethod) == null) {
          BroadcastGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<bilibili.broadcast.v1.HeartbeatReq, bilibili.broadcast.v1.HeartbeatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.HeartbeatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.HeartbeatResp.getDefaultInstance()))
              .setSchemaDescriptor(new BroadcastMethodDescriptorSupplier("Heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.broadcast.v1.TargetPath,
      com.google.protobuf.Empty> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = bilibili.broadcast.v1.TargetPath.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.broadcast.v1.TargetPath,
      com.google.protobuf.Empty> getSubscribeMethod() {
    io.grpc.MethodDescriptor<bilibili.broadcast.v1.TargetPath, com.google.protobuf.Empty> getSubscribeMethod;
    if ((getSubscribeMethod = BroadcastGrpc.getSubscribeMethod) == null) {
      synchronized (BroadcastGrpc.class) {
        if ((getSubscribeMethod = BroadcastGrpc.getSubscribeMethod) == null) {
          BroadcastGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<bilibili.broadcast.v1.TargetPath, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.TargetPath.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new BroadcastMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.broadcast.v1.TargetPath,
      com.google.protobuf.Empty> getUnsubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unsubscribe",
      requestType = bilibili.broadcast.v1.TargetPath.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.broadcast.v1.TargetPath,
      com.google.protobuf.Empty> getUnsubscribeMethod() {
    io.grpc.MethodDescriptor<bilibili.broadcast.v1.TargetPath, com.google.protobuf.Empty> getUnsubscribeMethod;
    if ((getUnsubscribeMethod = BroadcastGrpc.getUnsubscribeMethod) == null) {
      synchronized (BroadcastGrpc.class) {
        if ((getUnsubscribeMethod = BroadcastGrpc.getUnsubscribeMethod) == null) {
          BroadcastGrpc.getUnsubscribeMethod = getUnsubscribeMethod =
              io.grpc.MethodDescriptor.<bilibili.broadcast.v1.TargetPath, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unsubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.TargetPath.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new BroadcastMethodDescriptorSupplier("Unsubscribe"))
              .build();
        }
      }
    }
    return getUnsubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.broadcast.v1.MessageAckReq,
      com.google.protobuf.Empty> getMessageAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MessageAck",
      requestType = bilibili.broadcast.v1.MessageAckReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.broadcast.v1.MessageAckReq,
      com.google.protobuf.Empty> getMessageAckMethod() {
    io.grpc.MethodDescriptor<bilibili.broadcast.v1.MessageAckReq, com.google.protobuf.Empty> getMessageAckMethod;
    if ((getMessageAckMethod = BroadcastGrpc.getMessageAckMethod) == null) {
      synchronized (BroadcastGrpc.class) {
        if ((getMessageAckMethod = BroadcastGrpc.getMessageAckMethod) == null) {
          BroadcastGrpc.getMessageAckMethod = getMessageAckMethod =
              io.grpc.MethodDescriptor.<bilibili.broadcast.v1.MessageAckReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MessageAck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.MessageAckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new BroadcastMethodDescriptorSupplier("MessageAck"))
              .build();
        }
      }
    }
    return getMessageAckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BroadcastStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastStub>() {
        @java.lang.Override
        public BroadcastStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastStub(channel, callOptions);
        }
      };
    return BroadcastStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BroadcastBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastBlockingStub>() {
        @java.lang.Override
        public BroadcastBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastBlockingStub(channel, callOptions);
        }
      };
    return BroadcastBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BroadcastFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastFutureStub>() {
        @java.lang.Override
        public BroadcastFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastFutureStub(channel, callOptions);
        }
      };
    return BroadcastFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * broadcast操作，对应每个target_path
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 用户鉴权
     * </pre>
     */
    default void auth(bilibili.broadcast.v1.AuthReq request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.AuthResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthMethod(), responseObserver);
    }

    /**
     * <pre>
     * 心跳保活：成功心跳为4分45秒，重试心跳为30s，三次收不到进行重连（不超过5分45）
     * </pre>
     */
    default void heartbeat(bilibili.broadcast.v1.HeartbeatReq request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.HeartbeatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     * <pre>
     * 订阅target_path
     * </pre>
     */
    default void subscribe(bilibili.broadcast.v1.TargetPath request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 取消订阅target_path
     * </pre>
     */
    default void unsubscribe(bilibili.broadcast.v1.TargetPath request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 消息回执
     * </pre>
     */
    default void messageAck(bilibili.broadcast.v1.MessageAckReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMessageAckMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Broadcast.
   * <pre>
   * broadcast操作，对应每个target_path
   * </pre>
   */
  public static abstract class BroadcastImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BroadcastGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Broadcast.
   * <pre>
   * broadcast操作，对应每个target_path
   * </pre>
   */
  public static final class BroadcastStub
      extends io.grpc.stub.AbstractAsyncStub<BroadcastStub> {
    private BroadcastStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用户鉴权
     * </pre>
     */
    public void auth(bilibili.broadcast.v1.AuthReq request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.AuthResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 心跳保活：成功心跳为4分45秒，重试心跳为30s，三次收不到进行重连（不超过5分45）
     * </pre>
     */
    public void heartbeat(bilibili.broadcast.v1.HeartbeatReq request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.HeartbeatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 订阅target_path
     * </pre>
     */
    public void subscribe(bilibili.broadcast.v1.TargetPath request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 取消订阅target_path
     * </pre>
     */
    public void unsubscribe(bilibili.broadcast.v1.TargetPath request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 消息回执
     * </pre>
     */
    public void messageAck(bilibili.broadcast.v1.MessageAckReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMessageAckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Broadcast.
   * <pre>
   * broadcast操作，对应每个target_path
   * </pre>
   */
  public static final class BroadcastBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BroadcastBlockingStub> {
    private BroadcastBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用户鉴权
     * </pre>
     */
    public bilibili.broadcast.v1.AuthResp auth(bilibili.broadcast.v1.AuthReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 心跳保活：成功心跳为4分45秒，重试心跳为30s，三次收不到进行重连（不超过5分45）
     * </pre>
     */
    public bilibili.broadcast.v1.HeartbeatResp heartbeat(bilibili.broadcast.v1.HeartbeatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 订阅target_path
     * </pre>
     */
    public com.google.protobuf.Empty subscribe(bilibili.broadcast.v1.TargetPath request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消订阅target_path
     * </pre>
     */
    public com.google.protobuf.Empty unsubscribe(bilibili.broadcast.v1.TargetPath request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 消息回执
     * </pre>
     */
    public com.google.protobuf.Empty messageAck(bilibili.broadcast.v1.MessageAckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMessageAckMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Broadcast.
   * <pre>
   * broadcast操作，对应每个target_path
   * </pre>
   */
  public static final class BroadcastFutureStub
      extends io.grpc.stub.AbstractFutureStub<BroadcastFutureStub> {
    private BroadcastFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用户鉴权
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.broadcast.v1.AuthResp> auth(
        bilibili.broadcast.v1.AuthReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 心跳保活：成功心跳为4分45秒，重试心跳为30s，三次收不到进行重连（不超过5分45）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.broadcast.v1.HeartbeatResp> heartbeat(
        bilibili.broadcast.v1.HeartbeatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 订阅target_path
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> subscribe(
        bilibili.broadcast.v1.TargetPath request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 取消订阅target_path
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unsubscribe(
        bilibili.broadcast.v1.TargetPath request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsubscribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 消息回执
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> messageAck(
        bilibili.broadcast.v1.MessageAckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMessageAckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH = 0;
  private static final int METHODID_HEARTBEAT = 1;
  private static final int METHODID_SUBSCRIBE = 2;
  private static final int METHODID_UNSUBSCRIBE = 3;
  private static final int METHODID_MESSAGE_ACK = 4;

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
        case METHODID_AUTH:
          serviceImpl.auth((bilibili.broadcast.v1.AuthReq) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.v1.AuthResp>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((bilibili.broadcast.v1.HeartbeatReq) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.v1.HeartbeatResp>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((bilibili.broadcast.v1.TargetPath) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE:
          serviceImpl.unsubscribe((bilibili.broadcast.v1.TargetPath) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MESSAGE_ACK:
          serviceImpl.messageAck((bilibili.broadcast.v1.MessageAckReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getAuthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.broadcast.v1.AuthReq,
              bilibili.broadcast.v1.AuthResp>(
                service, METHODID_AUTH)))
        .addMethod(
          getHeartbeatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.broadcast.v1.HeartbeatReq,
              bilibili.broadcast.v1.HeartbeatResp>(
                service, METHODID_HEARTBEAT)))
        .addMethod(
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.broadcast.v1.TargetPath,
              com.google.protobuf.Empty>(
                service, METHODID_SUBSCRIBE)))
        .addMethod(
          getUnsubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.broadcast.v1.TargetPath,
              com.google.protobuf.Empty>(
                service, METHODID_UNSUBSCRIBE)))
        .addMethod(
          getMessageAckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.broadcast.v1.MessageAckReq,
              com.google.protobuf.Empty>(
                service, METHODID_MESSAGE_ACK)))
        .build();
  }

  private static abstract class BroadcastBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BroadcastBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.v1.BroadcastOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Broadcast");
    }
  }

  private static final class BroadcastFileDescriptorSupplier
      extends BroadcastBaseDescriptorSupplier {
    BroadcastFileDescriptorSupplier() {}
  }

  private static final class BroadcastMethodDescriptorSupplier
      extends BroadcastBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BroadcastMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BroadcastGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BroadcastFileDescriptorSupplier())
              .addMethod(getAuthMethod())
              .addMethod(getHeartbeatMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getUnsubscribeMethod())
              .addMethod(getMessageAckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
