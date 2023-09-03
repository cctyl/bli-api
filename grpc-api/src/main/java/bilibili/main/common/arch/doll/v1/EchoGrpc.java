package bilibili.main.common.arch.doll.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/main/common/arch/doll/v1/doll.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EchoGrpc {

  private EchoGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.main.common.arch.doll.v1.Echo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.PingRequest,
      bilibili.main.common.arch.doll.v1.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = bilibili.main.common.arch.doll.v1.PingRequest.class,
      responseType = bilibili.main.common.arch.doll.v1.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.PingRequest,
      bilibili.main.common.arch.doll.v1.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.PingRequest, bilibili.main.common.arch.doll.v1.PingResponse> getPingMethod;
    if ((getPingMethod = EchoGrpc.getPingMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getPingMethod = EchoGrpc.getPingMethod) == null) {
          EchoGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<bilibili.main.common.arch.doll.v1.PingRequest, bilibili.main.common.arch.doll.v1.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.common.arch.doll.v1.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.common.arch.doll.v1.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.SayRequest,
      bilibili.main.common.arch.doll.v1.SayResponse> getSayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Say",
      requestType = bilibili.main.common.arch.doll.v1.SayRequest.class,
      responseType = bilibili.main.common.arch.doll.v1.SayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.SayRequest,
      bilibili.main.common.arch.doll.v1.SayResponse> getSayMethod() {
    io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.SayRequest, bilibili.main.common.arch.doll.v1.SayResponse> getSayMethod;
    if ((getSayMethod = EchoGrpc.getSayMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getSayMethod = EchoGrpc.getSayMethod) == null) {
          EchoGrpc.getSayMethod = getSayMethod =
              io.grpc.MethodDescriptor.<bilibili.main.common.arch.doll.v1.SayRequest, bilibili.main.common.arch.doll.v1.SayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Say"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.common.arch.doll.v1.SayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.common.arch.doll.v1.SayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("Say"))
              .build();
        }
      }
    }
    return getSayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.ErrorRequest,
      bilibili.main.common.arch.doll.v1.ErrorResponse> getErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Error",
      requestType = bilibili.main.common.arch.doll.v1.ErrorRequest.class,
      responseType = bilibili.main.common.arch.doll.v1.ErrorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.ErrorRequest,
      bilibili.main.common.arch.doll.v1.ErrorResponse> getErrorMethod() {
    io.grpc.MethodDescriptor<bilibili.main.common.arch.doll.v1.ErrorRequest, bilibili.main.common.arch.doll.v1.ErrorResponse> getErrorMethod;
    if ((getErrorMethod = EchoGrpc.getErrorMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getErrorMethod = EchoGrpc.getErrorMethod) == null) {
          EchoGrpc.getErrorMethod = getErrorMethod =
              io.grpc.MethodDescriptor.<bilibili.main.common.arch.doll.v1.ErrorRequest, bilibili.main.common.arch.doll.v1.ErrorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Error"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.common.arch.doll.v1.ErrorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.common.arch.doll.v1.ErrorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("Error"))
              .build();
        }
      }
    }
    return getErrorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoStub>() {
        @java.lang.Override
        public EchoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoStub(channel, callOptions);
        }
      };
    return EchoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoBlockingStub>() {
        @java.lang.Override
        public EchoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoBlockingStub(channel, callOptions);
        }
      };
    return EchoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoFutureStub>() {
        @java.lang.Override
        public EchoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoFutureStub(channel, callOptions);
        }
      };
    return EchoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void ping(bilibili.main.common.arch.doll.v1.PingRequest request,
        io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.PingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    default void say(bilibili.main.common.arch.doll.v1.SayRequest request,
        io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.SayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayMethod(), responseObserver);
    }

    /**
     */
    default void error(bilibili.main.common.arch.doll.v1.ErrorRequest request,
        io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.ErrorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getErrorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Echo.
   */
  public static abstract class EchoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EchoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Echo.
   */
  public static final class EchoStub
      extends io.grpc.stub.AbstractAsyncStub<EchoStub> {
    private EchoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoStub(channel, callOptions);
    }

    /**
     */
    public void ping(bilibili.main.common.arch.doll.v1.PingRequest request,
        io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.PingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void say(bilibili.main.common.arch.doll.v1.SayRequest request,
        io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.SayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void error(bilibili.main.common.arch.doll.v1.ErrorRequest request,
        io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.ErrorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getErrorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Echo.
   */
  public static final class EchoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EchoBlockingStub> {
    private EchoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.main.common.arch.doll.v1.PingResponse ping(bilibili.main.common.arch.doll.v1.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.common.arch.doll.v1.SayResponse say(bilibili.main.common.arch.doll.v1.SayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.common.arch.doll.v1.ErrorResponse error(bilibili.main.common.arch.doll.v1.ErrorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getErrorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Echo.
   */
  public static final class EchoFutureStub
      extends io.grpc.stub.AbstractFutureStub<EchoFutureStub> {
    private EchoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.common.arch.doll.v1.PingResponse> ping(
        bilibili.main.common.arch.doll.v1.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.common.arch.doll.v1.SayResponse> say(
        bilibili.main.common.arch.doll.v1.SayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.common.arch.doll.v1.ErrorResponse> error(
        bilibili.main.common.arch.doll.v1.ErrorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getErrorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_SAY = 1;
  private static final int METHODID_ERROR = 2;

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
        case METHODID_PING:
          serviceImpl.ping((bilibili.main.common.arch.doll.v1.PingRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.PingResponse>) responseObserver);
          break;
        case METHODID_SAY:
          serviceImpl.say((bilibili.main.common.arch.doll.v1.SayRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.SayResponse>) responseObserver);
          break;
        case METHODID_ERROR:
          serviceImpl.error((bilibili.main.common.arch.doll.v1.ErrorRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.main.common.arch.doll.v1.ErrorResponse>) responseObserver);
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
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.common.arch.doll.v1.PingRequest,
              bilibili.main.common.arch.doll.v1.PingResponse>(
                service, METHODID_PING)))
        .addMethod(
          getSayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.common.arch.doll.v1.SayRequest,
              bilibili.main.common.arch.doll.v1.SayResponse>(
                service, METHODID_SAY)))
        .addMethod(
          getErrorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.common.arch.doll.v1.ErrorRequest,
              bilibili.main.common.arch.doll.v1.ErrorResponse>(
                service, METHODID_ERROR)))
        .build();
  }

  private static abstract class EchoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.main.common.arch.doll.v1.Doll.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Echo");
    }
  }

  private static final class EchoFileDescriptorSupplier
      extends EchoBaseDescriptorSupplier {
    EchoFileDescriptorSupplier() {}
  }

  private static final class EchoMethodDescriptorSupplier
      extends EchoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EchoMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EchoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getSayMethod())
              .addMethod(getErrorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
