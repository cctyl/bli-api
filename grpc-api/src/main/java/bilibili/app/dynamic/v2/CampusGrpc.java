package bilibili.app.dynamic.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/dynamic/v2/campus.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampusGrpc {

  private CampusGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.dynamic.v2.Campus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq,
      bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp> getWaterFlowRcmdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaterFlowRcmd",
      requestType = bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq.class,
      responseType = bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq,
      bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp> getWaterFlowRcmdMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq, bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp> getWaterFlowRcmdMethod;
    if ((getWaterFlowRcmdMethod = CampusGrpc.getWaterFlowRcmdMethod) == null) {
      synchronized (CampusGrpc.class) {
        if ((getWaterFlowRcmdMethod = CampusGrpc.getWaterFlowRcmdMethod) == null) {
          CampusGrpc.getWaterFlowRcmdMethod = getWaterFlowRcmdMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq, bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaterFlowRcmd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp.getDefaultInstance()))
              .setSchemaDescriptor(new CampusMethodDescriptorSupplier("WaterFlowRcmd"))
              .build();
        }
      }
    }
    return getWaterFlowRcmdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampusStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampusStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampusStub>() {
        @java.lang.Override
        public CampusStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampusStub(channel, callOptions);
        }
      };
    return CampusStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampusBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampusBlockingStub>() {
        @java.lang.Override
        public CampusBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampusBlockingStub(channel, callOptions);
        }
      };
    return CampusBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampusFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampusFutureStub>() {
        @java.lang.Override
        public CampusFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampusFutureStub(channel, callOptions);
        }
      };
    return CampusFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 
     * </pre>
     */
    default void waterFlowRcmd(bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWaterFlowRcmdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Campus.
   */
  public static abstract class CampusImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampusGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Campus.
   */
  public static final class CampusStub
      extends io.grpc.stub.AbstractAsyncStub<CampusStub> {
    private CampusStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampusStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampusStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void waterFlowRcmd(bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWaterFlowRcmdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Campus.
   */
  public static final class CampusBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampusBlockingStub> {
    private CampusBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampusBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampusBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp waterFlowRcmd(bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWaterFlowRcmdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Campus.
   */
  public static final class CampusFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampusFutureStub> {
    private CampusFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampusFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampusFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp> waterFlowRcmd(
        bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWaterFlowRcmdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WATER_FLOW_RCMD = 0;

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
        case METHODID_WATER_FLOW_RCMD:
          serviceImpl.waterFlowRcmd((bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp>) responseObserver);
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
          getWaterFlowRcmdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdReq,
              bilibili.app.dynamic.v2.CampusRpcProto.WaterFlowRcmdResp>(
                service, METHODID_WATER_FLOW_RCMD)))
        .build();
  }

  private static abstract class CampusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.dynamic.v2.CampusRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Campus");
    }
  }

  private static final class CampusFileDescriptorSupplier
      extends CampusBaseDescriptorSupplier {
    CampusFileDescriptorSupplier() {}
  }

  private static final class CampusMethodDescriptorSupplier
      extends CampusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CampusMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CampusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampusFileDescriptorSupplier())
              .addMethod(getWaterFlowRcmdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
