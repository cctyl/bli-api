package bilibili.app.interface.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/interfaces/v1/media.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MediaGrpc {

  private MediaGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.interface.v1.Media";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaTabReq,
      bilibili.app.interface.v1.MediaTabReply> getMediaTabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MediaTab",
      requestType = bilibili.app.interface.v1.MediaTabReq.class,
      responseType = bilibili.app.interface.v1.MediaTabReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaTabReq,
      bilibili.app.interface.v1.MediaTabReply> getMediaTabMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaTabReq, bilibili.app.interface.v1.MediaTabReply> getMediaTabMethod;
    if ((getMediaTabMethod = MediaGrpc.getMediaTabMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getMediaTabMethod = MediaGrpc.getMediaTabMethod) == null) {
          MediaGrpc.getMediaTabMethod = getMediaTabMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.MediaTabReq, bilibili.app.interface.v1.MediaTabReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MediaTab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaTabReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaTabReply.getDefaultInstance()))
              .setSchemaDescriptor(new MediaMethodDescriptorSupplier("MediaTab"))
              .build();
        }
      }
    }
    return getMediaTabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaDetailReq,
      bilibili.app.interface.v1.MediaDetailReply> getMediaDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MediaDetail",
      requestType = bilibili.app.interface.v1.MediaDetailReq.class,
      responseType = bilibili.app.interface.v1.MediaDetailReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaDetailReq,
      bilibili.app.interface.v1.MediaDetailReply> getMediaDetailMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaDetailReq, bilibili.app.interface.v1.MediaDetailReply> getMediaDetailMethod;
    if ((getMediaDetailMethod = MediaGrpc.getMediaDetailMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getMediaDetailMethod = MediaGrpc.getMediaDetailMethod) == null) {
          MediaGrpc.getMediaDetailMethod = getMediaDetailMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.MediaDetailReq, bilibili.app.interface.v1.MediaDetailReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MediaDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaDetailReply.getDefaultInstance()))
              .setSchemaDescriptor(new MediaMethodDescriptorSupplier("MediaDetail"))
              .build();
        }
      }
    }
    return getMediaDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaVideoReq,
      bilibili.app.interface.v1.MediaVideoReply> getMediaVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MediaVideo",
      requestType = bilibili.app.interface.v1.MediaVideoReq.class,
      responseType = bilibili.app.interface.v1.MediaVideoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaVideoReq,
      bilibili.app.interface.v1.MediaVideoReply> getMediaVideoMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaVideoReq, bilibili.app.interface.v1.MediaVideoReply> getMediaVideoMethod;
    if ((getMediaVideoMethod = MediaGrpc.getMediaVideoMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getMediaVideoMethod = MediaGrpc.getMediaVideoMethod) == null) {
          MediaGrpc.getMediaVideoMethod = getMediaVideoMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.MediaVideoReq, bilibili.app.interface.v1.MediaVideoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MediaVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaVideoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaVideoReply.getDefaultInstance()))
              .setSchemaDescriptor(new MediaMethodDescriptorSupplier("MediaVideo"))
              .build();
        }
      }
    }
    return getMediaVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaRelationReq,
      bilibili.app.interface.v1.MediaRelationReply> getMediaRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MediaRelation",
      requestType = bilibili.app.interface.v1.MediaRelationReq.class,
      responseType = bilibili.app.interface.v1.MediaRelationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaRelationReq,
      bilibili.app.interface.v1.MediaRelationReply> getMediaRelationMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaRelationReq, bilibili.app.interface.v1.MediaRelationReply> getMediaRelationMethod;
    if ((getMediaRelationMethod = MediaGrpc.getMediaRelationMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getMediaRelationMethod = MediaGrpc.getMediaRelationMethod) == null) {
          MediaGrpc.getMediaRelationMethod = getMediaRelationMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.MediaRelationReq, bilibili.app.interface.v1.MediaRelationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MediaRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaRelationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaRelationReply.getDefaultInstance()))
              .setSchemaDescriptor(new MediaMethodDescriptorSupplier("MediaRelation"))
              .build();
        }
      }
    }
    return getMediaRelationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaFollowReq,
      bilibili.app.interface.v1.MediaFollowReply> getMediaFollowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MediaFollow",
      requestType = bilibili.app.interface.v1.MediaFollowReq.class,
      responseType = bilibili.app.interface.v1.MediaFollowReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaFollowReq,
      bilibili.app.interface.v1.MediaFollowReply> getMediaFollowMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.MediaFollowReq, bilibili.app.interface.v1.MediaFollowReply> getMediaFollowMethod;
    if ((getMediaFollowMethod = MediaGrpc.getMediaFollowMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getMediaFollowMethod = MediaGrpc.getMediaFollowMethod) == null) {
          MediaGrpc.getMediaFollowMethod = getMediaFollowMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.MediaFollowReq, bilibili.app.interface.v1.MediaFollowReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MediaFollow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaFollowReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.MediaFollowReply.getDefaultInstance()))
              .setSchemaDescriptor(new MediaMethodDescriptorSupplier("MediaFollow"))
              .build();
        }
      }
    }
    return getMediaFollowMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MediaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaStub>() {
        @java.lang.Override
        public MediaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaStub(channel, callOptions);
        }
      };
    return MediaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MediaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaBlockingStub>() {
        @java.lang.Override
        public MediaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaBlockingStub(channel, callOptions);
        }
      };
    return MediaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MediaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaFutureStub>() {
        @java.lang.Override
        public MediaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaFutureStub(channel, callOptions);
        }
      };
    return MediaFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void mediaTab(bilibili.app.interface.v1.MediaTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaTabReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMediaTabMethod(), responseObserver);
    }

    /**
     */
    default void mediaDetail(bilibili.app.interface.v1.MediaDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaDetailReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMediaDetailMethod(), responseObserver);
    }

    /**
     */
    default void mediaVideo(bilibili.app.interface.v1.MediaVideoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaVideoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMediaVideoMethod(), responseObserver);
    }

    /**
     */
    default void mediaRelation(bilibili.app.interface.v1.MediaRelationReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaRelationReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMediaRelationMethod(), responseObserver);
    }

    /**
     */
    default void mediaFollow(bilibili.app.interface.v1.MediaFollowReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaFollowReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMediaFollowMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Media.
   */
  public static abstract class MediaImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MediaGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Media.
   */
  public static final class MediaStub
      extends io.grpc.stub.AbstractAsyncStub<MediaStub> {
    private MediaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaStub(channel, callOptions);
    }

    /**
     */
    public void mediaTab(bilibili.app.interface.v1.MediaTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaTabReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMediaTabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mediaDetail(bilibili.app.interface.v1.MediaDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaDetailReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMediaDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mediaVideo(bilibili.app.interface.v1.MediaVideoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaVideoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMediaVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mediaRelation(bilibili.app.interface.v1.MediaRelationReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaRelationReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMediaRelationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mediaFollow(bilibili.app.interface.v1.MediaFollowReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaFollowReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMediaFollowMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Media.
   */
  public static final class MediaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MediaBlockingStub> {
    private MediaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.interface.v1.MediaTabReply mediaTab(bilibili.app.interface.v1.MediaTabReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMediaTabMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.interface.v1.MediaDetailReply mediaDetail(bilibili.app.interface.v1.MediaDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMediaDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.interface.v1.MediaVideoReply mediaVideo(bilibili.app.interface.v1.MediaVideoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMediaVideoMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.interface.v1.MediaRelationReply mediaRelation(bilibili.app.interface.v1.MediaRelationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMediaRelationMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.interface.v1.MediaFollowReply mediaFollow(bilibili.app.interface.v1.MediaFollowReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMediaFollowMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Media.
   */
  public static final class MediaFutureStub
      extends io.grpc.stub.AbstractFutureStub<MediaFutureStub> {
    private MediaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.MediaTabReply> mediaTab(
        bilibili.app.interface.v1.MediaTabReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMediaTabMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.MediaDetailReply> mediaDetail(
        bilibili.app.interface.v1.MediaDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMediaDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.MediaVideoReply> mediaVideo(
        bilibili.app.interface.v1.MediaVideoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMediaVideoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.MediaRelationReply> mediaRelation(
        bilibili.app.interface.v1.MediaRelationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMediaRelationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.MediaFollowReply> mediaFollow(
        bilibili.app.interface.v1.MediaFollowReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMediaFollowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MEDIA_TAB = 0;
  private static final int METHODID_MEDIA_DETAIL = 1;
  private static final int METHODID_MEDIA_VIDEO = 2;
  private static final int METHODID_MEDIA_RELATION = 3;
  private static final int METHODID_MEDIA_FOLLOW = 4;

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
        case METHODID_MEDIA_TAB:
          serviceImpl.mediaTab((bilibili.app.interface.v1.MediaTabReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaTabReply>) responseObserver);
          break;
        case METHODID_MEDIA_DETAIL:
          serviceImpl.mediaDetail((bilibili.app.interface.v1.MediaDetailReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaDetailReply>) responseObserver);
          break;
        case METHODID_MEDIA_VIDEO:
          serviceImpl.mediaVideo((bilibili.app.interface.v1.MediaVideoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaVideoReply>) responseObserver);
          break;
        case METHODID_MEDIA_RELATION:
          serviceImpl.mediaRelation((bilibili.app.interface.v1.MediaRelationReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaRelationReply>) responseObserver);
          break;
        case METHODID_MEDIA_FOLLOW:
          serviceImpl.mediaFollow((bilibili.app.interface.v1.MediaFollowReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.MediaFollowReply>) responseObserver);
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
          getMediaTabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.MediaTabReq,
              bilibili.app.interface.v1.MediaTabReply>(
                service, METHODID_MEDIA_TAB)))
        .addMethod(
          getMediaDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.MediaDetailReq,
              bilibili.app.interface.v1.MediaDetailReply>(
                service, METHODID_MEDIA_DETAIL)))
        .addMethod(
          getMediaVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.MediaVideoReq,
              bilibili.app.interface.v1.MediaVideoReply>(
                service, METHODID_MEDIA_VIDEO)))
        .addMethod(
          getMediaRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.MediaRelationReq,
              bilibili.app.interface.v1.MediaRelationReply>(
                service, METHODID_MEDIA_RELATION)))
        .addMethod(
          getMediaFollowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.MediaFollowReq,
              bilibili.app.interface.v1.MediaFollowReply>(
                service, METHODID_MEDIA_FOLLOW)))
        .build();
  }

  private static abstract class MediaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MediaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.interface.v1.MediaOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Media");
    }
  }

  private static final class MediaFileDescriptorSupplier
      extends MediaBaseDescriptorSupplier {
    MediaFileDescriptorSupplier() {}
  }

  private static final class MediaMethodDescriptorSupplier
      extends MediaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MediaMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MediaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MediaFileDescriptorSupplier())
              .addMethod(getMediaTabMethod())
              .addMethod(getMediaDetailMethod())
              .addMethod(getMediaVideoMethod())
              .addMethod(getMediaRelationMethod())
              .addMethod(getMediaFollowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
