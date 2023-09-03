package bilibili.broadcast.message.editor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/message/editor/notify.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OperationNotifyGrpc {

  private OperationNotifyGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.message.editor.OperationNotify";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.editor.Notify> getOperationNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OperationNotify",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.editor.Notify.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.editor.Notify> getOperationNotifyMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.editor.Notify> getOperationNotifyMethod;
    if ((getOperationNotifyMethod = OperationNotifyGrpc.getOperationNotifyMethod) == null) {
      synchronized (OperationNotifyGrpc.class) {
        if ((getOperationNotifyMethod = OperationNotifyGrpc.getOperationNotifyMethod) == null) {
          OperationNotifyGrpc.getOperationNotifyMethod = getOperationNotifyMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.editor.Notify>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OperationNotify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.editor.Notify.getDefaultInstance()))
              .setSchemaDescriptor(new OperationNotifyMethodDescriptorSupplier("OperationNotify"))
              .build();
        }
      }
    }
    return getOperationNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationNotifyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationNotifyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationNotifyStub>() {
        @java.lang.Override
        public OperationNotifyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationNotifyStub(channel, callOptions);
        }
      };
    return OperationNotifyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationNotifyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationNotifyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationNotifyBlockingStub>() {
        @java.lang.Override
        public OperationNotifyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationNotifyBlockingStub(channel, callOptions);
        }
      };
    return OperationNotifyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperationNotifyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationNotifyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationNotifyFutureStub>() {
        @java.lang.Override
        public OperationNotifyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationNotifyFutureStub(channel, callOptions);
        }
      };
    return OperationNotifyFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void operationNotify(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.editor.Notify> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOperationNotifyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OperationNotify.
   */
  public static abstract class OperationNotifyImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OperationNotifyGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OperationNotify.
   */
  public static final class OperationNotifyStub
      extends io.grpc.stub.AbstractAsyncStub<OperationNotifyStub> {
    private OperationNotifyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationNotifyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationNotifyStub(channel, callOptions);
    }

    /**
     */
    public void operationNotify(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.editor.Notify> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOperationNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OperationNotify.
   */
  public static final class OperationNotifyBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OperationNotifyBlockingStub> {
    private OperationNotifyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationNotifyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationNotifyBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<bilibili.broadcast.message.editor.Notify> operationNotify(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOperationNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OperationNotify.
   */
  public static final class OperationNotifyFutureStub
      extends io.grpc.stub.AbstractFutureStub<OperationNotifyFutureStub> {
    private OperationNotifyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationNotifyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationNotifyFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_OPERATION_NOTIFY = 0;

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
        case METHODID_OPERATION_NOTIFY:
          serviceImpl.operationNotify((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.editor.Notify>) responseObserver);
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
          getOperationNotifyMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.editor.Notify>(
                service, METHODID_OPERATION_NOTIFY)))
        .build();
  }

  private static abstract class OperationNotifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperationNotifyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.message.editor.NotifyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OperationNotify");
    }
  }

  private static final class OperationNotifyFileDescriptorSupplier
      extends OperationNotifyBaseDescriptorSupplier {
    OperationNotifyFileDescriptorSupplier() {}
  }

  private static final class OperationNotifyMethodDescriptorSupplier
      extends OperationNotifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OperationNotifyMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OperationNotifyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperationNotifyFileDescriptorSupplier())
              .addMethod(getOperationNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
