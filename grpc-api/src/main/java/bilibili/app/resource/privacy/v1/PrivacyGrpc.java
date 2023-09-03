package bilibili.app.resource.privacy.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 隐私
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/resource/privacy/v1/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrivacyGrpc {

  private PrivacyGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.resource.privacy.v1.Privacy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.resource.privacy.v1.NoArgRequest,
      bilibili.app.resource.privacy.v1.PrivacyConfigReply> getPrivacyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrivacyConfig",
      requestType = bilibili.app.resource.privacy.v1.NoArgRequest.class,
      responseType = bilibili.app.resource.privacy.v1.PrivacyConfigReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.resource.privacy.v1.NoArgRequest,
      bilibili.app.resource.privacy.v1.PrivacyConfigReply> getPrivacyConfigMethod() {
    io.grpc.MethodDescriptor<bilibili.app.resource.privacy.v1.NoArgRequest, bilibili.app.resource.privacy.v1.PrivacyConfigReply> getPrivacyConfigMethod;
    if ((getPrivacyConfigMethod = PrivacyGrpc.getPrivacyConfigMethod) == null) {
      synchronized (PrivacyGrpc.class) {
        if ((getPrivacyConfigMethod = PrivacyGrpc.getPrivacyConfigMethod) == null) {
          PrivacyGrpc.getPrivacyConfigMethod = getPrivacyConfigMethod =
              io.grpc.MethodDescriptor.<bilibili.app.resource.privacy.v1.NoArgRequest, bilibili.app.resource.privacy.v1.PrivacyConfigReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrivacyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.resource.privacy.v1.NoArgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.resource.privacy.v1.PrivacyConfigReply.getDefaultInstance()))
              .setSchemaDescriptor(new PrivacyMethodDescriptorSupplier("PrivacyConfig"))
              .build();
        }
      }
    }
    return getPrivacyConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest,
      bilibili.app.resource.privacy.v1.NoReply> getSetPrivacyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPrivacyConfig",
      requestType = bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest.class,
      responseType = bilibili.app.resource.privacy.v1.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest,
      bilibili.app.resource.privacy.v1.NoReply> getSetPrivacyConfigMethod() {
    io.grpc.MethodDescriptor<bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest, bilibili.app.resource.privacy.v1.NoReply> getSetPrivacyConfigMethod;
    if ((getSetPrivacyConfigMethod = PrivacyGrpc.getSetPrivacyConfigMethod) == null) {
      synchronized (PrivacyGrpc.class) {
        if ((getSetPrivacyConfigMethod = PrivacyGrpc.getSetPrivacyConfigMethod) == null) {
          PrivacyGrpc.getSetPrivacyConfigMethod = getSetPrivacyConfigMethod =
              io.grpc.MethodDescriptor.<bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest, bilibili.app.resource.privacy.v1.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPrivacyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.resource.privacy.v1.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new PrivacyMethodDescriptorSupplier("SetPrivacyConfig"))
              .build();
        }
      }
    }
    return getSetPrivacyConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrivacyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivacyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivacyStub>() {
        @java.lang.Override
        public PrivacyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivacyStub(channel, callOptions);
        }
      };
    return PrivacyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrivacyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivacyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivacyBlockingStub>() {
        @java.lang.Override
        public PrivacyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivacyBlockingStub(channel, callOptions);
        }
      };
    return PrivacyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrivacyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivacyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivacyFutureStub>() {
        @java.lang.Override
        public PrivacyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivacyFutureStub(channel, callOptions);
        }
      };
    return PrivacyFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 隐私
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取隐私设置
     * </pre>
     */
    default void privacyConfig(bilibili.app.resource.privacy.v1.NoArgRequest request,
        io.grpc.stub.StreamObserver<bilibili.app.resource.privacy.v1.PrivacyConfigReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrivacyConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * 修改隐私设置
     * </pre>
     */
    default void setPrivacyConfig(bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest request,
        io.grpc.stub.StreamObserver<bilibili.app.resource.privacy.v1.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPrivacyConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Privacy.
   * <pre>
   * 隐私
   * </pre>
   */
  public static abstract class PrivacyImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PrivacyGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Privacy.
   * <pre>
   * 隐私
   * </pre>
   */
  public static final class PrivacyStub
      extends io.grpc.stub.AbstractAsyncStub<PrivacyStub> {
    private PrivacyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivacyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivacyStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取隐私设置
     * </pre>
     */
    public void privacyConfig(bilibili.app.resource.privacy.v1.NoArgRequest request,
        io.grpc.stub.StreamObserver<bilibili.app.resource.privacy.v1.PrivacyConfigReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrivacyConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 修改隐私设置
     * </pre>
     */
    public void setPrivacyConfig(bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest request,
        io.grpc.stub.StreamObserver<bilibili.app.resource.privacy.v1.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPrivacyConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Privacy.
   * <pre>
   * 隐私
   * </pre>
   */
  public static final class PrivacyBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PrivacyBlockingStub> {
    private PrivacyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivacyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivacyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取隐私设置
     * </pre>
     */
    public bilibili.app.resource.privacy.v1.PrivacyConfigReply privacyConfig(bilibili.app.resource.privacy.v1.NoArgRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrivacyConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改隐私设置
     * </pre>
     */
    public bilibili.app.resource.privacy.v1.NoReply setPrivacyConfig(bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPrivacyConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Privacy.
   * <pre>
   * 隐私
   * </pre>
   */
  public static final class PrivacyFutureStub
      extends io.grpc.stub.AbstractFutureStub<PrivacyFutureStub> {
    private PrivacyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivacyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivacyFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取隐私设置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.resource.privacy.v1.PrivacyConfigReply> privacyConfig(
        bilibili.app.resource.privacy.v1.NoArgRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrivacyConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 修改隐私设置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.resource.privacy.v1.NoReply> setPrivacyConfig(
        bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPrivacyConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRIVACY_CONFIG = 0;
  private static final int METHODID_SET_PRIVACY_CONFIG = 1;

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
        case METHODID_PRIVACY_CONFIG:
          serviceImpl.privacyConfig((bilibili.app.resource.privacy.v1.NoArgRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.app.resource.privacy.v1.PrivacyConfigReply>) responseObserver);
          break;
        case METHODID_SET_PRIVACY_CONFIG:
          serviceImpl.setPrivacyConfig((bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.app.resource.privacy.v1.NoReply>) responseObserver);
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
          getPrivacyConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.resource.privacy.v1.NoArgRequest,
              bilibili.app.resource.privacy.v1.PrivacyConfigReply>(
                service, METHODID_PRIVACY_CONFIG)))
        .addMethod(
          getSetPrivacyConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.resource.privacy.v1.SetPrivacyConfigRequest,
              bilibili.app.resource.privacy.v1.NoReply>(
                service, METHODID_SET_PRIVACY_CONFIG)))
        .build();
  }

  private static abstract class PrivacyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrivacyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.resource.privacy.v1.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Privacy");
    }
  }

  private static final class PrivacyFileDescriptorSupplier
      extends PrivacyBaseDescriptorSupplier {
    PrivacyFileDescriptorSupplier() {}
  }

  private static final class PrivacyMethodDescriptorSupplier
      extends PrivacyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PrivacyMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PrivacyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrivacyFileDescriptorSupplier())
              .addMethod(getPrivacyConfigMethod())
              .addMethod(getSetPrivacyConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
