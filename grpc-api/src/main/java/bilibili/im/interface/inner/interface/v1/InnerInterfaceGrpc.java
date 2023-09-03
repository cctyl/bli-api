package bilibili.im.interface.inner.interface.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/im/interfaces/inner-interface/v1/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InnerInterfaceGrpc {

  private InnerInterfaceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.im.interface.inner.interface.v1.InnerInterface";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.im.interface.inner.interface.v1.ReqOpBlacklist,
      bilibili.im.interface.inner.interface.v1.RspOpBlacklist> getUpdateListInnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateListInn",
      requestType = bilibili.im.interface.inner.interface.v1.ReqOpBlacklist.class,
      responseType = bilibili.im.interface.inner.interface.v1.RspOpBlacklist.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interface.inner.interface.v1.ReqOpBlacklist,
      bilibili.im.interface.inner.interface.v1.RspOpBlacklist> getUpdateListInnMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interface.inner.interface.v1.ReqOpBlacklist, bilibili.im.interface.inner.interface.v1.RspOpBlacklist> getUpdateListInnMethod;
    if ((getUpdateListInnMethod = InnerInterfaceGrpc.getUpdateListInnMethod) == null) {
      synchronized (InnerInterfaceGrpc.class) {
        if ((getUpdateListInnMethod = InnerInterfaceGrpc.getUpdateListInnMethod) == null) {
          InnerInterfaceGrpc.getUpdateListInnMethod = getUpdateListInnMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interface.inner.interface.v1.ReqOpBlacklist, bilibili.im.interface.inner.interface.v1.RspOpBlacklist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateListInn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interface.inner.interface.v1.ReqOpBlacklist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interface.inner.interface.v1.RspOpBlacklist.getDefaultInstance()))
              .setSchemaDescriptor(new InnerInterfaceMethodDescriptorSupplier("UpdateListInn"))
              .build();
        }
      }
    }
    return getUpdateListInnMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InnerInterfaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InnerInterfaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InnerInterfaceStub>() {
        @java.lang.Override
        public InnerInterfaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InnerInterfaceStub(channel, callOptions);
        }
      };
    return InnerInterfaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InnerInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InnerInterfaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InnerInterfaceBlockingStub>() {
        @java.lang.Override
        public InnerInterfaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InnerInterfaceBlockingStub(channel, callOptions);
        }
      };
    return InnerInterfaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InnerInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InnerInterfaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InnerInterfaceFutureStub>() {
        @java.lang.Override
        public InnerInterfaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InnerInterfaceFutureStub(channel, callOptions);
        }
      };
    return InnerInterfaceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void updateListInn(bilibili.im.interface.inner.interface.v1.ReqOpBlacklist request,
        io.grpc.stub.StreamObserver<bilibili.im.interface.inner.interface.v1.RspOpBlacklist> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateListInnMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InnerInterface.
   */
  public static abstract class InnerInterfaceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InnerInterfaceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InnerInterface.
   */
  public static final class InnerInterfaceStub
      extends io.grpc.stub.AbstractAsyncStub<InnerInterfaceStub> {
    private InnerInterfaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InnerInterfaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InnerInterfaceStub(channel, callOptions);
    }

    /**
     */
    public void updateListInn(bilibili.im.interface.inner.interface.v1.ReqOpBlacklist request,
        io.grpc.stub.StreamObserver<bilibili.im.interface.inner.interface.v1.RspOpBlacklist> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateListInnMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InnerInterface.
   */
  public static final class InnerInterfaceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InnerInterfaceBlockingStub> {
    private InnerInterfaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InnerInterfaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InnerInterfaceBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.im.interface.inner.interface.v1.RspOpBlacklist updateListInn(bilibili.im.interface.inner.interface.v1.ReqOpBlacklist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateListInnMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InnerInterface.
   */
  public static final class InnerInterfaceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InnerInterfaceFutureStub> {
    private InnerInterfaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InnerInterfaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InnerInterfaceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interface.inner.interface.v1.RspOpBlacklist> updateListInn(
        bilibili.im.interface.inner.interface.v1.ReqOpBlacklist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateListInnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_LIST_INN = 0;

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
        case METHODID_UPDATE_LIST_INN:
          serviceImpl.updateListInn((bilibili.im.interface.inner.interface.v1.ReqOpBlacklist) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interface.inner.interface.v1.RspOpBlacklist>) responseObserver);
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
          getUpdateListInnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interface.inner.interface.v1.ReqOpBlacklist,
              bilibili.im.interface.inner.interface.v1.RspOpBlacklist>(
                service, METHODID_UPDATE_LIST_INN)))
        .build();
  }

  private static abstract class InnerInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InnerInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.im.interface.inner.interface.v1.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InnerInterface");
    }
  }

  private static final class InnerInterfaceFileDescriptorSupplier
      extends InnerInterfaceBaseDescriptorSupplier {
    InnerInterfaceFileDescriptorSupplier() {}
  }

  private static final class InnerInterfaceMethodDescriptorSupplier
      extends InnerInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InnerInterfaceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InnerInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InnerInterfaceFileDescriptorSupplier())
              .addMethod(getUpdateListInnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
