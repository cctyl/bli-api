package bilibili.app.distribution.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * APP配置
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/distribution/v1/distribution.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DistributionGrpc {

  private DistributionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.distribution.v1.Distribution";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq,
      bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply> getGetUserPreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPreference",
      requestType = bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq.class,
      responseType = bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq,
      bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply> getGetUserPreferenceMethod() {
    io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq, bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply> getGetUserPreferenceMethod;
    if ((getGetUserPreferenceMethod = DistributionGrpc.getGetUserPreferenceMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getGetUserPreferenceMethod = DistributionGrpc.getGetUserPreferenceMethod) == null) {
          DistributionGrpc.getGetUserPreferenceMethod = getGetUserPreferenceMethod =
              io.grpc.MethodDescriptor.<bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq, bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("GetUserPreference"))
              .build();
        }
      }
    }
    return getGetUserPreferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq,
      bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply> getSetUserPreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserPreference",
      requestType = bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq.class,
      responseType = bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq,
      bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply> getSetUserPreferenceMethod() {
    io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq, bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply> getSetUserPreferenceMethod;
    if ((getSetUserPreferenceMethod = DistributionGrpc.getSetUserPreferenceMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getSetUserPreferenceMethod = DistributionGrpc.getSetUserPreferenceMethod) == null) {
          DistributionGrpc.getSetUserPreferenceMethod = getSetUserPreferenceMethod =
              io.grpc.MethodDescriptor.<bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq, bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserPreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("SetUserPreference"))
              .build();
        }
      }
    }
    return getSetUserPreferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq,
      bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply> getUserPreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserPreference",
      requestType = bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq.class,
      responseType = bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq,
      bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply> getUserPreferenceMethod() {
    io.grpc.MethodDescriptor<bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq, bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply> getUserPreferenceMethod;
    if ((getUserPreferenceMethod = DistributionGrpc.getUserPreferenceMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getUserPreferenceMethod = DistributionGrpc.getUserPreferenceMethod) == null) {
          DistributionGrpc.getUserPreferenceMethod = getUserPreferenceMethod =
              io.grpc.MethodDescriptor.<bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq, bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserPreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("UserPreference"))
              .build();
        }
      }
    }
    return getUserPreferenceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DistributionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistributionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistributionStub>() {
        @java.lang.Override
        public DistributionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistributionStub(channel, callOptions);
        }
      };
    return DistributionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DistributionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistributionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistributionBlockingStub>() {
        @java.lang.Override
        public DistributionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistributionBlockingStub(channel, callOptions);
        }
      };
    return DistributionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DistributionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistributionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistributionFutureStub>() {
        @java.lang.Override
        public DistributionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistributionFutureStub(channel, callOptions);
        }
      };
    return DistributionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * APP配置
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取云端储存的用户偏好
     * </pre>
     */
    default void getUserPreference(bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq request,
        io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPreferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 设定用户偏好
     * </pre>
     */
    default void setUserPreference(bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq request,
        io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserPreferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取云控配置
     * </pre>
     */
    default void userPreference(bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq request,
        io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserPreferenceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Distribution.
   * <pre>
   * APP配置
   * </pre>
   */
  public static abstract class DistributionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DistributionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Distribution.
   * <pre>
   * APP配置
   * </pre>
   */
  public static final class DistributionStub
      extends io.grpc.stub.AbstractAsyncStub<DistributionStub> {
    private DistributionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistributionStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取云端储存的用户偏好
     * </pre>
     */
    public void getUserPreference(bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq request,
        io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPreferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 设定用户偏好
     * </pre>
     */
    public void setUserPreference(bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq request,
        io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserPreferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取云控配置
     * </pre>
     */
    public void userPreference(bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq request,
        io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserPreferenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Distribution.
   * <pre>
   * APP配置
   * </pre>
   */
  public static final class DistributionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DistributionBlockingStub> {
    private DistributionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistributionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取云端储存的用户偏好
     * </pre>
     */
    public bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply getUserPreference(bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPreferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 设定用户偏好
     * </pre>
     */
    public bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply setUserPreference(bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserPreferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取云控配置
     * </pre>
     */
    public bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply userPreference(bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserPreferenceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Distribution.
   * <pre>
   * APP配置
   * </pre>
   */
  public static final class DistributionFutureStub
      extends io.grpc.stub.AbstractFutureStub<DistributionFutureStub> {
    private DistributionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistributionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取云端储存的用户偏好
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply> getUserPreference(
        bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPreferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 设定用户偏好
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply> setUserPreference(
        bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserPreferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取云控配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply> userPreference(
        bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserPreferenceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_PREFERENCE = 0;
  private static final int METHODID_SET_USER_PREFERENCE = 1;
  private static final int METHODID_USER_PREFERENCE = 2;

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
        case METHODID_GET_USER_PREFERENCE:
          serviceImpl.getUserPreference((bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply>) responseObserver);
          break;
        case METHODID_SET_USER_PREFERENCE:
          serviceImpl.setUserPreference((bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply>) responseObserver);
          break;
        case METHODID_USER_PREFERENCE:
          serviceImpl.userPreference((bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply>) responseObserver);
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
          getGetUserPreferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReq,
              bilibili.app.distribution.v1.DistributionRpcProto.GetUserPreferenceReply>(
                service, METHODID_GET_USER_PREFERENCE)))
        .addMethod(
          getSetUserPreferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReq,
              bilibili.app.distribution.v1.DistributionRpcProto.SetUserPreferenceReply>(
                service, METHODID_SET_USER_PREFERENCE)))
        .addMethod(
          getUserPreferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReq,
              bilibili.app.distribution.v1.DistributionRpcProto.UserPreferenceReply>(
                service, METHODID_USER_PREFERENCE)))
        .build();
  }

  private static abstract class DistributionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DistributionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.distribution.v1.DistributionRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Distribution");
    }
  }

  private static final class DistributionFileDescriptorSupplier
      extends DistributionBaseDescriptorSupplier {
    DistributionFileDescriptorSupplier() {}
  }

  private static final class DistributionMethodDescriptorSupplier
      extends DistributionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DistributionMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DistributionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DistributionFileDescriptorSupplier())
              .addMethod(getGetUserPreferenceMethod())
              .addMethod(getSetUserPreferenceMethod())
              .addMethod(getUserPreferenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
