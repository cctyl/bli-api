package bilibili.pgc.service.premiere.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 首播服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/pgc/service/premiere/v1/premiere.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PremiereGrpc {

  private PremiereGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.pgc.service.premiere.v1.Premiere";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.pgc.service.premiere.v1.PremiereStatusReq,
      bilibili.pgc.service.premiere.v1.PremiereStatusReply> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = bilibili.pgc.service.premiere.v1.PremiereStatusReq.class,
      responseType = bilibili.pgc.service.premiere.v1.PremiereStatusReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pgc.service.premiere.v1.PremiereStatusReq,
      bilibili.pgc.service.premiere.v1.PremiereStatusReply> getStatusMethod() {
    io.grpc.MethodDescriptor<bilibili.pgc.service.premiere.v1.PremiereStatusReq, bilibili.pgc.service.premiere.v1.PremiereStatusReply> getStatusMethod;
    if ((getStatusMethod = PremiereGrpc.getStatusMethod) == null) {
      synchronized (PremiereGrpc.class) {
        if ((getStatusMethod = PremiereGrpc.getStatusMethod) == null) {
          PremiereGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<bilibili.pgc.service.premiere.v1.PremiereStatusReq, bilibili.pgc.service.premiere.v1.PremiereStatusReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pgc.service.premiere.v1.PremiereStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pgc.service.premiere.v1.PremiereStatusReply.getDefaultInstance()))
              .setSchemaDescriptor(new PremiereMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PremiereStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremiereStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremiereStub>() {
        @java.lang.Override
        public PremiereStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremiereStub(channel, callOptions);
        }
      };
    return PremiereStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PremiereBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremiereBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremiereBlockingStub>() {
        @java.lang.Override
        public PremiereBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremiereBlockingStub(channel, callOptions);
        }
      };
    return PremiereBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PremiereFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremiereFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremiereFutureStub>() {
        @java.lang.Override
        public PremiereFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremiereFutureStub(channel, callOptions);
        }
      };
    return PremiereFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 首播服务
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取首播状态
     * </pre>
     */
    default void status(bilibili.pgc.service.premiere.v1.PremiereStatusReq request,
        io.grpc.stub.StreamObserver<bilibili.pgc.service.premiere.v1.PremiereStatusReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Premiere.
   * <pre>
   * 首播服务
   * </pre>
   */
  public static abstract class PremiereImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PremiereGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Premiere.
   * <pre>
   * 首播服务
   * </pre>
   */
  public static final class PremiereStub
      extends io.grpc.stub.AbstractAsyncStub<PremiereStub> {
    private PremiereStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremiereStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremiereStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取首播状态
     * </pre>
     */
    public void status(bilibili.pgc.service.premiere.v1.PremiereStatusReq request,
        io.grpc.stub.StreamObserver<bilibili.pgc.service.premiere.v1.PremiereStatusReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Premiere.
   * <pre>
   * 首播服务
   * </pre>
   */
  public static final class PremiereBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PremiereBlockingStub> {
    private PremiereBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremiereBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremiereBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取首播状态
     * </pre>
     */
    public bilibili.pgc.service.premiere.v1.PremiereStatusReply status(bilibili.pgc.service.premiere.v1.PremiereStatusReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Premiere.
   * <pre>
   * 首播服务
   * </pre>
   */
  public static final class PremiereFutureStub
      extends io.grpc.stub.AbstractFutureStub<PremiereFutureStub> {
    private PremiereFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremiereFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremiereFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取首播状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pgc.service.premiere.v1.PremiereStatusReply> status(
        bilibili.pgc.service.premiere.v1.PremiereStatusReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STATUS = 0;

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
        case METHODID_STATUS:
          serviceImpl.status((bilibili.pgc.service.premiere.v1.PremiereStatusReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pgc.service.premiere.v1.PremiereStatusReply>) responseObserver);
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
          getStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pgc.service.premiere.v1.PremiereStatusReq,
              bilibili.pgc.service.premiere.v1.PremiereStatusReply>(
                service, METHODID_STATUS)))
        .build();
  }

  private static abstract class PremiereBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PremiereBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.pgc.service.premiere.v1.PremiereOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Premiere");
    }
  }

  private static final class PremiereFileDescriptorSupplier
      extends PremiereBaseDescriptorSupplier {
    PremiereFileDescriptorSupplier() {}
  }

  private static final class PremiereMethodDescriptorSupplier
      extends PremiereBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PremiereMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PremiereGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PremiereFileDescriptorSupplier())
              .addMethod(getStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
