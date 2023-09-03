package bilibili.broadcast.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Laser
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/v2/laser.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LaserGrpc {

  private LaserGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.v2.Laser";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.v2.LaserEventResp> getWatchEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchEvent",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.v2.LaserEventResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.v2.LaserEventResp> getWatchEventMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.v2.LaserEventResp> getWatchEventMethod;
    if ((getWatchEventMethod = LaserGrpc.getWatchEventMethod) == null) {
      synchronized (LaserGrpc.class) {
        if ((getWatchEventMethod = LaserGrpc.getWatchEventMethod) == null) {
          LaserGrpc.getWatchEventMethod = getWatchEventMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.v2.LaserEventResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v2.LaserEventResp.getDefaultInstance()))
              .setSchemaDescriptor(new LaserMethodDescriptorSupplier("WatchEvent"))
              .build();
        }
      }
    }
    return getWatchEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LaserStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LaserStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LaserStub>() {
        @java.lang.Override
        public LaserStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LaserStub(channel, callOptions);
        }
      };
    return LaserStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LaserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LaserBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LaserBlockingStub>() {
        @java.lang.Override
        public LaserBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LaserBlockingStub(channel, callOptions);
        }
      };
    return LaserBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LaserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LaserFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LaserFutureStub>() {
        @java.lang.Override
        public LaserFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LaserFutureStub(channel, callOptions);
        }
      };
    return LaserFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Laser
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 监听Laser事件
     * </pre>
     */
    default void watchEvent(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v2.LaserEventResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Laser.
   * <pre>
   * Laser
   * </pre>
   */
  public static abstract class LaserImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LaserGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Laser.
   * <pre>
   * Laser
   * </pre>
   */
  public static final class LaserStub
      extends io.grpc.stub.AbstractAsyncStub<LaserStub> {
    private LaserStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaserStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LaserStub(channel, callOptions);
    }

    /**
     * <pre>
     * 监听Laser事件
     * </pre>
     */
    public void watchEvent(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v2.LaserEventResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Laser.
   * <pre>
   * Laser
   * </pre>
   */
  public static final class LaserBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LaserBlockingStub> {
    private LaserBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaserBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LaserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 监听Laser事件
     * </pre>
     */
    public java.util.Iterator<bilibili.broadcast.v2.LaserEventResp> watchEvent(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Laser.
   * <pre>
   * Laser
   * </pre>
   */
  public static final class LaserFutureStub
      extends io.grpc.stub.AbstractFutureStub<LaserFutureStub> {
    private LaserFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaserFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LaserFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATCH_EVENT = 0;

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
        case METHODID_WATCH_EVENT:
          serviceImpl.watchEvent((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.v2.LaserEventResp>) responseObserver);
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
          getWatchEventMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.v2.LaserEventResp>(
                service, METHODID_WATCH_EVENT)))
        .build();
  }

  private static abstract class LaserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LaserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.v2.LaserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Laser");
    }
  }

  private static final class LaserFileDescriptorSupplier
      extends LaserBaseDescriptorSupplier {
    LaserFileDescriptorSupplier() {}
  }

  private static final class LaserMethodDescriptorSupplier
      extends LaserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LaserMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LaserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LaserFileDescriptorSupplier())
              .addMethod(getWatchEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
