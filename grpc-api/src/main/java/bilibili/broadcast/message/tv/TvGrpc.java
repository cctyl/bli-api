package bilibili.broadcast.message.tv;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/broadcast/message/tv/proj.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TvGrpc {

  private TvGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.message.tv.Tv";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.ProjReply> getProjMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proj",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.tv.ProjReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.ProjReply> getProjMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.tv.ProjReply> getProjMethod;
    if ((getProjMethod = TvGrpc.getProjMethod) == null) {
      synchronized (TvGrpc.class) {
        if ((getProjMethod = TvGrpc.getProjMethod) == null) {
          TvGrpc.getProjMethod = getProjMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.tv.ProjReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proj"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.tv.ProjReply.getDefaultInstance()))
              .setSchemaDescriptor(new TvMethodDescriptorSupplier("Proj"))
              .build();
        }
      }
    }
    return getProjMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.LiveStatusNotify> getLiveStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.tv.LiveStatusNotify.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.LiveStatusNotify> getLiveStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.tv.LiveStatusNotify> getLiveStatusMethod;
    if ((getLiveStatusMethod = TvGrpc.getLiveStatusMethod) == null) {
      synchronized (TvGrpc.class) {
        if ((getLiveStatusMethod = TvGrpc.getLiveStatusMethod) == null) {
          TvGrpc.getLiveStatusMethod = getLiveStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.tv.LiveStatusNotify>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiveStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.tv.LiveStatusNotify.getDefaultInstance()))
              .setSchemaDescriptor(new TvMethodDescriptorSupplier("LiveStatus"))
              .build();
        }
      }
    }
    return getLiveStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.EsportsNotify> getEsportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Esports",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.tv.EsportsNotify.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.EsportsNotify> getEsportsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.tv.EsportsNotify> getEsportsMethod;
    if ((getEsportsMethod = TvGrpc.getEsportsMethod) == null) {
      synchronized (TvGrpc.class) {
        if ((getEsportsMethod = TvGrpc.getEsportsMethod) == null) {
          TvGrpc.getEsportsMethod = getEsportsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.tv.EsportsNotify>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Esports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.tv.EsportsNotify.getDefaultInstance()))
              .setSchemaDescriptor(new TvMethodDescriptorSupplier("Esports"))
              .build();
        }
      }
    }
    return getEsportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.PublicityNotify> getPublicityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publicity",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.tv.PublicityNotify.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.PublicityNotify> getPublicityMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.tv.PublicityNotify> getPublicityMethod;
    if ((getPublicityMethod = TvGrpc.getPublicityMethod) == null) {
      synchronized (TvGrpc.class) {
        if ((getPublicityMethod = TvGrpc.getPublicityMethod) == null) {
          TvGrpc.getPublicityMethod = getPublicityMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.tv.PublicityNotify>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Publicity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.tv.PublicityNotify.getDefaultInstance()))
              .setSchemaDescriptor(new TvMethodDescriptorSupplier("Publicity"))
              .build();
        }
      }
    }
    return getPublicityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.LiveSkipNotify> getLiveSkipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveSkip",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.message.tv.LiveSkipNotify.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.message.tv.LiveSkipNotify> getLiveSkipMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.message.tv.LiveSkipNotify> getLiveSkipMethod;
    if ((getLiveSkipMethod = TvGrpc.getLiveSkipMethod) == null) {
      synchronized (TvGrpc.class) {
        if ((getLiveSkipMethod = TvGrpc.getLiveSkipMethod) == null) {
          TvGrpc.getLiveSkipMethod = getLiveSkipMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.message.tv.LiveSkipNotify>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiveSkip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.message.tv.LiveSkipNotify.getDefaultInstance()))
              .setSchemaDescriptor(new TvMethodDescriptorSupplier("LiveSkip"))
              .build();
        }
      }
    }
    return getLiveSkipMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TvStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TvStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TvStub>() {
        @java.lang.Override
        public TvStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TvStub(channel, callOptions);
        }
      };
    return TvStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TvBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TvBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TvBlockingStub>() {
        @java.lang.Override
        public TvBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TvBlockingStub(channel, callOptions);
        }
      };
    return TvBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TvFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TvFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TvFutureStub>() {
        @java.lang.Override
        public TvFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TvFutureStub(channel, callOptions);
        }
      };
    return TvFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 投屏
     * </pre>
     */
    default void proj(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.ProjReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProjMethod(), responseObserver);
    }

    /**
     * <pre>
     * 直播状态
     * </pre>
     */
    default void liveStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.LiveStatusNotify> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiveStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * 赛事比分通知
     * </pre>
     */
    default void esports(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.EsportsNotify> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEsportsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 直播插卡
     * </pre>
     */
    default void publicity(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.PublicityNotify> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublicityMethod(), responseObserver);
    }

    /**
     * <pre>
     * 直转点
     * </pre>
     */
    default void liveSkip(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.LiveSkipNotify> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiveSkipMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Tv.
   */
  public static abstract class TvImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TvGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Tv.
   */
  public static final class TvStub
      extends io.grpc.stub.AbstractAsyncStub<TvStub> {
    private TvStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TvStub(channel, callOptions);
    }

    /**
     * <pre>
     * 投屏
     * </pre>
     */
    public void proj(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.ProjReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getProjMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 直播状态
     * </pre>
     */
    public void liveStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.LiveStatusNotify> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getLiveStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 赛事比分通知
     * </pre>
     */
    public void esports(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.EsportsNotify> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEsportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 直播插卡
     * </pre>
     */
    public void publicity(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.PublicityNotify> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPublicityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 直转点
     * </pre>
     */
    public void liveSkip(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.LiveSkipNotify> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getLiveSkipMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Tv.
   */
  public static final class TvBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TvBlockingStub> {
    private TvBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TvBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 投屏
     * </pre>
     */
    public java.util.Iterator<bilibili.broadcast.message.tv.ProjReply> proj(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getProjMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 直播状态
     * </pre>
     */
    public java.util.Iterator<bilibili.broadcast.message.tv.LiveStatusNotify> liveStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getLiveStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 赛事比分通知
     * </pre>
     */
    public java.util.Iterator<bilibili.broadcast.message.tv.EsportsNotify> esports(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEsportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 直播插卡
     * </pre>
     */
    public java.util.Iterator<bilibili.broadcast.message.tv.PublicityNotify> publicity(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPublicityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 直转点
     * </pre>
     */
    public java.util.Iterator<bilibili.broadcast.message.tv.LiveSkipNotify> liveSkip(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getLiveSkipMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Tv.
   */
  public static final class TvFutureStub
      extends io.grpc.stub.AbstractFutureStub<TvFutureStub> {
    private TvFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TvFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PROJ = 0;
  private static final int METHODID_LIVE_STATUS = 1;
  private static final int METHODID_ESPORTS = 2;
  private static final int METHODID_PUBLICITY = 3;
  private static final int METHODID_LIVE_SKIP = 4;

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
        case METHODID_PROJ:
          serviceImpl.proj((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.ProjReply>) responseObserver);
          break;
        case METHODID_LIVE_STATUS:
          serviceImpl.liveStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.LiveStatusNotify>) responseObserver);
          break;
        case METHODID_ESPORTS:
          serviceImpl.esports((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.EsportsNotify>) responseObserver);
          break;
        case METHODID_PUBLICITY:
          serviceImpl.publicity((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.PublicityNotify>) responseObserver);
          break;
        case METHODID_LIVE_SKIP:
          serviceImpl.liveSkip((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.message.tv.LiveSkipNotify>) responseObserver);
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
          getProjMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.tv.ProjReply>(
                service, METHODID_PROJ)))
        .addMethod(
          getLiveStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.tv.LiveStatusNotify>(
                service, METHODID_LIVE_STATUS)))
        .addMethod(
          getEsportsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.tv.EsportsNotify>(
                service, METHODID_ESPORTS)))
        .addMethod(
          getPublicityMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.tv.PublicityNotify>(
                service, METHODID_PUBLICITY)))
        .addMethod(
          getLiveSkipMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.message.tv.LiveSkipNotify>(
                service, METHODID_LIVE_SKIP)))
        .build();
  }

  private static abstract class TvBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TvBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.message.tv.Proj.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tv");
    }
  }

  private static final class TvFileDescriptorSupplier
      extends TvBaseDescriptorSupplier {
    TvFileDescriptorSupplier() {}
  }

  private static final class TvMethodDescriptorSupplier
      extends TvBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TvMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TvGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TvFileDescriptorSupplier())
              .addMethod(getProjMethod())
              .addMethod(getLiveStatusMethod())
              .addMethod(getEsportsMethod())
              .addMethod(getPublicityMethod())
              .addMethod(getLiveSkipMethod())
              .build();
        }
      }
    }
    return result;
  }
}
