package bilibili.broadcast.message.fission;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/message/fission/notify.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FissionGrpc {

  private FissionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.message.fission.Fission";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply> getGameNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GameNotify",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply> getGameNotifyMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply> getGameNotifyMethod;
    if ((getGameNotifyMethod = FissionGrpc.getGameNotifyMethod) == null) {
      synchronized (FissionGrpc.class) {
        if ((getGameNotifyMethod = FissionGrpc.getGameNotifyMethod) == null) {
          FissionGrpc.getGameNotifyMethod = getGameNotifyMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GameNotify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply.getDefaultInstance()))
              .setSchemaDescriptor(new FissionMethodDescriptorSupplier("GameNotify"))
              .build();
        }
      }
    }
    return getGameNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FissionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FissionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FissionStub>() {
        @java.lang.Override
        public FissionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FissionStub(channel, callOptions);
        }
      };
    return FissionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FissionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FissionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FissionBlockingStub>() {
        @java.lang.Override
        public FissionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FissionBlockingStub(channel, callOptions);
        }
      };
    return FissionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FissionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FissionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FissionFutureStub>() {
        @java.lang.Override
        public FissionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FissionFutureStub(channel, callOptions);
        }
      };
    return FissionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void gameNotify(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGameNotifyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Fission.
   */
  public static abstract class FissionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FissionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Fission.
   */
  public static final class FissionStub
      extends io.grpc.stub.AbstractAsyncStub<FissionStub> {
    private FissionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FissionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FissionStub(channel, callOptions);
    }

    /**
     */
    public void gameNotify(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGameNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Fission.
   */
  public static final class FissionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FissionBlockingStub> {
    private FissionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FissionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FissionBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply> gameNotify(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGameNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Fission.
   */
  public static final class FissionFutureStub
      extends io.grpc.stub.AbstractFutureStub<FissionFutureStub> {
    private FissionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FissionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FissionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GAME_NOTIFY = 0;

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
        case METHODID_GAME_NOTIFY:
          serviceImpl.gameNotify((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply>) responseObserver);
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
          getGameNotifyMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.fission.NotifyRpcProto.GameNotifyReply>(
                service, METHODID_GAME_NOTIFY)))
        .build();
  }

  private static abstract class FissionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FissionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.message.fission.NotifyRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Fission");
    }
  }

  private static final class FissionFileDescriptorSupplier
      extends FissionBaseDescriptorSupplier {
    FissionFileDescriptorSupplier() {}
  }

  private static final class FissionMethodDescriptorSupplier
      extends FissionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FissionMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FissionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FissionFileDescriptorSupplier())
              .addMethod(getGameNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
