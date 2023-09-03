package bilibili.app.dynamic.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/dynamic/v2/opus.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OpusGrpc {

  private OpusGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.dynamic.v2.Opus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OpusDetailReq,
      bilibili.app.dynamic.v2.OpusDetailResp> getOpusDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpusDetail",
      requestType = bilibili.app.dynamic.v2.OpusDetailReq.class,
      responseType = bilibili.app.dynamic.v2.OpusDetailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OpusDetailReq,
      bilibili.app.dynamic.v2.OpusDetailResp> getOpusDetailMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OpusDetailReq, bilibili.app.dynamic.v2.OpusDetailResp> getOpusDetailMethod;
    if ((getOpusDetailMethod = OpusGrpc.getOpusDetailMethod) == null) {
      synchronized (OpusGrpc.class) {
        if ((getOpusDetailMethod = OpusGrpc.getOpusDetailMethod) == null) {
          OpusGrpc.getOpusDetailMethod = getOpusDetailMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.OpusDetailReq, bilibili.app.dynamic.v2.OpusDetailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpusDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.OpusDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.OpusDetailResp.getDefaultInstance()))
              .setSchemaDescriptor(new OpusMethodDescriptorSupplier("OpusDetail"))
              .build();
        }
      }
    }
    return getOpusDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OpusStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpusStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpusStub>() {
        @java.lang.Override
        public OpusStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpusStub(channel, callOptions);
        }
      };
    return OpusStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OpusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpusBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpusBlockingStub>() {
        @java.lang.Override
        public OpusBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpusBlockingStub(channel, callOptions);
        }
      };
    return OpusBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OpusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpusFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpusFutureStub>() {
        @java.lang.Override
        public OpusFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpusFutureStub(channel, callOptions);
        }
      };
    return OpusFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 
     * </pre>
     */
    default void opusDetail(bilibili.app.dynamic.v2.OpusDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OpusDetailResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpusDetailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Opus.
   */
  public static abstract class OpusImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OpusGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Opus.
   */
  public static final class OpusStub
      extends io.grpc.stub.AbstractAsyncStub<OpusStub> {
    private OpusStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpusStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpusStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void opusDetail(bilibili.app.dynamic.v2.OpusDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OpusDetailResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpusDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Opus.
   */
  public static final class OpusBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OpusBlockingStub> {
    private OpusBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpusBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpusBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.OpusDetailResp opusDetail(bilibili.app.dynamic.v2.OpusDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpusDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Opus.
   */
  public static final class OpusFutureStub
      extends io.grpc.stub.AbstractFutureStub<OpusFutureStub> {
    private OpusFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpusFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpusFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.OpusDetailResp> opusDetail(
        bilibili.app.dynamic.v2.OpusDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpusDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPUS_DETAIL = 0;

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
        case METHODID_OPUS_DETAIL:
          serviceImpl.opusDetail((bilibili.app.dynamic.v2.OpusDetailReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OpusDetailResp>) responseObserver);
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
          getOpusDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.OpusDetailReq,
              bilibili.app.dynamic.v2.OpusDetailResp>(
                service, METHODID_OPUS_DETAIL)))
        .build();
  }

  private static abstract class OpusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OpusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.dynamic.v2.OpusOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Opus");
    }
  }

  private static final class OpusFileDescriptorSupplier
      extends OpusBaseDescriptorSupplier {
    OpusFileDescriptorSupplier() {}
  }

  private static final class OpusMethodDescriptorSupplier
      extends OpusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OpusMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OpusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OpusFileDescriptorSupplier())
              .addMethod(getOpusDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
