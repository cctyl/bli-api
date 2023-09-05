package pgc.gateway.vega.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: pgc/gateway/vega/v1/vega.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VegaGrpc {

  private VegaGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pgc.gateway.vega.v1.Vega";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pgc.gateway.vega.v1.VegaRpcProto.VegaFrame,
      pgc.gateway.vega.v1.VegaRpcProto.VegaFrame> getCreateTunnelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTunnel",
      requestType = pgc.gateway.vega.v1.VegaRpcProto.VegaFrame.class,
      responseType = pgc.gateway.vega.v1.VegaRpcProto.VegaFrame.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pgc.gateway.vega.v1.VegaRpcProto.VegaFrame,
      pgc.gateway.vega.v1.VegaRpcProto.VegaFrame> getCreateTunnelMethod() {
    io.grpc.MethodDescriptor<pgc.gateway.vega.v1.VegaRpcProto.VegaFrame, pgc.gateway.vega.v1.VegaRpcProto.VegaFrame> getCreateTunnelMethod;
    if ((getCreateTunnelMethod = VegaGrpc.getCreateTunnelMethod) == null) {
      synchronized (VegaGrpc.class) {
        if ((getCreateTunnelMethod = VegaGrpc.getCreateTunnelMethod) == null) {
          VegaGrpc.getCreateTunnelMethod = getCreateTunnelMethod =
              io.grpc.MethodDescriptor.<pgc.gateway.vega.v1.VegaRpcProto.VegaFrame, pgc.gateway.vega.v1.VegaRpcProto.VegaFrame>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTunnel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pgc.gateway.vega.v1.VegaRpcProto.VegaFrame.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pgc.gateway.vega.v1.VegaRpcProto.VegaFrame.getDefaultInstance()))
              .setSchemaDescriptor(new VegaMethodDescriptorSupplier("CreateTunnel"))
              .build();
        }
      }
    }
    return getCreateTunnelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VegaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaStub>() {
        @java.lang.Override
        public VegaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaStub(channel, callOptions);
        }
      };
    return VegaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VegaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaBlockingStub>() {
        @java.lang.Override
        public VegaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaBlockingStub(channel, callOptions);
        }
      };
    return VegaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VegaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaFutureStub>() {
        @java.lang.Override
        public VegaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaFutureStub(channel, callOptions);
        }
      };
    return VegaFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createTunnel(pgc.gateway.vega.v1.VegaRpcProto.VegaFrame request,
        io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.VegaRpcProto.VegaFrame> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTunnelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Vega.
   */
  public static abstract class VegaImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VegaGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Vega.
   */
  public static final class VegaStub
      extends io.grpc.stub.AbstractAsyncStub<VegaStub> {
    private VegaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaStub(channel, callOptions);
    }

    /**
     */
    public void createTunnel(pgc.gateway.vega.v1.VegaRpcProto.VegaFrame request,
        io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.VegaRpcProto.VegaFrame> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTunnelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Vega.
   */
  public static final class VegaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VegaBlockingStub> {
    private VegaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaBlockingStub(channel, callOptions);
    }

    /**
     */
    public pgc.gateway.vega.v1.VegaRpcProto.VegaFrame createTunnel(pgc.gateway.vega.v1.VegaRpcProto.VegaFrame request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTunnelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Vega.
   */
  public static final class VegaFutureStub
      extends io.grpc.stub.AbstractFutureStub<VegaFutureStub> {
    private VegaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pgc.gateway.vega.v1.VegaRpcProto.VegaFrame> createTunnel(
        pgc.gateway.vega.v1.VegaRpcProto.VegaFrame request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTunnelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TUNNEL = 0;

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
        case METHODID_CREATE_TUNNEL:
          serviceImpl.createTunnel((pgc.gateway.vega.v1.VegaRpcProto.VegaFrame) request,
              (io.grpc.stub.StreamObserver<pgc.gateway.vega.v1.VegaRpcProto.VegaFrame>) responseObserver);
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
          getCreateTunnelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pgc.gateway.vega.v1.VegaRpcProto.VegaFrame,
              pgc.gateway.vega.v1.VegaRpcProto.VegaFrame>(
                service, METHODID_CREATE_TUNNEL)))
        .build();
  }

  private static abstract class VegaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VegaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pgc.gateway.vega.v1.VegaRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vega");
    }
  }

  private static final class VegaFileDescriptorSupplier
      extends VegaBaseDescriptorSupplier {
    VegaFileDescriptorSupplier() {}
  }

  private static final class VegaMethodDescriptorSupplier
      extends VegaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VegaMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VegaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VegaFileDescriptorSupplier())
              .addMethod(getCreateTunnelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
