package bilibili.app.listener.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/listener/v1/listener.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MusicGrpc {

  private MusicGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.listener.v1.Music";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq,
      bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp> getFavTabShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavTabShow",
      requestType = bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq.class,
      responseType = bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq,
      bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp> getFavTabShowMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq, bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp> getFavTabShowMethod;
    if ((getFavTabShowMethod = MusicGrpc.getFavTabShowMethod) == null) {
      synchronized (MusicGrpc.class) {
        if ((getFavTabShowMethod = MusicGrpc.getFavTabShowMethod) == null) {
          MusicGrpc.getFavTabShowMethod = getFavTabShowMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq, bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavTabShow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp.getDefaultInstance()))
              .setSchemaDescriptor(new MusicMethodDescriptorSupplier("FavTabShow"))
              .build();
        }
      }
    }
    return getFavTabShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq,
      bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp> getMainFavMusicSubTabListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MainFavMusicSubTabList",
      requestType = bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq.class,
      responseType = bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq,
      bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp> getMainFavMusicSubTabListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq, bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp> getMainFavMusicSubTabListMethod;
    if ((getMainFavMusicSubTabListMethod = MusicGrpc.getMainFavMusicSubTabListMethod) == null) {
      synchronized (MusicGrpc.class) {
        if ((getMainFavMusicSubTabListMethod = MusicGrpc.getMainFavMusicSubTabListMethod) == null) {
          MusicGrpc.getMainFavMusicSubTabListMethod = getMainFavMusicSubTabListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq, bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MainFavMusicSubTabList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp.getDefaultInstance()))
              .setSchemaDescriptor(new MusicMethodDescriptorSupplier("MainFavMusicSubTabList"))
              .build();
        }
      }
    }
    return getMainFavMusicSubTabListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq,
      bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp> getMainFavMusicMenuListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MainFavMusicMenuList",
      requestType = bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq.class,
      responseType = bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq,
      bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp> getMainFavMusicMenuListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq, bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp> getMainFavMusicMenuListMethod;
    if ((getMainFavMusicMenuListMethod = MusicGrpc.getMainFavMusicMenuListMethod) == null) {
      synchronized (MusicGrpc.class) {
        if ((getMainFavMusicMenuListMethod = MusicGrpc.getMainFavMusicMenuListMethod) == null) {
          MusicGrpc.getMainFavMusicMenuListMethod = getMainFavMusicMenuListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq, bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MainFavMusicMenuList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp.getDefaultInstance()))
              .setSchemaDescriptor(new MusicMethodDescriptorSupplier("MainFavMusicMenuList"))
              .build();
        }
      }
    }
    return getMainFavMusicMenuListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq,
      bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp> getMenuEditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MenuEdit",
      requestType = bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq.class,
      responseType = bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq,
      bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp> getMenuEditMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq, bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp> getMenuEditMethod;
    if ((getMenuEditMethod = MusicGrpc.getMenuEditMethod) == null) {
      synchronized (MusicGrpc.class) {
        if ((getMenuEditMethod = MusicGrpc.getMenuEditMethod) == null) {
          MusicGrpc.getMenuEditMethod = getMenuEditMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq, bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MenuEdit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp.getDefaultInstance()))
              .setSchemaDescriptor(new MusicMethodDescriptorSupplier("MenuEdit"))
              .build();
        }
      }
    }
    return getMenuEditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq,
      bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp> getMenuDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MenuDelete",
      requestType = bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq.class,
      responseType = bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq,
      bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp> getMenuDeleteMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq, bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp> getMenuDeleteMethod;
    if ((getMenuDeleteMethod = MusicGrpc.getMenuDeleteMethod) == null) {
      synchronized (MusicGrpc.class) {
        if ((getMenuDeleteMethod = MusicGrpc.getMenuDeleteMethod) == null) {
          MusicGrpc.getMenuDeleteMethod = getMenuDeleteMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq, bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MenuDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp.getDefaultInstance()))
              .setSchemaDescriptor(new MusicMethodDescriptorSupplier("MenuDelete"))
              .build();
        }
      }
    }
    return getMenuDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq,
      bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp> getMenuSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MenuSubscribe",
      requestType = bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq.class,
      responseType = bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq,
      bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp> getMenuSubscribeMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq, bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp> getMenuSubscribeMethod;
    if ((getMenuSubscribeMethod = MusicGrpc.getMenuSubscribeMethod) == null) {
      synchronized (MusicGrpc.class) {
        if ((getMenuSubscribeMethod = MusicGrpc.getMenuSubscribeMethod) == null) {
          MusicGrpc.getMenuSubscribeMethod = getMenuSubscribeMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq, bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MenuSubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp.getDefaultInstance()))
              .setSchemaDescriptor(new MusicMethodDescriptorSupplier("MenuSubscribe"))
              .build();
        }
      }
    }
    return getMenuSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.ClickReq,
      bilibili.app.listener.v1.ListenerRpcProto.ClickResp> getClickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Click",
      requestType = bilibili.app.listener.v1.ListenerRpcProto.ClickReq.class,
      responseType = bilibili.app.listener.v1.ListenerRpcProto.ClickResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.ClickReq,
      bilibili.app.listener.v1.ListenerRpcProto.ClickResp> getClickMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.ListenerRpcProto.ClickReq, bilibili.app.listener.v1.ListenerRpcProto.ClickResp> getClickMethod;
    if ((getClickMethod = MusicGrpc.getClickMethod) == null) {
      synchronized (MusicGrpc.class) {
        if ((getClickMethod = MusicGrpc.getClickMethod) == null) {
          MusicGrpc.getClickMethod = getClickMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.ListenerRpcProto.ClickReq, bilibili.app.listener.v1.ListenerRpcProto.ClickResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Click"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.ClickReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ListenerRpcProto.ClickResp.getDefaultInstance()))
              .setSchemaDescriptor(new MusicMethodDescriptorSupplier("Click"))
              .build();
        }
      }
    }
    return getClickMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MusicStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MusicStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MusicStub>() {
        @java.lang.Override
        public MusicStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MusicStub(channel, callOptions);
        }
      };
    return MusicStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MusicBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MusicBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MusicBlockingStub>() {
        @java.lang.Override
        public MusicBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MusicBlockingStub(channel, callOptions);
        }
      };
    return MusicBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MusicFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MusicFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MusicFutureStub>() {
        @java.lang.Override
        public MusicFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MusicFutureStub(channel, callOptions);
        }
      };
    return MusicFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void favTabShow(bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavTabShowMethod(), responseObserver);
    }

    /**
     */
    default void mainFavMusicSubTabList(bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMainFavMusicSubTabListMethod(), responseObserver);
    }

    /**
     */
    default void mainFavMusicMenuList(bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMainFavMusicMenuListMethod(), responseObserver);
    }

    /**
     */
    default void menuEdit(bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMenuEditMethod(), responseObserver);
    }

    /**
     */
    default void menuDelete(bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMenuDeleteMethod(), responseObserver);
    }

    /**
     */
    default void menuSubscribe(bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMenuSubscribeMethod(), responseObserver);
    }

    /**
     */
    default void click(bilibili.app.listener.v1.ListenerRpcProto.ClickReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.ClickResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClickMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Music.
   */
  public static abstract class MusicImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MusicGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Music.
   */
  public static final class MusicStub
      extends io.grpc.stub.AbstractAsyncStub<MusicStub> {
    private MusicStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MusicStub(channel, callOptions);
    }

    /**
     */
    public void favTabShow(bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavTabShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mainFavMusicSubTabList(bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMainFavMusicSubTabListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mainFavMusicMenuList(bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMainFavMusicMenuListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void menuEdit(bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMenuEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void menuDelete(bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMenuDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void menuSubscribe(bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMenuSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void click(bilibili.app.listener.v1.ListenerRpcProto.ClickReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.ClickResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClickMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Music.
   */
  public static final class MusicBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MusicBlockingStub> {
    private MusicBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MusicBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp favTabShow(bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavTabShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp mainFavMusicSubTabList(bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMainFavMusicSubTabListMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp mainFavMusicMenuList(bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMainFavMusicMenuListMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp menuEdit(bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMenuEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp menuDelete(bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMenuDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp menuSubscribe(bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMenuSubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.ListenerRpcProto.ClickResp click(bilibili.app.listener.v1.ListenerRpcProto.ClickReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClickMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Music.
   */
  public static final class MusicFutureStub
      extends io.grpc.stub.AbstractFutureStub<MusicFutureStub> {
    private MusicFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MusicFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp> favTabShow(
        bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavTabShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp> mainFavMusicSubTabList(
        bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMainFavMusicSubTabListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp> mainFavMusicMenuList(
        bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMainFavMusicMenuListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp> menuEdit(
        bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMenuEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp> menuDelete(
        bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMenuDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp> menuSubscribe(
        bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMenuSubscribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.ListenerRpcProto.ClickResp> click(
        bilibili.app.listener.v1.ListenerRpcProto.ClickReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClickMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FAV_TAB_SHOW = 0;
  private static final int METHODID_MAIN_FAV_MUSIC_SUB_TAB_LIST = 1;
  private static final int METHODID_MAIN_FAV_MUSIC_MENU_LIST = 2;
  private static final int METHODID_MENU_EDIT = 3;
  private static final int METHODID_MENU_DELETE = 4;
  private static final int METHODID_MENU_SUBSCRIBE = 5;
  private static final int METHODID_CLICK = 6;

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
        case METHODID_FAV_TAB_SHOW:
          serviceImpl.favTabShow((bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp>) responseObserver);
          break;
        case METHODID_MAIN_FAV_MUSIC_SUB_TAB_LIST:
          serviceImpl.mainFavMusicSubTabList((bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp>) responseObserver);
          break;
        case METHODID_MAIN_FAV_MUSIC_MENU_LIST:
          serviceImpl.mainFavMusicMenuList((bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp>) responseObserver);
          break;
        case METHODID_MENU_EDIT:
          serviceImpl.menuEdit((bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp>) responseObserver);
          break;
        case METHODID_MENU_DELETE:
          serviceImpl.menuDelete((bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp>) responseObserver);
          break;
        case METHODID_MENU_SUBSCRIBE:
          serviceImpl.menuSubscribe((bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp>) responseObserver);
          break;
        case METHODID_CLICK:
          serviceImpl.click((bilibili.app.listener.v1.ListenerRpcProto.ClickReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ListenerRpcProto.ClickResp>) responseObserver);
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
          getFavTabShowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.ListenerRpcProto.FavTabShowReq,
              bilibili.app.listener.v1.ListenerRpcProto.FavTabShowResp>(
                service, METHODID_FAV_TAB_SHOW)))
        .addMethod(
          getMainFavMusicSubTabListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListReq,
              bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicSubTabListResp>(
                service, METHODID_MAIN_FAV_MUSIC_SUB_TAB_LIST)))
        .addMethod(
          getMainFavMusicMenuListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListReq,
              bilibili.app.listener.v1.ListenerRpcProto.MainFavMusicMenuListResp>(
                service, METHODID_MAIN_FAV_MUSIC_MENU_LIST)))
        .addMethod(
          getMenuEditMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.ListenerRpcProto.MenuEditReq,
              bilibili.app.listener.v1.ListenerRpcProto.MenuEditResp>(
                service, METHODID_MENU_EDIT)))
        .addMethod(
          getMenuDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteReq,
              bilibili.app.listener.v1.ListenerRpcProto.MenuDeleteResp>(
                service, METHODID_MENU_DELETE)))
        .addMethod(
          getMenuSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeReq,
              bilibili.app.listener.v1.ListenerRpcProto.MenuSubscribeResp>(
                service, METHODID_MENU_SUBSCRIBE)))
        .addMethod(
          getClickMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.ListenerRpcProto.ClickReq,
              bilibili.app.listener.v1.ListenerRpcProto.ClickResp>(
                service, METHODID_CLICK)))
        .build();
  }

  private static abstract class MusicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MusicBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.listener.v1.ListenerRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Music");
    }
  }

  private static final class MusicFileDescriptorSupplier
      extends MusicBaseDescriptorSupplier {
    MusicFileDescriptorSupplier() {}
  }

  private static final class MusicMethodDescriptorSupplier
      extends MusicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MusicMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MusicGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MusicFileDescriptorSupplier())
              .addMethod(getFavTabShowMethod())
              .addMethod(getMainFavMusicSubTabListMethod())
              .addMethod(getMainFavMusicMenuListMethod())
              .addMethod(getMenuEditMethod())
              .addMethod(getMenuDeleteMethod())
              .addMethod(getMenuSubscribeMethod())
              .addMethod(getClickMethod())
              .build();
        }
      }
    }
    return result;
  }
}
