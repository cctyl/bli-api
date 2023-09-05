package bilibili.broadcast.message.main;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/message/main/native.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NativePageGrpc {

  private NativePageGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.message.main.NativePage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent> getWatchNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchNotify",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent> getWatchNotifyMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent> getWatchNotifyMethod;
    if ((getWatchNotifyMethod = NativePageGrpc.getWatchNotifyMethod) == null) {
      synchronized (NativePageGrpc.class) {
        if ((getWatchNotifyMethod = NativePageGrpc.getWatchNotifyMethod) == null) {
          NativePageGrpc.getWatchNotifyMethod = getWatchNotifyMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchNotify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent.getDefaultInstance()))
              .setSchemaDescriptor(new NativePageMethodDescriptorSupplier("WatchNotify"))
              .build();
        }
      }
    }
    return getWatchNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NativePageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NativePageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NativePageStub>() {
        @java.lang.Override
        public NativePageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NativePageStub(channel, callOptions);
        }
      };
    return NativePageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NativePageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NativePageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NativePageBlockingStub>() {
        @java.lang.Override
        public NativePageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NativePageBlockingStub(channel, callOptions);
        }
      };
    return NativePageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NativePageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NativePageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NativePageFutureStub>() {
        @java.lang.Override
        public NativePageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NativePageFutureStub(channel, callOptions);
        }
      };
    return NativePageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void watchNotify(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchNotifyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NativePage.
   */
  public static abstract class NativePageImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NativePageGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NativePage.
   */
  public static final class NativePageStub
      extends io.grpc.stub.AbstractAsyncStub<NativePageStub> {
    private NativePageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NativePageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NativePageStub(channel, callOptions);
    }

    /**
     */
    public void watchNotify(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NativePage.
   */
  public static final class NativePageBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NativePageBlockingStub> {
    private NativePageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NativePageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NativePageBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent> watchNotify(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NativePage.
   */
  public static final class NativePageFutureStub
      extends io.grpc.stub.AbstractFutureStub<NativePageFutureStub> {
    private NativePageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NativePageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NativePageFutureStub(channel, callOptions);
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
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent>) responseObserver);
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
              bilibili.broadcast.message.main.NativeRpcProto.NativePageEvent>(
                service, METHODID_WATCH_NOTIFY)))
        .build();
  }

  private static abstract class NativePageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NativePageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.message.main.NativeRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NativePage");
    }
  }

  private static final class NativePageFileDescriptorSupplier
      extends NativePageBaseDescriptorSupplier {
    NativePageFileDescriptorSupplier() {}
  }

  private static final class NativePageMethodDescriptorSupplier
      extends NativePageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NativePageMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NativePageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NativePageFileDescriptorSupplier())
              .addMethod(getWatchNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
