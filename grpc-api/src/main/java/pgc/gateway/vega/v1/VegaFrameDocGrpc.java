package pgc.gateway.vega.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: pgc/gateway/vega/v1/vega.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VegaFrameDocGrpc {

  private VegaFrameDocGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pgc.gateway.vega.v1.VegaFrameDoc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pgc.gateway.vega.v1.AuthReq,
      pgc.gateway.vega.v1.AuthResp> getAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Auth",
      requestType = pgc.gateway.vega.v1.AuthReq.class,
      responseType = pgc.gateway.vega.v1.AuthResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pgc.gateway.vega.v1.AuthReq,
      pgc.gateway.vega.v1.AuthResp> getAuthMethod() {
    io.grpc.MethodDescriptor<pgc.gateway.vega.v1.AuthReq, pgc.gateway.vega.v1.AuthResp> getAuthMethod;
    if ((getAuthMethod = VegaFrameDocGrpc.getAuthMethod) == null) {
      synchronized (VegaFrameDocGrpc.class) {
        if ((getAuthMethod = VegaFrameDocGrpc.getAuthMethod) == null) {
          VegaFrameDocGrpc.getAuthMethod = getAuthMethod =
              io.grpc.MethodDescriptor.<pgc.gateway.vega.v1.AuthReq, pgc.gateway.vega.v1.AuthResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Auth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pgc.gateway.vega.v1.AuthReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pgc.gateway.vega.v1.AuthResp.getDefaultInstance()))
              .setSchemaDescriptor(new VegaFrameDocMethodDescriptorSupplier("Auth"))
              .build();
        }
      }
    }
    return getAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pgc.gateway.vega.v1.HeartbeatReq,
      pgc.gateway.vega.v1.HeartbeatResp> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heartbeat",
      requestType = pgc.gateway.vega.v1.HeartbeatReq.class,
      responseType = pgc.gateway.vega.v1.HeartbeatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pgc.gateway.vega.v1.HeartbeatReq,
      pgc.gateway.vega.v1.HeartbeatResp> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<pgc.gateway.vega.v1.HeartbeatReq, pgc.gateway.vega.v1.HeartbeatResp> getHeartbeatMethod;
    if ((getHeartbeatMethod = VegaFrameDocGrpc.getHeartbeatMethod) == null) {
      synchronized (VegaFrameDocGrpc.class) {
        if ((getHeartbeatMethod = VegaFrameDocGrpc.getHeartbeatMethod) == null) {
          VegaFrameDocGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<pgc.gateway.vega.v1.HeartbeatReq, pgc.gateway.vega.v1.HeartbeatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pgc.gateway.vega.v1.HeartbeatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pgc.gateway.vega.v1.HeartbeatResp.getDefaultInstance()))
              .setSchemaDescriptor(new VegaFrameDocMethodDescriptorSupplier("Heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pgc.gateway.vega.v1.MessageAckReq,
      com.google.protobuf.Empty> getMessageAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MessageAck",
      requestType = pgc.gateway.vega.v1.MessageAckReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pgc.gateway.vega.v1.MessageAckReq,
      com.google.protobuf.Empty> getMessageAckMethod() {
    io.grpc.MethodDescriptor<pgc.gateway.vega.v1.MessageAckReq, com.google.protobuf.Empty> getMessageAckMethod;
    if ((getMessageAckMethod = VegaFrameDocGrpc.getMessageAckMethod) == null) {
      synchronized (VegaFrameDocGrpc.class) {
        if ((getMessageAckMethod = VegaFrameDocGrpc.getMessageAckMethod) == null) {
          VegaFrameDocGrpc.getMessageAckMethod = getMessageAckMethod =
              io.grpc.MethodDescriptor.<pgc.gateway.vega.v1.MessageAckReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MessageAck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pgc.gateway.vega.v1.MessageAckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new VegaFrameDocMethodDescriptorSupplier("MessageAck"))
              .build();
        }
      }
    }
    return getMessageAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pgc.gateway.vega.v1.SubscribeReq,
      com.google.protobuf.Empty> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = pgc.gateway.vega.v1.SubscribeReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pgc.gateway.vega.v1.SubscribeReq,
      com.google.protobuf.Empty> getSubscribeMethod() {
    io.grpc.MethodDescriptor<pgc.gateway.vega.v1.SubscribeReq, com.google.protobuf.Empty> getSubscribeMethod;
    if ((getSubscribeMethod = VegaFrameDocGrpc.getSubscribeMethod) == null) {
      synchronized (VegaFrameDocGrpc.class) {
        if ((getSubscribeMethod = VegaFrameDocGrpc.getSubscribeMethod) == null) {
          VegaFrameDocGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<pgc.gateway.vega.v1.SubscribeReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pgc.gateway.vega.v1.SubscribeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new VegaFrameDocMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VegaFrameDocStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaFrameDocStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaFrameDocStub>() {
        @java.lang.Override
        public VegaFrameDocStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaFrameDocStub(channel, callOptions);
        }
      };
    return VegaFrameDocStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VegaFrameDocBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaFrameDocBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaFrameDocBlockingStub>() {
        @java.lang.Override
        public VegaFrameDocBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaFrameDocBlockingStub(channel, callOptions);
        }
      };
    return VegaFrameDocBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VegaFrameDocFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaFrameDocFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaFrameDocFutureStub>() {
        @java.lang.Override
        public VegaFrameDocFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaFrameDocFutureStub(channel, callOptions);
        }
      };
    return VegaFrameDocFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void auth(pgc.gateway.vega.v1.AuthReq request,
        io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.AuthResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthMethod(), responseObserver);
    }

    /**
     */
    default void heartbeat(pgc.gateway.vega.v1.HeartbeatReq request,
        io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.HeartbeatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     */
    default void messageAck(pgc.gateway.vega.v1.MessageAckReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMessageAckMethod(), responseObserver);
    }

    /**
     */
    default void subscribe(pgc.gateway.vega.v1.SubscribeReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VegaFrameDoc.
   */
  public static abstract class VegaFrameDocImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VegaFrameDocGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VegaFrameDoc.
   */
  public static final class VegaFrameDocStub
      extends io.grpc.stub.AbstractAsyncStub<VegaFrameDocStub> {
    private VegaFrameDocStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaFrameDocStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaFrameDocStub(channel, callOptions);
    }

    /**
     */
    public void auth(pgc.gateway.vega.v1.AuthReq request,
        io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.AuthResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heartbeat(pgc.gateway.vega.v1.HeartbeatReq request,
        io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.HeartbeatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void messageAck(pgc.gateway.vega.v1.MessageAckReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMessageAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribe(pgc.gateway.vega.v1.SubscribeReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VegaFrameDoc.
   */
  public static final class VegaFrameDocBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VegaFrameDocBlockingStub> {
    private VegaFrameDocBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaFrameDocBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaFrameDocBlockingStub(channel, callOptions);
    }

    /**
     */
    public pgc.gateway.vega.v1.AuthResp auth(pgc.gateway.vega.v1.AuthReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public pgc.gateway.vega.v1.HeartbeatResp heartbeat(pgc.gateway.vega.v1.HeartbeatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty messageAck(pgc.gateway.vega.v1.MessageAckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMessageAckMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty subscribe(pgc.gateway.vega.v1.SubscribeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VegaFrameDoc.
   */
  public static final class VegaFrameDocFutureStub
      extends io.grpc.stub.AbstractFutureStub<VegaFrameDocFutureStub> {
    private VegaFrameDocFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaFrameDocFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaFrameDocFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pgc.gateway.vega.v1.AuthResp> auth(
        pgc.gateway.vega.v1.AuthReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pgc.gateway.vega.v1.HeartbeatResp> heartbeat(
        pgc.gateway.vega.v1.HeartbeatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> messageAck(
        pgc.gateway.vega.v1.MessageAckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMessageAckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> subscribe(
        pgc.gateway.vega.v1.SubscribeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH = 0;
  private static final int METHODID_HEARTBEAT = 1;
  private static final int METHODID_MESSAGE_ACK = 2;
  private static final int METHODID_SUBSCRIBE = 3;

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
          serviceImpl.auth((pgc.gateway.vega.v1.AuthReq) request,
              (io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.AuthResp>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((pgc.gateway.vega.v1.HeartbeatReq) request,
              (io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.HeartbeatResp>) responseObserver);
          break;
        case METHODID_MESSAGE_ACK:
          serviceImpl.messageAck((pgc.gateway.vega.v1.MessageAckReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((pgc.gateway.vega.v1.SubscribeReq) request,
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
              pgc.gateway.vega.v1.AuthReq,
              pgc.gateway.vega.v1.AuthResp>(
                service, METHODID_AUTH)))
        .addMethod(
          getHeartbeatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pgc.gateway.vega.v1.HeartbeatReq,
              pgc.gateway.vega.v1.HeartbeatResp>(
                service, METHODID_HEARTBEAT)))
        .addMethod(
          getMessageAckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pgc.gateway.vega.v1.MessageAckReq,
              com.google.protobuf.Empty>(
                service, METHODID_MESSAGE_ACK)))
        .addMethod(
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pgc.gateway.vega.v1.SubscribeReq,
              com.google.protobuf.Empty>(
                service, METHODID_SUBSCRIBE)))
        .build();
  }

  private static abstract class VegaFrameDocBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VegaFrameDocBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pgc.gateway.vega.v1.VegaOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VegaFrameDoc");
    }
  }

  private static final class VegaFrameDocFileDescriptorSupplier
      extends VegaFrameDocBaseDescriptorSupplier {
    VegaFrameDocFileDescriptorSupplier() {}
  }

  private static final class VegaFrameDocMethodDescriptorSupplier
      extends VegaFrameDocBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VegaFrameDocMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VegaFrameDocGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VegaFrameDocFileDescriptorSupplier())
              .addMethod(getAuthMethod())
              .addMethod(getHeartbeatMethod())
              .addMethod(getMessageAckMethod())
              .addMethod(getSubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
