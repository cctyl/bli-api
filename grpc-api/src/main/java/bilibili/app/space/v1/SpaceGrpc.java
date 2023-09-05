package bilibili.app.space.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/space/v1/space.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpaceGrpc {

  private SpaceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.space.v1.Space";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.space.v1.SpaceRpcProto.ArchiveReq,
      bilibili.app.space.v1.SpaceRpcProto.ArchiveReply> getArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Archive",
      requestType = bilibili.app.space.v1.SpaceRpcProto.ArchiveReq.class,
      responseType = bilibili.app.space.v1.SpaceRpcProto.ArchiveReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.space.v1.SpaceRpcProto.ArchiveReq,
      bilibili.app.space.v1.SpaceRpcProto.ArchiveReply> getArchiveMethod() {
    io.grpc.MethodDescriptor<bilibili.app.space.v1.SpaceRpcProto.ArchiveReq, bilibili.app.space.v1.SpaceRpcProto.ArchiveReply> getArchiveMethod;
    if ((getArchiveMethod = SpaceGrpc.getArchiveMethod) == null) {
      synchronized (SpaceGrpc.class) {
        if ((getArchiveMethod = SpaceGrpc.getArchiveMethod) == null) {
          SpaceGrpc.getArchiveMethod = getArchiveMethod =
              io.grpc.MethodDescriptor.<bilibili.app.space.v1.SpaceRpcProto.ArchiveReq, bilibili.app.space.v1.SpaceRpcProto.ArchiveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Archive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.space.v1.SpaceRpcProto.ArchiveReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.space.v1.SpaceRpcProto.ArchiveReply.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceMethodDescriptorSupplier("Archive"))
              .build();
        }
      }
    }
    return getArchiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceStub>() {
        @java.lang.Override
        public SpaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceStub(channel, callOptions);
        }
      };
    return SpaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceBlockingStub>() {
        @java.lang.Override
        public SpaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceBlockingStub(channel, callOptions);
        }
      };
    return SpaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceFutureStub>() {
        @java.lang.Override
        public SpaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceFutureStub(channel, callOptions);
        }
      };
    return SpaceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void archive(bilibili.app.space.v1.SpaceRpcProto.ArchiveReq request,
        io.grpc.stub.StreamObserver<bilibili.app.space.v1.SpaceRpcProto.ArchiveReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArchiveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Space.
   */
  public static abstract class SpaceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SpaceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Space.
   */
  public static final class SpaceStub
      extends io.grpc.stub.AbstractAsyncStub<SpaceStub> {
    private SpaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceStub(channel, callOptions);
    }

    /**
     */
    public void archive(bilibili.app.space.v1.SpaceRpcProto.ArchiveReq request,
        io.grpc.stub.StreamObserver<bilibili.app.space.v1.SpaceRpcProto.ArchiveReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArchiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Space.
   */
  public static final class SpaceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SpaceBlockingStub> {
    private SpaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.space.v1.SpaceRpcProto.ArchiveReply archive(bilibili.app.space.v1.SpaceRpcProto.ArchiveReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArchiveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Space.
   */
  public static final class SpaceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SpaceFutureStub> {
    private SpaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.space.v1.SpaceRpcProto.ArchiveReply> archive(
        bilibili.app.space.v1.SpaceRpcProto.ArchiveReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArchiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ARCHIVE = 0;

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
        case METHODID_ARCHIVE:
          serviceImpl.archive((bilibili.app.space.v1.SpaceRpcProto.ArchiveReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.space.v1.SpaceRpcProto.ArchiveReply>) responseObserver);
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
          getArchiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.space.v1.SpaceRpcProto.ArchiveReq,
              bilibili.app.space.v1.SpaceRpcProto.ArchiveReply>(
                service, METHODID_ARCHIVE)))
        .build();
  }

  private static abstract class SpaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.space.v1.SpaceRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Space");
    }
  }

  private static final class SpaceFileDescriptorSupplier
      extends SpaceBaseDescriptorSupplier {
    SpaceFileDescriptorSupplier() {}
  }

  private static final class SpaceMethodDescriptorSupplier
      extends SpaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SpaceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SpaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpaceFileDescriptorSupplier())
              .addMethod(getArchiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
