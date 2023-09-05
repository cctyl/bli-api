package bilibili.app.show.mixture.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/show/mixture/v1/mixture.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MixtureGrpc {

  private MixtureGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.show.mixture.v1.Mixture";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq,
      bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply> getWidgetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Widget",
      requestType = bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq.class,
      responseType = bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq,
      bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply> getWidgetMethod() {
    io.grpc.MethodDescriptor<bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq, bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply> getWidgetMethod;
    if ((getWidgetMethod = MixtureGrpc.getWidgetMethod) == null) {
      synchronized (MixtureGrpc.class) {
        if ((getWidgetMethod = MixtureGrpc.getWidgetMethod) == null) {
          MixtureGrpc.getWidgetMethod = getWidgetMethod =
              io.grpc.MethodDescriptor.<bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq, bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Widget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply.getDefaultInstance()))
              .setSchemaDescriptor(new MixtureMethodDescriptorSupplier("Widget"))
              .build();
        }
      }
    }
    return getWidgetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MixtureStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MixtureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MixtureStub>() {
        @java.lang.Override
        public MixtureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MixtureStub(channel, callOptions);
        }
      };
    return MixtureStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MixtureBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MixtureBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MixtureBlockingStub>() {
        @java.lang.Override
        public MixtureBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MixtureBlockingStub(channel, callOptions);
        }
      };
    return MixtureBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MixtureFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MixtureFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MixtureFutureStub>() {
        @java.lang.Override
        public MixtureFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MixtureFutureStub(channel, callOptions);
        }
      };
    return MixtureFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 
     * </pre>
     */
    default void widget(bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWidgetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Mixture.
   * <pre>
   * 
   * </pre>
   */
  public static abstract class MixtureImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MixtureGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Mixture.
   * <pre>
   * 
   * </pre>
   */
  public static final class MixtureStub
      extends io.grpc.stub.AbstractAsyncStub<MixtureStub> {
    private MixtureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MixtureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MixtureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void widget(bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWidgetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Mixture.
   * <pre>
   * 
   * </pre>
   */
  public static final class MixtureBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MixtureBlockingStub> {
    private MixtureBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MixtureBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MixtureBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply widget(bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWidgetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Mixture.
   * <pre>
   * 
   * </pre>
   */
  public static final class MixtureFutureStub
      extends io.grpc.stub.AbstractFutureStub<MixtureFutureStub> {
    private MixtureFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MixtureFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MixtureFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply> widget(
        bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWidgetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WIDGET = 0;

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
        case METHODID_WIDGET:
          serviceImpl.widget((bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply>) responseObserver);
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
          getWidgetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReq,
              bilibili.app.show.mixture.v1.MixtureRpcProto.WidgetReply>(
                service, METHODID_WIDGET)))
        .build();
  }

  private static abstract class MixtureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MixtureBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.show.mixture.v1.MixtureRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Mixture");
    }
  }

  private static final class MixtureFileDescriptorSupplier
      extends MixtureBaseDescriptorSupplier {
    MixtureFileDescriptorSupplier() {}
  }

  private static final class MixtureMethodDescriptorSupplier
      extends MixtureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MixtureMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MixtureGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MixtureFileDescriptorSupplier())
              .addMethod(getWidgetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
