package bilibili.app.resource.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/resource/v1/module.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ModuleGrpc {

  private ModuleGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.resource.v1.Module";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.resource.v1.ListReq,
      bilibili.app.resource.v1.ListReply> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = bilibili.app.resource.v1.ListReq.class,
      responseType = bilibili.app.resource.v1.ListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.resource.v1.ListReq,
      bilibili.app.resource.v1.ListReply> getListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.resource.v1.ListReq, bilibili.app.resource.v1.ListReply> getListMethod;
    if ((getListMethod = ModuleGrpc.getListMethod) == null) {
      synchronized (ModuleGrpc.class) {
        if ((getListMethod = ModuleGrpc.getListMethod) == null) {
          ModuleGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.resource.v1.ListReq, bilibili.app.resource.v1.ListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.resource.v1.ListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.resource.v1.ListReply.getDefaultInstance()))
              .setSchemaDescriptor(new ModuleMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModuleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModuleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModuleStub>() {
        @java.lang.Override
        public ModuleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModuleStub(channel, callOptions);
        }
      };
    return ModuleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModuleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModuleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModuleBlockingStub>() {
        @java.lang.Override
        public ModuleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModuleBlockingStub(channel, callOptions);
        }
      };
    return ModuleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ModuleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModuleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModuleFutureStub>() {
        @java.lang.Override
        public ModuleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModuleFutureStub(channel, callOptions);
        }
      };
    return ModuleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void list(bilibili.app.resource.v1.ListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.resource.v1.ListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Module.
   */
  public static abstract class ModuleImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ModuleGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Module.
   */
  public static final class ModuleStub
      extends io.grpc.stub.AbstractAsyncStub<ModuleStub> {
    private ModuleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModuleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModuleStub(channel, callOptions);
    }

    /**
     */
    public void list(bilibili.app.resource.v1.ListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.resource.v1.ListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Module.
   */
  public static final class ModuleBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ModuleBlockingStub> {
    private ModuleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModuleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModuleBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.resource.v1.ListReply list(bilibili.app.resource.v1.ListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Module.
   */
  public static final class ModuleFutureStub
      extends io.grpc.stub.AbstractFutureStub<ModuleFutureStub> {
    private ModuleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModuleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModuleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.resource.v1.ListReply> list(
        bilibili.app.resource.v1.ListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

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
        case METHODID_LIST:
          serviceImpl.list((bilibili.app.resource.v1.ListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.resource.v1.ListReply>) responseObserver);
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
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.resource.v1.ListReq,
              bilibili.app.resource.v1.ListReply>(
                service, METHODID_LIST)))
        .build();
  }

  private static abstract class ModuleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModuleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.resource.v1.ModuleOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Module");
    }
  }

  private static final class ModuleFileDescriptorSupplier
      extends ModuleBaseDescriptorSupplier {
    ModuleFileDescriptorSupplier() {}
  }

  private static final class ModuleMethodDescriptorSupplier
      extends ModuleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ModuleMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ModuleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ModuleFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
