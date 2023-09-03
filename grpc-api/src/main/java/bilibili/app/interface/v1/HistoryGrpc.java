package bilibili.app.interface.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 历史记录
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/interfaces/v1/history.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HistoryGrpc {

  private HistoryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.interface.v1.History";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.HistoryTabReq,
      bilibili.app.interface.v1.HistoryTabReply> getHistoryTabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoryTab",
      requestType = bilibili.app.interface.v1.HistoryTabReq.class,
      responseType = bilibili.app.interface.v1.HistoryTabReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.HistoryTabReq,
      bilibili.app.interface.v1.HistoryTabReply> getHistoryTabMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.HistoryTabReq, bilibili.app.interface.v1.HistoryTabReply> getHistoryTabMethod;
    if ((getHistoryTabMethod = HistoryGrpc.getHistoryTabMethod) == null) {
      synchronized (HistoryGrpc.class) {
        if ((getHistoryTabMethod = HistoryGrpc.getHistoryTabMethod) == null) {
          HistoryGrpc.getHistoryTabMethod = getHistoryTabMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.HistoryTabReq, bilibili.app.interface.v1.HistoryTabReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoryTab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.HistoryTabReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.HistoryTabReply.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryMethodDescriptorSupplier("HistoryTab"))
              .build();
        }
      }
    }
    return getHistoryTabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.CursorReq,
      bilibili.app.interface.v1.CursorReply> getCursorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cursor",
      requestType = bilibili.app.interface.v1.CursorReq.class,
      responseType = bilibili.app.interface.v1.CursorReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.CursorReq,
      bilibili.app.interface.v1.CursorReply> getCursorMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.CursorReq, bilibili.app.interface.v1.CursorReply> getCursorMethod;
    if ((getCursorMethod = HistoryGrpc.getCursorMethod) == null) {
      synchronized (HistoryGrpc.class) {
        if ((getCursorMethod = HistoryGrpc.getCursorMethod) == null) {
          HistoryGrpc.getCursorMethod = getCursorMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.CursorReq, bilibili.app.interface.v1.CursorReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cursor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.CursorReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.CursorReply.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryMethodDescriptorSupplier("Cursor"))
              .build();
        }
      }
    }
    return getCursorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.CursorV2Req,
      bilibili.app.interface.v1.CursorV2Reply> getCursorV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CursorV2",
      requestType = bilibili.app.interface.v1.CursorV2Req.class,
      responseType = bilibili.app.interface.v1.CursorV2Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.CursorV2Req,
      bilibili.app.interface.v1.CursorV2Reply> getCursorV2Method() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.CursorV2Req, bilibili.app.interface.v1.CursorV2Reply> getCursorV2Method;
    if ((getCursorV2Method = HistoryGrpc.getCursorV2Method) == null) {
      synchronized (HistoryGrpc.class) {
        if ((getCursorV2Method = HistoryGrpc.getCursorV2Method) == null) {
          HistoryGrpc.getCursorV2Method = getCursorV2Method =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.CursorV2Req, bilibili.app.interface.v1.CursorV2Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CursorV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.CursorV2Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.CursorV2Reply.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryMethodDescriptorSupplier("CursorV2"))
              .build();
        }
      }
    }
    return getCursorV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.DeleteReq,
      bilibili.app.interface.v1.NoReply> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = bilibili.app.interface.v1.DeleteReq.class,
      responseType = bilibili.app.interface.v1.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.DeleteReq,
      bilibili.app.interface.v1.NoReply> getDeleteMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.DeleteReq, bilibili.app.interface.v1.NoReply> getDeleteMethod;
    if ((getDeleteMethod = HistoryGrpc.getDeleteMethod) == null) {
      synchronized (HistoryGrpc.class) {
        if ((getDeleteMethod = HistoryGrpc.getDeleteMethod) == null) {
          HistoryGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.DeleteReq, bilibili.app.interface.v1.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.DeleteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchReq,
      bilibili.app.interface.v1.SearchReply> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = bilibili.app.interface.v1.SearchReq.class,
      responseType = bilibili.app.interface.v1.SearchReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchReq,
      bilibili.app.interface.v1.SearchReply> getSearchMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.SearchReq, bilibili.app.interface.v1.SearchReply> getSearchMethod;
    if ((getSearchMethod = HistoryGrpc.getSearchMethod) == null) {
      synchronized (HistoryGrpc.class) {
        if ((getSearchMethod = HistoryGrpc.getSearchMethod) == null) {
          HistoryGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.SearchReq, bilibili.app.interface.v1.SearchReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.SearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.SearchReply.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.ClearReq,
      bilibili.app.interface.v1.NoReply> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = bilibili.app.interface.v1.ClearReq.class,
      responseType = bilibili.app.interface.v1.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.ClearReq,
      bilibili.app.interface.v1.NoReply> getClearMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.ClearReq, bilibili.app.interface.v1.NoReply> getClearMethod;
    if ((getClearMethod = HistoryGrpc.getClearMethod) == null) {
      synchronized (HistoryGrpc.class) {
        if ((getClearMethod = HistoryGrpc.getClearMethod) == null) {
          HistoryGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.ClearReq, bilibili.app.interface.v1.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.ClearReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.interface.v1.LatestHistoryReq,
      bilibili.app.interface.v1.LatestHistoryReply> getLatestHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestHistory",
      requestType = bilibili.app.interface.v1.LatestHistoryReq.class,
      responseType = bilibili.app.interface.v1.LatestHistoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.interface.v1.LatestHistoryReq,
      bilibili.app.interface.v1.LatestHistoryReply> getLatestHistoryMethod() {
    io.grpc.MethodDescriptor<bilibili.app.interface.v1.LatestHistoryReq, bilibili.app.interface.v1.LatestHistoryReply> getLatestHistoryMethod;
    if ((getLatestHistoryMethod = HistoryGrpc.getLatestHistoryMethod) == null) {
      synchronized (HistoryGrpc.class) {
        if ((getLatestHistoryMethod = HistoryGrpc.getLatestHistoryMethod) == null) {
          HistoryGrpc.getLatestHistoryMethod = getLatestHistoryMethod =
              io.grpc.MethodDescriptor.<bilibili.app.interface.v1.LatestHistoryReq, bilibili.app.interface.v1.LatestHistoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.LatestHistoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.interface.v1.LatestHistoryReply.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryMethodDescriptorSupplier("LatestHistory"))
              .build();
        }
      }
    }
    return getLatestHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryStub>() {
        @java.lang.Override
        public HistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryStub(channel, callOptions);
        }
      };
    return HistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryBlockingStub>() {
        @java.lang.Override
        public HistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryBlockingStub(channel, callOptions);
        }
      };
    return HistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryFutureStub>() {
        @java.lang.Override
        public HistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryFutureStub(channel, callOptions);
        }
      };
    return HistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 历史记录
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取历史记录tab
     * </pre>
     */
    default void historyTab(bilibili.app.interface.v1.HistoryTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.HistoryTabReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoryTabMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取历史记录列表(旧版)
     * </pre>
     */
    default void cursor(bilibili.app.interface.v1.CursorReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.CursorReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCursorMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取历史记录列表
     * </pre>
     */
    default void cursorV2(bilibili.app.interface.v1.CursorV2Req request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.CursorV2Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCursorV2Method(), responseObserver);
    }

    /**
     * <pre>
     * 删除历史记录
     * </pre>
     */
    default void delete(bilibili.app.interface.v1.DeleteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 搜索历史记录
     * </pre>
     */
    default void search(bilibili.app.interface.v1.SearchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 清空历史记录
     * </pre>
     */
    default void clear(bilibili.app.interface.v1.ClearReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取最新的历史记录
     * </pre>
     */
    default void latestHistory(bilibili.app.interface.v1.LatestHistoryReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.LatestHistoryReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLatestHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service History.
   * <pre>
   * 历史记录
   * </pre>
   */
  public static abstract class HistoryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HistoryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service History.
   * <pre>
   * 历史记录
   * </pre>
   */
  public static final class HistoryStub
      extends io.grpc.stub.AbstractAsyncStub<HistoryStub> {
    private HistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取历史记录tab
     * </pre>
     */
    public void historyTab(bilibili.app.interface.v1.HistoryTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.HistoryTabReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoryTabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取历史记录列表(旧版)
     * </pre>
     */
    public void cursor(bilibili.app.interface.v1.CursorReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.CursorReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCursorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取历史记录列表
     * </pre>
     */
    public void cursorV2(bilibili.app.interface.v1.CursorV2Req request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.CursorV2Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCursorV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除历史记录
     * </pre>
     */
    public void delete(bilibili.app.interface.v1.DeleteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索历史记录
     * </pre>
     */
    public void search(bilibili.app.interface.v1.SearchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 清空历史记录
     * </pre>
     */
    public void clear(bilibili.app.interface.v1.ClearReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取最新的历史记录
     * </pre>
     */
    public void latestHistory(bilibili.app.interface.v1.LatestHistoryReq request,
        io.grpc.stub.StreamObserver<bilibili.app.interface.v1.LatestHistoryReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLatestHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service History.
   * <pre>
   * 历史记录
   * </pre>
   */
  public static final class HistoryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HistoryBlockingStub> {
    private HistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取历史记录tab
     * </pre>
     */
    public bilibili.app.interface.v1.HistoryTabReply historyTab(bilibili.app.interface.v1.HistoryTabReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoryTabMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取历史记录列表(旧版)
     * </pre>
     */
    public bilibili.app.interface.v1.CursorReply cursor(bilibili.app.interface.v1.CursorReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCursorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取历史记录列表
     * </pre>
     */
    public bilibili.app.interface.v1.CursorV2Reply cursorV2(bilibili.app.interface.v1.CursorV2Req request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCursorV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除历史记录
     * </pre>
     */
    public bilibili.app.interface.v1.NoReply delete(bilibili.app.interface.v1.DeleteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索历史记录
     * </pre>
     */
    public bilibili.app.interface.v1.SearchReply search(bilibili.app.interface.v1.SearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 清空历史记录
     * </pre>
     */
    public bilibili.app.interface.v1.NoReply clear(bilibili.app.interface.v1.ClearReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取最新的历史记录
     * </pre>
     */
    public bilibili.app.interface.v1.LatestHistoryReply latestHistory(bilibili.app.interface.v1.LatestHistoryReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLatestHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service History.
   * <pre>
   * 历史记录
   * </pre>
   */
  public static final class HistoryFutureStub
      extends io.grpc.stub.AbstractFutureStub<HistoryFutureStub> {
    private HistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取历史记录tab
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.HistoryTabReply> historyTab(
        bilibili.app.interface.v1.HistoryTabReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoryTabMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取历史记录列表(旧版)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.CursorReply> cursor(
        bilibili.app.interface.v1.CursorReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCursorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取历史记录列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.CursorV2Reply> cursorV2(
        bilibili.app.interface.v1.CursorV2Req request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCursorV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除历史记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.NoReply> delete(
        bilibili.app.interface.v1.DeleteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索历史记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.SearchReply> search(
        bilibili.app.interface.v1.SearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 清空历史记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.NoReply> clear(
        bilibili.app.interface.v1.ClearReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取最新的历史记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.interface.v1.LatestHistoryReply> latestHistory(
        bilibili.app.interface.v1.LatestHistoryReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLatestHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HISTORY_TAB = 0;
  private static final int METHODID_CURSOR = 1;
  private static final int METHODID_CURSOR_V2 = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_SEARCH = 4;
  private static final int METHODID_CLEAR = 5;
  private static final int METHODID_LATEST_HISTORY = 6;

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
        case METHODID_HISTORY_TAB:
          serviceImpl.historyTab((bilibili.app.interface.v1.HistoryTabReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.HistoryTabReply>) responseObserver);
          break;
        case METHODID_CURSOR:
          serviceImpl.cursor((bilibili.app.interface.v1.CursorReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.CursorReply>) responseObserver);
          break;
        case METHODID_CURSOR_V2:
          serviceImpl.cursorV2((bilibili.app.interface.v1.CursorV2Req) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.CursorV2Reply>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((bilibili.app.interface.v1.DeleteReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.NoReply>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((bilibili.app.interface.v1.SearchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.SearchReply>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((bilibili.app.interface.v1.ClearReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.NoReply>) responseObserver);
          break;
        case METHODID_LATEST_HISTORY:
          serviceImpl.latestHistory((bilibili.app.interface.v1.LatestHistoryReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.interface.v1.LatestHistoryReply>) responseObserver);
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
          getHistoryTabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.HistoryTabReq,
              bilibili.app.interface.v1.HistoryTabReply>(
                service, METHODID_HISTORY_TAB)))
        .addMethod(
          getCursorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.CursorReq,
              bilibili.app.interface.v1.CursorReply>(
                service, METHODID_CURSOR)))
        .addMethod(
          getCursorV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.CursorV2Req,
              bilibili.app.interface.v1.CursorV2Reply>(
                service, METHODID_CURSOR_V2)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.DeleteReq,
              bilibili.app.interface.v1.NoReply>(
                service, METHODID_DELETE)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.SearchReq,
              bilibili.app.interface.v1.SearchReply>(
                service, METHODID_SEARCH)))
        .addMethod(
          getClearMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.ClearReq,
              bilibili.app.interface.v1.NoReply>(
                service, METHODID_CLEAR)))
        .addMethod(
          getLatestHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.interface.v1.LatestHistoryReq,
              bilibili.app.interface.v1.LatestHistoryReply>(
                service, METHODID_LATEST_HISTORY)))
        .build();
  }

  private static abstract class HistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.interface.v1.HistoryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("History");
    }
  }

  private static final class HistoryFileDescriptorSupplier
      extends HistoryBaseDescriptorSupplier {
    HistoryFileDescriptorSupplier() {}
  }

  private static final class HistoryMethodDescriptorSupplier
      extends HistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HistoryMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HistoryFileDescriptorSupplier())
              .addMethod(getHistoryTabMethod())
              .addMethod(getCursorMethod())
              .addMethod(getCursorV2Method())
              .addMethod(getDeleteMethod())
              .addMethod(getSearchMethod())
              .addMethod(getClearMethod())
              .addMethod(getLatestHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
