package bilibili.app.wall.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 免流规则
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/wall/v1/wall.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WallGrpc {

  private WallGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.wall.v1.Wall";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.wall.v1.WallRpcProto.RuleRequest,
      bilibili.app.wall.v1.WallRpcProto.RulesReply> getRuleInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RuleInfo",
      requestType = bilibili.app.wall.v1.WallRpcProto.RuleRequest.class,
      responseType = bilibili.app.wall.v1.WallRpcProto.RulesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.wall.v1.WallRpcProto.RuleRequest,
      bilibili.app.wall.v1.WallRpcProto.RulesReply> getRuleInfoMethod() {
    io.grpc.MethodDescriptor<bilibili.app.wall.v1.WallRpcProto.RuleRequest, bilibili.app.wall.v1.WallRpcProto.RulesReply> getRuleInfoMethod;
    if ((getRuleInfoMethod = WallGrpc.getRuleInfoMethod) == null) {
      synchronized (WallGrpc.class) {
        if ((getRuleInfoMethod = WallGrpc.getRuleInfoMethod) == null) {
          WallGrpc.getRuleInfoMethod = getRuleInfoMethod =
              io.grpc.MethodDescriptor.<bilibili.app.wall.v1.WallRpcProto.RuleRequest, bilibili.app.wall.v1.WallRpcProto.RulesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RuleInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.wall.v1.WallRpcProto.RuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.wall.v1.WallRpcProto.RulesReply.getDefaultInstance()))
              .setSchemaDescriptor(new WallMethodDescriptorSupplier("RuleInfo"))
              .build();
        }
      }
    }
    return getRuleInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WallStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WallStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WallStub>() {
        @java.lang.Override
        public WallStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WallStub(channel, callOptions);
        }
      };
    return WallStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WallBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WallBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WallBlockingStub>() {
        @java.lang.Override
        public WallBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WallBlockingStub(channel, callOptions);
        }
      };
    return WallBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WallFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WallFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WallFutureStub>() {
        @java.lang.Override
        public WallFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WallFutureStub(channel, callOptions);
        }
      };
    return WallFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 免流规则
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取免流规则信息
     * </pre>
     */
    default void ruleInfo(bilibili.app.wall.v1.WallRpcProto.RuleRequest request,
        io.grpc.stub.StreamObserver<bilibili.app.wall.v1.WallRpcProto.RulesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRuleInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Wall.
   * <pre>
   * 免流规则
   * </pre>
   */
  public static abstract class WallImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WallGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Wall.
   * <pre>
   * 免流规则
   * </pre>
   */
  public static final class WallStub
      extends io.grpc.stub.AbstractAsyncStub<WallStub> {
    private WallStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WallStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WallStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取免流规则信息
     * </pre>
     */
    public void ruleInfo(bilibili.app.wall.v1.WallRpcProto.RuleRequest request,
        io.grpc.stub.StreamObserver<bilibili.app.wall.v1.WallRpcProto.RulesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRuleInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Wall.
   * <pre>
   * 免流规则
   * </pre>
   */
  public static final class WallBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WallBlockingStub> {
    private WallBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WallBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WallBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取免流规则信息
     * </pre>
     */
    public bilibili.app.wall.v1.WallRpcProto.RulesReply ruleInfo(bilibili.app.wall.v1.WallRpcProto.RuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRuleInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Wall.
   * <pre>
   * 免流规则
   * </pre>
   */
  public static final class WallFutureStub
      extends io.grpc.stub.AbstractFutureStub<WallFutureStub> {
    private WallFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WallFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WallFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取免流规则信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.wall.v1.WallRpcProto.RulesReply> ruleInfo(
        bilibili.app.wall.v1.WallRpcProto.RuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRuleInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RULE_INFO = 0;

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
        case METHODID_RULE_INFO:
          serviceImpl.ruleInfo((bilibili.app.wall.v1.WallRpcProto.RuleRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.app.wall.v1.WallRpcProto.RulesReply>) responseObserver);
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
          getRuleInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.wall.v1.WallRpcProto.RuleRequest,
              bilibili.app.wall.v1.WallRpcProto.RulesReply>(
                service, METHODID_RULE_INFO)))
        .build();
  }

  private static abstract class WallBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WallBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.wall.v1.WallRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wall");
    }
  }

  private static final class WallFileDescriptorSupplier
      extends WallBaseDescriptorSupplier {
    WallFileDescriptorSupplier() {}
  }

  private static final class WallMethodDescriptorSupplier
      extends WallBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WallMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WallGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WallFileDescriptorSupplier())
              .addMethod(getRuleInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
