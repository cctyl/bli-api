package bilibili.app.show.region.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/show/region/v1/region.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RegionGrpc {

  private RegionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.show.region.v1.Region";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.show.region.v1.RegionRpcProto.RegionReq,
      bilibili.app.show.region.v1.RegionRpcProto.RegionReply> getRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Region",
      requestType = bilibili.app.show.region.v1.RegionRpcProto.RegionReq.class,
      responseType = bilibili.app.show.region.v1.RegionRpcProto.RegionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.show.region.v1.RegionRpcProto.RegionReq,
      bilibili.app.show.region.v1.RegionRpcProto.RegionReply> getRegionMethod() {
    io.grpc.MethodDescriptor<bilibili.app.show.region.v1.RegionRpcProto.RegionReq, bilibili.app.show.region.v1.RegionRpcProto.RegionReply> getRegionMethod;
    if ((getRegionMethod = RegionGrpc.getRegionMethod) == null) {
      synchronized (RegionGrpc.class) {
        if ((getRegionMethod = RegionGrpc.getRegionMethod) == null) {
          RegionGrpc.getRegionMethod = getRegionMethod =
              io.grpc.MethodDescriptor.<bilibili.app.show.region.v1.RegionRpcProto.RegionReq, bilibili.app.show.region.v1.RegionRpcProto.RegionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Region"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.region.v1.RegionRpcProto.RegionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.show.region.v1.RegionRpcProto.RegionReply.getDefaultInstance()))
              .setSchemaDescriptor(new RegionMethodDescriptorSupplier("Region"))
              .build();
        }
      }
    }
    return getRegionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegionStub>() {
        @java.lang.Override
        public RegionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegionStub(channel, callOptions);
        }
      };
    return RegionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegionBlockingStub>() {
        @java.lang.Override
        public RegionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegionBlockingStub(channel, callOptions);
        }
      };
    return RegionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegionFutureStub>() {
        @java.lang.Override
        public RegionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegionFutureStub(channel, callOptions);
        }
      };
    return RegionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void region(bilibili.app.show.region.v1.RegionRpcProto.RegionReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.region.v1.RegionRpcProto.RegionReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Region.
   */
  public static abstract class RegionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RegionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Region.
   */
  public static final class RegionStub
      extends io.grpc.stub.AbstractAsyncStub<RegionStub> {
    private RegionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegionStub(channel, callOptions);
    }

    /**
     */
    public void region(bilibili.app.show.region.v1.RegionRpcProto.RegionReq request,
        io.grpc.stub.StreamObserver<bilibili.app.show.region.v1.RegionRpcProto.RegionReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Region.
   */
  public static final class RegionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RegionBlockingStub> {
    private RegionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegionBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.show.region.v1.RegionRpcProto.RegionReply region(bilibili.app.show.region.v1.RegionRpcProto.RegionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Region.
   */
  public static final class RegionFutureStub
      extends io.grpc.stub.AbstractFutureStub<RegionFutureStub> {
    private RegionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.show.region.v1.RegionRpcProto.RegionReply> region(
        bilibili.app.show.region.v1.RegionRpcProto.RegionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGION = 0;

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
        case METHODID_REGION:
          serviceImpl.region((bilibili.app.show.region.v1.RegionRpcProto.RegionReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.show.region.v1.RegionRpcProto.RegionReply>) responseObserver);
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
          getRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.show.region.v1.RegionRpcProto.RegionReq,
              bilibili.app.show.region.v1.RegionRpcProto.RegionReply>(
                service, METHODID_REGION)))
        .build();
  }

  private static abstract class RegionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.show.region.v1.RegionRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Region");
    }
  }

  private static final class RegionFileDescriptorSupplier
      extends RegionBaseDescriptorSupplier {
    RegionFileDescriptorSupplier() {}
  }

  private static final class RegionMethodDescriptorSupplier
      extends RegionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RegionMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RegionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegionFileDescriptorSupplier())
              .addMethod(getRegionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
