package bilibili.broadcast.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/v1/room.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BroadcastRoomGrpc {

  private BroadcastRoomGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.v1.BroadcastRoom";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.broadcast.v1.RoomReq,
      bilibili.broadcast.v1.RoomResp> getEnterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enter",
      requestType = bilibili.broadcast.v1.RoomReq.class,
      responseType = bilibili.broadcast.v1.RoomResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<bilibili.broadcast.v1.RoomReq,
      bilibili.broadcast.v1.RoomResp> getEnterMethod() {
    io.grpc.MethodDescriptor<bilibili.broadcast.v1.RoomReq, bilibili.broadcast.v1.RoomResp> getEnterMethod;
    if ((getEnterMethod = BroadcastRoomGrpc.getEnterMethod) == null) {
      synchronized (BroadcastRoomGrpc.class) {
        if ((getEnterMethod = BroadcastRoomGrpc.getEnterMethod) == null) {
          BroadcastRoomGrpc.getEnterMethod = getEnterMethod =
              io.grpc.MethodDescriptor.<bilibili.broadcast.v1.RoomReq, bilibili.broadcast.v1.RoomResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.RoomReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.RoomResp.getDefaultInstance()))
              .setSchemaDescriptor(new BroadcastRoomMethodDescriptorSupplier("Enter"))
              .build();
        }
      }
    }
    return getEnterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BroadcastRoomStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastRoomStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastRoomStub>() {
        @java.lang.Override
        public BroadcastRoomStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastRoomStub(channel, callOptions);
        }
      };
    return BroadcastRoomStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BroadcastRoomBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastRoomBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastRoomBlockingStub>() {
        @java.lang.Override
        public BroadcastRoomBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastRoomBlockingStub(channel, callOptions);
        }
      };
    return BroadcastRoomBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BroadcastRoomFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BroadcastRoomFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BroadcastRoomFutureStub>() {
        @java.lang.Override
        public BroadcastRoomFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BroadcastRoomFutureStub(channel, callOptions);
        }
      };
    return BroadcastRoomFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<bilibili.broadcast.v1.RoomReq> enter(
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.RoomResp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEnterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BroadcastRoom.
   */
  public static abstract class BroadcastRoomImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BroadcastRoomGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BroadcastRoom.
   */
  public static final class BroadcastRoomStub
      extends io.grpc.stub.AbstractAsyncStub<BroadcastRoomStub> {
    private BroadcastRoomStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastRoomStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastRoomStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<bilibili.broadcast.v1.RoomReq> enter(
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.RoomResp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BroadcastRoom.
   */
  public static final class BroadcastRoomBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BroadcastRoomBlockingStub> {
    private BroadcastRoomBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastRoomBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastRoomBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BroadcastRoom.
   */
  public static final class BroadcastRoomFutureStub
      extends io.grpc.stub.AbstractFutureStub<BroadcastRoomFutureStub> {
    private BroadcastRoomFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BroadcastRoomFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BroadcastRoomFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ENTER = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.enter(
              (io.grpc.stub.StreamObserver<bilibili.broadcast.v1.RoomResp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEnterMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              bilibili.broadcast.v1.RoomReq,
              bilibili.broadcast.v1.RoomResp>(
                service, METHODID_ENTER)))
        .build();
  }

  private static abstract class BroadcastRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BroadcastRoomBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.v1.Room.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BroadcastRoom");
    }
  }

  private static final class BroadcastRoomFileDescriptorSupplier
      extends BroadcastRoomBaseDescriptorSupplier {
    BroadcastRoomFileDescriptorSupplier() {}
  }

  private static final class BroadcastRoomMethodDescriptorSupplier
      extends BroadcastRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BroadcastRoomMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BroadcastRoomGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BroadcastRoomFileDescriptorSupplier())
              .addMethod(getEnterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
