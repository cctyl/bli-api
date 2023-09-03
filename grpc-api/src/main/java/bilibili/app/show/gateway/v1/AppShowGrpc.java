package bilibili.app.show.gateway.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/show/gateway/v1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppShowGrpc {

  private AppShowGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.show.gateway.v1.AppShow";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.show.gateway.v1.GetActProgressReq,
      bilibili.app.show.gateway.v1.GetActProgressReply> getGetActProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActProgress",
      requestType = bilibili.app.show.gateway.v1.GetActProgressReq.class,
      responseType = bilibili.app.show.gateway.v1.GetActProgressReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.show.gateway.v1.GetActProgressReq,
      bilibili.app.show.gateway.v1.GetActProgressReply> getGetActProgressMethod() {
    io.grpc.MethodDescriptor<bilibili.app.show.gateway.v1.GetActProgressReq, bilibili.app.show.gateway.v1.GetActProgressReply> getGetActProgressMethod;
    if ((getGetActProgressMethod = AppShowGrpc.getGetActProgressMethod) == null) {
      synchronized (AppShowGrpc.class) {
        if ((getGetActProgressMethod = AppShowGrpc.getGetActProgressMethod) == null) {
          AppShowGrpc.getGetActProgressMethod = getGetActProgressMethod =
              io.grpc.MethodDescriptor.<bilibili.app.show.gateway.v1.GetActProgressReq, bilibili.app.show.gateway.v1.GetActProgressReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetActProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.gateway.v1.GetActProgressReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.gateway.v1.GetActProgressReply.getDefaultInstance()))
              .setSchemaDescriptor(new AppShowMethodDescriptorSupplier("GetActProgress"))
              .build();
        }
      }
    }
    return getGetActProgressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppShowStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppShowStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppShowStub>() {
        @java.lang.Override
        public AppShowStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppShowStub(channel, callOptions);
        }
      };
    return AppShowStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppShowBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppShowBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppShowBlockingStub>() {
        @java.lang.Override
        public AppShowBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppShowBlockingStub(channel, callOptions);
        }
      };
    return AppShowBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppShowFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppShowFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppShowFutureStub>() {
        @java.lang.Override
        public AppShowFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppShowFutureStub(channel, callOptions);
        }
      };
    return AppShowFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取Native页进度数据
     * </pre>
     */
    default void getActProgress(bilibili.app.show.gateway.v1.GetActProgressReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.gateway.v1.GetActProgressReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActProgressMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AppShow.
   */
  public static abstract class AppShowImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AppShowGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AppShow.
   */
  public static final class AppShowStub
      extends io.grpc.stub.AbstractAsyncStub<AppShowStub> {
    private AppShowStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppShowStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppShowStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取Native页进度数据
     * </pre>
     */
    public void getActProgress(bilibili.app.show.gateway.v1.GetActProgressReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.gateway.v1.GetActProgressReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetActProgressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AppShow.
   */
  public static final class AppShowBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AppShowBlockingStub> {
    private AppShowBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppShowBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppShowBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取Native页进度数据
     * </pre>
     */
    public bilibili.app.show.gateway.v1.GetActProgressReply getActProgress(bilibili.app.show.gateway.v1.GetActProgressReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetActProgressMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AppShow.
   */
  public static final class AppShowFutureStub
      extends io.grpc.stub.AbstractFutureStub<AppShowFutureStub> {
    private AppShowFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppShowFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppShowFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取Native页进度数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.show.gateway.v1.GetActProgressReply> getActProgress(
        bilibili.app.show.gateway.v1.GetActProgressReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetActProgressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACT_PROGRESS = 0;

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
        case METHODID_GET_ACT_PROGRESS:
          serviceImpl.getActProgress((bilibili.app.show.gateway.v1.GetActProgressReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.show.gateway.v1.GetActProgressReply>) responseObserver);
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
          getGetActProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.show.gateway.v1.GetActProgressReq,
              bilibili.app.show.gateway.v1.GetActProgressReply>(
                service, METHODID_GET_ACT_PROGRESS)))
        .build();
  }

  private static abstract class AppShowBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppShowBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.show.gateway.v1.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppShow");
    }
  }

  private static final class AppShowFileDescriptorSupplier
      extends AppShowBaseDescriptorSupplier {
    AppShowFileDescriptorSupplier() {}
  }

  private static final class AppShowMethodDescriptorSupplier
      extends AppShowBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AppShowMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AppShowGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppShowFileDescriptorSupplier())
              .addMethod(getGetActProgressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
