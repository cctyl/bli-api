package bilibili.community.service.dm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *弹幕
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/community/service/dm/v1/dm.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DMGrpc {

  private DMGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.community.service.dm.v1.DM";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply> getDmSegMobileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DmSegMobile",
      requestType = bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq.class,
      responseType = bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply> getDmSegMobileMethod() {
    io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq, bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply> getDmSegMobileMethod;
    if ((getDmSegMobileMethod = DMGrpc.getDmSegMobileMethod) == null) {
      synchronized (DMGrpc.class) {
        if ((getDmSegMobileMethod = DMGrpc.getDmSegMobileMethod) == null) {
          DMGrpc.getDmSegMobileMethod = getDmSegMobileMethod =
              io.grpc.MethodDescriptor.<bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq, bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DmSegMobile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply.getDefaultInstance()))
              .setSchemaDescriptor(new DMMethodDescriptorSupplier("DmSegMobile"))
              .build();
        }
      }
    }
    return getDmSegMobileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmViewReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmViewReply> getDmViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DmView",
      requestType = bilibili.community.service.dm.v1.DmRpcProto.DmViewReq.class,
      responseType = bilibili.community.service.dm.v1.DmRpcProto.DmViewReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmViewReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmViewReply> getDmViewMethod() {
    io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmViewReq, bilibili.community.service.dm.v1.DmRpcProto.DmViewReply> getDmViewMethod;
    if ((getDmViewMethod = DMGrpc.getDmViewMethod) == null) {
      synchronized (DMGrpc.class) {
        if ((getDmViewMethod = DMGrpc.getDmViewMethod) == null) {
          DMGrpc.getDmViewMethod = getDmViewMethod =
              io.grpc.MethodDescriptor.<bilibili.community.service.dm.v1.DmRpcProto.DmViewReq, bilibili.community.service.dm.v1.DmRpcProto.DmViewReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DmView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmViewReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmViewReply.getDefaultInstance()))
              .setSchemaDescriptor(new DMMethodDescriptorSupplier("DmView"))
              .build();
        }
      }
    }
    return getDmViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq,
      bilibili.community.service.dm.v1.DmRpcProto.Response> getDmPlayerConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DmPlayerConfig",
      requestType = bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq.class,
      responseType = bilibili.community.service.dm.v1.DmRpcProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq,
      bilibili.community.service.dm.v1.DmRpcProto.Response> getDmPlayerConfigMethod() {
    io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq, bilibili.community.service.dm.v1.DmRpcProto.Response> getDmPlayerConfigMethod;
    if ((getDmPlayerConfigMethod = DMGrpc.getDmPlayerConfigMethod) == null) {
      synchronized (DMGrpc.class) {
        if ((getDmPlayerConfigMethod = DMGrpc.getDmPlayerConfigMethod) == null) {
          DMGrpc.getDmPlayerConfigMethod = getDmPlayerConfigMethod =
              io.grpc.MethodDescriptor.<bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq, bilibili.community.service.dm.v1.DmRpcProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DmPlayerConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new DMMethodDescriptorSupplier("DmPlayerConfig"))
              .build();
        }
      }
    }
    return getDmPlayerConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply> getDmSegOttMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DmSegOtt",
      requestType = bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq.class,
      responseType = bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply> getDmSegOttMethod() {
    io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq, bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply> getDmSegOttMethod;
    if ((getDmSegOttMethod = DMGrpc.getDmSegOttMethod) == null) {
      synchronized (DMGrpc.class) {
        if ((getDmSegOttMethod = DMGrpc.getDmSegOttMethod) == null) {
          DMGrpc.getDmSegOttMethod = getDmSegOttMethod =
              io.grpc.MethodDescriptor.<bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq, bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DmSegOtt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply.getDefaultInstance()))
              .setSchemaDescriptor(new DMMethodDescriptorSupplier("DmSegOtt"))
              .build();
        }
      }
    }
    return getDmSegOttMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply> getDmSegSDKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DmSegSDK",
      requestType = bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq.class,
      responseType = bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply> getDmSegSDKMethod() {
    io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq, bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply> getDmSegSDKMethod;
    if ((getDmSegSDKMethod = DMGrpc.getDmSegSDKMethod) == null) {
      synchronized (DMGrpc.class) {
        if ((getDmSegSDKMethod = DMGrpc.getDmSegSDKMethod) == null) {
          DMGrpc.getDmSegSDKMethod = getDmSegSDKMethod =
              io.grpc.MethodDescriptor.<bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq, bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DmSegSDK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply.getDefaultInstance()))
              .setSchemaDescriptor(new DMMethodDescriptorSupplier("DmSegSDK"))
              .build();
        }
      }
    }
    return getDmSegSDKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes> getDmExpoReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DmExpoReport",
      requestType = bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq.class,
      responseType = bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq,
      bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes> getDmExpoReportMethod() {
    io.grpc.MethodDescriptor<bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq, bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes> getDmExpoReportMethod;
    if ((getDmExpoReportMethod = DMGrpc.getDmExpoReportMethod) == null) {
      synchronized (DMGrpc.class) {
        if ((getDmExpoReportMethod = DMGrpc.getDmExpoReportMethod) == null) {
          DMGrpc.getDmExpoReportMethod = getDmExpoReportMethod =
              io.grpc.MethodDescriptor.<bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq, bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DmExpoReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes.getDefaultInstance()))
              .setSchemaDescriptor(new DMMethodDescriptorSupplier("DmExpoReport"))
              .build();
        }
      }
    }
    return getDmExpoReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DMStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DMStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DMStub>() {
        @java.lang.Override
        public DMStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DMStub(channel, callOptions);
        }
      };
    return DMStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DMBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DMBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DMBlockingStub>() {
        @java.lang.Override
        public DMBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DMBlockingStub(channel, callOptions);
        }
      };
    return DMBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DMFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DMFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DMFutureStub>() {
        @java.lang.Override
        public DMFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DMFutureStub(channel, callOptions);
        }
      };
    return DMFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *弹幕
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取分段弹幕
     * </pre>
     */
    default void dmSegMobile(bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDmSegMobileMethod(), responseObserver);
    }

    /**
     * <pre>
     * 客户端弹幕元数据 字幕、分段、防挡蒙版等
     * </pre>
     */
    default void dmView(bilibili.community.service.dm.v1.DmRpcProto.DmViewReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmViewReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDmViewMethod(), responseObserver);
    }

    /**
     * <pre>
     * 修改弹幕配置
     * </pre>
     */
    default void dmPlayerConfig(bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDmPlayerConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * ott弹幕列表
     * </pre>
     */
    default void dmSegOtt(bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDmSegOttMethod(), responseObserver);
    }

    /**
     * <pre>
     * SDK弹幕列表
     * </pre>
     */
    default void dmSegSDK(bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDmSegSDKMethod(), responseObserver);
    }

    /**
     */
    default void dmExpoReport(bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDmExpoReportMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DM.
   * <pre>
   *弹幕
   * </pre>
   */
  public static abstract class DMImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DMGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DM.
   * <pre>
   *弹幕
   * </pre>
   */
  public static final class DMStub
      extends io.grpc.stub.AbstractAsyncStub<DMStub> {
    private DMStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DMStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DMStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取分段弹幕
     * </pre>
     */
    public void dmSegMobile(bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDmSegMobileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 客户端弹幕元数据 字幕、分段、防挡蒙版等
     * </pre>
     */
    public void dmView(bilibili.community.service.dm.v1.DmRpcProto.DmViewReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmViewReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDmViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 修改弹幕配置
     * </pre>
     */
    public void dmPlayerConfig(bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDmPlayerConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ott弹幕列表
     * </pre>
     */
    public void dmSegOtt(bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDmSegOttMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SDK弹幕列表
     * </pre>
     */
    public void dmSegSDK(bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDmSegSDKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dmExpoReport(bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq request,
        io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDmExpoReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DM.
   * <pre>
   *弹幕
   * </pre>
   */
  public static final class DMBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DMBlockingStub> {
    private DMBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DMBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DMBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取分段弹幕
     * </pre>
     */
    public bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply dmSegMobile(bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDmSegMobileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 客户端弹幕元数据 字幕、分段、防挡蒙版等
     * </pre>
     */
    public bilibili.community.service.dm.v1.DmRpcProto.DmViewReply dmView(bilibili.community.service.dm.v1.DmRpcProto.DmViewReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDmViewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改弹幕配置
     * </pre>
     */
    public bilibili.community.service.dm.v1.DmRpcProto.Response dmPlayerConfig(bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDmPlayerConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ott弹幕列表
     * </pre>
     */
    public bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply dmSegOtt(bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDmSegOttMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SDK弹幕列表
     * </pre>
     */
    public bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply dmSegSDK(bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDmSegSDKMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes dmExpoReport(bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDmExpoReportMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DM.
   * <pre>
   *弹幕
   * </pre>
   */
  public static final class DMFutureStub
      extends io.grpc.stub.AbstractFutureStub<DMFutureStub> {
    private DMFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DMFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DMFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取分段弹幕
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply> dmSegMobile(
        bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDmSegMobileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 客户端弹幕元数据 字幕、分段、防挡蒙版等
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.community.service.dm.v1.DmRpcProto.DmViewReply> dmView(
        bilibili.community.service.dm.v1.DmRpcProto.DmViewReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDmViewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 修改弹幕配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.community.service.dm.v1.DmRpcProto.Response> dmPlayerConfig(
        bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDmPlayerConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ott弹幕列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply> dmSegOtt(
        bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDmSegOttMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SDK弹幕列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply> dmSegSDK(
        bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDmSegSDKMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes> dmExpoReport(
        bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDmExpoReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DM_SEG_MOBILE = 0;
  private static final int METHODID_DM_VIEW = 1;
  private static final int METHODID_DM_PLAYER_CONFIG = 2;
  private static final int METHODID_DM_SEG_OTT = 3;
  private static final int METHODID_DM_SEG_SDK = 4;
  private static final int METHODID_DM_EXPO_REPORT = 5;

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
        case METHODID_DM_SEG_MOBILE:
          serviceImpl.dmSegMobile((bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq) request,
              (io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply>) responseObserver);
          break;
        case METHODID_DM_VIEW:
          serviceImpl.dmView((bilibili.community.service.dm.v1.DmRpcProto.DmViewReq) request,
              (io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmViewReply>) responseObserver);
          break;
        case METHODID_DM_PLAYER_CONFIG:
          serviceImpl.dmPlayerConfig((bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq) request,
              (io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.Response>) responseObserver);
          break;
        case METHODID_DM_SEG_OTT:
          serviceImpl.dmSegOtt((bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq) request,
              (io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply>) responseObserver);
          break;
        case METHODID_DM_SEG_SDK:
          serviceImpl.dmSegSDK((bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq) request,
              (io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply>) responseObserver);
          break;
        case METHODID_DM_EXPO_REPORT:
          serviceImpl.dmExpoReport((bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq) request,
              (io.grpc.stub.StreamObserver<bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes>) responseObserver);
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
          getDmSegMobileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReq,
              bilibili.community.service.dm.v1.DmRpcProto.DmSegMobileReply>(
                service, METHODID_DM_SEG_MOBILE)))
        .addMethod(
          getDmViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.community.service.dm.v1.DmRpcProto.DmViewReq,
              bilibili.community.service.dm.v1.DmRpcProto.DmViewReply>(
                service, METHODID_DM_VIEW)))
        .addMethod(
          getDmPlayerConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.community.service.dm.v1.DmRpcProto.DmPlayerConfigReq,
              bilibili.community.service.dm.v1.DmRpcProto.Response>(
                service, METHODID_DM_PLAYER_CONFIG)))
        .addMethod(
          getDmSegOttMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReq,
              bilibili.community.service.dm.v1.DmRpcProto.DmSegOttReply>(
                service, METHODID_DM_SEG_OTT)))
        .addMethod(
          getDmSegSDKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReq,
              bilibili.community.service.dm.v1.DmRpcProto.DmSegSDKReply>(
                service, METHODID_DM_SEG_SDK)))
        .addMethod(
          getDmExpoReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportReq,
              bilibili.community.service.dm.v1.DmRpcProto.DmExpoReportRes>(
                service, METHODID_DM_EXPO_REPORT)))
        .build();
  }

  private static abstract class DMBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DMBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.community.service.dm.v1.DmRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DM");
    }
  }

  private static final class DMFileDescriptorSupplier
      extends DMBaseDescriptorSupplier {
    DMFileDescriptorSupplier() {}
  }

  private static final class DMMethodDescriptorSupplier
      extends DMBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DMMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DMGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DMFileDescriptorSupplier())
              .addMethod(getDmSegMobileMethod())
              .addMethod(getDmViewMethod())
              .addMethod(getDmPlayerConfigMethod())
              .addMethod(getDmSegOttMethod())
              .addMethod(getDmSegSDKMethod())
              .addMethod(getDmExpoReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
