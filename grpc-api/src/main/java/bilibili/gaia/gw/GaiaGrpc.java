package bilibili.gaia.gw;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 应用列表上报
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/gaia/gw/gw_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GaiaGrpc {

  private GaiaGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.gaia.gw.Gaia";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.gaia.gw.GaiaEncryptMsgReq,
      bilibili.gaia.gw.UploadAppListReply> getExUploadAppListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExUploadAppList",
      requestType = bilibili.gaia.gw.GaiaEncryptMsgReq.class,
      responseType = bilibili.gaia.gw.UploadAppListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.gaia.gw.GaiaEncryptMsgReq,
      bilibili.gaia.gw.UploadAppListReply> getExUploadAppListMethod() {
    io.grpc.MethodDescriptor<bilibili.gaia.gw.GaiaEncryptMsgReq, bilibili.gaia.gw.UploadAppListReply> getExUploadAppListMethod;
    if ((getExUploadAppListMethod = GaiaGrpc.getExUploadAppListMethod) == null) {
      synchronized (GaiaGrpc.class) {
        if ((getExUploadAppListMethod = GaiaGrpc.getExUploadAppListMethod) == null) {
          GaiaGrpc.getExUploadAppListMethod = getExUploadAppListMethod =
              io.grpc.MethodDescriptor.<bilibili.gaia.gw.GaiaEncryptMsgReq, bilibili.gaia.gw.UploadAppListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExUploadAppList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.gaia.gw.GaiaEncryptMsgReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.gaia.gw.UploadAppListReply.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaMethodDescriptorSupplier("ExUploadAppList"))
              .build();
        }
      }
    }
    return getExUploadAppListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.gaia.gw.FetchPublicKeyReply> getExFetchPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExFetchPublicKey",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.gaia.gw.FetchPublicKeyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.gaia.gw.FetchPublicKeyReply> getExFetchPublicKeyMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.gaia.gw.FetchPublicKeyReply> getExFetchPublicKeyMethod;
    if ((getExFetchPublicKeyMethod = GaiaGrpc.getExFetchPublicKeyMethod) == null) {
      synchronized (GaiaGrpc.class) {
        if ((getExFetchPublicKeyMethod = GaiaGrpc.getExFetchPublicKeyMethod) == null) {
          GaiaGrpc.getExFetchPublicKeyMethod = getExFetchPublicKeyMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.gaia.gw.FetchPublicKeyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExFetchPublicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.gaia.gw.FetchPublicKeyReply.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaMethodDescriptorSupplier("ExFetchPublicKey"))
              .build();
        }
      }
    }
    return getExFetchPublicKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GaiaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GaiaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GaiaStub>() {
        @java.lang.Override
        public GaiaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GaiaStub(channel, callOptions);
        }
      };
    return GaiaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GaiaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GaiaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GaiaBlockingStub>() {
        @java.lang.Override
        public GaiaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GaiaBlockingStub(channel, callOptions);
        }
      };
    return GaiaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GaiaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GaiaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GaiaFutureStub>() {
        @java.lang.Override
        public GaiaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GaiaFutureStub(channel, callOptions);
        }
      };
    return GaiaFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 应用列表上报
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 应用列表上报
     * </pre>
     */
    default void exUploadAppList(bilibili.gaia.gw.GaiaEncryptMsgReq request,
        io.grpc.stub.StreamObserver<bilibili.gaia.gw.UploadAppListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExUploadAppListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 拉取rsa公钥
     * </pre>
     */
    default void exFetchPublicKey(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.gaia.gw.FetchPublicKeyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExFetchPublicKeyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Gaia.
   * <pre>
   * 应用列表上报
   * </pre>
   */
  public static abstract class GaiaImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GaiaGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Gaia.
   * <pre>
   * 应用列表上报
   * </pre>
   */
  public static final class GaiaStub
      extends io.grpc.stub.AbstractAsyncStub<GaiaStub> {
    private GaiaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GaiaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GaiaStub(channel, callOptions);
    }

    /**
     * <pre>
     * 应用列表上报
     * </pre>
     */
    public void exUploadAppList(bilibili.gaia.gw.GaiaEncryptMsgReq request,
        io.grpc.stub.StreamObserver<bilibili.gaia.gw.UploadAppListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExUploadAppListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 拉取rsa公钥
     * </pre>
     */
    public void exFetchPublicKey(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.gaia.gw.FetchPublicKeyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExFetchPublicKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Gaia.
   * <pre>
   * 应用列表上报
   * </pre>
   */
  public static final class GaiaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GaiaBlockingStub> {
    private GaiaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GaiaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GaiaBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 应用列表上报
     * </pre>
     */
    public bilibili.gaia.gw.UploadAppListReply exUploadAppList(bilibili.gaia.gw.GaiaEncryptMsgReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExUploadAppListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 拉取rsa公钥
     * </pre>
     */
    public bilibili.gaia.gw.FetchPublicKeyReply exFetchPublicKey(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExFetchPublicKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Gaia.
   * <pre>
   * 应用列表上报
   * </pre>
   */
  public static final class GaiaFutureStub
      extends io.grpc.stub.AbstractFutureStub<GaiaFutureStub> {
    private GaiaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GaiaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GaiaFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 应用列表上报
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.gaia.gw.UploadAppListReply> exUploadAppList(
        bilibili.gaia.gw.GaiaEncryptMsgReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExUploadAppListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 拉取rsa公钥
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.gaia.gw.FetchPublicKeyReply> exFetchPublicKey(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExFetchPublicKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EX_UPLOAD_APP_LIST = 0;
  private static final int METHODID_EX_FETCH_PUBLIC_KEY = 1;

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
        case METHODID_EX_UPLOAD_APP_LIST:
          serviceImpl.exUploadAppList((bilibili.gaia.gw.GaiaEncryptMsgReq) request,
              (io.grpc.stub.StreamObserver<bilibili.gaia.gw.UploadAppListReply>) responseObserver);
          break;
        case METHODID_EX_FETCH_PUBLIC_KEY:
          serviceImpl.exFetchPublicKey((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.gaia.gw.FetchPublicKeyReply>) responseObserver);
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
          getExUploadAppListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.gaia.gw.GaiaEncryptMsgReq,
              bilibili.gaia.gw.UploadAppListReply>(
                service, METHODID_EX_UPLOAD_APP_LIST)))
        .addMethod(
          getExFetchPublicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.gaia.gw.FetchPublicKeyReply>(
                service, METHODID_EX_FETCH_PUBLIC_KEY)))
        .build();
  }

  private static abstract class GaiaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GaiaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.gaia.gw.GwApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Gaia");
    }
  }

  private static final class GaiaFileDescriptorSupplier
      extends GaiaBaseDescriptorSupplier {
    GaiaFileDescriptorSupplier() {}
  }

  private static final class GaiaMethodDescriptorSupplier
      extends GaiaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GaiaMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GaiaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GaiaFileDescriptorSupplier())
              .addMethod(getExUploadAppListMethod())
              .addMethod(getExFetchPublicKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
