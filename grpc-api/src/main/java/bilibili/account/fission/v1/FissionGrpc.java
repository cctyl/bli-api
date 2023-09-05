package bilibili.account.fission.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Fission裂变
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/account/fission/v1/fission.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FissionGrpc {

  private FissionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.account.fission.v1.Fission";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.EntranceReq,
      bilibili.account.fission.v1.FissionRpcProto.EntranceReply> getEntranceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entrance",
      requestType = bilibili.account.fission.v1.FissionRpcProto.EntranceReq.class,
      responseType = bilibili.account.fission.v1.FissionRpcProto.EntranceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.EntranceReq,
      bilibili.account.fission.v1.FissionRpcProto.EntranceReply> getEntranceMethod() {
    io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.EntranceReq, bilibili.account.fission.v1.FissionRpcProto.EntranceReply> getEntranceMethod;
    if ((getEntranceMethod = FissionGrpc.getEntranceMethod) == null) {
      synchronized (FissionGrpc.class) {
        if ((getEntranceMethod = FissionGrpc.getEntranceMethod) == null) {
          FissionGrpc.getEntranceMethod = getEntranceMethod =
              io.grpc.MethodDescriptor.<bilibili.account.fission.v1.FissionRpcProto.EntranceReq, bilibili.account.fission.v1.FissionRpcProto.EntranceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entrance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.account.fission.v1.FissionRpcProto.EntranceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.account.fission.v1.FissionRpcProto.EntranceReply.getDefaultInstance()))
              .setSchemaDescriptor(new FissionMethodDescriptorSupplier("Entrance"))
              .build();
        }
      }
    }
    return getEntranceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.WindowReq,
      bilibili.account.fission.v1.FissionRpcProto.WindowReply> getWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Window",
      requestType = bilibili.account.fission.v1.FissionRpcProto.WindowReq.class,
      responseType = bilibili.account.fission.v1.FissionRpcProto.WindowReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.WindowReq,
      bilibili.account.fission.v1.FissionRpcProto.WindowReply> getWindowMethod() {
    io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.WindowReq, bilibili.account.fission.v1.FissionRpcProto.WindowReply> getWindowMethod;
    if ((getWindowMethod = FissionGrpc.getWindowMethod) == null) {
      synchronized (FissionGrpc.class) {
        if ((getWindowMethod = FissionGrpc.getWindowMethod) == null) {
          FissionGrpc.getWindowMethod = getWindowMethod =
              io.grpc.MethodDescriptor.<bilibili.account.fission.v1.FissionRpcProto.WindowReq, bilibili.account.fission.v1.FissionRpcProto.WindowReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Window"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.account.fission.v1.FissionRpcProto.WindowReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.account.fission.v1.FissionRpcProto.WindowReply.getDefaultInstance()))
              .setSchemaDescriptor(new FissionMethodDescriptorSupplier("Window"))
              .build();
        }
      }
    }
    return getWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.PrivacyReq,
      bilibili.account.fission.v1.FissionRpcProto.PrivacyReply> getPrivacyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Privacy",
      requestType = bilibili.account.fission.v1.FissionRpcProto.PrivacyReq.class,
      responseType = bilibili.account.fission.v1.FissionRpcProto.PrivacyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.PrivacyReq,
      bilibili.account.fission.v1.FissionRpcProto.PrivacyReply> getPrivacyMethod() {
    io.grpc.MethodDescriptor<bilibili.account.fission.v1.FissionRpcProto.PrivacyReq, bilibili.account.fission.v1.FissionRpcProto.PrivacyReply> getPrivacyMethod;
    if ((getPrivacyMethod = FissionGrpc.getPrivacyMethod) == null) {
      synchronized (FissionGrpc.class) {
        if ((getPrivacyMethod = FissionGrpc.getPrivacyMethod) == null) {
          FissionGrpc.getPrivacyMethod = getPrivacyMethod =
              io.grpc.MethodDescriptor.<bilibili.account.fission.v1.FissionRpcProto.PrivacyReq, bilibili.account.fission.v1.FissionRpcProto.PrivacyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Privacy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.account.fission.v1.FissionRpcProto.PrivacyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.account.fission.v1.FissionRpcProto.PrivacyReply.getDefaultInstance()))
              .setSchemaDescriptor(new FissionMethodDescriptorSupplier("Privacy"))
              .build();
        }
      }
    }
    return getPrivacyMethod;
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
   * <pre>
   * Fission裂变
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 活动入口
     * </pre>
     */
    default void entrance(bilibili.account.fission.v1.FissionRpcProto.EntranceReq request,
        io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.EntranceReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntranceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 首页弹窗
     * </pre>
     */
    default void window(bilibili.account.fission.v1.FissionRpcProto.WindowReq request,
        io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.WindowReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWindowMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void privacy(bilibili.account.fission.v1.FissionRpcProto.PrivacyReq request,
        io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.PrivacyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrivacyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Fission.
   * <pre>
   * Fission裂变
   * </pre>
   */
  public static abstract class FissionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FissionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Fission.
   * <pre>
   * Fission裂变
   * </pre>
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
     * <pre>
     * 活动入口
     * </pre>
     */
    public void entrance(bilibili.account.fission.v1.FissionRpcProto.EntranceReq request,
        io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.EntranceReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEntranceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 首页弹窗
     * </pre>
     */
    public void window(bilibili.account.fission.v1.FissionRpcProto.WindowReq request,
        io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.WindowReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void privacy(bilibili.account.fission.v1.FissionRpcProto.PrivacyReq request,
        io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.PrivacyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrivacyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Fission.
   * <pre>
   * Fission裂变
   * </pre>
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
     * <pre>
     * 活动入口
     * </pre>
     */
    public bilibili.account.fission.v1.FissionRpcProto.EntranceReply entrance(bilibili.account.fission.v1.FissionRpcProto.EntranceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEntranceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 首页弹窗
     * </pre>
     */
    public bilibili.account.fission.v1.FissionRpcProto.WindowReply window(bilibili.account.fission.v1.FissionRpcProto.WindowReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWindowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.account.fission.v1.FissionRpcProto.PrivacyReply privacy(bilibili.account.fission.v1.FissionRpcProto.PrivacyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrivacyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Fission.
   * <pre>
   * Fission裂变
   * </pre>
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

    /**
     * <pre>
     * 活动入口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.account.fission.v1.FissionRpcProto.EntranceReply> entrance(
        bilibili.account.fission.v1.FissionRpcProto.EntranceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEntranceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 首页弹窗
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.account.fission.v1.FissionRpcProto.WindowReply> window(
        bilibili.account.fission.v1.FissionRpcProto.WindowReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWindowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.account.fission.v1.FissionRpcProto.PrivacyReply> privacy(
        bilibili.account.fission.v1.FissionRpcProto.PrivacyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrivacyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTRANCE = 0;
  private static final int METHODID_WINDOW = 1;
  private static final int METHODID_PRIVACY = 2;

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
        case METHODID_ENTRANCE:
          serviceImpl.entrance((bilibili.account.fission.v1.FissionRpcProto.EntranceReq) request,
              (io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.EntranceReply>) responseObserver);
          break;
        case METHODID_WINDOW:
          serviceImpl.window((bilibili.account.fission.v1.FissionRpcProto.WindowReq) request,
              (io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.WindowReply>) responseObserver);
          break;
        case METHODID_PRIVACY:
          serviceImpl.privacy((bilibili.account.fission.v1.FissionRpcProto.PrivacyReq) request,
              (io.grpc.stub.StreamObserver<bilibili.account.fission.v1.FissionRpcProto.PrivacyReply>) responseObserver);
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
          getEntranceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.account.fission.v1.FissionRpcProto.EntranceReq,
              bilibili.account.fission.v1.FissionRpcProto.EntranceReply>(
                service, METHODID_ENTRANCE)))
        .addMethod(
          getWindowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.account.fission.v1.FissionRpcProto.WindowReq,
              bilibili.account.fission.v1.FissionRpcProto.WindowReply>(
                service, METHODID_WINDOW)))
        .addMethod(
          getPrivacyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.account.fission.v1.FissionRpcProto.PrivacyReq,
              bilibili.account.fission.v1.FissionRpcProto.PrivacyReply>(
                service, METHODID_PRIVACY)))
        .build();
  }

  private static abstract class FissionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FissionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.account.fission.v1.FissionRpcProto.getDescriptor();
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
              .addMethod(getEntranceMethod())
              .addMethod(getWindowMethod())
              .addMethod(getPrivacyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
