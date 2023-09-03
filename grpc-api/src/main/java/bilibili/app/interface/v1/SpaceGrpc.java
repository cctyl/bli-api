package bilibili.app.interface.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/interfaces/v1/space.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpaceGrpc {

  private SpaceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.interface.v1.Space";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchTabReq,
      bilibili.app.interface.v1.SearchTabReply> getSearchTabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchTab",
      requestType = bilibili.app.interface.v1.SearchTabReq.class,
      responseType = bilibili.app.interface.v1.SearchTabReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchTabReq,
      bilibili.app.interface.v1.SearchTabReply> getSearchTabMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchTabReq, bilibili.app.interface.v1.SearchTabReply> getSearchTabMethod;
    if ((getSearchTabMethod = SpaceGrpc.getSearchTabMethod) == null) {
      synchronized (SpaceGrpc.class) {
        if ((getSearchTabMethod = SpaceGrpc.getSearchTabMethod) == null) {
          SpaceGrpc.getSearchTabMethod = getSearchTabMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.SearchTabReq, bilibili.app.interface.v1.SearchTabReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchTab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.SearchTabReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.SearchTabReply.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceMethodDescriptorSupplier("SearchTab"))
              .build();
        }
      }
    }
    return getSearchTabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchArchiveReq,
      bilibili.app.interface.v1.SearchArchiveReply> getSearchArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchArchive",
      requestType = bilibili.app.interface.v1.SearchArchiveReq.class,
      responseType = bilibili.app.interface.v1.SearchArchiveReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchArchiveReq,
      bilibili.app.interface.v1.SearchArchiveReply> getSearchArchiveMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchArchiveReq, bilibili.app.interface.v1.SearchArchiveReply> getSearchArchiveMethod;
    if ((getSearchArchiveMethod = SpaceGrpc.getSearchArchiveMethod) == null) {
      synchronized (SpaceGrpc.class) {
        if ((getSearchArchiveMethod = SpaceGrpc.getSearchArchiveMethod) == null) {
          SpaceGrpc.getSearchArchiveMethod = getSearchArchiveMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.SearchArchiveReq, bilibili.app.interface.v1.SearchArchiveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchArchive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.SearchArchiveReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.SearchArchiveReply.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceMethodDescriptorSupplier("SearchArchive"))
              .build();
        }
      }
    }
    return getSearchArchiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchDynamicReq,
      bilibili.app.interface.v1.SearchDynamicReply> getSearchDynamicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchDynamic",
      requestType = bilibili.app.interface.v1.SearchDynamicReq.class,
      responseType = bilibili.app.interface.v1.SearchDynamicReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchDynamicReq,
      bilibili.app.interface.v1.SearchDynamicReply> getSearchDynamicMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchDynamicReq, bilibili.app.interface.v1.SearchDynamicReply> getSearchDynamicMethod;
    if ((getSearchDynamicMethod = SpaceGrpc.getSearchDynamicMethod) == null) {
      synchronized (SpaceGrpc.class) {
        if ((getSearchDynamicMethod = SpaceGrpc.getSearchDynamicMethod) == null) {
          SpaceGrpc.getSearchDynamicMethod = getSearchDynamicMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.SearchDynamicReq, bilibili.app.interface.v1.SearchDynamicReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchDynamic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.SearchDynamicReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.SearchDynamicReply.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceMethodDescriptorSupplier("SearchDynamic"))
              .build();
        }
      }
    }
    return getSearchDynamicMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceStub>() {
        @java.lang.Override
        public SpaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceStub(channel, callOptions);
        }
      };
    return SpaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceBlockingStub>() {
        @java.lang.Override
        public SpaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceBlockingStub(channel, callOptions);
        }
      };
    return SpaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceFutureStub>() {
        @java.lang.Override
        public SpaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceFutureStub(channel, callOptions);
        }
      };
    return SpaceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void searchTab(bilibili.app.interface.v1.SearchTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchTabReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchTabMethod(), responseObserver);
    }

    /**
     */
    default void searchArchive(bilibili.app.interface.v1.SearchArchiveReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchArchiveReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchArchiveMethod(), responseObserver);
    }

    /**
     */
    default void searchDynamic(bilibili.app.interface.v1.SearchDynamicReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchDynamicReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchDynamicMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Space.
   */
  public static abstract class SpaceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SpaceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Space.
   */
  public static final class SpaceStub
      extends io.grpc.stub.AbstractAsyncStub<SpaceStub> {
    private SpaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceStub(channel, callOptions);
    }

    /**
     */
    public void searchTab(bilibili.app.interface.v1.SearchTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchTabReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchTabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchArchive(bilibili.app.interface.v1.SearchArchiveReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchArchiveReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchArchiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchDynamic(bilibili.app.interface.v1.SearchDynamicReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchDynamicReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchDynamicMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Space.
   */
  public static final class SpaceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SpaceBlockingStub> {
    private SpaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.interface.v1.SearchTabReply searchTab(bilibili.app.interface.v1.SearchTabReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchTabMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.interface.v1.SearchArchiveReply searchArchive(bilibili.app.interface.v1.SearchArchiveReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchArchiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.interface.v1.SearchDynamicReply searchDynamic(bilibili.app.interface.v1.SearchDynamicReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchDynamicMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Space.
   */
  public static final class SpaceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SpaceFutureStub> {
    private SpaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.SearchTabReply> searchTab(
        bilibili.app.interface.v1.SearchTabReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchTabMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.SearchArchiveReply> searchArchive(
        bilibili.app.interface.v1.SearchArchiveReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchArchiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.SearchDynamicReply> searchDynamic(
        bilibili.app.interface.v1.SearchDynamicReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchDynamicMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_TAB = 0;
  private static final int METHODID_SEARCH_ARCHIVE = 1;
  private static final int METHODID_SEARCH_DYNAMIC = 2;

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
        case METHODID_SEARCH_TAB:
          serviceImpl.searchTab((bilibili.app.interface.v1.SearchTabReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchTabReply>) responseObserver);
          break;
        case METHODID_SEARCH_ARCHIVE:
          serviceImpl.searchArchive((bilibili.app.interface.v1.SearchArchiveReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchArchiveReply>) responseObserver);
          break;
        case METHODID_SEARCH_DYNAMIC:
          serviceImpl.searchDynamic((bilibili.app.interface.v1.SearchDynamicReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchDynamicReply>) responseObserver);
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
          getSearchTabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.SearchTabReq,
              bilibili.app.interface.v1.SearchTabReply>(
                service, METHODID_SEARCH_TAB)))
        .addMethod(
          getSearchArchiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.SearchArchiveReq,
              bilibili.app.interface.v1.SearchArchiveReply>(
                service, METHODID_SEARCH_ARCHIVE)))
        .addMethod(
          getSearchDynamicMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.SearchDynamicReq,
              bilibili.app.interface.v1.SearchDynamicReply>(
                service, METHODID_SEARCH_DYNAMIC)))
        .build();
  }

  private static abstract class SpaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.interface.v1.SpaceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Space");
    }
  }

  private static final class SpaceFileDescriptorSupplier
      extends SpaceBaseDescriptorSupplier {
    SpaceFileDescriptorSupplier() {}
  }

  private static final class SpaceMethodDescriptorSupplier
      extends SpaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SpaceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SpaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpaceFileDescriptorSupplier())
              .addMethod(getSearchTabMethod())
              .addMethod(getSearchArchiveMethod())
              .addMethod(getSearchDynamicMethod())
              .build();
        }
      }
    }
    return result;
  }
}
