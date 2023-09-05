package bilibili.broadcast.message.main;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/message/main/resource.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceGrpc {

  private ResourceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.message.main.Resource";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply> getTopActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopActivity",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply> getTopActivityMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply> getTopActivityMethod;
    if ((getTopActivityMethod = ResourceGrpc.getTopActivityMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getTopActivityMethod = ResourceGrpc.getTopActivityMethod) == null) {
          ResourceGrpc.getTopActivityMethod = getTopActivityMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TopActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("TopActivity"))
              .build();
        }
      }
    }
    return getTopActivityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceStub>() {
        @java.lang.Override
        public ResourceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceStub(channel, callOptions);
        }
      };
    return ResourceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceBlockingStub>() {
        @java.lang.Override
        public ResourceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceBlockingStub(channel, callOptions);
        }
      };
    return ResourceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceFutureStub>() {
        @java.lang.Override
        public ResourceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceFutureStub(channel, callOptions);
        }
      };
    return ResourceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void topActivity(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTopActivityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Resource.
   */
  public static abstract class ResourceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ResourceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Resource.
   */
  public static final class ResourceStub
      extends io.grpc.stub.AbstractAsyncStub<ResourceStub> {
    private ResourceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceStub(channel, callOptions);
    }

    /**
     */
    public void topActivity(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getTopActivityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Resource.
   */
  public static final class ResourceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ResourceBlockingStub> {
    private ResourceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply> topActivity(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getTopActivityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Resource.
   */
  public static final class ResourceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ResourceFutureStub> {
    private ResourceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TOP_ACTIVITY = 0;

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
        case METHODID_TOP_ACTIVITY:
          serviceImpl.topActivity((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply>) responseObserver);
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
          getTopActivityMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.main.ResourceRpcProto.TopActivityReply>(
                service, METHODID_TOP_ACTIVITY)))
        .build();
  }

  private static abstract class ResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.message.main.ResourceRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Resource");
    }
  }

  private static final class ResourceFileDescriptorSupplier
      extends ResourceBaseDescriptorSupplier {
    ResourceFileDescriptorSupplier() {}
  }

  private static final class ResourceMethodDescriptorSupplier
      extends ResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ResourceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ResourceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceFileDescriptorSupplier())
              .addMethod(getTopActivityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
