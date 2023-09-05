package bilibili.polymer.list.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/polymer/list/v1/list.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ListGrpc {

  private ListGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.polymer.list.v1.List";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq,
      bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply> getFavoriteTabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavoriteTab",
      requestType = bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq.class,
      responseType = bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq,
      bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply> getFavoriteTabMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq, bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply> getFavoriteTabMethod;
    if ((getFavoriteTabMethod = ListGrpc.getFavoriteTabMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getFavoriteTabMethod = ListGrpc.getFavoriteTabMethod) == null) {
          ListGrpc.getFavoriteTabMethod = getFavoriteTabMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq, bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavoriteTab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("FavoriteTab"))
              .build();
        }
      }
    }
    return getFavoriteTabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq,
      bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply> getCheckAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckAccount",
      requestType = bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq.class,
      responseType = bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq,
      bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply> getCheckAccountMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq, bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply> getCheckAccountMethod;
    if ((getCheckAccountMethod = ListGrpc.getCheckAccountMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getCheckAccountMethod = ListGrpc.getCheckAccountMethod) == null) {
          ListGrpc.getCheckAccountMethod = getCheckAccountMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq, bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("CheckAccount"))
              .build();
        }
      }
    }
    return getCheckAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListStub>() {
        @java.lang.Override
        public ListStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListStub(channel, callOptions);
        }
      };
    return ListStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListBlockingStub>() {
        @java.lang.Override
        public ListBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListBlockingStub(channel, callOptions);
        }
      };
    return ListBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListFutureStub>() {
        @java.lang.Override
        public ListFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListFutureStub(channel, callOptions);
        }
      };
    return ListFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void favoriteTab(bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavoriteTabMethod(), responseObserver);
    }

    /**
     */
    default void checkAccount(bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckAccountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service List.
   */
  public static abstract class ListImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ListGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service List.
   */
  public static final class ListStub
      extends io.grpc.stub.AbstractAsyncStub<ListStub> {
    private ListStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListStub(channel, callOptions);
    }

    /**
     */
    public void favoriteTab(bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavoriteTabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkAccount(bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service List.
   */
  public static final class ListBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ListBlockingStub> {
    private ListBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply favoriteTab(bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavoriteTabMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply checkAccount(bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service List.
   */
  public static final class ListFutureStub
      extends io.grpc.stub.AbstractFutureStub<ListFutureStub> {
    private ListFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply> favoriteTab(
        bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavoriteTabMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply> checkAccount(
        bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FAVORITE_TAB = 0;
  private static final int METHODID_CHECK_ACCOUNT = 1;

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
        case METHODID_FAVORITE_TAB:
          serviceImpl.favoriteTab((bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply>) responseObserver);
          break;
        case METHODID_CHECK_ACCOUNT:
          serviceImpl.checkAccount((bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply>) responseObserver);
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
          getFavoriteTabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReq,
              bilibili.polymer.list.v1.ListRpcProto.FavoriteTabReply>(
                service, METHODID_FAVORITE_TAB)))
        .addMethod(
          getCheckAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.list.v1.ListRpcProto.CheckAccountReq,
              bilibili.polymer.list.v1.ListRpcProto.CheckAccountReply>(
                service, METHODID_CHECK_ACCOUNT)))
        .build();
  }

  private static abstract class ListBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.polymer.list.v1.ListRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("List");
    }
  }

  private static final class ListFileDescriptorSupplier
      extends ListBaseDescriptorSupplier {
    ListFileDescriptorSupplier() {}
  }

  private static final class ListMethodDescriptorSupplier
      extends ListBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ListMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ListGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListFileDescriptorSupplier())
              .addMethod(getFavoriteTabMethod())
              .addMethod(getCheckAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
