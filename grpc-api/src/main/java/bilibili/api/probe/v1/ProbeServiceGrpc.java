package bilibili.api.probe.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 服务可用性探针
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/api/probe/v1/probe.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProbeServiceGrpc {

  private ProbeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.api.probe.v1.ProbeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage,
      bilibili.api.probe.v1.SimpleMessage> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = bilibili.api.probe.v1.SimpleMessage.class,
      responseType = bilibili.api.probe.v1.SimpleMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage,
      bilibili.api.probe.v1.SimpleMessage> getEchoMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage, bilibili.api.probe.v1.SimpleMessage> getEchoMethod;
    if ((getEchoMethod = ProbeServiceGrpc.getEchoMethod) == null) {
      synchronized (ProbeServiceGrpc.class) {
        if ((getEchoMethod = ProbeServiceGrpc.getEchoMethod) == null) {
          ProbeServiceGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.SimpleMessage, bilibili.api.probe.v1.SimpleMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.SimpleMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.SimpleMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeServiceMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage,
      bilibili.api.probe.v1.SimpleMessage> getEchoBodyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoBody",
      requestType = bilibili.api.probe.v1.SimpleMessage.class,
      responseType = bilibili.api.probe.v1.SimpleMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage,
      bilibili.api.probe.v1.SimpleMessage> getEchoBodyMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage, bilibili.api.probe.v1.SimpleMessage> getEchoBodyMethod;
    if ((getEchoBodyMethod = ProbeServiceGrpc.getEchoBodyMethod) == null) {
      synchronized (ProbeServiceGrpc.class) {
        if ((getEchoBodyMethod = ProbeServiceGrpc.getEchoBodyMethod) == null) {
          ProbeServiceGrpc.getEchoBodyMethod = getEchoBodyMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.SimpleMessage, bilibili.api.probe.v1.SimpleMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoBody"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.SimpleMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.SimpleMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeServiceMethodDescriptorSupplier("EchoBody"))
              .build();
        }
      }
    }
    return getEchoBodyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage,
      bilibili.api.probe.v1.SimpleMessage> getEchoDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoDelete",
      requestType = bilibili.api.probe.v1.SimpleMessage.class,
      responseType = bilibili.api.probe.v1.SimpleMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage,
      bilibili.api.probe.v1.SimpleMessage> getEchoDeleteMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.SimpleMessage, bilibili.api.probe.v1.SimpleMessage> getEchoDeleteMethod;
    if ((getEchoDeleteMethod = ProbeServiceGrpc.getEchoDeleteMethod) == null) {
      synchronized (ProbeServiceGrpc.class) {
        if ((getEchoDeleteMethod = ProbeServiceGrpc.getEchoDeleteMethod) == null) {
          ProbeServiceGrpc.getEchoDeleteMethod = getEchoDeleteMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.SimpleMessage, bilibili.api.probe.v1.SimpleMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.SimpleMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.SimpleMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeServiceMethodDescriptorSupplier("EchoDelete"))
              .build();
        }
      }
    }
    return getEchoDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.ErrorMessage,
      bilibili.api.probe.v1.ErrorMessage> getEchoErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoError",
      requestType = bilibili.api.probe.v1.ErrorMessage.class,
      responseType = bilibili.api.probe.v1.ErrorMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.ErrorMessage,
      bilibili.api.probe.v1.ErrorMessage> getEchoErrorMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.ErrorMessage, bilibili.api.probe.v1.ErrorMessage> getEchoErrorMethod;
    if ((getEchoErrorMethod = ProbeServiceGrpc.getEchoErrorMethod) == null) {
      synchronized (ProbeServiceGrpc.class) {
        if ((getEchoErrorMethod = ProbeServiceGrpc.getEchoErrorMethod) == null) {
          ProbeServiceGrpc.getEchoErrorMethod = getEchoErrorMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.ErrorMessage, bilibili.api.probe.v1.ErrorMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoError"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.ErrorMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.ErrorMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeServiceMethodDescriptorSupplier("EchoError"))
              .build();
        }
      }
    }
    return getEchoErrorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.DynamicMessageUpdate,
      bilibili.api.probe.v1.DynamicMessageUpdate> getEchoPatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoPatch",
      requestType = bilibili.api.probe.v1.DynamicMessageUpdate.class,
      responseType = bilibili.api.probe.v1.DynamicMessageUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.DynamicMessageUpdate,
      bilibili.api.probe.v1.DynamicMessageUpdate> getEchoPatchMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.DynamicMessageUpdate, bilibili.api.probe.v1.DynamicMessageUpdate> getEchoPatchMethod;
    if ((getEchoPatchMethod = ProbeServiceGrpc.getEchoPatchMethod) == null) {
      synchronized (ProbeServiceGrpc.class) {
        if ((getEchoPatchMethod = ProbeServiceGrpc.getEchoPatchMethod) == null) {
          ProbeServiceGrpc.getEchoPatchMethod = getEchoPatchMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.DynamicMessageUpdate, bilibili.api.probe.v1.DynamicMessageUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoPatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.DynamicMessageUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.DynamicMessageUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeServiceMethodDescriptorSupplier("EchoPatch"))
              .build();
        }
      }
    }
    return getEchoPatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProbeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProbeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProbeServiceStub>() {
        @java.lang.Override
        public ProbeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProbeServiceStub(channel, callOptions);
        }
      };
    return ProbeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProbeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProbeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProbeServiceBlockingStub>() {
        @java.lang.Override
        public ProbeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProbeServiceBlockingStub(channel, callOptions);
        }
      };
    return ProbeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProbeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProbeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProbeServiceFutureStub>() {
        @java.lang.Override
        public ProbeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProbeServiceFutureStub(channel, callOptions);
        }
      };
    return ProbeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 
     * </pre>
     */
    default void echo(bilibili.api.probe.v1.SimpleMessage request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void echoBody(bilibili.api.probe.v1.SimpleMessage request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoBodyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void echoDelete(bilibili.api.probe.v1.SimpleMessage request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void echoError(bilibili.api.probe.v1.ErrorMessage request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ErrorMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoErrorMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void echoPatch(bilibili.api.probe.v1.DynamicMessageUpdate request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.DynamicMessageUpdate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoPatchMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProbeService.
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public static abstract class ProbeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProbeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProbeService.
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public static final class ProbeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProbeServiceStub> {
    private ProbeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProbeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void echo(bilibili.api.probe.v1.SimpleMessage request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void echoBody(bilibili.api.probe.v1.SimpleMessage request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoBodyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void echoDelete(bilibili.api.probe.v1.SimpleMessage request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void echoError(bilibili.api.probe.v1.ErrorMessage request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ErrorMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoErrorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void echoPatch(bilibili.api.probe.v1.DynamicMessageUpdate request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.DynamicMessageUpdate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoPatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProbeService.
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public static final class ProbeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProbeServiceBlockingStub> {
    private ProbeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProbeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.api.probe.v1.SimpleMessage echo(bilibili.api.probe.v1.SimpleMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.api.probe.v1.SimpleMessage echoBody(bilibili.api.probe.v1.SimpleMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoBodyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.api.probe.v1.SimpleMessage echoDelete(bilibili.api.probe.v1.SimpleMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.api.probe.v1.ErrorMessage echoError(bilibili.api.probe.v1.ErrorMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoErrorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.api.probe.v1.DynamicMessageUpdate echoPatch(bilibili.api.probe.v1.DynamicMessageUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoPatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProbeService.
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public static final class ProbeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProbeServiceFutureStub> {
    private ProbeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProbeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.SimpleMessage> echo(
        bilibili.api.probe.v1.SimpleMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.SimpleMessage> echoBody(
        bilibili.api.probe.v1.SimpleMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoBodyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.SimpleMessage> echoDelete(
        bilibili.api.probe.v1.SimpleMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.ErrorMessage> echoError(
        bilibili.api.probe.v1.ErrorMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoErrorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.DynamicMessageUpdate> echoPatch(
        bilibili.api.probe.v1.DynamicMessageUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoPatchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_ECHO_BODY = 1;
  private static final int METHODID_ECHO_DELETE = 2;
  private static final int METHODID_ECHO_ERROR = 3;
  private static final int METHODID_ECHO_PATCH = 4;

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
        case METHODID_ECHO:
          serviceImpl.echo((bilibili.api.probe.v1.SimpleMessage) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage>) responseObserver);
          break;
        case METHODID_ECHO_BODY:
          serviceImpl.echoBody((bilibili.api.probe.v1.SimpleMessage) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage>) responseObserver);
          break;
        case METHODID_ECHO_DELETE:
          serviceImpl.echoDelete((bilibili.api.probe.v1.SimpleMessage) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.SimpleMessage>) responseObserver);
          break;
        case METHODID_ECHO_ERROR:
          serviceImpl.echoError((bilibili.api.probe.v1.ErrorMessage) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ErrorMessage>) responseObserver);
          break;
        case METHODID_ECHO_PATCH:
          serviceImpl.echoPatch((bilibili.api.probe.v1.DynamicMessageUpdate) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.DynamicMessageUpdate>) responseObserver);
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
          getEchoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.SimpleMessage,
              bilibili.api.probe.v1.SimpleMessage>(
                service, METHODID_ECHO)))
        .addMethod(
          getEchoBodyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.SimpleMessage,
              bilibili.api.probe.v1.SimpleMessage>(
                service, METHODID_ECHO_BODY)))
        .addMethod(
          getEchoDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.SimpleMessage,
              bilibili.api.probe.v1.SimpleMessage>(
                service, METHODID_ECHO_DELETE)))
        .addMethod(
          getEchoErrorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.ErrorMessage,
              bilibili.api.probe.v1.ErrorMessage>(
                service, METHODID_ECHO_ERROR)))
        .addMethod(
          getEchoPatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.DynamicMessageUpdate,
              bilibili.api.probe.v1.DynamicMessageUpdate>(
                service, METHODID_ECHO_PATCH)))
        .build();
  }

  private static abstract class ProbeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProbeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.api.probe.v1.ProbeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProbeService");
    }
  }

  private static final class ProbeServiceFileDescriptorSupplier
      extends ProbeServiceBaseDescriptorSupplier {
    ProbeServiceFileDescriptorSupplier() {}
  }

  private static final class ProbeServiceMethodDescriptorSupplier
      extends ProbeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProbeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProbeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProbeServiceFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .addMethod(getEchoBodyMethod())
              .addMethod(getEchoDeleteMethod())
              .addMethod(getEchoErrorMethod())
              .addMethod(getEchoPatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
