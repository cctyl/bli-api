package bilibili.polymer.app.govern.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 反骚扰
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/polymer/community/govern/v1/govern.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AntiHarassmentServiceGrpc {

  private AntiHarassmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.polymer.app.govern.v1.AntiHarassmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq,
      bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp> getStoreAntiHarassmentSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreAntiHarassmentSettings",
      requestType = bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq.class,
      responseType = bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq,
      bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp> getStoreAntiHarassmentSettingsMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq, bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp> getStoreAntiHarassmentSettingsMethod;
    if ((getStoreAntiHarassmentSettingsMethod = AntiHarassmentServiceGrpc.getStoreAntiHarassmentSettingsMethod) == null) {
      synchronized (AntiHarassmentServiceGrpc.class) {
        if ((getStoreAntiHarassmentSettingsMethod = AntiHarassmentServiceGrpc.getStoreAntiHarassmentSettingsMethod) == null) {
          AntiHarassmentServiceGrpc.getStoreAntiHarassmentSettingsMethod = getStoreAntiHarassmentSettingsMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq, bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreAntiHarassmentSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp.getDefaultInstance()))
              .setSchemaDescriptor(new AntiHarassmentServiceMethodDescriptorSupplier("StoreAntiHarassmentSettings"))
              .build();
        }
      }
    }
    return getStoreAntiHarassmentSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq,
      bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp> getLoadAntiHarassmentSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadAntiHarassmentSettings",
      requestType = bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq.class,
      responseType = bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq,
      bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp> getLoadAntiHarassmentSettingsMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq, bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp> getLoadAntiHarassmentSettingsMethod;
    if ((getLoadAntiHarassmentSettingsMethod = AntiHarassmentServiceGrpc.getLoadAntiHarassmentSettingsMethod) == null) {
      synchronized (AntiHarassmentServiceGrpc.class) {
        if ((getLoadAntiHarassmentSettingsMethod = AntiHarassmentServiceGrpc.getLoadAntiHarassmentSettingsMethod) == null) {
          AntiHarassmentServiceGrpc.getLoadAntiHarassmentSettingsMethod = getLoadAntiHarassmentSettingsMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq, bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadAntiHarassmentSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp.getDefaultInstance()))
              .setSchemaDescriptor(new AntiHarassmentServiceMethodDescriptorSupplier("LoadAntiHarassmentSettings"))
              .build();
        }
      }
    }
    return getLoadAntiHarassmentSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AntiHarassmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AntiHarassmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AntiHarassmentServiceStub>() {
        @java.lang.Override
        public AntiHarassmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AntiHarassmentServiceStub(channel, callOptions);
        }
      };
    return AntiHarassmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AntiHarassmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AntiHarassmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AntiHarassmentServiceBlockingStub>() {
        @java.lang.Override
        public AntiHarassmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AntiHarassmentServiceBlockingStub(channel, callOptions);
        }
      };
    return AntiHarassmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AntiHarassmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AntiHarassmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AntiHarassmentServiceFutureStub>() {
        @java.lang.Override
        public AntiHarassmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AntiHarassmentServiceFutureStub(channel, callOptions);
        }
      };
    return AntiHarassmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 反骚扰
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void storeAntiHarassmentSettings(bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreAntiHarassmentSettingsMethod(), responseObserver);
    }

    /**
     */
    default void loadAntiHarassmentSettings(bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadAntiHarassmentSettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AntiHarassmentService.
   * <pre>
   * 反骚扰
   * </pre>
   */
  public static abstract class AntiHarassmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AntiHarassmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AntiHarassmentService.
   * <pre>
   * 反骚扰
   * </pre>
   */
  public static final class AntiHarassmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AntiHarassmentServiceStub> {
    private AntiHarassmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AntiHarassmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AntiHarassmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void storeAntiHarassmentSettings(bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreAntiHarassmentSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadAntiHarassmentSettings(bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadAntiHarassmentSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AntiHarassmentService.
   * <pre>
   * 反骚扰
   * </pre>
   */
  public static final class AntiHarassmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AntiHarassmentServiceBlockingStub> {
    private AntiHarassmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AntiHarassmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AntiHarassmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp storeAntiHarassmentSettings(bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreAntiHarassmentSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp loadAntiHarassmentSettings(bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadAntiHarassmentSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AntiHarassmentService.
   * <pre>
   * 反骚扰
   * </pre>
   */
  public static final class AntiHarassmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AntiHarassmentServiceFutureStub> {
    private AntiHarassmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AntiHarassmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AntiHarassmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp> storeAntiHarassmentSettings(
        bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreAntiHarassmentSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp> loadAntiHarassmentSettings(
        bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadAntiHarassmentSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_ANTI_HARASSMENT_SETTINGS = 0;
  private static final int METHODID_LOAD_ANTI_HARASSMENT_SETTINGS = 1;

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
        case METHODID_STORE_ANTI_HARASSMENT_SETTINGS:
          serviceImpl.storeAntiHarassmentSettings((bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp>) responseObserver);
          break;
        case METHODID_LOAD_ANTI_HARASSMENT_SETTINGS:
          serviceImpl.loadAntiHarassmentSettings((bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp>) responseObserver);
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
          getStoreAntiHarassmentSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsReq,
              bilibili.polymer.app.govern.v1.GovernRpcProto.StoreAntiHarassmentSettingsRsp>(
                service, METHODID_STORE_ANTI_HARASSMENT_SETTINGS)))
        .addMethod(
          getLoadAntiHarassmentSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsReq,
              bilibili.polymer.app.govern.v1.GovernRpcProto.LoadAntiHarassmentSettingsRsp>(
                service, METHODID_LOAD_ANTI_HARASSMENT_SETTINGS)))
        .build();
  }

  private static abstract class AntiHarassmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AntiHarassmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.polymer.app.govern.v1.GovernRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AntiHarassmentService");
    }
  }

  private static final class AntiHarassmentServiceFileDescriptorSupplier
      extends AntiHarassmentServiceBaseDescriptorSupplier {
    AntiHarassmentServiceFileDescriptorSupplier() {}
  }

  private static final class AntiHarassmentServiceMethodDescriptorSupplier
      extends AntiHarassmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AntiHarassmentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AntiHarassmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AntiHarassmentServiceFileDescriptorSupplier())
              .addMethod(getStoreAntiHarassmentSettingsMethod())
              .addMethod(getLoadAntiHarassmentSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
