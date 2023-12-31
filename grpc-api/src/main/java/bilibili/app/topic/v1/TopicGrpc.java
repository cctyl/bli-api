package bilibili.app.topic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/topic/v1/topic.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TopicGrpc {

  private TopicGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.topic.v1.Topic";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq,
      bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply> getTopicDetailsAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopicDetailsAll",
      requestType = bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq.class,
      responseType = bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq,
      bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply> getTopicDetailsAllMethod() {
    io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq, bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply> getTopicDetailsAllMethod;
    if ((getTopicDetailsAllMethod = TopicGrpc.getTopicDetailsAllMethod) == null) {
      synchronized (TopicGrpc.class) {
        if ((getTopicDetailsAllMethod = TopicGrpc.getTopicDetailsAllMethod) == null) {
          TopicGrpc.getTopicDetailsAllMethod = getTopicDetailsAllMethod =
              io.grpc.MethodDescriptor.<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq, bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TopicDetailsAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply.getDefaultInstance()))
              .setSchemaDescriptor(new TopicMethodDescriptorSupplier("TopicDetailsAll"))
              .build();
        }
      }
    }
    return getTopicDetailsAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq,
      bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply> getTopicDetailsFoldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopicDetailsFold",
      requestType = bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq.class,
      responseType = bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq,
      bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply> getTopicDetailsFoldMethod() {
    io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq, bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply> getTopicDetailsFoldMethod;
    if ((getTopicDetailsFoldMethod = TopicGrpc.getTopicDetailsFoldMethod) == null) {
      synchronized (TopicGrpc.class) {
        if ((getTopicDetailsFoldMethod = TopicGrpc.getTopicDetailsFoldMethod) == null) {
          TopicGrpc.getTopicDetailsFoldMethod = getTopicDetailsFoldMethod =
              io.grpc.MethodDescriptor.<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq, bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TopicDetailsFold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply.getDefaultInstance()))
              .setSchemaDescriptor(new TopicMethodDescriptorSupplier("TopicDetailsFold"))
              .build();
        }
      }
    }
    return getTopicDetailsFoldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq,
      bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply> getTopicSetDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopicSetDetails",
      requestType = bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq.class,
      responseType = bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq,
      bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply> getTopicSetDetailsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq, bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply> getTopicSetDetailsMethod;
    if ((getTopicSetDetailsMethod = TopicGrpc.getTopicSetDetailsMethod) == null) {
      synchronized (TopicGrpc.class) {
        if ((getTopicSetDetailsMethod = TopicGrpc.getTopicSetDetailsMethod) == null) {
          TopicGrpc.getTopicSetDetailsMethod = getTopicSetDetailsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq, bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TopicSetDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply.getDefaultInstance()))
              .setSchemaDescriptor(new TopicMethodDescriptorSupplier("TopicSetDetails"))
              .build();
        }
      }
    }
    return getTopicSetDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TopicStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicStub>() {
        @java.lang.Override
        public TopicStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicStub(channel, callOptions);
        }
      };
    return TopicStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TopicBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicBlockingStub>() {
        @java.lang.Override
        public TopicBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicBlockingStub(channel, callOptions);
        }
      };
    return TopicBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TopicFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicFutureStub>() {
        @java.lang.Override
        public TopicFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicFutureStub(channel, callOptions);
        }
      };
    return TopicFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void topicDetailsAll(bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq request,
        io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTopicDetailsAllMethod(), responseObserver);
    }

    /**
     */
    default void topicDetailsFold(bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq request,
        io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTopicDetailsFoldMethod(), responseObserver);
    }

    /**
     */
    default void topicSetDetails(bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTopicSetDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Topic.
   */
  public static abstract class TopicImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TopicGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Topic.
   */
  public static final class TopicStub
      extends io.grpc.stub.AbstractAsyncStub<TopicStub> {
    private TopicStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicStub(channel, callOptions);
    }

    /**
     */
    public void topicDetailsAll(bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq request,
        io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTopicDetailsAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void topicDetailsFold(bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq request,
        io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTopicDetailsFoldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void topicSetDetails(bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTopicSetDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Topic.
   */
  public static final class TopicBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TopicBlockingStub> {
    private TopicBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply topicDetailsAll(bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTopicDetailsAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply topicDetailsFold(bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTopicDetailsFoldMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply topicSetDetails(bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTopicSetDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Topic.
   */
  public static final class TopicFutureStub
      extends io.grpc.stub.AbstractFutureStub<TopicFutureStub> {
    private TopicFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply> topicDetailsAll(
        bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTopicDetailsAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply> topicDetailsFold(
        bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTopicDetailsFoldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply> topicSetDetails(
        bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTopicSetDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOPIC_DETAILS_ALL = 0;
  private static final int METHODID_TOPIC_DETAILS_FOLD = 1;
  private static final int METHODID_TOPIC_SET_DETAILS = 2;

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
        case METHODID_TOPIC_DETAILS_ALL:
          serviceImpl.topicDetailsAll((bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply>) responseObserver);
          break;
        case METHODID_TOPIC_DETAILS_FOLD:
          serviceImpl.topicDetailsFold((bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply>) responseObserver);
          break;
        case METHODID_TOPIC_SET_DETAILS:
          serviceImpl.topicSetDetails((bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply>) responseObserver);
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
          getTopicDetailsAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReq,
              bilibili.app.topic.v1.TopicRpcProto.TopicDetailsAllReply>(
                service, METHODID_TOPIC_DETAILS_ALL)))
        .addMethod(
          getTopicDetailsFoldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReq,
              bilibili.app.topic.v1.TopicRpcProto.TopicDetailsFoldReply>(
                service, METHODID_TOPIC_DETAILS_FOLD)))
        .addMethod(
          getTopicSetDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReq,
              bilibili.app.topic.v1.TopicRpcProto.TopicSetDetailsReply>(
                service, METHODID_TOPIC_SET_DETAILS)))
        .build();
  }

  private static abstract class TopicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TopicBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.topic.v1.TopicRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Topic");
    }
  }

  private static final class TopicFileDescriptorSupplier
      extends TopicBaseDescriptorSupplier {
    TopicFileDescriptorSupplier() {}
  }

  private static final class TopicMethodDescriptorSupplier
      extends TopicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TopicMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TopicGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TopicFileDescriptorSupplier())
              .addMethod(getTopicDetailsAllMethod())
              .addMethod(getTopicDetailsFoldMethod())
              .addMethod(getTopicSetDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
