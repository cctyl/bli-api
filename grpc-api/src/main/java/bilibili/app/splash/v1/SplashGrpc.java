package bilibili.app.splash.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/splash/v1/splash.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SplashGrpc {

  private SplashGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.splash.v1.Splash";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.splash.v1.SplashRpcProto.SplashReq,
      bilibili.app.splash.v1.SplashRpcProto.SplashReply> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = bilibili.app.splash.v1.SplashRpcProto.SplashReq.class,
      responseType = bilibili.app.splash.v1.SplashRpcProto.SplashReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.splash.v1.SplashRpcProto.SplashReq,
      bilibili.app.splash.v1.SplashRpcProto.SplashReply> getListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.splash.v1.SplashRpcProto.SplashReq, bilibili.app.splash.v1.SplashRpcProto.SplashReply> getListMethod;
    if ((getListMethod = SplashGrpc.getListMethod) == null) {
      synchronized (SplashGrpc.class) {
        if ((getListMethod = SplashGrpc.getListMethod) == null) {
          SplashGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.splash.v1.SplashRpcProto.SplashReq, bilibili.app.splash.v1.SplashRpcProto.SplashReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.splash.v1.SplashRpcProto.SplashReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.splash.v1.SplashRpcProto.SplashReply.getDefaultInstance()))
              .setSchemaDescriptor(new SplashMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SplashStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SplashStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SplashStub>() {
        @java.lang.Override
        public SplashStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SplashStub(channel, callOptions);
        }
      };
    return SplashStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SplashBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SplashBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SplashBlockingStub>() {
        @java.lang.Override
        public SplashBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SplashBlockingStub(channel, callOptions);
        }
      };
    return SplashBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SplashFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SplashFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SplashFutureStub>() {
        @java.lang.Override
        public SplashFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SplashFutureStub(channel, callOptions);
        }
      };
    return SplashFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void list(bilibili.app.splash.v1.SplashRpcProto.SplashReq request,
        io.grpc.stub.StreamObserver<bilibili.app.splash.v1.SplashRpcProto.SplashReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Splash.
   */
  public static abstract class SplashImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SplashGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Splash.
   */
  public static final class SplashStub
      extends io.grpc.stub.AbstractAsyncStub<SplashStub> {
    private SplashStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SplashStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SplashStub(channel, callOptions);
    }

    /**
     */
    public void list(bilibili.app.splash.v1.SplashRpcProto.SplashReq request,
        io.grpc.stub.StreamObserver<bilibili.app.splash.v1.SplashRpcProto.SplashReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Splash.
   */
  public static final class SplashBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SplashBlockingStub> {
    private SplashBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SplashBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SplashBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.splash.v1.SplashRpcProto.SplashReply list(bilibili.app.splash.v1.SplashRpcProto.SplashReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Splash.
   */
  public static final class SplashFutureStub
      extends io.grpc.stub.AbstractFutureStub<SplashFutureStub> {
    private SplashFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SplashFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SplashFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.splash.v1.SplashRpcProto.SplashReply> list(
        bilibili.app.splash.v1.SplashRpcProto.SplashReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

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
        case METHODID_LIST:
          serviceImpl.list((bilibili.app.splash.v1.SplashRpcProto.SplashReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.splash.v1.SplashRpcProto.SplashReply>) responseObserver);
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
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.splash.v1.SplashRpcProto.SplashReq,
              bilibili.app.splash.v1.SplashRpcProto.SplashReply>(
                service, METHODID_LIST)))
        .build();
  }

  private static abstract class SplashBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SplashBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.splash.v1.SplashRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Splash");
    }
  }

  private static final class SplashFileDescriptorSupplier
      extends SplashBaseDescriptorSupplier {
    SplashFileDescriptorSupplier() {}
  }

  private static final class SplashMethodDescriptorSupplier
      extends SplashBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SplashMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SplashGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SplashFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
