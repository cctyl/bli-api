package bilibili.vega.deneb.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/vega/deneb/v1/deneb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VegaDenebRPCGrpc {

  private VegaDenebRPCGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.vega.deneb.v1.VegaDenebRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq,
      bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply> getMessagePullsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MessagePulls",
      requestType = bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq.class,
      responseType = bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq,
      bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply> getMessagePullsMethod() {
    io.grpc.MethodDescriptor<bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq, bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply> getMessagePullsMethod;
    if ((getMessagePullsMethod = VegaDenebRPCGrpc.getMessagePullsMethod) == null) {
      synchronized (VegaDenebRPCGrpc.class) {
        if ((getMessagePullsMethod = VegaDenebRPCGrpc.getMessagePullsMethod) == null) {
          VegaDenebRPCGrpc.getMessagePullsMethod = getMessagePullsMethod =
              io.grpc.MethodDescriptor.<bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq, bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MessagePulls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply.getDefaultInstance()))
              .setSchemaDescriptor(new VegaDenebRPCMethodDescriptorSupplier("MessagePulls"))
              .build();
        }
      }
    }
    return getMessagePullsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VegaDenebRPCStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaDenebRPCStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaDenebRPCStub>() {
        @java.lang.Override
        public VegaDenebRPCStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaDenebRPCStub(channel, callOptions);
        }
      };
    return VegaDenebRPCStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VegaDenebRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaDenebRPCBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaDenebRPCBlockingStub>() {
        @java.lang.Override
        public VegaDenebRPCBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaDenebRPCBlockingStub(channel, callOptions);
        }
      };
    return VegaDenebRPCBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VegaDenebRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegaDenebRPCFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegaDenebRPCFutureStub>() {
        @java.lang.Override
        public VegaDenebRPCFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegaDenebRPCFutureStub(channel, callOptions);
        }
      };
    return VegaDenebRPCFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void messagePulls(bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq request,
        io.grpc.stub.StreamObserver<bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMessagePullsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VegaDenebRPC.
   */
  public static abstract class VegaDenebRPCImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VegaDenebRPCGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VegaDenebRPC.
   */
  public static final class VegaDenebRPCStub
      extends io.grpc.stub.AbstractAsyncStub<VegaDenebRPCStub> {
    private VegaDenebRPCStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaDenebRPCStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaDenebRPCStub(channel, callOptions);
    }

    /**
     */
    public void messagePulls(bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq request,
        io.grpc.stub.StreamObserver<bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMessagePullsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VegaDenebRPC.
   */
  public static final class VegaDenebRPCBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VegaDenebRPCBlockingStub> {
    private VegaDenebRPCBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaDenebRPCBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaDenebRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply messagePulls(bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMessagePullsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VegaDenebRPC.
   */
  public static final class VegaDenebRPCFutureStub
      extends io.grpc.stub.AbstractFutureStub<VegaDenebRPCFutureStub> {
    private VegaDenebRPCFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegaDenebRPCFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegaDenebRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply> messagePulls(
        bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMessagePullsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MESSAGE_PULLS = 0;

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
        case METHODID_MESSAGE_PULLS:
          serviceImpl.messagePulls((bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply>) responseObserver);
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
          getMessagePullsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReq,
              bilibili.vega.deneb.v1.DenebRpcProto.MessagePullsReply>(
                service, METHODID_MESSAGE_PULLS)))
        .build();
  }

  private static abstract class VegaDenebRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VegaDenebRPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.vega.deneb.v1.DenebRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VegaDenebRPC");
    }
  }

  private static final class VegaDenebRPCFileDescriptorSupplier
      extends VegaDenebRPCBaseDescriptorSupplier {
    VegaDenebRPCFileDescriptorSupplier() {}
  }

  private static final class VegaDenebRPCMethodDescriptorSupplier
      extends VegaDenebRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VegaDenebRPCMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VegaDenebRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VegaDenebRPCFileDescriptorSupplier())
              .addMethod(getMessagePullsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
