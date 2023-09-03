package bilibili.community.service.govern.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/community/service/govern/v1/govern.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QoeGrpc {

  private QoeGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.community.service.govern.v1.Qoe";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.community.service.govern.v1.QoeReportReq,
      com.google.protobuf.Empty> getQoeReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QoeReport",
      requestType = bilibili.community.service.govern.v1.QoeReportReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.community.service.govern.v1.QoeReportReq,
      com.google.protobuf.Empty> getQoeReportMethod() {
    io.grpc.MethodDescriptor<bilibili.community.service.govern.v1.QoeReportReq, com.google.protobuf.Empty> getQoeReportMethod;
    if ((getQoeReportMethod = QoeGrpc.getQoeReportMethod) == null) {
      synchronized (QoeGrpc.class) {
        if ((getQoeReportMethod = QoeGrpc.getQoeReportMethod) == null) {
          QoeGrpc.getQoeReportMethod = getQoeReportMethod =
              io.grpc.MethodDescriptor.<bilibili.community.service.govern.v1.QoeReportReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QoeReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.govern.v1.QoeReportReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new QoeMethodDescriptorSupplier("QoeReport"))
              .build();
        }
      }
    }
    return getQoeReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QoeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QoeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QoeStub>() {
        @java.lang.Override
        public QoeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QoeStub(channel, callOptions);
        }
      };
    return QoeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QoeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QoeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QoeBlockingStub>() {
        @java.lang.Override
        public QoeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QoeBlockingStub(channel, callOptions);
        }
      };
    return QoeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QoeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QoeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QoeFutureStub>() {
        @java.lang.Override
        public QoeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QoeFutureStub(channel, callOptions);
        }
      };
    return QoeFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void qoeReport(bilibili.community.service.govern.v1.QoeReportReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQoeReportMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Qoe.
   */
  public static abstract class QoeImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QoeGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Qoe.
   */
  public static final class QoeStub
      extends io.grpc.stub.AbstractAsyncStub<QoeStub> {
    private QoeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QoeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QoeStub(channel, callOptions);
    }

    /**
     */
    public void qoeReport(bilibili.community.service.govern.v1.QoeReportReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQoeReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Qoe.
   */
  public static final class QoeBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QoeBlockingStub> {
    private QoeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QoeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QoeBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty qoeReport(bilibili.community.service.govern.v1.QoeReportReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQoeReportMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Qoe.
   */
  public static final class QoeFutureStub
      extends io.grpc.stub.AbstractFutureStub<QoeFutureStub> {
    private QoeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QoeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QoeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> qoeReport(
        bilibili.community.service.govern.v1.QoeReportReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQoeReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QOE_REPORT = 0;

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
        case METHODID_QOE_REPORT:
          serviceImpl.qoeReport((bilibili.community.service.govern.v1.QoeReportReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getQoeReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.community.service.govern.v1.QoeReportReq,
              com.google.protobuf.Empty>(
                service, METHODID_QOE_REPORT)))
        .build();
  }

  private static abstract class QoeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QoeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.community.service.govern.v1.Govern.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Qoe");
    }
  }

  private static final class QoeFileDescriptorSupplier
      extends QoeBaseDescriptorSupplier {
    QoeFileDescriptorSupplier() {}
  }

  private static final class QoeMethodDescriptorSupplier
      extends QoeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QoeMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QoeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QoeFileDescriptorSupplier())
              .addMethod(getQoeReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
