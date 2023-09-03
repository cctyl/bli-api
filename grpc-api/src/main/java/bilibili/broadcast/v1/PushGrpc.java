package bilibili.broadcast.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Push
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/v1/push.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PushGrpc {

  private PushGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.v1.Push";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.v1.PushMessageResp> getWatchMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchMessage",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.v1.PushMessageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.v1.PushMessageResp> getWatchMessageMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.v1.PushMessageResp> getWatchMessageMethod;
    if ((getWatchMessageMethod = PushGrpc.getWatchMessageMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getWatchMessageMethod = PushGrpc.getWatchMessageMethod) == null) {
          PushGrpc.getWatchMessageMethod = getWatchMessageMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.v1.PushMessageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.PushMessageResp.getDefaultInstance()))
              .setSchemaDescriptor(new PushMethodDescriptorSupplier("WatchMessage"))
              .build();
        }
      }
    }
    return getWatchMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PushStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PushStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PushStub>() {
        @java.lang.Override
        public PushStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PushStub(channel, callOptions);
        }
      };
    return PushStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PushBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PushBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PushBlockingStub>() {
        @java.lang.Override
        public PushBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PushBlockingStub(channel, callOptions);
        }
      };
    return PushBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PushFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PushFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PushFutureStub>() {
        @java.lang.Override
        public PushFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PushFutureStub(channel, callOptions);
        }
      };
    return PushFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Push
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void watchMessage(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.PushMessageResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchMessageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Push.
   * <pre>
   * Push
   * </pre>
   */
  public static abstract class PushImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PushGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Push.
   * <pre>
   * Push
   * </pre>
   */
  public static final class PushStub
      extends io.grpc.stub.AbstractAsyncStub<PushStub> {
    private PushStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PushStub(channel, callOptions);
    }

    /**
     */
    public void watchMessage(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.PushMessageResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Push.
   * <pre>
   * Push
   * </pre>
   */
  public static final class PushBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PushBlockingStub> {
    private PushBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PushBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<bilibili.broadcast.v1.PushMessageResp> watchMessage(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Push.
   * <pre>
   * Push
   * </pre>
   */
  public static final class PushFutureStub
      extends io.grpc.stub.AbstractFutureStub<PushFutureStub> {
    private PushFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PushFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATCH_MESSAGE = 0;

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
        case METHODID_WATCH_MESSAGE:
          serviceImpl.watchMessage((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.v1.PushMessageResp>) responseObserver);
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
          getWatchMessageMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.v1.PushMessageResp>(
                service, METHODID_WATCH_MESSAGE)))
        .build();
  }

  private static abstract class PushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PushBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.v1.PushOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Push");
    }
  }

  private static final class PushFileDescriptorSupplier
      extends PushBaseDescriptorSupplier {
    PushFileDescriptorSupplier() {}
  }

  private static final class PushMethodDescriptorSupplier
      extends PushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PushMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PushGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PushFileDescriptorSupplier())
              .addMethod(getWatchMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
