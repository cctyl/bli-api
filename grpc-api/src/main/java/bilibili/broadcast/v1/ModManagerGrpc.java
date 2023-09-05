package bilibili.broadcast.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ModManager
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/v1/mod.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ModManagerGrpc {

  private ModManagerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.v1.ModManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.v1.ModRpcProto.ModResourceResp> getWatchResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchResource",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.v1.ModRpcProto.ModResourceResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.v1.ModRpcProto.ModResourceResp> getWatchResourceMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.v1.ModRpcProto.ModResourceResp> getWatchResourceMethod;
    if ((getWatchResourceMethod = ModManagerGrpc.getWatchResourceMethod) == null) {
      synchronized (ModManagerGrpc.class) {
        if ((getWatchResourceMethod = ModManagerGrpc.getWatchResourceMethod) == null) {
          ModManagerGrpc.getWatchResourceMethod = getWatchResourceMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.v1.ModRpcProto.ModResourceResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.ModRpcProto.ModResourceResp.getDefaultInstance()))
              .setSchemaDescriptor(new ModManagerMethodDescriptorSupplier("WatchResource"))
              .build();
        }
      }
    }
    return getWatchResourceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModManagerStub>() {
        @java.lang.Override
        public ModManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModManagerStub(channel, callOptions);
        }
      };
    return ModManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModManagerBlockingStub>() {
        @java.lang.Override
        public ModManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModManagerBlockingStub(channel, callOptions);
        }
      };
    return ModManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ModManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModManagerFutureStub>() {
        @java.lang.Override
        public ModManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModManagerFutureStub(channel, callOptions);
        }
      };
    return ModManagerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ModManager
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void watchResource(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.ModRpcProto.ModResourceResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchResourceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ModManager.
   * <pre>
   * ModManager
   * </pre>
   */
  public static abstract class ModManagerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ModManagerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ModManager.
   * <pre>
   * ModManager
   * </pre>
   */
  public static final class ModManagerStub
      extends io.grpc.stub.AbstractAsyncStub<ModManagerStub> {
    private ModManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModManagerStub(channel, callOptions);
    }

    /**
     */
    public void watchResource(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.ModRpcProto.ModResourceResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchResourceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ModManager.
   * <pre>
   * ModManager
   * </pre>
   */
  public static final class ModManagerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ModManagerBlockingStub> {
    private ModManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<bilibili.broadcast.v1.ModRpcProto.ModResourceResp> watchResource(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchResourceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ModManager.
   * <pre>
   * ModManager
   * </pre>
   */
  public static final class ModManagerFutureStub
      extends io.grpc.stub.AbstractFutureStub<ModManagerFutureStub> {
    private ModManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModManagerFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATCH_RESOURCE = 0;

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
        case METHODID_WATCH_RESOURCE:
          serviceImpl.watchResource((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.v1.ModRpcProto.ModResourceResp>) responseObserver);
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
          getWatchResourceMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.v1.ModRpcProto.ModResourceResp>(
                service, METHODID_WATCH_RESOURCE)))
        .build();
  }

  private static abstract class ModManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.v1.ModRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ModManager");
    }
  }

  private static final class ModManagerFileDescriptorSupplier
      extends ModManagerBaseDescriptorSupplier {
    ModManagerFileDescriptorSupplier() {}
  }

  private static final class ModManagerMethodDescriptorSupplier
      extends ModManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ModManagerMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ModManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ModManagerFileDescriptorSupplier())
              .addMethod(getWatchResourceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
