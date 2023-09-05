package bilibili.app.playurl.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 视频url
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/playurl/v1/playurl.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlayURLGrpc {

  private PlayURLGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.playurl.v1.PlayURL";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply> getPlayURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayURL",
      requestType = bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq.class,
      responseType = bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply> getPlayURLMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq, bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply> getPlayURLMethod;
    if ((getPlayURLMethod = PlayURLGrpc.getPlayURLMethod) == null) {
      synchronized (PlayURLGrpc.class) {
        if ((getPlayURLMethod = PlayURLGrpc.getPlayURLMethod) == null) {
          PlayURLGrpc.getPlayURLMethod = getPlayURLMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq, bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayURLMethodDescriptorSupplier("PlayURL"))
              .build();
        }
      }
    }
    return getPlayURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply> getProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Project",
      requestType = bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq.class,
      responseType = bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply> getProjectMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq, bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply> getProjectMethod;
    if ((getProjectMethod = PlayURLGrpc.getProjectMethod) == null) {
      synchronized (PlayURLGrpc.class) {
        if ((getProjectMethod = PlayURLGrpc.getProjectMethod) == null) {
          PlayURLGrpc.getProjectMethod = getProjectMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq, bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Project"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayURLMethodDescriptorSupplier("Project"))
              .build();
        }
      }
    }
    return getProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply> getPlayViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayView",
      requestType = bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq.class,
      responseType = bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply> getPlayViewMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq, bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply> getPlayViewMethod;
    if ((getPlayViewMethod = PlayURLGrpc.getPlayViewMethod) == null) {
      synchronized (PlayURLGrpc.class) {
        if ((getPlayViewMethod = PlayURLGrpc.getPlayViewMethod) == null) {
          PlayURLGrpc.getPlayViewMethod = getPlayViewMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq, bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayURLMethodDescriptorSupplier("PlayView"))
              .build();
        }
      }
    }
    return getPlayViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply> getPlayConfEditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayConfEdit",
      requestType = bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq.class,
      responseType = bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply> getPlayConfEditMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq, bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply> getPlayConfEditMethod;
    if ((getPlayConfEditMethod = PlayURLGrpc.getPlayConfEditMethod) == null) {
      synchronized (PlayURLGrpc.class) {
        if ((getPlayConfEditMethod = PlayURLGrpc.getPlayConfEditMethod) == null) {
          PlayURLGrpc.getPlayConfEditMethod = getPlayConfEditMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq, bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayConfEdit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayURLMethodDescriptorSupplier("PlayConfEdit"))
              .build();
        }
      }
    }
    return getPlayConfEditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply> getPlayConfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayConf",
      requestType = bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq.class,
      responseType = bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq,
      bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply> getPlayConfMethod() {
    io.grpc.MethodDescriptor<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq, bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply> getPlayConfMethod;
    if ((getPlayConfMethod = PlayURLGrpc.getPlayConfMethod) == null) {
      synchronized (PlayURLGrpc.class) {
        if ((getPlayConfMethod = PlayURLGrpc.getPlayConfMethod) == null) {
          PlayURLGrpc.getPlayConfMethod = getPlayConfMethod =
              io.grpc.MethodDescriptor.<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq, bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayConf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply.getDefaultInstance()))
              .setSchemaDescriptor(new PlayURLMethodDescriptorSupplier("PlayConf"))
              .build();
        }
      }
    }
    return getPlayConfMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayURLStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayURLStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayURLStub>() {
        @java.lang.Override
        public PlayURLStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayURLStub(channel, callOptions);
        }
      };
    return PlayURLStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayURLBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayURLBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayURLBlockingStub>() {
        @java.lang.Override
        public PlayURLBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayURLBlockingStub(channel, callOptions);
        }
      };
    return PlayURLBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayURLFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayURLFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayURLFutureStub>() {
        @java.lang.Override
        public PlayURLFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayURLFutureStub(channel, callOptions);
        }
      };
    return PlayURLFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 视频url
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 视频地址
     * </pre>
     */
    default void playURL(bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * 投屏地址
     * </pre>
     */
    default void project(bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * 播放页信息
     * </pre>
     */
    default void playView(bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayViewMethod(), responseObserver);
    }

    /**
     * <pre>
     * 编辑播放界面配置
     * </pre>
     */
    default void playConfEdit(bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayConfEditMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取播放界面配置
     * </pre>
     */
    default void playConf(bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayConfMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PlayURL.
   * <pre>
   * 视频url
   * </pre>
   */
  public static abstract class PlayURLImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PlayURLGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PlayURL.
   * <pre>
   * 视频url
   * </pre>
   */
  public static final class PlayURLStub
      extends io.grpc.stub.AbstractAsyncStub<PlayURLStub> {
    private PlayURLStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayURLStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayURLStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频地址
     * </pre>
     */
    public void playURL(bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 投屏地址
     * </pre>
     */
    public void project(bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 播放页信息
     * </pre>
     */
    public void playView(bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 编辑播放界面配置
     * </pre>
     */
    public void playConfEdit(bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayConfEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取播放界面配置
     * </pre>
     */
    public void playConf(bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq request,
        io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayConfMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PlayURL.
   * <pre>
   * 视频url
   * </pre>
   */
  public static final class PlayURLBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PlayURLBlockingStub> {
    private PlayURLBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayURLBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayURLBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频地址
     * </pre>
     */
    public bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply playURL(bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 投屏地址
     * </pre>
     */
    public bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply project(bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 播放页信息
     * </pre>
     */
    public bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply playView(bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayViewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 编辑播放界面配置
     * </pre>
     */
    public bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply playConfEdit(bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayConfEditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取播放界面配置
     * </pre>
     */
    public bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply playConf(bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayConfMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PlayURL.
   * <pre>
   * 视频url
   * </pre>
   */
  public static final class PlayURLFutureStub
      extends io.grpc.stub.AbstractFutureStub<PlayURLFutureStub> {
    private PlayURLFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayURLFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayURLFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频地址
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply> playURL(
        bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 投屏地址
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply> project(
        bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 播放页信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply> playView(
        bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayViewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 编辑播放界面配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply> playConfEdit(
        bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayConfEditMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取播放界面配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply> playConf(
        bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayConfMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY_URL = 0;
  private static final int METHODID_PROJECT = 1;
  private static final int METHODID_PLAY_VIEW = 2;
  private static final int METHODID_PLAY_CONF_EDIT = 3;
  private static final int METHODID_PLAY_CONF = 4;

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
        case METHODID_PLAY_URL:
          serviceImpl.playURL((bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply>) responseObserver);
          break;
        case METHODID_PROJECT:
          serviceImpl.project((bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply>) responseObserver);
          break;
        case METHODID_PLAY_VIEW:
          serviceImpl.playView((bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply>) responseObserver);
          break;
        case METHODID_PLAY_CONF_EDIT:
          serviceImpl.playConfEdit((bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply>) responseObserver);
          break;
        case METHODID_PLAY_CONF:
          serviceImpl.playConf((bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply>) responseObserver);
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
          getPlayURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReq,
              bilibili.app.playurl.v1.PlayurlRpcProto.PlayURLReply>(
                service, METHODID_PLAY_URL)))
        .addMethod(
          getProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReq,
              bilibili.app.playurl.v1.PlayurlRpcProto.ProjectReply>(
                service, METHODID_PROJECT)))
        .addMethod(
          getPlayViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReq,
              bilibili.app.playurl.v1.PlayurlRpcProto.PlayViewReply>(
                service, METHODID_PLAY_VIEW)))
        .addMethod(
          getPlayConfEditMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReq,
              bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfEditReply>(
                service, METHODID_PLAY_CONF_EDIT)))
        .addMethod(
          getPlayConfMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReq,
              bilibili.app.playurl.v1.PlayurlRpcProto.PlayConfReply>(
                service, METHODID_PLAY_CONF)))
        .build();
  }

  private static abstract class PlayURLBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayURLBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.playurl.v1.PlayurlRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlayURL");
    }
  }

  private static final class PlayURLFileDescriptorSupplier
      extends PlayURLBaseDescriptorSupplier {
    PlayURLFileDescriptorSupplier() {}
  }

  private static final class PlayURLMethodDescriptorSupplier
      extends PlayURLBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PlayURLMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PlayURLGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayURLFileDescriptorSupplier())
              .addMethod(getPlayURLMethod())
              .addMethod(getProjectMethod())
              .addMethod(getPlayViewMethod())
              .addMethod(getPlayConfEditMethod())
              .addMethod(getPlayConfMethod())
              .build();
        }
      }
    }
    return result;
  }
}
