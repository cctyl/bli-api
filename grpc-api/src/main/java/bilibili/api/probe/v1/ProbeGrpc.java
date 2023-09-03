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
public final class ProbeGrpc {

  private ProbeGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.api.probe.v1.Probe";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.CodeReq,
      bilibili.api.probe.v1.CodeReply> getTestCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestCode",
      requestType = bilibili.api.probe.v1.CodeReq.class,
      responseType = bilibili.api.probe.v1.CodeReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.CodeReq,
      bilibili.api.probe.v1.CodeReply> getTestCodeMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.CodeReq, bilibili.api.probe.v1.CodeReply> getTestCodeMethod;
    if ((getTestCodeMethod = ProbeGrpc.getTestCodeMethod) == null) {
      synchronized (ProbeGrpc.class) {
        if ((getTestCodeMethod = ProbeGrpc.getTestCodeMethod) == null) {
          ProbeGrpc.getTestCodeMethod = getTestCodeMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.CodeReq, bilibili.api.probe.v1.CodeReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.CodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.CodeReply.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeMethodDescriptorSupplier("TestCode"))
              .build();
        }
      }
    }
    return getTestCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeReq,
      bilibili.api.probe.v1.ProbeReply> getTestReqMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestReq",
      requestType = bilibili.api.probe.v1.ProbeReq.class,
      responseType = bilibili.api.probe.v1.ProbeReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeReq,
      bilibili.api.probe.v1.ProbeReply> getTestReqMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeReq, bilibili.api.probe.v1.ProbeReply> getTestReqMethod;
    if ((getTestReqMethod = ProbeGrpc.getTestReqMethod) == null) {
      synchronized (ProbeGrpc.class) {
        if ((getTestReqMethod = ProbeGrpc.getTestReqMethod) == null) {
          ProbeGrpc.getTestReqMethod = getTestReqMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.ProbeReq, bilibili.api.probe.v1.ProbeReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestReq"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.ProbeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.ProbeReply.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeMethodDescriptorSupplier("TestReq"))
              .build();
        }
      }
    }
    return getTestReqMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeStreamReq,
      bilibili.api.probe.v1.ProbeStreamReply> getTestStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestStream",
      requestType = bilibili.api.probe.v1.ProbeStreamReq.class,
      responseType = bilibili.api.probe.v1.ProbeStreamReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeStreamReq,
      bilibili.api.probe.v1.ProbeStreamReply> getTestStreamMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeStreamReq, bilibili.api.probe.v1.ProbeStreamReply> getTestStreamMethod;
    if ((getTestStreamMethod = ProbeGrpc.getTestStreamMethod) == null) {
      synchronized (ProbeGrpc.class) {
        if ((getTestStreamMethod = ProbeGrpc.getTestStreamMethod) == null) {
          ProbeGrpc.getTestStreamMethod = getTestStreamMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.ProbeStreamReq, bilibili.api.probe.v1.ProbeStreamReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.ProbeStreamReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.ProbeStreamReply.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeMethodDescriptorSupplier("TestStream"))
              .build();
        }
      }
    }
    return getTestStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeSubReq,
      bilibili.api.probe.v1.ProbeSubReply> getTestSubMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestSub",
      requestType = bilibili.api.probe.v1.ProbeSubReq.class,
      responseType = bilibili.api.probe.v1.ProbeSubReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeSubReq,
      bilibili.api.probe.v1.ProbeSubReply> getTestSubMethod() {
    io.grpc.MethodDescriptor<bilibili.api.probe.v1.ProbeSubReq, bilibili.api.probe.v1.ProbeSubReply> getTestSubMethod;
    if ((getTestSubMethod = ProbeGrpc.getTestSubMethod) == null) {
      synchronized (ProbeGrpc.class) {
        if ((getTestSubMethod = ProbeGrpc.getTestSubMethod) == null) {
          ProbeGrpc.getTestSubMethod = getTestSubMethod =
              io.grpc.MethodDescriptor.<bilibili.api.probe.v1.ProbeSubReq, bilibili.api.probe.v1.ProbeSubReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestSub"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.ProbeSubReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.probe.v1.ProbeSubReply.getDefaultInstance()))
              .setSchemaDescriptor(new ProbeMethodDescriptorSupplier("TestSub"))
              .build();
        }
      }
    }
    return getTestSubMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProbeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProbeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProbeStub>() {
        @java.lang.Override
        public ProbeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProbeStub(channel, callOptions);
        }
      };
    return ProbeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProbeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProbeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProbeBlockingStub>() {
        @java.lang.Override
        public ProbeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProbeBlockingStub(channel, callOptions);
        }
      };
    return ProbeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProbeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProbeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProbeFutureStub>() {
        @java.lang.Override
        public ProbeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProbeFutureStub(channel, callOptions);
        }
      };
    return ProbeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void testCode(bilibili.api.probe.v1.CodeReq request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.CodeReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestCodeMethod(), responseObserver);
    }

    /**
     */
    default void testReq(bilibili.api.probe.v1.ProbeReq request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestReqMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void testStream(bilibili.api.probe.v1.ProbeStreamReq request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeStreamReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestStreamMethod(), responseObserver);
    }

    /**
     */
    default void testSub(bilibili.api.probe.v1.ProbeSubReq request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeSubReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestSubMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Probe.
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public static abstract class ProbeImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProbeGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Probe.
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public static final class ProbeStub
      extends io.grpc.stub.AbstractAsyncStub<ProbeStub> {
    private ProbeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProbeStub(channel, callOptions);
    }

    /**
     */
    public void testCode(bilibili.api.probe.v1.CodeReq request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.CodeReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testReq(bilibili.api.probe.v1.ProbeReq request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestReqMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void testStream(bilibili.api.probe.v1.ProbeStreamReq request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeStreamReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testSub(bilibili.api.probe.v1.ProbeSubReq request,
        io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeSubReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestSubMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Probe.
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public static final class ProbeBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProbeBlockingStub> {
    private ProbeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProbeBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.api.probe.v1.CodeReply testCode(bilibili.api.probe.v1.CodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.api.probe.v1.ProbeReply testReq(bilibili.api.probe.v1.ProbeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestReqMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.api.probe.v1.ProbeStreamReply testStream(bilibili.api.probe.v1.ProbeStreamReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.api.probe.v1.ProbeSubReply testSub(bilibili.api.probe.v1.ProbeSubReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestSubMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Probe.
   * <pre>
   * 服务可用性探针
   * </pre>
   */
  public static final class ProbeFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProbeFutureStub> {
    private ProbeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProbeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.CodeReply> testCode(
        bilibili.api.probe.v1.CodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.ProbeReply> testReq(
        bilibili.api.probe.v1.ProbeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestReqMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.ProbeStreamReply> testStream(
        bilibili.api.probe.v1.ProbeStreamReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestStreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.probe.v1.ProbeSubReply> testSub(
        bilibili.api.probe.v1.ProbeSubReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestSubMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_CODE = 0;
  private static final int METHODID_TEST_REQ = 1;
  private static final int METHODID_TEST_STREAM = 2;
  private static final int METHODID_TEST_SUB = 3;

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
        case METHODID_TEST_CODE:
          serviceImpl.testCode((bilibili.api.probe.v1.CodeReq) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.CodeReply>) responseObserver);
          break;
        case METHODID_TEST_REQ:
          serviceImpl.testReq((bilibili.api.probe.v1.ProbeReq) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeReply>) responseObserver);
          break;
        case METHODID_TEST_STREAM:
          serviceImpl.testStream((bilibili.api.probe.v1.ProbeStreamReq) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeStreamReply>) responseObserver);
          break;
        case METHODID_TEST_SUB:
          serviceImpl.testSub((bilibili.api.probe.v1.ProbeSubReq) request,
              (io.grpc.stub.StreamObserver<bilibili.api.probe.v1.ProbeSubReply>) responseObserver);
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
          getTestCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.CodeReq,
              bilibili.api.probe.v1.CodeReply>(
                service, METHODID_TEST_CODE)))
        .addMethod(
          getTestReqMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.ProbeReq,
              bilibili.api.probe.v1.ProbeReply>(
                service, METHODID_TEST_REQ)))
        .addMethod(
          getTestStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.ProbeStreamReq,
              bilibili.api.probe.v1.ProbeStreamReply>(
                service, METHODID_TEST_STREAM)))
        .addMethod(
          getTestSubMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.probe.v1.ProbeSubReq,
              bilibili.api.probe.v1.ProbeSubReply>(
                service, METHODID_TEST_SUB)))
        .build();
  }

  private static abstract class ProbeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProbeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.api.probe.v1.ProbeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Probe");
    }
  }

  private static final class ProbeFileDescriptorSupplier
      extends ProbeBaseDescriptorSupplier {
    ProbeFileDescriptorSupplier() {}
  }

  private static final class ProbeMethodDescriptorSupplier
      extends ProbeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProbeMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProbeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProbeFileDescriptorSupplier())
              .addMethod(getTestCodeMethod())
              .addMethod(getTestReqMethod())
              .addMethod(getTestStreamMethod())
              .addMethod(getTestSubMethod())
              .build();
        }
      }
    }
    return result;
  }
}
