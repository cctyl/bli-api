package bilibili.relation.interface.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/relation/interfaces/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RelationInterfaceGrpc {

  private RelationInterfaceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.relation.interface.v1.RelationInterface";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.relation.interface.v1.AtSearchReq,
      bilibili.relation.interface.v1.AtSearchReply> getAtSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AtSearch",
      requestType = bilibili.relation.interface.v1.AtSearchReq.class,
      responseType = bilibili.relation.interface.v1.AtSearchReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.relation.interface.v1.AtSearchReq,
      bilibili.relation.interface.v1.AtSearchReply> getAtSearchMethod() {
    io.grpc.MethodDescriptor<bilibili.relation.interface.v1.AtSearchReq, bilibili.relation.interface.v1.AtSearchReply> getAtSearchMethod;
    if ((getAtSearchMethod = RelationInterfaceGrpc.getAtSearchMethod) == null) {
      synchronized (RelationInterfaceGrpc.class) {
        if ((getAtSearchMethod = RelationInterfaceGrpc.getAtSearchMethod) == null) {
          RelationInterfaceGrpc.getAtSearchMethod = getAtSearchMethod =
              io.grpc.MethodDescriptor.<bilibili.relation.interface.v1.AtSearchReq, bilibili.relation.interface.v1.AtSearchReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AtSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.relation.interface.v1.AtSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.relation.interface.v1.AtSearchReply.getDefaultInstance()))
              .setSchemaDescriptor(new RelationInterfaceMethodDescriptorSupplier("AtSearch"))
              .build();
        }
      }
    }
    return getAtSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RelationInterfaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RelationInterfaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RelationInterfaceStub>() {
        @java.lang.Override
        public RelationInterfaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RelationInterfaceStub(channel, callOptions);
        }
      };
    return RelationInterfaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RelationInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RelationInterfaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RelationInterfaceBlockingStub>() {
        @java.lang.Override
        public RelationInterfaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RelationInterfaceBlockingStub(channel, callOptions);
        }
      };
    return RelationInterfaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RelationInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RelationInterfaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RelationInterfaceFutureStub>() {
        @java.lang.Override
        public RelationInterfaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RelationInterfaceFutureStub(channel, callOptions);
        }
      };
    return RelationInterfaceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 评论区 At 用户列表 (无需登录鉴权)
     * </pre>
     */
    default void atSearch(bilibili.relation.interface.v1.AtSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.relation.interface.v1.AtSearchReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAtSearchMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RelationInterface.
   */
  public static abstract class RelationInterfaceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RelationInterfaceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RelationInterface.
   */
  public static final class RelationInterfaceStub
      extends io.grpc.stub.AbstractAsyncStub<RelationInterfaceStub> {
    private RelationInterfaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RelationInterfaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RelationInterfaceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 评论区 At 用户列表 (无需登录鉴权)
     * </pre>
     */
    public void atSearch(bilibili.relation.interface.v1.AtSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.relation.interface.v1.AtSearchReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAtSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RelationInterface.
   */
  public static final class RelationInterfaceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RelationInterfaceBlockingStub> {
    private RelationInterfaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RelationInterfaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RelationInterfaceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 评论区 At 用户列表 (无需登录鉴权)
     * </pre>
     */
    public bilibili.relation.interface.v1.AtSearchReply atSearch(bilibili.relation.interface.v1.AtSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAtSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RelationInterface.
   */
  public static final class RelationInterfaceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RelationInterfaceFutureStub> {
    private RelationInterfaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RelationInterfaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RelationInterfaceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 评论区 At 用户列表 (无需登录鉴权)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.relation.interface.v1.AtSearchReply> atSearch(
        bilibili.relation.interface.v1.AtSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAtSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AT_SEARCH = 0;

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
        case METHODID_AT_SEARCH:
          serviceImpl.atSearch((bilibili.relation.interface.v1.AtSearchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.relation.interface.v1.AtSearchReply>) responseObserver);
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
          getAtSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.relation.interface.v1.AtSearchReq,
              bilibili.relation.interface.v1.AtSearchReply>(
                service, METHODID_AT_SEARCH)))
        .build();
  }

  private static abstract class RelationInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RelationInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.relation.interface.v1.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RelationInterface");
    }
  }

  private static final class RelationInterfaceFileDescriptorSupplier
      extends RelationInterfaceBaseDescriptorSupplier {
    RelationInterfaceFileDescriptorSupplier() {}
  }

  private static final class RelationInterfaceMethodDescriptorSupplier
      extends RelationInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RelationInterfaceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RelationInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RelationInterfaceFileDescriptorSupplier())
              .addMethod(getAtSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
