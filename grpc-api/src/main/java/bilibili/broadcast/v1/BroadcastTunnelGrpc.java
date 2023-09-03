package bilibili.broadcast.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * broadcast连接隧道
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/v1/broadcast.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BroadcastTunnelGrpc {

  private BroadcastTunnelGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.v1.BroadcastTunnel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.broadcast.v1.BroadcastFrame,
      bilibili.broadcast.v1.BroadcastFrame> getCreateTunnelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTunnel",
      requestType = bilibili.broadcast.v1.BroadcastFrame.class,
      responseType = bilibili.broadcast.v1.BroadcastFrame.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<bilibili.broadcast.v1.BroadcastFrame,
      bilibili.broadcast.v1.BroadcastFrame> getCreateTunnelMethod() {
    io.grpc.MethodDescriptor<bilibili.broadcast.v1.BroadcastFrame, bilibili.broadcast.v1.BroadcastFrame> getCreateTunnelMethod;
    if ((getCreateTunnelMethod = BroadcastTunnelGrpc.getCreateTunnelMethod) == null) {
      synchronized (BroadcastTunnelGrpc.class) {
        if ((getCreateTunnelMethod = BroadcastTunnelGrpc.getCreateTunnelMethod) == null) {
          BroadcastTunnelGrpc.getCreateTunnelMethod = getCreateTunnelMethod =
              io.grpc.MethodDescriptor.<bilibili.broadcast.v1.BroadcastFrame, bilibili.broadcast.v1.BroadcastFrame>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTunnel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.BroadcastFrame.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.BroadcastFrame.getDefaultInstance()))
              .setSchemaDescriptor(new BroadcastTunnelMethodDescriptorSupplier("CreateTunnel"))
              .build();
        }
      }
    }
    return getCreateTunnelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BroadcastTunnelStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastTunnelStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastTunnelStub>() {
        @java.lang.Override
        public BroadcastTunnelStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastTunnelStub(channel, callOptions);
        }
      };
    return BroadcastTunnelStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BroadcastTunnelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastTunnelBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastTunnelBlockingStub>() {
        @java.lang.Override
        public BroadcastTunnelBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastTunnelBlockingStub(channel, callOptions);
        }
      };
    return BroadcastTunnelBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BroadcastTunnelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastTunnelFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastTunnelFutureStub>() {
        @java.lang.Override
        public BroadcastTunnelFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastTunnelFutureStub(channel, callOptions);
        }
      };
    return BroadcastTunnelFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * broadcast连接隧道
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 创建双向stream连接隧道
     * </pre>
     */
    default io.grpc.stub.StreamObserver<bilibili.broadcast.v1.BroadcastFrame> createTunnel(
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.BroadcastFrame> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateTunnelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BroadcastTunnel.
   * <pre>
   * broadcast连接隧道
   * </pre>
   */
  public static abstract class BroadcastTunnelImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BroadcastTunnelGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BroadcastTunnel.
   * <pre>
   * broadcast连接隧道
   * </pre>
   */
  public static final class BroadcastTunnelStub
      extends io.grpc.stub.AbstractAsyncStub<BroadcastTunnelStub> {
    private BroadcastTunnelStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastTunnelStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastTunnelStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建双向stream连接隧道
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bilibili.broadcast.v1.BroadcastFrame> createTunnel(
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.BroadcastFrame> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCreateTunnelMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BroadcastTunnel.
   * <pre>
   * broadcast连接隧道
   * </pre>
   */
  public static final class BroadcastTunnelBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BroadcastTunnelBlockingStub> {
    private BroadcastTunnelBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastTunnelBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastTunnelBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BroadcastTunnel.
   * <pre>
   * broadcast连接隧道
   * </pre>
   */
  public static final class BroadcastTunnelFutureStub
      extends io.grpc.stub.AbstractFutureStub<BroadcastTunnelFutureStub> {
    private BroadcastTunnelFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastTunnelFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastTunnelFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CREATE_TUNNEL = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TUNNEL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createTunnel(
              (io.grpc.stub.StreamObserver<bilibili.broadcast.v1.BroadcastFrame>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateTunnelMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              bilibili.broadcast.v1.BroadcastFrame,
              bilibili.broadcast.v1.BroadcastFrame>(
                service, METHODID_CREATE_TUNNEL)))
        .build();
  }

  private static abstract class BroadcastTunnelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BroadcastTunnelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.v1.BroadcastOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BroadcastTunnel");
    }
  }

  private static final class BroadcastTunnelFileDescriptorSupplier
      extends BroadcastTunnelBaseDescriptorSupplier {
    BroadcastTunnelFileDescriptorSupplier() {}
  }

  private static final class BroadcastTunnelMethodDescriptorSupplier
      extends BroadcastTunnelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BroadcastTunnelMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BroadcastTunnelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BroadcastTunnelFileDescriptorSupplier())
              .addMethod(getCreateTunnelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
