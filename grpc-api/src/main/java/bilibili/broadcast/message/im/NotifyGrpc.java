package bilibili.broadcast.message.im;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/message/im/notify.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NotifyGrpc {

  private NotifyGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.message.im.Notify";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp> getWatchNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchNotify",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp> getWatchNotifyMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp> getWatchNotifyMethod;
    if ((getWatchNotifyMethod = NotifyGrpc.getWatchNotifyMethod) == null) {
      synchronized (NotifyGrpc.class) {
        if ((getWatchNotifyMethod = NotifyGrpc.getWatchNotifyMethod) == null) {
          NotifyGrpc.getWatchNotifyMethod = getWatchNotifyMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchNotify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp.getDefaultInstance()))
              .setSchemaDescriptor(new NotifyMethodDescriptorSupplier("WatchNotify"))
              .build();
        }
      }
    }
    return getWatchNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotifyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotifyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotifyStub>() {
        @java.lang.Override
        public NotifyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotifyStub(channel, callOptions);
        }
      };
    return NotifyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotifyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotifyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotifyBlockingStub>() {
        @java.lang.Override
        public NotifyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotifyBlockingStub(channel, callOptions);
        }
      };
    return NotifyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotifyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotifyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotifyFutureStub>() {
        @java.lang.Override
        public NotifyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotifyFutureStub(channel, callOptions);
        }
      };
    return NotifyFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void watchNotify(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchNotifyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Notify.
   */
  public static abstract class NotifyImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NotifyGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Notify.
   */
  public static final class NotifyStub
      extends io.grpc.stub.AbstractAsyncStub<NotifyStub> {
    private NotifyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotifyStub(channel, callOptions);
    }

    /**
     */
    public void watchNotify(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Notify.
   */
  public static final class NotifyBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NotifyBlockingStub> {
    private NotifyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotifyBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp> watchNotify(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Notify.
   */
  public static final class NotifyFutureStub
      extends io.grpc.stub.AbstractFutureStub<NotifyFutureStub> {
    private NotifyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotifyFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATCH_NOTIFY = 0;

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
        case METHODID_WATCH_NOTIFY:
          serviceImpl.watchNotify((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp>) responseObserver);
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
          getWatchNotifyMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.im.NotifyRpcProto.NotifyRsp>(
                service, METHODID_WATCH_NOTIFY)))
        .build();
  }

  private static abstract class NotifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotifyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.message.im.NotifyRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Notify");
    }
  }

  private static final class NotifyFileDescriptorSupplier
      extends NotifyBaseDescriptorSupplier {
    NotifyFileDescriptorSupplier() {}
  }

  private static final class NotifyMethodDescriptorSupplier
      extends NotifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NotifyMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NotifyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotifyFileDescriptorSupplier())
              .addMethod(getWatchNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
