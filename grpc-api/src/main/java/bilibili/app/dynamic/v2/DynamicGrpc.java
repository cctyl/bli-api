package bilibili.app.dynamic.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * v2动态, rpc 按字母顺序排列
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/dynamic/v2/dynamic.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DynamicGrpc {

  private DynamicGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.dynamic.v2.Dynamic";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.AlumniDynamicsReq,
      bilibili.app.dynamic.v2.AlumniDynamicsReply> getAlumniDynamicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlumniDynamics",
      requestType = bilibili.app.dynamic.v2.AlumniDynamicsReq.class,
      responseType = bilibili.app.dynamic.v2.AlumniDynamicsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.AlumniDynamicsReq,
      bilibili.app.dynamic.v2.AlumniDynamicsReply> getAlumniDynamicsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.AlumniDynamicsReq, bilibili.app.dynamic.v2.AlumniDynamicsReply> getAlumniDynamicsMethod;
    if ((getAlumniDynamicsMethod = DynamicGrpc.getAlumniDynamicsMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getAlumniDynamicsMethod = DynamicGrpc.getAlumniDynamicsMethod) == null) {
          DynamicGrpc.getAlumniDynamicsMethod = getAlumniDynamicsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.AlumniDynamicsReq, bilibili.app.dynamic.v2.AlumniDynamicsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlumniDynamics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.AlumniDynamicsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.AlumniDynamicsReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("AlumniDynamics"))
              .build();
        }
      }
    }
    return getAlumniDynamicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusBillBoardReq,
      bilibili.app.dynamic.v2.CampusBillBoardReply> getCampusBillBoardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusBillBoard",
      requestType = bilibili.app.dynamic.v2.CampusBillBoardReq.class,
      responseType = bilibili.app.dynamic.v2.CampusBillBoardReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusBillBoardReq,
      bilibili.app.dynamic.v2.CampusBillBoardReply> getCampusBillBoardMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusBillBoardReq, bilibili.app.dynamic.v2.CampusBillBoardReply> getCampusBillBoardMethod;
    if ((getCampusBillBoardMethod = DynamicGrpc.getCampusBillBoardMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusBillBoardMethod = DynamicGrpc.getCampusBillBoardMethod) == null) {
          DynamicGrpc.getCampusBillBoardMethod = getCampusBillBoardMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusBillBoardReq, bilibili.app.dynamic.v2.CampusBillBoardReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusBillBoard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusBillBoardReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusBillBoardReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusBillBoard"))
              .build();
        }
      }
    }
    return getCampusBillBoardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusEntryTabReq,
      bilibili.app.dynamic.v2.CampusEntryTabResp> getCampusEntryTabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusEntryTab",
      requestType = bilibili.app.dynamic.v2.CampusEntryTabReq.class,
      responseType = bilibili.app.dynamic.v2.CampusEntryTabResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusEntryTabReq,
      bilibili.app.dynamic.v2.CampusEntryTabResp> getCampusEntryTabMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusEntryTabReq, bilibili.app.dynamic.v2.CampusEntryTabResp> getCampusEntryTabMethod;
    if ((getCampusEntryTabMethod = DynamicGrpc.getCampusEntryTabMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusEntryTabMethod = DynamicGrpc.getCampusEntryTabMethod) == null) {
          DynamicGrpc.getCampusEntryTabMethod = getCampusEntryTabMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusEntryTabReq, bilibili.app.dynamic.v2.CampusEntryTabResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusEntryTab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusEntryTabReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusEntryTabResp.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusEntryTab"))
              .build();
        }
      }
    }
    return getCampusEntryTabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusFeedbackReq,
      bilibili.app.dynamic.v2.CampusFeedbackReply> getCampusFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusFeedback",
      requestType = bilibili.app.dynamic.v2.CampusFeedbackReq.class,
      responseType = bilibili.app.dynamic.v2.CampusFeedbackReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusFeedbackReq,
      bilibili.app.dynamic.v2.CampusFeedbackReply> getCampusFeedbackMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusFeedbackReq, bilibili.app.dynamic.v2.CampusFeedbackReply> getCampusFeedbackMethod;
    if ((getCampusFeedbackMethod = DynamicGrpc.getCampusFeedbackMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusFeedbackMethod = DynamicGrpc.getCampusFeedbackMethod) == null) {
          DynamicGrpc.getCampusFeedbackMethod = getCampusFeedbackMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusFeedbackReq, bilibili.app.dynamic.v2.CampusFeedbackReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusFeedbackReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusFeedbackReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusFeedback"))
              .build();
        }
      }
    }
    return getCampusFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusHomePagesReq,
      bilibili.app.dynamic.v2.CampusHomePagesReply> getCampusHomePagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusHomePages",
      requestType = bilibili.app.dynamic.v2.CampusHomePagesReq.class,
      responseType = bilibili.app.dynamic.v2.CampusHomePagesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusHomePagesReq,
      bilibili.app.dynamic.v2.CampusHomePagesReply> getCampusHomePagesMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusHomePagesReq, bilibili.app.dynamic.v2.CampusHomePagesReply> getCampusHomePagesMethod;
    if ((getCampusHomePagesMethod = DynamicGrpc.getCampusHomePagesMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusHomePagesMethod = DynamicGrpc.getCampusHomePagesMethod) == null) {
          DynamicGrpc.getCampusHomePagesMethod = getCampusHomePagesMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusHomePagesReq, bilibili.app.dynamic.v2.CampusHomePagesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusHomePages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusHomePagesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusHomePagesReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusHomePages"))
              .build();
        }
      }
    }
    return getCampusHomePagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMateLikeListReq,
      bilibili.app.dynamic.v2.CampusMateLikeListReply> getCampusMateLikeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusMateLikeList",
      requestType = bilibili.app.dynamic.v2.CampusMateLikeListReq.class,
      responseType = bilibili.app.dynamic.v2.CampusMateLikeListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMateLikeListReq,
      bilibili.app.dynamic.v2.CampusMateLikeListReply> getCampusMateLikeListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMateLikeListReq, bilibili.app.dynamic.v2.CampusMateLikeListReply> getCampusMateLikeListMethod;
    if ((getCampusMateLikeListMethod = DynamicGrpc.getCampusMateLikeListMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusMateLikeListMethod = DynamicGrpc.getCampusMateLikeListMethod) == null) {
          DynamicGrpc.getCampusMateLikeListMethod = getCampusMateLikeListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusMateLikeListReq, bilibili.app.dynamic.v2.CampusMateLikeListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusMateLikeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusMateLikeListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusMateLikeListReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusMateLikeList"))
              .build();
        }
      }
    }
    return getCampusMateLikeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngDetailReq,
      bilibili.app.dynamic.v2.CampusMngDetailReply> getCampusMngDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusMngDetail",
      requestType = bilibili.app.dynamic.v2.CampusMngDetailReq.class,
      responseType = bilibili.app.dynamic.v2.CampusMngDetailReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngDetailReq,
      bilibili.app.dynamic.v2.CampusMngDetailReply> getCampusMngDetailMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngDetailReq, bilibili.app.dynamic.v2.CampusMngDetailReply> getCampusMngDetailMethod;
    if ((getCampusMngDetailMethod = DynamicGrpc.getCampusMngDetailMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusMngDetailMethod = DynamicGrpc.getCampusMngDetailMethod) == null) {
          DynamicGrpc.getCampusMngDetailMethod = getCampusMngDetailMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusMngDetailReq, bilibili.app.dynamic.v2.CampusMngDetailReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusMngDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusMngDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusMngDetailReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusMngDetail"))
              .build();
        }
      }
    }
    return getCampusMngDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngQuizOperateReq,
      bilibili.app.dynamic.v2.CampusMngQuizOperateReply> getCampusMngQuizOperateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusMngQuizOperate",
      requestType = bilibili.app.dynamic.v2.CampusMngQuizOperateReq.class,
      responseType = bilibili.app.dynamic.v2.CampusMngQuizOperateReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngQuizOperateReq,
      bilibili.app.dynamic.v2.CampusMngQuizOperateReply> getCampusMngQuizOperateMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngQuizOperateReq, bilibili.app.dynamic.v2.CampusMngQuizOperateReply> getCampusMngQuizOperateMethod;
    if ((getCampusMngQuizOperateMethod = DynamicGrpc.getCampusMngQuizOperateMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusMngQuizOperateMethod = DynamicGrpc.getCampusMngQuizOperateMethod) == null) {
          DynamicGrpc.getCampusMngQuizOperateMethod = getCampusMngQuizOperateMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusMngQuizOperateReq, bilibili.app.dynamic.v2.CampusMngQuizOperateReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusMngQuizOperate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusMngQuizOperateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusMngQuizOperateReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusMngQuizOperate"))
              .build();
        }
      }
    }
    return getCampusMngQuizOperateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngSubmitReq,
      bilibili.app.dynamic.v2.CampusMngSubmitReply> getCampusMngSubmitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusMngSubmit",
      requestType = bilibili.app.dynamic.v2.CampusMngSubmitReq.class,
      responseType = bilibili.app.dynamic.v2.CampusMngSubmitReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngSubmitReq,
      bilibili.app.dynamic.v2.CampusMngSubmitReply> getCampusMngSubmitMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusMngSubmitReq, bilibili.app.dynamic.v2.CampusMngSubmitReply> getCampusMngSubmitMethod;
    if ((getCampusMngSubmitMethod = DynamicGrpc.getCampusMngSubmitMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusMngSubmitMethod = DynamicGrpc.getCampusMngSubmitMethod) == null) {
          DynamicGrpc.getCampusMngSubmitMethod = getCampusMngSubmitMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusMngSubmitReq, bilibili.app.dynamic.v2.CampusMngSubmitReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusMngSubmit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusMngSubmitReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusMngSubmitReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusMngSubmit"))
              .build();
        }
      }
    }
    return getCampusMngSubmitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRcmdReq,
      bilibili.app.dynamic.v2.CampusRcmdReply> getCampusRcmdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusRcmd",
      requestType = bilibili.app.dynamic.v2.CampusRcmdReq.class,
      responseType = bilibili.app.dynamic.v2.CampusRcmdReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRcmdReq,
      bilibili.app.dynamic.v2.CampusRcmdReply> getCampusRcmdMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRcmdReq, bilibili.app.dynamic.v2.CampusRcmdReply> getCampusRcmdMethod;
    if ((getCampusRcmdMethod = DynamicGrpc.getCampusRcmdMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusRcmdMethod = DynamicGrpc.getCampusRcmdMethod) == null) {
          DynamicGrpc.getCampusRcmdMethod = getCampusRcmdMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusRcmdReq, bilibili.app.dynamic.v2.CampusRcmdReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusRcmd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRcmdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRcmdReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusRcmd"))
              .build();
        }
      }
    }
    return getCampusRcmdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRcmdFeedReq,
      bilibili.app.dynamic.v2.CampusRcmdFeedReply> getCampusRcmdFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusRcmdFeed",
      requestType = bilibili.app.dynamic.v2.CampusRcmdFeedReq.class,
      responseType = bilibili.app.dynamic.v2.CampusRcmdFeedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRcmdFeedReq,
      bilibili.app.dynamic.v2.CampusRcmdFeedReply> getCampusRcmdFeedMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRcmdFeedReq, bilibili.app.dynamic.v2.CampusRcmdFeedReply> getCampusRcmdFeedMethod;
    if ((getCampusRcmdFeedMethod = DynamicGrpc.getCampusRcmdFeedMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusRcmdFeedMethod = DynamicGrpc.getCampusRcmdFeedMethod) == null) {
          DynamicGrpc.getCampusRcmdFeedMethod = getCampusRcmdFeedMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusRcmdFeedReq, bilibili.app.dynamic.v2.CampusRcmdFeedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusRcmdFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRcmdFeedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRcmdFeedReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusRcmdFeed"))
              .build();
        }
      }
    }
    return getCampusRcmdFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRecommendReq,
      bilibili.app.dynamic.v2.CampusRecommendReply> getCampusRecommendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusRecommend",
      requestType = bilibili.app.dynamic.v2.CampusRecommendReq.class,
      responseType = bilibili.app.dynamic.v2.CampusRecommendReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRecommendReq,
      bilibili.app.dynamic.v2.CampusRecommendReply> getCampusRecommendMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRecommendReq, bilibili.app.dynamic.v2.CampusRecommendReply> getCampusRecommendMethod;
    if ((getCampusRecommendMethod = DynamicGrpc.getCampusRecommendMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusRecommendMethod = DynamicGrpc.getCampusRecommendMethod) == null) {
          DynamicGrpc.getCampusRecommendMethod = getCampusRecommendMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusRecommendReq, bilibili.app.dynamic.v2.CampusRecommendReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusRecommend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRecommendReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRecommendReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusRecommend"))
              .build();
        }
      }
    }
    return getCampusRecommendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRedDotReq,
      bilibili.app.dynamic.v2.CampusRedDotReply> getCampusRedDotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusRedDot",
      requestType = bilibili.app.dynamic.v2.CampusRedDotReq.class,
      responseType = bilibili.app.dynamic.v2.CampusRedDotReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRedDotReq,
      bilibili.app.dynamic.v2.CampusRedDotReply> getCampusRedDotMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusRedDotReq, bilibili.app.dynamic.v2.CampusRedDotReply> getCampusRedDotMethod;
    if ((getCampusRedDotMethod = DynamicGrpc.getCampusRedDotMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusRedDotMethod = DynamicGrpc.getCampusRedDotMethod) == null) {
          DynamicGrpc.getCampusRedDotMethod = getCampusRedDotMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusRedDotReq, bilibili.app.dynamic.v2.CampusRedDotReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusRedDot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRedDotReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusRedDotReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusRedDot"))
              .build();
        }
      }
    }
    return getCampusRedDotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusSquareReq,
      bilibili.app.dynamic.v2.CampusSquareReply> getCampusSquareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusSquare",
      requestType = bilibili.app.dynamic.v2.CampusSquareReq.class,
      responseType = bilibili.app.dynamic.v2.CampusSquareReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusSquareReq,
      bilibili.app.dynamic.v2.CampusSquareReply> getCampusSquareMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusSquareReq, bilibili.app.dynamic.v2.CampusSquareReply> getCampusSquareMethod;
    if ((getCampusSquareMethod = DynamicGrpc.getCampusSquareMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusSquareMethod = DynamicGrpc.getCampusSquareMethod) == null) {
          DynamicGrpc.getCampusSquareMethod = getCampusSquareMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusSquareReq, bilibili.app.dynamic.v2.CampusSquareReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusSquare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusSquareReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusSquareReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusSquare"))
              .build();
        }
      }
    }
    return getCampusSquareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq,
      bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply> getCampusTopicRcmdFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CampusTopicRcmdFeed",
      requestType = bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq.class,
      responseType = bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq,
      bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply> getCampusTopicRcmdFeedMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq, bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply> getCampusTopicRcmdFeedMethod;
    if ((getCampusTopicRcmdFeedMethod = DynamicGrpc.getCampusTopicRcmdFeedMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getCampusTopicRcmdFeedMethod = DynamicGrpc.getCampusTopicRcmdFeedMethod) == null) {
          DynamicGrpc.getCampusTopicRcmdFeedMethod = getCampusTopicRcmdFeedMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq, bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CampusTopicRcmdFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("CampusTopicRcmdFeed"))
              .build();
        }
      }
    }
    return getCampusTopicRcmdFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAdditionCommonFollowReq,
      bilibili.app.dynamic.v2.DynAdditionCommonFollowReply> getDynAdditionCommonFollowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynAdditionCommonFollow",
      requestType = bilibili.app.dynamic.v2.DynAdditionCommonFollowReq.class,
      responseType = bilibili.app.dynamic.v2.DynAdditionCommonFollowReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAdditionCommonFollowReq,
      bilibili.app.dynamic.v2.DynAdditionCommonFollowReply> getDynAdditionCommonFollowMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAdditionCommonFollowReq, bilibili.app.dynamic.v2.DynAdditionCommonFollowReply> getDynAdditionCommonFollowMethod;
    if ((getDynAdditionCommonFollowMethod = DynamicGrpc.getDynAdditionCommonFollowMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynAdditionCommonFollowMethod = DynamicGrpc.getDynAdditionCommonFollowMethod) == null) {
          DynamicGrpc.getDynAdditionCommonFollowMethod = getDynAdditionCommonFollowMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynAdditionCommonFollowReq, bilibili.app.dynamic.v2.DynAdditionCommonFollowReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynAdditionCommonFollow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynAdditionCommonFollowReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynAdditionCommonFollowReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynAdditionCommonFollow"))
              .build();
        }
      }
    }
    return getDynAdditionCommonFollowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllReq,
      bilibili.app.dynamic.v2.DynAllReply> getDynAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynAll",
      requestType = bilibili.app.dynamic.v2.DynAllReq.class,
      responseType = bilibili.app.dynamic.v2.DynAllReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllReq,
      bilibili.app.dynamic.v2.DynAllReply> getDynAllMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllReq, bilibili.app.dynamic.v2.DynAllReply> getDynAllMethod;
    if ((getDynAllMethod = DynamicGrpc.getDynAllMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynAllMethod = DynamicGrpc.getDynAllMethod) == null) {
          DynamicGrpc.getDynAllMethod = getDynAllMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynAllReq, bilibili.app.dynamic.v2.DynAllReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynAllReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynAll"))
              .build();
        }
      }
    }
    return getDynAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllPersonalReq,
      bilibili.app.dynamic.v2.DynAllPersonalReply> getDynAllPersonalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynAllPersonal",
      requestType = bilibili.app.dynamic.v2.DynAllPersonalReq.class,
      responseType = bilibili.app.dynamic.v2.DynAllPersonalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllPersonalReq,
      bilibili.app.dynamic.v2.DynAllPersonalReply> getDynAllPersonalMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllPersonalReq, bilibili.app.dynamic.v2.DynAllPersonalReply> getDynAllPersonalMethod;
    if ((getDynAllPersonalMethod = DynamicGrpc.getDynAllPersonalMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynAllPersonalMethod = DynamicGrpc.getDynAllPersonalMethod) == null) {
          DynamicGrpc.getDynAllPersonalMethod = getDynAllPersonalMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynAllPersonalReq, bilibili.app.dynamic.v2.DynAllPersonalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynAllPersonal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynAllPersonalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynAllPersonalReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynAllPersonal"))
              .build();
        }
      }
    }
    return getDynAllPersonalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllUpdOffsetReq,
      bilibili.app.dynamic.v2.NoReply> getDynAllUpdOffsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynAllUpdOffset",
      requestType = bilibili.app.dynamic.v2.DynAllUpdOffsetReq.class,
      responseType = bilibili.app.dynamic.v2.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllUpdOffsetReq,
      bilibili.app.dynamic.v2.NoReply> getDynAllUpdOffsetMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynAllUpdOffsetReq, bilibili.app.dynamic.v2.NoReply> getDynAllUpdOffsetMethod;
    if ((getDynAllUpdOffsetMethod = DynamicGrpc.getDynAllUpdOffsetMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynAllUpdOffsetMethod = DynamicGrpc.getDynAllUpdOffsetMethod) == null) {
          DynamicGrpc.getDynAllUpdOffsetMethod = getDynAllUpdOffsetMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynAllUpdOffsetReq, bilibili.app.dynamic.v2.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynAllUpdOffset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynAllUpdOffsetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynAllUpdOffset"))
              .build();
        }
      }
    }
    return getDynAllUpdOffsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynDetailReq,
      bilibili.app.dynamic.v2.DynDetailReply> getDynDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynDetail",
      requestType = bilibili.app.dynamic.v2.DynDetailReq.class,
      responseType = bilibili.app.dynamic.v2.DynDetailReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynDetailReq,
      bilibili.app.dynamic.v2.DynDetailReply> getDynDetailMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynDetailReq, bilibili.app.dynamic.v2.DynDetailReply> getDynDetailMethod;
    if ((getDynDetailMethod = DynamicGrpc.getDynDetailMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynDetailMethod = DynamicGrpc.getDynDetailMethod) == null) {
          DynamicGrpc.getDynDetailMethod = getDynDetailMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynDetailReq, bilibili.app.dynamic.v2.DynDetailReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynDetailReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynDetail"))
              .build();
        }
      }
    }
    return getDynDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynDetailsReq,
      bilibili.app.dynamic.v2.DynDetailsReply> getDynDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynDetails",
      requestType = bilibili.app.dynamic.v2.DynDetailsReq.class,
      responseType = bilibili.app.dynamic.v2.DynDetailsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynDetailsReq,
      bilibili.app.dynamic.v2.DynDetailsReply> getDynDetailsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynDetailsReq, bilibili.app.dynamic.v2.DynDetailsReply> getDynDetailsMethod;
    if ((getDynDetailsMethod = DynamicGrpc.getDynDetailsMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynDetailsMethod = DynamicGrpc.getDynDetailsMethod) == null) {
          DynamicGrpc.getDynDetailsMethod = getDynDetailsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynDetailsReq, bilibili.app.dynamic.v2.DynDetailsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynDetailsReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynDetails"))
              .build();
        }
      }
    }
    return getDynDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynFakeCardReq,
      bilibili.app.dynamic.v2.DynFakeCardReply> getDynFakeCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynFakeCard",
      requestType = bilibili.app.dynamic.v2.DynFakeCardReq.class,
      responseType = bilibili.app.dynamic.v2.DynFakeCardReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynFakeCardReq,
      bilibili.app.dynamic.v2.DynFakeCardReply> getDynFakeCardMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynFakeCardReq, bilibili.app.dynamic.v2.DynFakeCardReply> getDynFakeCardMethod;
    if ((getDynFakeCardMethod = DynamicGrpc.getDynFakeCardMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynFakeCardMethod = DynamicGrpc.getDynFakeCardMethod) == null) {
          DynamicGrpc.getDynFakeCardMethod = getDynFakeCardMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynFakeCardReq, bilibili.app.dynamic.v2.DynFakeCardReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynFakeCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynFakeCardReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynFakeCardReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynFakeCard"))
              .build();
        }
      }
    }
    return getDynFakeCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynFriendReq,
      bilibili.app.dynamic.v2.DynFriendReply> getDynFriendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynFriend",
      requestType = bilibili.app.dynamic.v2.DynFriendReq.class,
      responseType = bilibili.app.dynamic.v2.DynFriendReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynFriendReq,
      bilibili.app.dynamic.v2.DynFriendReply> getDynFriendMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynFriendReq, bilibili.app.dynamic.v2.DynFriendReply> getDynFriendMethod;
    if ((getDynFriendMethod = DynamicGrpc.getDynFriendMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynFriendMethod = DynamicGrpc.getDynFriendMethod) == null) {
          DynamicGrpc.getDynFriendMethod = getDynFriendMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynFriendReq, bilibili.app.dynamic.v2.DynFriendReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynFriend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynFriendReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynFriendReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynFriend"))
              .build();
        }
      }
    }
    return getDynFriendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynLightReq,
      bilibili.app.dynamic.v2.DynLightReply> getDynLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynLight",
      requestType = bilibili.app.dynamic.v2.DynLightReq.class,
      responseType = bilibili.app.dynamic.v2.DynLightReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynLightReq,
      bilibili.app.dynamic.v2.DynLightReply> getDynLightMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynLightReq, bilibili.app.dynamic.v2.DynLightReply> getDynLightMethod;
    if ((getDynLightMethod = DynamicGrpc.getDynLightMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynLightMethod = DynamicGrpc.getDynLightMethod) == null) {
          DynamicGrpc.getDynLightMethod = getDynLightMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynLightReq, bilibili.app.dynamic.v2.DynLightReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynLightReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynLightReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynLight"))
              .build();
        }
      }
    }
    return getDynLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynMixUpListViewMoreReq,
      bilibili.app.dynamic.v2.DynMixUpListViewMoreReply> getDynMixUpListViewMoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynMixUpListViewMore",
      requestType = bilibili.app.dynamic.v2.DynMixUpListViewMoreReq.class,
      responseType = bilibili.app.dynamic.v2.DynMixUpListViewMoreReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynMixUpListViewMoreReq,
      bilibili.app.dynamic.v2.DynMixUpListViewMoreReply> getDynMixUpListViewMoreMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynMixUpListViewMoreReq, bilibili.app.dynamic.v2.DynMixUpListViewMoreReply> getDynMixUpListViewMoreMethod;
    if ((getDynMixUpListViewMoreMethod = DynamicGrpc.getDynMixUpListViewMoreMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynMixUpListViewMoreMethod = DynamicGrpc.getDynMixUpListViewMoreMethod) == null) {
          DynamicGrpc.getDynMixUpListViewMoreMethod = getDynMixUpListViewMoreMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynMixUpListViewMoreReq, bilibili.app.dynamic.v2.DynMixUpListViewMoreReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynMixUpListViewMore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynMixUpListViewMoreReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynMixUpListViewMoreReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynMixUpListViewMore"))
              .build();
        }
      }
    }
    return getDynMixUpListViewMoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynRcmdUpExchangeReq,
      bilibili.app.dynamic.v2.DynRcmdUpExchangeReply> getDynRcmdUpExchangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynRcmdUpExchange",
      requestType = bilibili.app.dynamic.v2.DynRcmdUpExchangeReq.class,
      responseType = bilibili.app.dynamic.v2.DynRcmdUpExchangeReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynRcmdUpExchangeReq,
      bilibili.app.dynamic.v2.DynRcmdUpExchangeReply> getDynRcmdUpExchangeMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynRcmdUpExchangeReq, bilibili.app.dynamic.v2.DynRcmdUpExchangeReply> getDynRcmdUpExchangeMethod;
    if ((getDynRcmdUpExchangeMethod = DynamicGrpc.getDynRcmdUpExchangeMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynRcmdUpExchangeMethod = DynamicGrpc.getDynRcmdUpExchangeMethod) == null) {
          DynamicGrpc.getDynRcmdUpExchangeMethod = getDynRcmdUpExchangeMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynRcmdUpExchangeReq, bilibili.app.dynamic.v2.DynRcmdUpExchangeReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynRcmdUpExchange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynRcmdUpExchangeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynRcmdUpExchangeReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynRcmdUpExchange"))
              .build();
        }
      }
    }
    return getDynRcmdUpExchangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSearchReq,
      bilibili.app.dynamic.v2.DynSearchReply> getDynSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynSearch",
      requestType = bilibili.app.dynamic.v2.DynSearchReq.class,
      responseType = bilibili.app.dynamic.v2.DynSearchReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSearchReq,
      bilibili.app.dynamic.v2.DynSearchReply> getDynSearchMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSearchReq, bilibili.app.dynamic.v2.DynSearchReply> getDynSearchMethod;
    if ((getDynSearchMethod = DynamicGrpc.getDynSearchMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynSearchMethod = DynamicGrpc.getDynSearchMethod) == null) {
          DynamicGrpc.getDynSearchMethod = getDynSearchMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynSearchReq, bilibili.app.dynamic.v2.DynSearchReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynSearchReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynSearch"))
              .build();
        }
      }
    }
    return getDynSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynServerDetailsReq,
      bilibili.app.dynamic.v2.DynServerDetailsReply> getDynServerDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynServerDetails",
      requestType = bilibili.app.dynamic.v2.DynServerDetailsReq.class,
      responseType = bilibili.app.dynamic.v2.DynServerDetailsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynServerDetailsReq,
      bilibili.app.dynamic.v2.DynServerDetailsReply> getDynServerDetailsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynServerDetailsReq, bilibili.app.dynamic.v2.DynServerDetailsReply> getDynServerDetailsMethod;
    if ((getDynServerDetailsMethod = DynamicGrpc.getDynServerDetailsMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynServerDetailsMethod = DynamicGrpc.getDynServerDetailsMethod) == null) {
          DynamicGrpc.getDynServerDetailsMethod = getDynServerDetailsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynServerDetailsReq, bilibili.app.dynamic.v2.DynServerDetailsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynServerDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynServerDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynServerDetailsReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynServerDetails"))
              .build();
        }
      }
    }
    return getDynServerDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSpaceReq,
      bilibili.app.dynamic.v2.DynSpaceRsp> getDynSpaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynSpace",
      requestType = bilibili.app.dynamic.v2.DynSpaceReq.class,
      responseType = bilibili.app.dynamic.v2.DynSpaceRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSpaceReq,
      bilibili.app.dynamic.v2.DynSpaceRsp> getDynSpaceMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSpaceReq, bilibili.app.dynamic.v2.DynSpaceRsp> getDynSpaceMethod;
    if ((getDynSpaceMethod = DynamicGrpc.getDynSpaceMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynSpaceMethod = DynamicGrpc.getDynSpaceMethod) == null) {
          DynamicGrpc.getDynSpaceMethod = getDynSpaceMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynSpaceReq, bilibili.app.dynamic.v2.DynSpaceRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynSpace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynSpaceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynSpaceRsp.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynSpace"))
              .build();
        }
      }
    }
    return getDynSpaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq,
      bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply> getDynSpaceSearchDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynSpaceSearchDetails",
      requestType = bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq.class,
      responseType = bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq,
      bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply> getDynSpaceSearchDetailsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq, bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply> getDynSpaceSearchDetailsMethod;
    if ((getDynSpaceSearchDetailsMethod = DynamicGrpc.getDynSpaceSearchDetailsMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynSpaceSearchDetailsMethod = DynamicGrpc.getDynSpaceSearchDetailsMethod) == null) {
          DynamicGrpc.getDynSpaceSearchDetailsMethod = getDynSpaceSearchDetailsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq, bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynSpaceSearchDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynSpaceSearchDetails"))
              .build();
        }
      }
    }
    return getDynSpaceSearchDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynTabReq,
      bilibili.app.dynamic.v2.DynTabReply> getDynTabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynTab",
      requestType = bilibili.app.dynamic.v2.DynTabReq.class,
      responseType = bilibili.app.dynamic.v2.DynTabReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynTabReq,
      bilibili.app.dynamic.v2.DynTabReply> getDynTabMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynTabReq, bilibili.app.dynamic.v2.DynTabReply> getDynTabMethod;
    if ((getDynTabMethod = DynamicGrpc.getDynTabMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynTabMethod = DynamicGrpc.getDynTabMethod) == null) {
          DynamicGrpc.getDynTabMethod = getDynTabMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynTabReq, bilibili.app.dynamic.v2.DynTabReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynTab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynTabReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynTabReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynTab"))
              .build();
        }
      }
    }
    return getDynTabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynThumbReq,
      bilibili.app.dynamic.v2.NoReply> getDynThumbMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynThumb",
      requestType = bilibili.app.dynamic.v2.DynThumbReq.class,
      responseType = bilibili.app.dynamic.v2.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynThumbReq,
      bilibili.app.dynamic.v2.NoReply> getDynThumbMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynThumbReq, bilibili.app.dynamic.v2.NoReply> getDynThumbMethod;
    if ((getDynThumbMethod = DynamicGrpc.getDynThumbMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynThumbMethod = DynamicGrpc.getDynThumbMethod) == null) {
          DynamicGrpc.getDynThumbMethod = getDynThumbMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynThumbReq, bilibili.app.dynamic.v2.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynThumb"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynThumbReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynThumb"))
              .build();
        }
      }
    }
    return getDynThumbMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynRcmdReq,
      bilibili.app.dynamic.v2.DynRcmdReply> getDynUnLoginRcmdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynUnLoginRcmd",
      requestType = bilibili.app.dynamic.v2.DynRcmdReq.class,
      responseType = bilibili.app.dynamic.v2.DynRcmdReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynRcmdReq,
      bilibili.app.dynamic.v2.DynRcmdReply> getDynUnLoginRcmdMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynRcmdReq, bilibili.app.dynamic.v2.DynRcmdReply> getDynUnLoginRcmdMethod;
    if ((getDynUnLoginRcmdMethod = DynamicGrpc.getDynUnLoginRcmdMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynUnLoginRcmdMethod = DynamicGrpc.getDynUnLoginRcmdMethod) == null) {
          DynamicGrpc.getDynUnLoginRcmdMethod = getDynUnLoginRcmdMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynRcmdReq, bilibili.app.dynamic.v2.DynRcmdReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynUnLoginRcmd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynRcmdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynRcmdReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynUnLoginRcmd"))
              .build();
        }
      }
    }
    return getDynUnLoginRcmdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoReq,
      bilibili.app.dynamic.v2.DynVideoReply> getDynVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynVideo",
      requestType = bilibili.app.dynamic.v2.DynVideoReq.class,
      responseType = bilibili.app.dynamic.v2.DynVideoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoReq,
      bilibili.app.dynamic.v2.DynVideoReply> getDynVideoMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoReq, bilibili.app.dynamic.v2.DynVideoReply> getDynVideoMethod;
    if ((getDynVideoMethod = DynamicGrpc.getDynVideoMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynVideoMethod = DynamicGrpc.getDynVideoMethod) == null) {
          DynamicGrpc.getDynVideoMethod = getDynVideoMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynVideoReq, bilibili.app.dynamic.v2.DynVideoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynVideoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynVideoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynVideo"))
              .build();
        }
      }
    }
    return getDynVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoPersonalReq,
      bilibili.app.dynamic.v2.DynVideoPersonalReply> getDynVideoPersonalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynVideoPersonal",
      requestType = bilibili.app.dynamic.v2.DynVideoPersonalReq.class,
      responseType = bilibili.app.dynamic.v2.DynVideoPersonalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoPersonalReq,
      bilibili.app.dynamic.v2.DynVideoPersonalReply> getDynVideoPersonalMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoPersonalReq, bilibili.app.dynamic.v2.DynVideoPersonalReply> getDynVideoPersonalMethod;
    if ((getDynVideoPersonalMethod = DynamicGrpc.getDynVideoPersonalMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynVideoPersonalMethod = DynamicGrpc.getDynVideoPersonalMethod) == null) {
          DynamicGrpc.getDynVideoPersonalMethod = getDynVideoPersonalMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynVideoPersonalReq, bilibili.app.dynamic.v2.DynVideoPersonalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynVideoPersonal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynVideoPersonalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynVideoPersonalReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynVideoPersonal"))
              .build();
        }
      }
    }
    return getDynVideoPersonalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoUpdOffsetReq,
      bilibili.app.dynamic.v2.NoReply> getDynVideoUpdOffsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynVideoUpdOffset",
      requestType = bilibili.app.dynamic.v2.DynVideoUpdOffsetReq.class,
      responseType = bilibili.app.dynamic.v2.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoUpdOffsetReq,
      bilibili.app.dynamic.v2.NoReply> getDynVideoUpdOffsetMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVideoUpdOffsetReq, bilibili.app.dynamic.v2.NoReply> getDynVideoUpdOffsetMethod;
    if ((getDynVideoUpdOffsetMethod = DynamicGrpc.getDynVideoUpdOffsetMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynVideoUpdOffsetMethod = DynamicGrpc.getDynVideoUpdOffsetMethod) == null) {
          DynamicGrpc.getDynVideoUpdOffsetMethod = getDynVideoUpdOffsetMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynVideoUpdOffsetReq, bilibili.app.dynamic.v2.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynVideoUpdOffset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynVideoUpdOffsetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynVideoUpdOffset"))
              .build();
        }
      }
    }
    return getDynVideoUpdOffsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVoteReq,
      bilibili.app.dynamic.v2.DynVoteReply> getDynVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynVote",
      requestType = bilibili.app.dynamic.v2.DynVoteReq.class,
      responseType = bilibili.app.dynamic.v2.DynVoteReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVoteReq,
      bilibili.app.dynamic.v2.DynVoteReply> getDynVoteMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.DynVoteReq, bilibili.app.dynamic.v2.DynVoteReply> getDynVoteMethod;
    if ((getDynVoteMethod = DynamicGrpc.getDynVoteMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynVoteMethod = DynamicGrpc.getDynVoteMethod) == null) {
          DynamicGrpc.getDynVoteMethod = getDynVoteMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.DynVoteReq, bilibili.app.dynamic.v2.DynVoteReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynVoteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.DynVoteReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynVote"))
              .build();
        }
      }
    }
    return getDynVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.FeedFilterReq,
      bilibili.app.dynamic.v2.FeedFilterReply> getFeedFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeedFilter",
      requestType = bilibili.app.dynamic.v2.FeedFilterReq.class,
      responseType = bilibili.app.dynamic.v2.FeedFilterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.FeedFilterReq,
      bilibili.app.dynamic.v2.FeedFilterReply> getFeedFilterMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.FeedFilterReq, bilibili.app.dynamic.v2.FeedFilterReply> getFeedFilterMethod;
    if ((getFeedFilterMethod = DynamicGrpc.getFeedFilterMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getFeedFilterMethod = DynamicGrpc.getFeedFilterMethod) == null) {
          DynamicGrpc.getFeedFilterMethod = getFeedFilterMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.FeedFilterReq, bilibili.app.dynamic.v2.FeedFilterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeedFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.FeedFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.FeedFilterReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("FeedFilter"))
              .build();
        }
      }
    }
    return getFeedFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.NoReq,
      bilibili.app.dynamic.v2.FetchTabSettingReply> getFetchTabSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchTabSetting",
      requestType = bilibili.app.dynamic.v2.NoReq.class,
      responseType = bilibili.app.dynamic.v2.FetchTabSettingReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.NoReq,
      bilibili.app.dynamic.v2.FetchTabSettingReply> getFetchTabSettingMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.NoReq, bilibili.app.dynamic.v2.FetchTabSettingReply> getFetchTabSettingMethod;
    if ((getFetchTabSettingMethod = DynamicGrpc.getFetchTabSettingMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getFetchTabSettingMethod = DynamicGrpc.getFetchTabSettingMethod) == null) {
          DynamicGrpc.getFetchTabSettingMethod = getFetchTabSettingMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.NoReq, bilibili.app.dynamic.v2.FetchTabSettingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchTabSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.FetchTabSettingReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("FetchTabSetting"))
              .build();
        }
      }
    }
    return getFetchTabSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.HomeSubscribeReq,
      bilibili.app.dynamic.v2.HomeSubscribeReply> getHomeSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HomeSubscribe",
      requestType = bilibili.app.dynamic.v2.HomeSubscribeReq.class,
      responseType = bilibili.app.dynamic.v2.HomeSubscribeReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.HomeSubscribeReq,
      bilibili.app.dynamic.v2.HomeSubscribeReply> getHomeSubscribeMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.HomeSubscribeReq, bilibili.app.dynamic.v2.HomeSubscribeReply> getHomeSubscribeMethod;
    if ((getHomeSubscribeMethod = DynamicGrpc.getHomeSubscribeMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getHomeSubscribeMethod = DynamicGrpc.getHomeSubscribeMethod) == null) {
          DynamicGrpc.getHomeSubscribeMethod = getHomeSubscribeMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.HomeSubscribeReq, bilibili.app.dynamic.v2.HomeSubscribeReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HomeSubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.HomeSubscribeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.HomeSubscribeReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("HomeSubscribe"))
              .build();
        }
      }
    }
    return getHomeSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LbsPoiReq,
      bilibili.app.dynamic.v2.LbsPoiReply> getLbsPoiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LbsPoi",
      requestType = bilibili.app.dynamic.v2.LbsPoiReq.class,
      responseType = bilibili.app.dynamic.v2.LbsPoiReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LbsPoiReq,
      bilibili.app.dynamic.v2.LbsPoiReply> getLbsPoiMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LbsPoiReq, bilibili.app.dynamic.v2.LbsPoiReply> getLbsPoiMethod;
    if ((getLbsPoiMethod = DynamicGrpc.getLbsPoiMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getLbsPoiMethod = DynamicGrpc.getLbsPoiMethod) == null) {
          DynamicGrpc.getLbsPoiMethod = getLbsPoiMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.LbsPoiReq, bilibili.app.dynamic.v2.LbsPoiReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LbsPoi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.LbsPoiReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.LbsPoiReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("LbsPoi"))
              .build();
        }
      }
    }
    return getLbsPoiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LegacyTopicFeedReq,
      bilibili.app.dynamic.v2.LegacyTopicFeedReply> getLegacyTopicFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LegacyTopicFeed",
      requestType = bilibili.app.dynamic.v2.LegacyTopicFeedReq.class,
      responseType = bilibili.app.dynamic.v2.LegacyTopicFeedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LegacyTopicFeedReq,
      bilibili.app.dynamic.v2.LegacyTopicFeedReply> getLegacyTopicFeedMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LegacyTopicFeedReq, bilibili.app.dynamic.v2.LegacyTopicFeedReply> getLegacyTopicFeedMethod;
    if ((getLegacyTopicFeedMethod = DynamicGrpc.getLegacyTopicFeedMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getLegacyTopicFeedMethod = DynamicGrpc.getLegacyTopicFeedMethod) == null) {
          DynamicGrpc.getLegacyTopicFeedMethod = getLegacyTopicFeedMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.LegacyTopicFeedReq, bilibili.app.dynamic.v2.LegacyTopicFeedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LegacyTopicFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.LegacyTopicFeedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.LegacyTopicFeedReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("LegacyTopicFeed"))
              .build();
        }
      }
    }
    return getLegacyTopicFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LikeListReq,
      bilibili.app.dynamic.v2.LikeListReply> getLikeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LikeList",
      requestType = bilibili.app.dynamic.v2.LikeListReq.class,
      responseType = bilibili.app.dynamic.v2.LikeListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LikeListReq,
      bilibili.app.dynamic.v2.LikeListReply> getLikeListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.LikeListReq, bilibili.app.dynamic.v2.LikeListReply> getLikeListMethod;
    if ((getLikeListMethod = DynamicGrpc.getLikeListMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getLikeListMethod = DynamicGrpc.getLikeListMethod) == null) {
          DynamicGrpc.getLikeListMethod = getLikeListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.LikeListReq, bilibili.app.dynamic.v2.LikeListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LikeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.LikeListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.LikeListReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("LikeList"))
              .build();
        }
      }
    }
    return getLikeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OfficialAccountsReq,
      bilibili.app.dynamic.v2.OfficialAccountsReply> getOfficialAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfficialAccounts",
      requestType = bilibili.app.dynamic.v2.OfficialAccountsReq.class,
      responseType = bilibili.app.dynamic.v2.OfficialAccountsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OfficialAccountsReq,
      bilibili.app.dynamic.v2.OfficialAccountsReply> getOfficialAccountsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OfficialAccountsReq, bilibili.app.dynamic.v2.OfficialAccountsReply> getOfficialAccountsMethod;
    if ((getOfficialAccountsMethod = DynamicGrpc.getOfficialAccountsMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getOfficialAccountsMethod = DynamicGrpc.getOfficialAccountsMethod) == null) {
          DynamicGrpc.getOfficialAccountsMethod = getOfficialAccountsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.OfficialAccountsReq, bilibili.app.dynamic.v2.OfficialAccountsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OfficialAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.OfficialAccountsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.OfficialAccountsReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("OfficialAccounts"))
              .build();
        }
      }
    }
    return getOfficialAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OfficialDynamicsReq,
      bilibili.app.dynamic.v2.OfficialDynamicsReply> getOfficialDynamicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfficialDynamics",
      requestType = bilibili.app.dynamic.v2.OfficialDynamicsReq.class,
      responseType = bilibili.app.dynamic.v2.OfficialDynamicsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OfficialDynamicsReq,
      bilibili.app.dynamic.v2.OfficialDynamicsReply> getOfficialDynamicsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.OfficialDynamicsReq, bilibili.app.dynamic.v2.OfficialDynamicsReply> getOfficialDynamicsMethod;
    if ((getOfficialDynamicsMethod = DynamicGrpc.getOfficialDynamicsMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getOfficialDynamicsMethod = DynamicGrpc.getOfficialDynamicsMethod) == null) {
          DynamicGrpc.getOfficialDynamicsMethod = getOfficialDynamicsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.OfficialDynamicsReq, bilibili.app.dynamic.v2.OfficialDynamicsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OfficialDynamics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.OfficialDynamicsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.OfficialDynamicsReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("OfficialDynamics"))
              .build();
        }
      }
    }
    return getOfficialDynamicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.ReactionListReq,
      bilibili.app.dynamic.v2.ReactionListReply> getReactionListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReactionList",
      requestType = bilibili.app.dynamic.v2.ReactionListReq.class,
      responseType = bilibili.app.dynamic.v2.ReactionListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.ReactionListReq,
      bilibili.app.dynamic.v2.ReactionListReply> getReactionListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.ReactionListReq, bilibili.app.dynamic.v2.ReactionListReply> getReactionListMethod;
    if ((getReactionListMethod = DynamicGrpc.getReactionListMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getReactionListMethod = DynamicGrpc.getReactionListMethod) == null) {
          DynamicGrpc.getReactionListMethod = getReactionListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.ReactionListReq, bilibili.app.dynamic.v2.ReactionListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReactionList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.ReactionListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.ReactionListReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("ReactionList"))
              .build();
        }
      }
    }
    return getReactionListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.RepostListReq,
      bilibili.app.dynamic.v2.RepostListRsp> getRepostListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RepostList",
      requestType = bilibili.app.dynamic.v2.RepostListReq.class,
      responseType = bilibili.app.dynamic.v2.RepostListRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.RepostListReq,
      bilibili.app.dynamic.v2.RepostListRsp> getRepostListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.RepostListReq, bilibili.app.dynamic.v2.RepostListRsp> getRepostListMethod;
    if ((getRepostListMethod = DynamicGrpc.getRepostListMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getRepostListMethod = DynamicGrpc.getRepostListMethod) == null) {
          DynamicGrpc.getRepostListMethod = getRepostListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.RepostListReq, bilibili.app.dynamic.v2.RepostListRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RepostList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.RepostListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.RepostListRsp.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("RepostList"))
              .build();
        }
      }
    }
    return getRepostListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SchoolRecommendReq,
      bilibili.app.dynamic.v2.SchoolRecommendReply> getSchoolRecommendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SchoolRecommend",
      requestType = bilibili.app.dynamic.v2.SchoolRecommendReq.class,
      responseType = bilibili.app.dynamic.v2.SchoolRecommendReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SchoolRecommendReq,
      bilibili.app.dynamic.v2.SchoolRecommendReply> getSchoolRecommendMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SchoolRecommendReq, bilibili.app.dynamic.v2.SchoolRecommendReply> getSchoolRecommendMethod;
    if ((getSchoolRecommendMethod = DynamicGrpc.getSchoolRecommendMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getSchoolRecommendMethod = DynamicGrpc.getSchoolRecommendMethod) == null) {
          DynamicGrpc.getSchoolRecommendMethod = getSchoolRecommendMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.SchoolRecommendReq, bilibili.app.dynamic.v2.SchoolRecommendReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SchoolRecommend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.SchoolRecommendReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.SchoolRecommendReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("SchoolRecommend"))
              .build();
        }
      }
    }
    return getSchoolRecommendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SchoolSearchReq,
      bilibili.app.dynamic.v2.SchoolSearchReply> getSchoolSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SchoolSearch",
      requestType = bilibili.app.dynamic.v2.SchoolSearchReq.class,
      responseType = bilibili.app.dynamic.v2.SchoolSearchReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SchoolSearchReq,
      bilibili.app.dynamic.v2.SchoolSearchReply> getSchoolSearchMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SchoolSearchReq, bilibili.app.dynamic.v2.SchoolSearchReply> getSchoolSearchMethod;
    if ((getSchoolSearchMethod = DynamicGrpc.getSchoolSearchMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getSchoolSearchMethod = DynamicGrpc.getSchoolSearchMethod) == null) {
          DynamicGrpc.getSchoolSearchMethod = getSchoolSearchMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.SchoolSearchReq, bilibili.app.dynamic.v2.SchoolSearchReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SchoolSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.SchoolSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.SchoolSearchReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("SchoolSearch"))
              .build();
        }
      }
    }
    return getSchoolSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SetDecisionReq,
      bilibili.app.dynamic.v2.NoReply> getSetDecisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDecision",
      requestType = bilibili.app.dynamic.v2.SetDecisionReq.class,
      responseType = bilibili.app.dynamic.v2.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SetDecisionReq,
      bilibili.app.dynamic.v2.NoReply> getSetDecisionMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SetDecisionReq, bilibili.app.dynamic.v2.NoReply> getSetDecisionMethod;
    if ((getSetDecisionMethod = DynamicGrpc.getSetDecisionMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getSetDecisionMethod = DynamicGrpc.getSetDecisionMethod) == null) {
          DynamicGrpc.getSetDecisionMethod = getSetDecisionMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.SetDecisionReq, bilibili.app.dynamic.v2.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDecision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.SetDecisionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("SetDecision"))
              .build();
        }
      }
    }
    return getSetDecisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SetRecentCampusReq,
      bilibili.app.dynamic.v2.NoReply> getSetRecentCampusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRecentCampus",
      requestType = bilibili.app.dynamic.v2.SetRecentCampusReq.class,
      responseType = bilibili.app.dynamic.v2.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SetRecentCampusReq,
      bilibili.app.dynamic.v2.NoReply> getSetRecentCampusMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SetRecentCampusReq, bilibili.app.dynamic.v2.NoReply> getSetRecentCampusMethod;
    if ((getSetRecentCampusMethod = DynamicGrpc.getSetRecentCampusMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getSetRecentCampusMethod = DynamicGrpc.getSetRecentCampusMethod) == null) {
          DynamicGrpc.getSetRecentCampusMethod = getSetRecentCampusMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.SetRecentCampusReq, bilibili.app.dynamic.v2.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRecentCampus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.SetRecentCampusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("SetRecentCampus"))
              .build();
        }
      }
    }
    return getSetRecentCampusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SubscribeCampusReq,
      bilibili.app.dynamic.v2.NoReply> getSubscribeCampusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCampus",
      requestType = bilibili.app.dynamic.v2.SubscribeCampusReq.class,
      responseType = bilibili.app.dynamic.v2.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SubscribeCampusReq,
      bilibili.app.dynamic.v2.NoReply> getSubscribeCampusMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.SubscribeCampusReq, bilibili.app.dynamic.v2.NoReply> getSubscribeCampusMethod;
    if ((getSubscribeCampusMethod = DynamicGrpc.getSubscribeCampusMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getSubscribeCampusMethod = DynamicGrpc.getSubscribeCampusMethod) == null) {
          DynamicGrpc.getSubscribeCampusMethod = getSubscribeCampusMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.SubscribeCampusReq, bilibili.app.dynamic.v2.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCampus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.SubscribeCampusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("SubscribeCampus"))
              .build();
        }
      }
    }
    return getSubscribeCampusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.TopicListReq,
      bilibili.app.dynamic.v2.TopicListReply> getTopicListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopicList",
      requestType = bilibili.app.dynamic.v2.TopicListReq.class,
      responseType = bilibili.app.dynamic.v2.TopicListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.TopicListReq,
      bilibili.app.dynamic.v2.TopicListReply> getTopicListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.TopicListReq, bilibili.app.dynamic.v2.TopicListReply> getTopicListMethod;
    if ((getTopicListMethod = DynamicGrpc.getTopicListMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getTopicListMethod = DynamicGrpc.getTopicListMethod) == null) {
          DynamicGrpc.getTopicListMethod = getTopicListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.TopicListReq, bilibili.app.dynamic.v2.TopicListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TopicList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.TopicListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.TopicListReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("TopicList"))
              .build();
        }
      }
    }
    return getTopicListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.TopicSquareReq,
      bilibili.app.dynamic.v2.TopicSquareReply> getTopicSquareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopicSquare",
      requestType = bilibili.app.dynamic.v2.TopicSquareReq.class,
      responseType = bilibili.app.dynamic.v2.TopicSquareReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.TopicSquareReq,
      bilibili.app.dynamic.v2.TopicSquareReply> getTopicSquareMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.TopicSquareReq, bilibili.app.dynamic.v2.TopicSquareReply> getTopicSquareMethod;
    if ((getTopicSquareMethod = DynamicGrpc.getTopicSquareMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getTopicSquareMethod = DynamicGrpc.getTopicSquareMethod) == null) {
          DynamicGrpc.getTopicSquareMethod = getTopicSquareMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.TopicSquareReq, bilibili.app.dynamic.v2.TopicSquareReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TopicSquare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.TopicSquareReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.TopicSquareReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("TopicSquare"))
              .build();
        }
      }
    }
    return getTopicSquareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.UnfollowMatchReq,
      bilibili.app.dynamic.v2.NoReply> getUnfollowMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfollowMatch",
      requestType = bilibili.app.dynamic.v2.UnfollowMatchReq.class,
      responseType = bilibili.app.dynamic.v2.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.UnfollowMatchReq,
      bilibili.app.dynamic.v2.NoReply> getUnfollowMatchMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.UnfollowMatchReq, bilibili.app.dynamic.v2.NoReply> getUnfollowMatchMethod;
    if ((getUnfollowMatchMethod = DynamicGrpc.getUnfollowMatchMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getUnfollowMatchMethod = DynamicGrpc.getUnfollowMatchMethod) == null) {
          DynamicGrpc.getUnfollowMatchMethod = getUnfollowMatchMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.UnfollowMatchReq, bilibili.app.dynamic.v2.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfollowMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.UnfollowMatchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("UnfollowMatch"))
              .build();
        }
      }
    }
    return getUnfollowMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.UpdateTabSettingReq,
      bilibili.app.dynamic.v2.NoReply> getUpdateTabSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTabSetting",
      requestType = bilibili.app.dynamic.v2.UpdateTabSettingReq.class,
      responseType = bilibili.app.dynamic.v2.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.UpdateTabSettingReq,
      bilibili.app.dynamic.v2.NoReply> getUpdateTabSettingMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v2.UpdateTabSettingReq, bilibili.app.dynamic.v2.NoReply> getUpdateTabSettingMethod;
    if ((getUpdateTabSettingMethod = DynamicGrpc.getUpdateTabSettingMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getUpdateTabSettingMethod = DynamicGrpc.getUpdateTabSettingMethod) == null) {
          DynamicGrpc.getUpdateTabSettingMethod = getUpdateTabSettingMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v2.UpdateTabSettingReq, bilibili.app.dynamic.v2.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTabSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.UpdateTabSettingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v2.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("UpdateTabSetting"))
              .build();
        }
      }
    }
    return getUpdateTabSettingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DynamicStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicStub>() {
        @java.lang.Override
        public DynamicStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicStub(channel, callOptions);
        }
      };
    return DynamicStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DynamicBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicBlockingStub>() {
        @java.lang.Override
        public DynamicBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicBlockingStub(channel, callOptions);
        }
      };
    return DynamicBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DynamicFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicFutureStub>() {
        @java.lang.Override
        public DynamicFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicFutureStub(channel, callOptions);
        }
      };
    return DynamicFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * v2动态, rpc 按字母顺序排列
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 
     * </pre>
     */
    default void alumniDynamics(bilibili.app.dynamic.v2.AlumniDynamicsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.AlumniDynamicsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlumniDynamicsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusBillBoard(bilibili.app.dynamic.v2.CampusBillBoardReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusBillBoardReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusBillBoardMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusEntryTab(bilibili.app.dynamic.v2.CampusEntryTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusEntryTabResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusEntryTabMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusFeedback(bilibili.app.dynamic.v2.CampusFeedbackReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusFeedbackReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusHomePages(bilibili.app.dynamic.v2.CampusHomePagesReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusHomePagesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusHomePagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusMateLikeList(bilibili.app.dynamic.v2.CampusMateLikeListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMateLikeListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusMateLikeListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusMngDetail(bilibili.app.dynamic.v2.CampusMngDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngDetailReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusMngDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusMngQuizOperate(bilibili.app.dynamic.v2.CampusMngQuizOperateReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngQuizOperateReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusMngQuizOperateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusMngSubmit(bilibili.app.dynamic.v2.CampusMngSubmitReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngSubmitReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusMngSubmitMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusRcmd(bilibili.app.dynamic.v2.CampusRcmdReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRcmdReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusRcmdMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusRcmdFeed(bilibili.app.dynamic.v2.CampusRcmdFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRcmdFeedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusRcmdFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusRecommend(bilibili.app.dynamic.v2.CampusRecommendReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRecommendReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusRecommendMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusRedDot(bilibili.app.dynamic.v2.CampusRedDotReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRedDotReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusRedDotMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusSquare(bilibili.app.dynamic.v2.CampusSquareReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusSquareReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusSquareMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void campusTopicRcmdFeed(bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampusTopicRcmdFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态通用附加卡-follow/取消follow
     * </pre>
     */
    default void dynAdditionCommonFollow(bilibili.app.dynamic.v2.DynAdditionCommonFollowReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAdditionCommonFollowReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynAdditionCommonFollowMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态综合页
     * </pre>
     */
    default void dynAll(bilibili.app.dynamic.v2.DynAllReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAllReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * 综合页最近访问 - 个人feed流
     * </pre>
     */
    default void dynAllPersonal(bilibili.app.dynamic.v2.DynAllPersonalReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAllPersonalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynAllPersonalMethod(), responseObserver);
    }

    /**
     * <pre>
     * 综合页最近访问 - 标记已读
     * </pre>
     */
    default void dynAllUpdOffset(bilibili.app.dynamic.v2.DynAllUpdOffsetReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynAllUpdOffsetMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态详情页
     * </pre>
     */
    default void dynDetail(bilibili.app.dynamic.v2.DynDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynDetailReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量动态id获取动态详情
     * </pre>
     */
    default void dynDetails(bilibili.app.dynamic.v2.DynDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynDetailsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态发布生成临时卡
     * </pre>
     */
    default void dynFakeCard(bilibili.app.dynamic.v2.DynFakeCardReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynFakeCardReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynFakeCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void dynFriend(bilibili.app.dynamic.v2.DynFriendReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynFriendReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynFriendMethod(), responseObserver);
    }

    /**
     * <pre>
     * 轻浏览
     * </pre>
     */
    default void dynLight(bilibili.app.dynamic.v2.DynLightReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynLightReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * 网关调用 - 查看更多-列表
     * </pre>
     */
    default void dynMixUpListViewMore(bilibili.app.dynamic.v2.DynMixUpListViewMoreReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynMixUpListViewMoreReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynMixUpListViewMoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * 关注推荐up主换一换
     * </pre>
     */
    default void dynRcmdUpExchange(bilibili.app.dynamic.v2.DynRcmdUpExchangeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynRcmdUpExchangeReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynRcmdUpExchangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void dynSearch(bilibili.app.dynamic.v2.DynSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSearchReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void dynServerDetails(bilibili.app.dynamic.v2.DynServerDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynServerDetailsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynServerDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 空间页动态
     * </pre>
     */
    default void dynSpace(bilibili.app.dynamic.v2.DynSpaceReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSpaceRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynSpaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void dynSpaceSearchDetails(bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynSpaceSearchDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void dynTab(bilibili.app.dynamic.v2.DynTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynTabReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynTabMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态点赞
     * </pre>
     */
    default void dynThumb(bilibili.app.dynamic.v2.DynThumbReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynThumbMethod(), responseObserver);
    }

    /**
     * <pre>
     * 未登录页分区UP主推荐
     * </pre>
     */
    default void dynUnLoginRcmd(bilibili.app.dynamic.v2.DynRcmdReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynRcmdReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynUnLoginRcmdMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态视频页
     * </pre>
     */
    default void dynVideo(bilibili.app.dynamic.v2.DynVideoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVideoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 视频页最近访问 - 个人feed流
     * </pre>
     */
    default void dynVideoPersonal(bilibili.app.dynamic.v2.DynVideoPersonalReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVideoPersonalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynVideoPersonalMethod(), responseObserver);
    }

    /**
     * <pre>
     * 视频页最近访问 - 标记已读
     * </pre>
     */
    default void dynVideoUpdOffset(bilibili.app.dynamic.v2.DynVideoUpdOffsetReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynVideoUpdOffsetMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void dynVote(bilibili.app.dynamic.v2.DynVoteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVoteReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void feedFilter(bilibili.app.dynamic.v2.FeedFilterReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.FeedFilterReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeedFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void fetchTabSetting(bilibili.app.dynamic.v2.NoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.FetchTabSettingReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchTabSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void homeSubscribe(bilibili.app.dynamic.v2.HomeSubscribeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.HomeSubscribeReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHomeSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void lbsPoi(bilibili.app.dynamic.v2.LbsPoiReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LbsPoiReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLbsPoiMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void legacyTopicFeed(bilibili.app.dynamic.v2.LegacyTopicFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LegacyTopicFeedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLegacyTopicFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * 点赞列表
     * </pre>
     */
    default void likeList(bilibili.app.dynamic.v2.LikeListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LikeListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLikeListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void officialAccounts(bilibili.app.dynamic.v2.OfficialAccountsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OfficialAccountsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOfficialAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void officialDynamics(bilibili.app.dynamic.v2.OfficialDynamicsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OfficialDynamicsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOfficialDynamicsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 新版动态转发点赞列表 需要登录
     * </pre>
     */
    default void reactionList(bilibili.app.dynamic.v2.ReactionListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.ReactionListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReactionListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 转发列表
     * </pre>
     */
    default void repostList(bilibili.app.dynamic.v2.RepostListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.RepostListRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepostListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void schoolRecommend(bilibili.app.dynamic.v2.SchoolRecommendReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.SchoolRecommendReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchoolRecommendMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void schoolSearch(bilibili.app.dynamic.v2.SchoolSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.SchoolSearchReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchoolSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void setDecision(bilibili.app.dynamic.v2.SetDecisionReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDecisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void setRecentCampus(bilibili.app.dynamic.v2.SetRecentCampusReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRecentCampusMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void subscribeCampus(bilibili.app.dynamic.v2.SubscribeCampusReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCampusMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void topicList(bilibili.app.dynamic.v2.TopicListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.TopicListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTopicListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void topicSquare(bilibili.app.dynamic.v2.TopicSquareReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.TopicSquareReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTopicSquareMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void unfollowMatch(bilibili.app.dynamic.v2.UnfollowMatchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfollowMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    default void updateTabSetting(bilibili.app.dynamic.v2.UpdateTabSettingReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTabSettingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Dynamic.
   * <pre>
   * v2动态, rpc 按字母顺序排列
   * </pre>
   */
  public static abstract class DynamicImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DynamicGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Dynamic.
   * <pre>
   * v2动态, rpc 按字母顺序排列
   * </pre>
   */
  public static final class DynamicStub
      extends io.grpc.stub.AbstractAsyncStub<DynamicStub> {
    private DynamicStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void alumniDynamics(bilibili.app.dynamic.v2.AlumniDynamicsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.AlumniDynamicsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlumniDynamicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusBillBoard(bilibili.app.dynamic.v2.CampusBillBoardReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusBillBoardReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusBillBoardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusEntryTab(bilibili.app.dynamic.v2.CampusEntryTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusEntryTabResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusEntryTabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusFeedback(bilibili.app.dynamic.v2.CampusFeedbackReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusFeedbackReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusHomePages(bilibili.app.dynamic.v2.CampusHomePagesReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusHomePagesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusHomePagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusMateLikeList(bilibili.app.dynamic.v2.CampusMateLikeListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMateLikeListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusMateLikeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusMngDetail(bilibili.app.dynamic.v2.CampusMngDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngDetailReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusMngDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusMngQuizOperate(bilibili.app.dynamic.v2.CampusMngQuizOperateReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngQuizOperateReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusMngQuizOperateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusMngSubmit(bilibili.app.dynamic.v2.CampusMngSubmitReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngSubmitReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusMngSubmitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusRcmd(bilibili.app.dynamic.v2.CampusRcmdReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRcmdReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusRcmdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusRcmdFeed(bilibili.app.dynamic.v2.CampusRcmdFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRcmdFeedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusRcmdFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusRecommend(bilibili.app.dynamic.v2.CampusRecommendReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRecommendReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusRecommendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusRedDot(bilibili.app.dynamic.v2.CampusRedDotReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRedDotReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusRedDotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusSquare(bilibili.app.dynamic.v2.CampusSquareReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusSquareReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusSquareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void campusTopicRcmdFeed(bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampusTopicRcmdFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态通用附加卡-follow/取消follow
     * </pre>
     */
    public void dynAdditionCommonFollow(bilibili.app.dynamic.v2.DynAdditionCommonFollowReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAdditionCommonFollowReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynAdditionCommonFollowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态综合页
     * </pre>
     */
    public void dynAll(bilibili.app.dynamic.v2.DynAllReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAllReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 综合页最近访问 - 个人feed流
     * </pre>
     */
    public void dynAllPersonal(bilibili.app.dynamic.v2.DynAllPersonalReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAllPersonalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynAllPersonalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 综合页最近访问 - 标记已读
     * </pre>
     */
    public void dynAllUpdOffset(bilibili.app.dynamic.v2.DynAllUpdOffsetReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynAllUpdOffsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态详情页
     * </pre>
     */
    public void dynDetail(bilibili.app.dynamic.v2.DynDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynDetailReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量动态id获取动态详情
     * </pre>
     */
    public void dynDetails(bilibili.app.dynamic.v2.DynDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynDetailsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态发布生成临时卡
     * </pre>
     */
    public void dynFakeCard(bilibili.app.dynamic.v2.DynFakeCardReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynFakeCardReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynFakeCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void dynFriend(bilibili.app.dynamic.v2.DynFriendReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynFriendReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynFriendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 轻浏览
     * </pre>
     */
    public void dynLight(bilibili.app.dynamic.v2.DynLightReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynLightReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 网关调用 - 查看更多-列表
     * </pre>
     */
    public void dynMixUpListViewMore(bilibili.app.dynamic.v2.DynMixUpListViewMoreReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynMixUpListViewMoreReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynMixUpListViewMoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 关注推荐up主换一换
     * </pre>
     */
    public void dynRcmdUpExchange(bilibili.app.dynamic.v2.DynRcmdUpExchangeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynRcmdUpExchangeReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynRcmdUpExchangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void dynSearch(bilibili.app.dynamic.v2.DynSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSearchReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void dynServerDetails(bilibili.app.dynamic.v2.DynServerDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynServerDetailsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynServerDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 空间页动态
     * </pre>
     */
    public void dynSpace(bilibili.app.dynamic.v2.DynSpaceReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSpaceRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynSpaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void dynSpaceSearchDetails(bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynSpaceSearchDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void dynTab(bilibili.app.dynamic.v2.DynTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynTabReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynTabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态点赞
     * </pre>
     */
    public void dynThumb(bilibili.app.dynamic.v2.DynThumbReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynThumbMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 未登录页分区UP主推荐
     * </pre>
     */
    public void dynUnLoginRcmd(bilibili.app.dynamic.v2.DynRcmdReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynRcmdReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynUnLoginRcmdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态视频页
     * </pre>
     */
    public void dynVideo(bilibili.app.dynamic.v2.DynVideoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVideoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 视频页最近访问 - 个人feed流
     * </pre>
     */
    public void dynVideoPersonal(bilibili.app.dynamic.v2.DynVideoPersonalReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVideoPersonalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynVideoPersonalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 视频页最近访问 - 标记已读
     * </pre>
     */
    public void dynVideoUpdOffset(bilibili.app.dynamic.v2.DynVideoUpdOffsetReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynVideoUpdOffsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void dynVote(bilibili.app.dynamic.v2.DynVoteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVoteReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void feedFilter(bilibili.app.dynamic.v2.FeedFilterReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.FeedFilterReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeedFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void fetchTabSetting(bilibili.app.dynamic.v2.NoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.FetchTabSettingReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchTabSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void homeSubscribe(bilibili.app.dynamic.v2.HomeSubscribeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.HomeSubscribeReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHomeSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void lbsPoi(bilibili.app.dynamic.v2.LbsPoiReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LbsPoiReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLbsPoiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void legacyTopicFeed(bilibili.app.dynamic.v2.LegacyTopicFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LegacyTopicFeedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLegacyTopicFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 点赞列表
     * </pre>
     */
    public void likeList(bilibili.app.dynamic.v2.LikeListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LikeListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLikeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void officialAccounts(bilibili.app.dynamic.v2.OfficialAccountsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OfficialAccountsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOfficialAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void officialDynamics(bilibili.app.dynamic.v2.OfficialDynamicsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OfficialDynamicsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOfficialDynamicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 新版动态转发点赞列表 需要登录
     * </pre>
     */
    public void reactionList(bilibili.app.dynamic.v2.ReactionListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.ReactionListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReactionListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 转发列表
     * </pre>
     */
    public void repostList(bilibili.app.dynamic.v2.RepostListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.RepostListRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepostListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void schoolRecommend(bilibili.app.dynamic.v2.SchoolRecommendReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.SchoolRecommendReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchoolRecommendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void schoolSearch(bilibili.app.dynamic.v2.SchoolSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.SchoolSearchReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchoolSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void setDecision(bilibili.app.dynamic.v2.SetDecisionReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDecisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void setRecentCampus(bilibili.app.dynamic.v2.SetRecentCampusReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRecentCampusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void subscribeCampus(bilibili.app.dynamic.v2.SubscribeCampusReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeCampusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void topicList(bilibili.app.dynamic.v2.TopicListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.TopicListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTopicListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void topicSquare(bilibili.app.dynamic.v2.TopicSquareReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.TopicSquareReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTopicSquareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void unfollowMatch(bilibili.app.dynamic.v2.UnfollowMatchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfollowMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void updateTabSetting(bilibili.app.dynamic.v2.UpdateTabSettingReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTabSettingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Dynamic.
   * <pre>
   * v2动态, rpc 按字母顺序排列
   * </pre>
   */
  public static final class DynamicBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DynamicBlockingStub> {
    private DynamicBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.AlumniDynamicsReply alumniDynamics(bilibili.app.dynamic.v2.AlumniDynamicsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlumniDynamicsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusBillBoardReply campusBillBoard(bilibili.app.dynamic.v2.CampusBillBoardReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusBillBoardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusEntryTabResp campusEntryTab(bilibili.app.dynamic.v2.CampusEntryTabReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusEntryTabMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusFeedbackReply campusFeedback(bilibili.app.dynamic.v2.CampusFeedbackReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusHomePagesReply campusHomePages(bilibili.app.dynamic.v2.CampusHomePagesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusHomePagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusMateLikeListReply campusMateLikeList(bilibili.app.dynamic.v2.CampusMateLikeListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusMateLikeListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusMngDetailReply campusMngDetail(bilibili.app.dynamic.v2.CampusMngDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusMngDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusMngQuizOperateReply campusMngQuizOperate(bilibili.app.dynamic.v2.CampusMngQuizOperateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusMngQuizOperateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusMngSubmitReply campusMngSubmit(bilibili.app.dynamic.v2.CampusMngSubmitReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusMngSubmitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusRcmdReply campusRcmd(bilibili.app.dynamic.v2.CampusRcmdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusRcmdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusRcmdFeedReply campusRcmdFeed(bilibili.app.dynamic.v2.CampusRcmdFeedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusRcmdFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusRecommendReply campusRecommend(bilibili.app.dynamic.v2.CampusRecommendReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusRecommendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusRedDotReply campusRedDot(bilibili.app.dynamic.v2.CampusRedDotReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusRedDotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusSquareReply campusSquare(bilibili.app.dynamic.v2.CampusSquareReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusSquareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply campusTopicRcmdFeed(bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampusTopicRcmdFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态通用附加卡-follow/取消follow
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynAdditionCommonFollowReply dynAdditionCommonFollow(bilibili.app.dynamic.v2.DynAdditionCommonFollowReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynAdditionCommonFollowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态综合页
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynAllReply dynAll(bilibili.app.dynamic.v2.DynAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 综合页最近访问 - 个人feed流
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynAllPersonalReply dynAllPersonal(bilibili.app.dynamic.v2.DynAllPersonalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynAllPersonalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 综合页最近访问 - 标记已读
     * </pre>
     */
    public bilibili.app.dynamic.v2.NoReply dynAllUpdOffset(bilibili.app.dynamic.v2.DynAllUpdOffsetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynAllUpdOffsetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态详情页
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynDetailReply dynDetail(bilibili.app.dynamic.v2.DynDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量动态id获取动态详情
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynDetailsReply dynDetails(bilibili.app.dynamic.v2.DynDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态发布生成临时卡
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynFakeCardReply dynFakeCard(bilibili.app.dynamic.v2.DynFakeCardReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynFakeCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynFriendReply dynFriend(bilibili.app.dynamic.v2.DynFriendReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynFriendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 轻浏览
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynLightReply dynLight(bilibili.app.dynamic.v2.DynLightReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 网关调用 - 查看更多-列表
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynMixUpListViewMoreReply dynMixUpListViewMore(bilibili.app.dynamic.v2.DynMixUpListViewMoreReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynMixUpListViewMoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 关注推荐up主换一换
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynRcmdUpExchangeReply dynRcmdUpExchange(bilibili.app.dynamic.v2.DynRcmdUpExchangeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynRcmdUpExchangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynSearchReply dynSearch(bilibili.app.dynamic.v2.DynSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynServerDetailsReply dynServerDetails(bilibili.app.dynamic.v2.DynServerDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynServerDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 空间页动态
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynSpaceRsp dynSpace(bilibili.app.dynamic.v2.DynSpaceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynSpaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply dynSpaceSearchDetails(bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynSpaceSearchDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynTabReply dynTab(bilibili.app.dynamic.v2.DynTabReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynTabMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态点赞
     * </pre>
     */
    public bilibili.app.dynamic.v2.NoReply dynThumb(bilibili.app.dynamic.v2.DynThumbReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynThumbMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 未登录页分区UP主推荐
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynRcmdReply dynUnLoginRcmd(bilibili.app.dynamic.v2.DynRcmdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynUnLoginRcmdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态视频页
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynVideoReply dynVideo(bilibili.app.dynamic.v2.DynVideoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 视频页最近访问 - 个人feed流
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynVideoPersonalReply dynVideoPersonal(bilibili.app.dynamic.v2.DynVideoPersonalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynVideoPersonalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 视频页最近访问 - 标记已读
     * </pre>
     */
    public bilibili.app.dynamic.v2.NoReply dynVideoUpdOffset(bilibili.app.dynamic.v2.DynVideoUpdOffsetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynVideoUpdOffsetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.DynVoteReply dynVote(bilibili.app.dynamic.v2.DynVoteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.FeedFilterReply feedFilter(bilibili.app.dynamic.v2.FeedFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.FetchTabSettingReply fetchTabSetting(bilibili.app.dynamic.v2.NoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchTabSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.HomeSubscribeReply homeSubscribe(bilibili.app.dynamic.v2.HomeSubscribeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHomeSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.LbsPoiReply lbsPoi(bilibili.app.dynamic.v2.LbsPoiReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLbsPoiMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.LegacyTopicFeedReply legacyTopicFeed(bilibili.app.dynamic.v2.LegacyTopicFeedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLegacyTopicFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 点赞列表
     * </pre>
     */
    public bilibili.app.dynamic.v2.LikeListReply likeList(bilibili.app.dynamic.v2.LikeListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLikeListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.OfficialAccountsReply officialAccounts(bilibili.app.dynamic.v2.OfficialAccountsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfficialAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.OfficialDynamicsReply officialDynamics(bilibili.app.dynamic.v2.OfficialDynamicsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfficialDynamicsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 新版动态转发点赞列表 需要登录
     * </pre>
     */
    public bilibili.app.dynamic.v2.ReactionListReply reactionList(bilibili.app.dynamic.v2.ReactionListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReactionListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 转发列表
     * </pre>
     */
    public bilibili.app.dynamic.v2.RepostListRsp repostList(bilibili.app.dynamic.v2.RepostListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepostListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.SchoolRecommendReply schoolRecommend(bilibili.app.dynamic.v2.SchoolRecommendReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchoolRecommendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.SchoolSearchReply schoolSearch(bilibili.app.dynamic.v2.SchoolSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchoolSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.NoReply setDecision(bilibili.app.dynamic.v2.SetDecisionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDecisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.NoReply setRecentCampus(bilibili.app.dynamic.v2.SetRecentCampusReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRecentCampusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.NoReply subscribeCampus(bilibili.app.dynamic.v2.SubscribeCampusReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeCampusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.TopicListReply topicList(bilibili.app.dynamic.v2.TopicListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTopicListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.TopicSquareReply topicSquare(bilibili.app.dynamic.v2.TopicSquareReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTopicSquareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.NoReply unfollowMatch(bilibili.app.dynamic.v2.UnfollowMatchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfollowMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public bilibili.app.dynamic.v2.NoReply updateTabSetting(bilibili.app.dynamic.v2.UpdateTabSettingReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTabSettingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Dynamic.
   * <pre>
   * v2动态, rpc 按字母顺序排列
   * </pre>
   */
  public static final class DynamicFutureStub
      extends io.grpc.stub.AbstractFutureStub<DynamicFutureStub> {
    private DynamicFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.AlumniDynamicsReply> alumniDynamics(
        bilibili.app.dynamic.v2.AlumniDynamicsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlumniDynamicsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusBillBoardReply> campusBillBoard(
        bilibili.app.dynamic.v2.CampusBillBoardReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusBillBoardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusEntryTabResp> campusEntryTab(
        bilibili.app.dynamic.v2.CampusEntryTabReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusEntryTabMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusFeedbackReply> campusFeedback(
        bilibili.app.dynamic.v2.CampusFeedbackReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusHomePagesReply> campusHomePages(
        bilibili.app.dynamic.v2.CampusHomePagesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusHomePagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusMateLikeListReply> campusMateLikeList(
        bilibili.app.dynamic.v2.CampusMateLikeListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusMateLikeListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusMngDetailReply> campusMngDetail(
        bilibili.app.dynamic.v2.CampusMngDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusMngDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusMngQuizOperateReply> campusMngQuizOperate(
        bilibili.app.dynamic.v2.CampusMngQuizOperateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusMngQuizOperateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusMngSubmitReply> campusMngSubmit(
        bilibili.app.dynamic.v2.CampusMngSubmitReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusMngSubmitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusRcmdReply> campusRcmd(
        bilibili.app.dynamic.v2.CampusRcmdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusRcmdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusRcmdFeedReply> campusRcmdFeed(
        bilibili.app.dynamic.v2.CampusRcmdFeedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusRcmdFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusRecommendReply> campusRecommend(
        bilibili.app.dynamic.v2.CampusRecommendReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusRecommendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusRedDotReply> campusRedDot(
        bilibili.app.dynamic.v2.CampusRedDotReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusRedDotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusSquareReply> campusSquare(
        bilibili.app.dynamic.v2.CampusSquareReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusSquareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply> campusTopicRcmdFeed(
        bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampusTopicRcmdFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态通用附加卡-follow/取消follow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynAdditionCommonFollowReply> dynAdditionCommonFollow(
        bilibili.app.dynamic.v2.DynAdditionCommonFollowReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynAdditionCommonFollowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态综合页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynAllReply> dynAll(
        bilibili.app.dynamic.v2.DynAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 综合页最近访问 - 个人feed流
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynAllPersonalReply> dynAllPersonal(
        bilibili.app.dynamic.v2.DynAllPersonalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynAllPersonalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 综合页最近访问 - 标记已读
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.NoReply> dynAllUpdOffset(
        bilibili.app.dynamic.v2.DynAllUpdOffsetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynAllUpdOffsetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态详情页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynDetailReply> dynDetail(
        bilibili.app.dynamic.v2.DynDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量动态id获取动态详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynDetailsReply> dynDetails(
        bilibili.app.dynamic.v2.DynDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态发布生成临时卡
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynFakeCardReply> dynFakeCard(
        bilibili.app.dynamic.v2.DynFakeCardReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynFakeCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynFriendReply> dynFriend(
        bilibili.app.dynamic.v2.DynFriendReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynFriendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 轻浏览
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynLightReply> dynLight(
        bilibili.app.dynamic.v2.DynLightReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 网关调用 - 查看更多-列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynMixUpListViewMoreReply> dynMixUpListViewMore(
        bilibili.app.dynamic.v2.DynMixUpListViewMoreReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynMixUpListViewMoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 关注推荐up主换一换
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynRcmdUpExchangeReply> dynRcmdUpExchange(
        bilibili.app.dynamic.v2.DynRcmdUpExchangeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynRcmdUpExchangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynSearchReply> dynSearch(
        bilibili.app.dynamic.v2.DynSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynServerDetailsReply> dynServerDetails(
        bilibili.app.dynamic.v2.DynServerDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynServerDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 空间页动态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynSpaceRsp> dynSpace(
        bilibili.app.dynamic.v2.DynSpaceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynSpaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply> dynSpaceSearchDetails(
        bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynSpaceSearchDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynTabReply> dynTab(
        bilibili.app.dynamic.v2.DynTabReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynTabMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态点赞
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.NoReply> dynThumb(
        bilibili.app.dynamic.v2.DynThumbReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynThumbMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 未登录页分区UP主推荐
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynRcmdReply> dynUnLoginRcmd(
        bilibili.app.dynamic.v2.DynRcmdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynUnLoginRcmdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态视频页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynVideoReply> dynVideo(
        bilibili.app.dynamic.v2.DynVideoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynVideoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 视频页最近访问 - 个人feed流
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynVideoPersonalReply> dynVideoPersonal(
        bilibili.app.dynamic.v2.DynVideoPersonalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynVideoPersonalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 视频页最近访问 - 标记已读
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.NoReply> dynVideoUpdOffset(
        bilibili.app.dynamic.v2.DynVideoUpdOffsetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynVideoUpdOffsetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.DynVoteReply> dynVote(
        bilibili.app.dynamic.v2.DynVoteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.FeedFilterReply> feedFilter(
        bilibili.app.dynamic.v2.FeedFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeedFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.FetchTabSettingReply> fetchTabSetting(
        bilibili.app.dynamic.v2.NoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchTabSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.HomeSubscribeReply> homeSubscribe(
        bilibili.app.dynamic.v2.HomeSubscribeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHomeSubscribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.LbsPoiReply> lbsPoi(
        bilibili.app.dynamic.v2.LbsPoiReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLbsPoiMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.LegacyTopicFeedReply> legacyTopicFeed(
        bilibili.app.dynamic.v2.LegacyTopicFeedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLegacyTopicFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 点赞列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.LikeListReply> likeList(
        bilibili.app.dynamic.v2.LikeListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLikeListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.OfficialAccountsReply> officialAccounts(
        bilibili.app.dynamic.v2.OfficialAccountsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOfficialAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.OfficialDynamicsReply> officialDynamics(
        bilibili.app.dynamic.v2.OfficialDynamicsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOfficialDynamicsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 新版动态转发点赞列表 需要登录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.ReactionListReply> reactionList(
        bilibili.app.dynamic.v2.ReactionListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReactionListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 转发列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.RepostListRsp> repostList(
        bilibili.app.dynamic.v2.RepostListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepostListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.SchoolRecommendReply> schoolRecommend(
        bilibili.app.dynamic.v2.SchoolRecommendReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchoolRecommendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.SchoolSearchReply> schoolSearch(
        bilibili.app.dynamic.v2.SchoolSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchoolSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.NoReply> setDecision(
        bilibili.app.dynamic.v2.SetDecisionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDecisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.NoReply> setRecentCampus(
        bilibili.app.dynamic.v2.SetRecentCampusReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRecentCampusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.NoReply> subscribeCampus(
        bilibili.app.dynamic.v2.SubscribeCampusReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeCampusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.TopicListReply> topicList(
        bilibili.app.dynamic.v2.TopicListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTopicListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.TopicSquareReply> topicSquare(
        bilibili.app.dynamic.v2.TopicSquareReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTopicSquareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.NoReply> unfollowMatch(
        bilibili.app.dynamic.v2.UnfollowMatchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfollowMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v2.NoReply> updateTabSetting(
        bilibili.app.dynamic.v2.UpdateTabSettingReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTabSettingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALUMNI_DYNAMICS = 0;
  private static final int METHODID_CAMPUS_BILL_BOARD = 1;
  private static final int METHODID_CAMPUS_ENTRY_TAB = 2;
  private static final int METHODID_CAMPUS_FEEDBACK = 3;
  private static final int METHODID_CAMPUS_HOME_PAGES = 4;
  private static final int METHODID_CAMPUS_MATE_LIKE_LIST = 5;
  private static final int METHODID_CAMPUS_MNG_DETAIL = 6;
  private static final int METHODID_CAMPUS_MNG_QUIZ_OPERATE = 7;
  private static final int METHODID_CAMPUS_MNG_SUBMIT = 8;
  private static final int METHODID_CAMPUS_RCMD = 9;
  private static final int METHODID_CAMPUS_RCMD_FEED = 10;
  private static final int METHODID_CAMPUS_RECOMMEND = 11;
  private static final int METHODID_CAMPUS_RED_DOT = 12;
  private static final int METHODID_CAMPUS_SQUARE = 13;
  private static final int METHODID_CAMPUS_TOPIC_RCMD_FEED = 14;
  private static final int METHODID_DYN_ADDITION_COMMON_FOLLOW = 15;
  private static final int METHODID_DYN_ALL = 16;
  private static final int METHODID_DYN_ALL_PERSONAL = 17;
  private static final int METHODID_DYN_ALL_UPD_OFFSET = 18;
  private static final int METHODID_DYN_DETAIL = 19;
  private static final int METHODID_DYN_DETAILS = 20;
  private static final int METHODID_DYN_FAKE_CARD = 21;
  private static final int METHODID_DYN_FRIEND = 22;
  private static final int METHODID_DYN_LIGHT = 23;
  private static final int METHODID_DYN_MIX_UP_LIST_VIEW_MORE = 24;
  private static final int METHODID_DYN_RCMD_UP_EXCHANGE = 25;
  private static final int METHODID_DYN_SEARCH = 26;
  private static final int METHODID_DYN_SERVER_DETAILS = 27;
  private static final int METHODID_DYN_SPACE = 28;
  private static final int METHODID_DYN_SPACE_SEARCH_DETAILS = 29;
  private static final int METHODID_DYN_TAB = 30;
  private static final int METHODID_DYN_THUMB = 31;
  private static final int METHODID_DYN_UN_LOGIN_RCMD = 32;
  private static final int METHODID_DYN_VIDEO = 33;
  private static final int METHODID_DYN_VIDEO_PERSONAL = 34;
  private static final int METHODID_DYN_VIDEO_UPD_OFFSET = 35;
  private static final int METHODID_DYN_VOTE = 36;
  private static final int METHODID_FEED_FILTER = 37;
  private static final int METHODID_FETCH_TAB_SETTING = 38;
  private static final int METHODID_HOME_SUBSCRIBE = 39;
  private static final int METHODID_LBS_POI = 40;
  private static final int METHODID_LEGACY_TOPIC_FEED = 41;
  private static final int METHODID_LIKE_LIST = 42;
  private static final int METHODID_OFFICIAL_ACCOUNTS = 43;
  private static final int METHODID_OFFICIAL_DYNAMICS = 44;
  private static final int METHODID_REACTION_LIST = 45;
  private static final int METHODID_REPOST_LIST = 46;
  private static final int METHODID_SCHOOL_RECOMMEND = 47;
  private static final int METHODID_SCHOOL_SEARCH = 48;
  private static final int METHODID_SET_DECISION = 49;
  private static final int METHODID_SET_RECENT_CAMPUS = 50;
  private static final int METHODID_SUBSCRIBE_CAMPUS = 51;
  private static final int METHODID_TOPIC_LIST = 52;
  private static final int METHODID_TOPIC_SQUARE = 53;
  private static final int METHODID_UNFOLLOW_MATCH = 54;
  private static final int METHODID_UPDATE_TAB_SETTING = 55;

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
        case METHODID_ALUMNI_DYNAMICS:
          serviceImpl.alumniDynamics((bilibili.app.dynamic.v2.AlumniDynamicsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.AlumniDynamicsReply>) responseObserver);
          break;
        case METHODID_CAMPUS_BILL_BOARD:
          serviceImpl.campusBillBoard((bilibili.app.dynamic.v2.CampusBillBoardReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusBillBoardReply>) responseObserver);
          break;
        case METHODID_CAMPUS_ENTRY_TAB:
          serviceImpl.campusEntryTab((bilibili.app.dynamic.v2.CampusEntryTabReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusEntryTabResp>) responseObserver);
          break;
        case METHODID_CAMPUS_FEEDBACK:
          serviceImpl.campusFeedback((bilibili.app.dynamic.v2.CampusFeedbackReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusFeedbackReply>) responseObserver);
          break;
        case METHODID_CAMPUS_HOME_PAGES:
          serviceImpl.campusHomePages((bilibili.app.dynamic.v2.CampusHomePagesReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusHomePagesReply>) responseObserver);
          break;
        case METHODID_CAMPUS_MATE_LIKE_LIST:
          serviceImpl.campusMateLikeList((bilibili.app.dynamic.v2.CampusMateLikeListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMateLikeListReply>) responseObserver);
          break;
        case METHODID_CAMPUS_MNG_DETAIL:
          serviceImpl.campusMngDetail((bilibili.app.dynamic.v2.CampusMngDetailReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngDetailReply>) responseObserver);
          break;
        case METHODID_CAMPUS_MNG_QUIZ_OPERATE:
          serviceImpl.campusMngQuizOperate((bilibili.app.dynamic.v2.CampusMngQuizOperateReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngQuizOperateReply>) responseObserver);
          break;
        case METHODID_CAMPUS_MNG_SUBMIT:
          serviceImpl.campusMngSubmit((bilibili.app.dynamic.v2.CampusMngSubmitReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusMngSubmitReply>) responseObserver);
          break;
        case METHODID_CAMPUS_RCMD:
          serviceImpl.campusRcmd((bilibili.app.dynamic.v2.CampusRcmdReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRcmdReply>) responseObserver);
          break;
        case METHODID_CAMPUS_RCMD_FEED:
          serviceImpl.campusRcmdFeed((bilibili.app.dynamic.v2.CampusRcmdFeedReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRcmdFeedReply>) responseObserver);
          break;
        case METHODID_CAMPUS_RECOMMEND:
          serviceImpl.campusRecommend((bilibili.app.dynamic.v2.CampusRecommendReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRecommendReply>) responseObserver);
          break;
        case METHODID_CAMPUS_RED_DOT:
          serviceImpl.campusRedDot((bilibili.app.dynamic.v2.CampusRedDotReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusRedDotReply>) responseObserver);
          break;
        case METHODID_CAMPUS_SQUARE:
          serviceImpl.campusSquare((bilibili.app.dynamic.v2.CampusSquareReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusSquareReply>) responseObserver);
          break;
        case METHODID_CAMPUS_TOPIC_RCMD_FEED:
          serviceImpl.campusTopicRcmdFeed((bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply>) responseObserver);
          break;
        case METHODID_DYN_ADDITION_COMMON_FOLLOW:
          serviceImpl.dynAdditionCommonFollow((bilibili.app.dynamic.v2.DynAdditionCommonFollowReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAdditionCommonFollowReply>) responseObserver);
          break;
        case METHODID_DYN_ALL:
          serviceImpl.dynAll((bilibili.app.dynamic.v2.DynAllReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAllReply>) responseObserver);
          break;
        case METHODID_DYN_ALL_PERSONAL:
          serviceImpl.dynAllPersonal((bilibili.app.dynamic.v2.DynAllPersonalReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynAllPersonalReply>) responseObserver);
          break;
        case METHODID_DYN_ALL_UPD_OFFSET:
          serviceImpl.dynAllUpdOffset((bilibili.app.dynamic.v2.DynAllUpdOffsetReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply>) responseObserver);
          break;
        case METHODID_DYN_DETAIL:
          serviceImpl.dynDetail((bilibili.app.dynamic.v2.DynDetailReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynDetailReply>) responseObserver);
          break;
        case METHODID_DYN_DETAILS:
          serviceImpl.dynDetails((bilibili.app.dynamic.v2.DynDetailsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynDetailsReply>) responseObserver);
          break;
        case METHODID_DYN_FAKE_CARD:
          serviceImpl.dynFakeCard((bilibili.app.dynamic.v2.DynFakeCardReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynFakeCardReply>) responseObserver);
          break;
        case METHODID_DYN_FRIEND:
          serviceImpl.dynFriend((bilibili.app.dynamic.v2.DynFriendReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynFriendReply>) responseObserver);
          break;
        case METHODID_DYN_LIGHT:
          serviceImpl.dynLight((bilibili.app.dynamic.v2.DynLightReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynLightReply>) responseObserver);
          break;
        case METHODID_DYN_MIX_UP_LIST_VIEW_MORE:
          serviceImpl.dynMixUpListViewMore((bilibili.app.dynamic.v2.DynMixUpListViewMoreReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynMixUpListViewMoreReply>) responseObserver);
          break;
        case METHODID_DYN_RCMD_UP_EXCHANGE:
          serviceImpl.dynRcmdUpExchange((bilibili.app.dynamic.v2.DynRcmdUpExchangeReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynRcmdUpExchangeReply>) responseObserver);
          break;
        case METHODID_DYN_SEARCH:
          serviceImpl.dynSearch((bilibili.app.dynamic.v2.DynSearchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSearchReply>) responseObserver);
          break;
        case METHODID_DYN_SERVER_DETAILS:
          serviceImpl.dynServerDetails((bilibili.app.dynamic.v2.DynServerDetailsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynServerDetailsReply>) responseObserver);
          break;
        case METHODID_DYN_SPACE:
          serviceImpl.dynSpace((bilibili.app.dynamic.v2.DynSpaceReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSpaceRsp>) responseObserver);
          break;
        case METHODID_DYN_SPACE_SEARCH_DETAILS:
          serviceImpl.dynSpaceSearchDetails((bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply>) responseObserver);
          break;
        case METHODID_DYN_TAB:
          serviceImpl.dynTab((bilibili.app.dynamic.v2.DynTabReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynTabReply>) responseObserver);
          break;
        case METHODID_DYN_THUMB:
          serviceImpl.dynThumb((bilibili.app.dynamic.v2.DynThumbReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply>) responseObserver);
          break;
        case METHODID_DYN_UN_LOGIN_RCMD:
          serviceImpl.dynUnLoginRcmd((bilibili.app.dynamic.v2.DynRcmdReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynRcmdReply>) responseObserver);
          break;
        case METHODID_DYN_VIDEO:
          serviceImpl.dynVideo((bilibili.app.dynamic.v2.DynVideoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVideoReply>) responseObserver);
          break;
        case METHODID_DYN_VIDEO_PERSONAL:
          serviceImpl.dynVideoPersonal((bilibili.app.dynamic.v2.DynVideoPersonalReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVideoPersonalReply>) responseObserver);
          break;
        case METHODID_DYN_VIDEO_UPD_OFFSET:
          serviceImpl.dynVideoUpdOffset((bilibili.app.dynamic.v2.DynVideoUpdOffsetReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply>) responseObserver);
          break;
        case METHODID_DYN_VOTE:
          serviceImpl.dynVote((bilibili.app.dynamic.v2.DynVoteReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.DynVoteReply>) responseObserver);
          break;
        case METHODID_FEED_FILTER:
          serviceImpl.feedFilter((bilibili.app.dynamic.v2.FeedFilterReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.FeedFilterReply>) responseObserver);
          break;
        case METHODID_FETCH_TAB_SETTING:
          serviceImpl.fetchTabSetting((bilibili.app.dynamic.v2.NoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.FetchTabSettingReply>) responseObserver);
          break;
        case METHODID_HOME_SUBSCRIBE:
          serviceImpl.homeSubscribe((bilibili.app.dynamic.v2.HomeSubscribeReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.HomeSubscribeReply>) responseObserver);
          break;
        case METHODID_LBS_POI:
          serviceImpl.lbsPoi((bilibili.app.dynamic.v2.LbsPoiReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LbsPoiReply>) responseObserver);
          break;
        case METHODID_LEGACY_TOPIC_FEED:
          serviceImpl.legacyTopicFeed((bilibili.app.dynamic.v2.LegacyTopicFeedReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LegacyTopicFeedReply>) responseObserver);
          break;
        case METHODID_LIKE_LIST:
          serviceImpl.likeList((bilibili.app.dynamic.v2.LikeListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.LikeListReply>) responseObserver);
          break;
        case METHODID_OFFICIAL_ACCOUNTS:
          serviceImpl.officialAccounts((bilibili.app.dynamic.v2.OfficialAccountsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OfficialAccountsReply>) responseObserver);
          break;
        case METHODID_OFFICIAL_DYNAMICS:
          serviceImpl.officialDynamics((bilibili.app.dynamic.v2.OfficialDynamicsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.OfficialDynamicsReply>) responseObserver);
          break;
        case METHODID_REACTION_LIST:
          serviceImpl.reactionList((bilibili.app.dynamic.v2.ReactionListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.ReactionListReply>) responseObserver);
          break;
        case METHODID_REPOST_LIST:
          serviceImpl.repostList((bilibili.app.dynamic.v2.RepostListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.RepostListRsp>) responseObserver);
          break;
        case METHODID_SCHOOL_RECOMMEND:
          serviceImpl.schoolRecommend((bilibili.app.dynamic.v2.SchoolRecommendReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.SchoolRecommendReply>) responseObserver);
          break;
        case METHODID_SCHOOL_SEARCH:
          serviceImpl.schoolSearch((bilibili.app.dynamic.v2.SchoolSearchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.SchoolSearchReply>) responseObserver);
          break;
        case METHODID_SET_DECISION:
          serviceImpl.setDecision((bilibili.app.dynamic.v2.SetDecisionReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply>) responseObserver);
          break;
        case METHODID_SET_RECENT_CAMPUS:
          serviceImpl.setRecentCampus((bilibili.app.dynamic.v2.SetRecentCampusReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CAMPUS:
          serviceImpl.subscribeCampus((bilibili.app.dynamic.v2.SubscribeCampusReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply>) responseObserver);
          break;
        case METHODID_TOPIC_LIST:
          serviceImpl.topicList((bilibili.app.dynamic.v2.TopicListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.TopicListReply>) responseObserver);
          break;
        case METHODID_TOPIC_SQUARE:
          serviceImpl.topicSquare((bilibili.app.dynamic.v2.TopicSquareReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.TopicSquareReply>) responseObserver);
          break;
        case METHODID_UNFOLLOW_MATCH:
          serviceImpl.unfollowMatch((bilibili.app.dynamic.v2.UnfollowMatchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply>) responseObserver);
          break;
        case METHODID_UPDATE_TAB_SETTING:
          serviceImpl.updateTabSetting((bilibili.app.dynamic.v2.UpdateTabSettingReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v2.NoReply>) responseObserver);
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
          getAlumniDynamicsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.AlumniDynamicsReq,
              bilibili.app.dynamic.v2.AlumniDynamicsReply>(
                service, METHODID_ALUMNI_DYNAMICS)))
        .addMethod(
          getCampusBillBoardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusBillBoardReq,
              bilibili.app.dynamic.v2.CampusBillBoardReply>(
                service, METHODID_CAMPUS_BILL_BOARD)))
        .addMethod(
          getCampusEntryTabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusEntryTabReq,
              bilibili.app.dynamic.v2.CampusEntryTabResp>(
                service, METHODID_CAMPUS_ENTRY_TAB)))
        .addMethod(
          getCampusFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusFeedbackReq,
              bilibili.app.dynamic.v2.CampusFeedbackReply>(
                service, METHODID_CAMPUS_FEEDBACK)))
        .addMethod(
          getCampusHomePagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusHomePagesReq,
              bilibili.app.dynamic.v2.CampusHomePagesReply>(
                service, METHODID_CAMPUS_HOME_PAGES)))
        .addMethod(
          getCampusMateLikeListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusMateLikeListReq,
              bilibili.app.dynamic.v2.CampusMateLikeListReply>(
                service, METHODID_CAMPUS_MATE_LIKE_LIST)))
        .addMethod(
          getCampusMngDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusMngDetailReq,
              bilibili.app.dynamic.v2.CampusMngDetailReply>(
                service, METHODID_CAMPUS_MNG_DETAIL)))
        .addMethod(
          getCampusMngQuizOperateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusMngQuizOperateReq,
              bilibili.app.dynamic.v2.CampusMngQuizOperateReply>(
                service, METHODID_CAMPUS_MNG_QUIZ_OPERATE)))
        .addMethod(
          getCampusMngSubmitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusMngSubmitReq,
              bilibili.app.dynamic.v2.CampusMngSubmitReply>(
                service, METHODID_CAMPUS_MNG_SUBMIT)))
        .addMethod(
          getCampusRcmdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusRcmdReq,
              bilibili.app.dynamic.v2.CampusRcmdReply>(
                service, METHODID_CAMPUS_RCMD)))
        .addMethod(
          getCampusRcmdFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusRcmdFeedReq,
              bilibili.app.dynamic.v2.CampusRcmdFeedReply>(
                service, METHODID_CAMPUS_RCMD_FEED)))
        .addMethod(
          getCampusRecommendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusRecommendReq,
              bilibili.app.dynamic.v2.CampusRecommendReply>(
                service, METHODID_CAMPUS_RECOMMEND)))
        .addMethod(
          getCampusRedDotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusRedDotReq,
              bilibili.app.dynamic.v2.CampusRedDotReply>(
                service, METHODID_CAMPUS_RED_DOT)))
        .addMethod(
          getCampusSquareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusSquareReq,
              bilibili.app.dynamic.v2.CampusSquareReply>(
                service, METHODID_CAMPUS_SQUARE)))
        .addMethod(
          getCampusTopicRcmdFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.CampusTopicRcmdFeedReq,
              bilibili.app.dynamic.v2.CampusTopicRcmdFeedReply>(
                service, METHODID_CAMPUS_TOPIC_RCMD_FEED)))
        .addMethod(
          getDynAdditionCommonFollowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynAdditionCommonFollowReq,
              bilibili.app.dynamic.v2.DynAdditionCommonFollowReply>(
                service, METHODID_DYN_ADDITION_COMMON_FOLLOW)))
        .addMethod(
          getDynAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynAllReq,
              bilibili.app.dynamic.v2.DynAllReply>(
                service, METHODID_DYN_ALL)))
        .addMethod(
          getDynAllPersonalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynAllPersonalReq,
              bilibili.app.dynamic.v2.DynAllPersonalReply>(
                service, METHODID_DYN_ALL_PERSONAL)))
        .addMethod(
          getDynAllUpdOffsetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynAllUpdOffsetReq,
              bilibili.app.dynamic.v2.NoReply>(
                service, METHODID_DYN_ALL_UPD_OFFSET)))
        .addMethod(
          getDynDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynDetailReq,
              bilibili.app.dynamic.v2.DynDetailReply>(
                service, METHODID_DYN_DETAIL)))
        .addMethod(
          getDynDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynDetailsReq,
              bilibili.app.dynamic.v2.DynDetailsReply>(
                service, METHODID_DYN_DETAILS)))
        .addMethod(
          getDynFakeCardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynFakeCardReq,
              bilibili.app.dynamic.v2.DynFakeCardReply>(
                service, METHODID_DYN_FAKE_CARD)))
        .addMethod(
          getDynFriendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynFriendReq,
              bilibili.app.dynamic.v2.DynFriendReply>(
                service, METHODID_DYN_FRIEND)))
        .addMethod(
          getDynLightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynLightReq,
              bilibili.app.dynamic.v2.DynLightReply>(
                service, METHODID_DYN_LIGHT)))
        .addMethod(
          getDynMixUpListViewMoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynMixUpListViewMoreReq,
              bilibili.app.dynamic.v2.DynMixUpListViewMoreReply>(
                service, METHODID_DYN_MIX_UP_LIST_VIEW_MORE)))
        .addMethod(
          getDynRcmdUpExchangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynRcmdUpExchangeReq,
              bilibili.app.dynamic.v2.DynRcmdUpExchangeReply>(
                service, METHODID_DYN_RCMD_UP_EXCHANGE)))
        .addMethod(
          getDynSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynSearchReq,
              bilibili.app.dynamic.v2.DynSearchReply>(
                service, METHODID_DYN_SEARCH)))
        .addMethod(
          getDynServerDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynServerDetailsReq,
              bilibili.app.dynamic.v2.DynServerDetailsReply>(
                service, METHODID_DYN_SERVER_DETAILS)))
        .addMethod(
          getDynSpaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynSpaceReq,
              bilibili.app.dynamic.v2.DynSpaceRsp>(
                service, METHODID_DYN_SPACE)))
        .addMethod(
          getDynSpaceSearchDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq,
              bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply>(
                service, METHODID_DYN_SPACE_SEARCH_DETAILS)))
        .addMethod(
          getDynTabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynTabReq,
              bilibili.app.dynamic.v2.DynTabReply>(
                service, METHODID_DYN_TAB)))
        .addMethod(
          getDynThumbMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynThumbReq,
              bilibili.app.dynamic.v2.NoReply>(
                service, METHODID_DYN_THUMB)))
        .addMethod(
          getDynUnLoginRcmdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynRcmdReq,
              bilibili.app.dynamic.v2.DynRcmdReply>(
                service, METHODID_DYN_UN_LOGIN_RCMD)))
        .addMethod(
          getDynVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynVideoReq,
              bilibili.app.dynamic.v2.DynVideoReply>(
                service, METHODID_DYN_VIDEO)))
        .addMethod(
          getDynVideoPersonalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynVideoPersonalReq,
              bilibili.app.dynamic.v2.DynVideoPersonalReply>(
                service, METHODID_DYN_VIDEO_PERSONAL)))
        .addMethod(
          getDynVideoUpdOffsetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynVideoUpdOffsetReq,
              bilibili.app.dynamic.v2.NoReply>(
                service, METHODID_DYN_VIDEO_UPD_OFFSET)))
        .addMethod(
          getDynVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.DynVoteReq,
              bilibili.app.dynamic.v2.DynVoteReply>(
                service, METHODID_DYN_VOTE)))
        .addMethod(
          getFeedFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.FeedFilterReq,
              bilibili.app.dynamic.v2.FeedFilterReply>(
                service, METHODID_FEED_FILTER)))
        .addMethod(
          getFetchTabSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.NoReq,
              bilibili.app.dynamic.v2.FetchTabSettingReply>(
                service, METHODID_FETCH_TAB_SETTING)))
        .addMethod(
          getHomeSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.HomeSubscribeReq,
              bilibili.app.dynamic.v2.HomeSubscribeReply>(
                service, METHODID_HOME_SUBSCRIBE)))
        .addMethod(
          getLbsPoiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.LbsPoiReq,
              bilibili.app.dynamic.v2.LbsPoiReply>(
                service, METHODID_LBS_POI)))
        .addMethod(
          getLegacyTopicFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.LegacyTopicFeedReq,
              bilibili.app.dynamic.v2.LegacyTopicFeedReply>(
                service, METHODID_LEGACY_TOPIC_FEED)))
        .addMethod(
          getLikeListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.LikeListReq,
              bilibili.app.dynamic.v2.LikeListReply>(
                service, METHODID_LIKE_LIST)))
        .addMethod(
          getOfficialAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.OfficialAccountsReq,
              bilibili.app.dynamic.v2.OfficialAccountsReply>(
                service, METHODID_OFFICIAL_ACCOUNTS)))
        .addMethod(
          getOfficialDynamicsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.OfficialDynamicsReq,
              bilibili.app.dynamic.v2.OfficialDynamicsReply>(
                service, METHODID_OFFICIAL_DYNAMICS)))
        .addMethod(
          getReactionListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.ReactionListReq,
              bilibili.app.dynamic.v2.ReactionListReply>(
                service, METHODID_REACTION_LIST)))
        .addMethod(
          getRepostListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.RepostListReq,
              bilibili.app.dynamic.v2.RepostListRsp>(
                service, METHODID_REPOST_LIST)))
        .addMethod(
          getSchoolRecommendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.SchoolRecommendReq,
              bilibili.app.dynamic.v2.SchoolRecommendReply>(
                service, METHODID_SCHOOL_RECOMMEND)))
        .addMethod(
          getSchoolSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.SchoolSearchReq,
              bilibili.app.dynamic.v2.SchoolSearchReply>(
                service, METHODID_SCHOOL_SEARCH)))
        .addMethod(
          getSetDecisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.SetDecisionReq,
              bilibili.app.dynamic.v2.NoReply>(
                service, METHODID_SET_DECISION)))
        .addMethod(
          getSetRecentCampusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.SetRecentCampusReq,
              bilibili.app.dynamic.v2.NoReply>(
                service, METHODID_SET_RECENT_CAMPUS)))
        .addMethod(
          getSubscribeCampusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.SubscribeCampusReq,
              bilibili.app.dynamic.v2.NoReply>(
                service, METHODID_SUBSCRIBE_CAMPUS)))
        .addMethod(
          getTopicListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.TopicListReq,
              bilibili.app.dynamic.v2.TopicListReply>(
                service, METHODID_TOPIC_LIST)))
        .addMethod(
          getTopicSquareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.TopicSquareReq,
              bilibili.app.dynamic.v2.TopicSquareReply>(
                service, METHODID_TOPIC_SQUARE)))
        .addMethod(
          getUnfollowMatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.UnfollowMatchReq,
              bilibili.app.dynamic.v2.NoReply>(
                service, METHODID_UNFOLLOW_MATCH)))
        .addMethod(
          getUpdateTabSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v2.UpdateTabSettingReq,
              bilibili.app.dynamic.v2.NoReply>(
                service, METHODID_UPDATE_TAB_SETTING)))
        .build();
  }

  private static abstract class DynamicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DynamicBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Dynamic");
    }
  }

  private static final class DynamicFileDescriptorSupplier
      extends DynamicBaseDescriptorSupplier {
    DynamicFileDescriptorSupplier() {}
  }

  private static final class DynamicMethodDescriptorSupplier
      extends DynamicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DynamicMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DynamicGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DynamicFileDescriptorSupplier())
              .addMethod(getAlumniDynamicsMethod())
              .addMethod(getCampusBillBoardMethod())
              .addMethod(getCampusEntryTabMethod())
              .addMethod(getCampusFeedbackMethod())
              .addMethod(getCampusHomePagesMethod())
              .addMethod(getCampusMateLikeListMethod())
              .addMethod(getCampusMngDetailMethod())
              .addMethod(getCampusMngQuizOperateMethod())
              .addMethod(getCampusMngSubmitMethod())
              .addMethod(getCampusRcmdMethod())
              .addMethod(getCampusRcmdFeedMethod())
              .addMethod(getCampusRecommendMethod())
              .addMethod(getCampusRedDotMethod())
              .addMethod(getCampusSquareMethod())
              .addMethod(getCampusTopicRcmdFeedMethod())
              .addMethod(getDynAdditionCommonFollowMethod())
              .addMethod(getDynAllMethod())
              .addMethod(getDynAllPersonalMethod())
              .addMethod(getDynAllUpdOffsetMethod())
              .addMethod(getDynDetailMethod())
              .addMethod(getDynDetailsMethod())
              .addMethod(getDynFakeCardMethod())
              .addMethod(getDynFriendMethod())
              .addMethod(getDynLightMethod())
              .addMethod(getDynMixUpListViewMoreMethod())
              .addMethod(getDynRcmdUpExchangeMethod())
              .addMethod(getDynSearchMethod())
              .addMethod(getDynServerDetailsMethod())
              .addMethod(getDynSpaceMethod())
              .addMethod(getDynSpaceSearchDetailsMethod())
              .addMethod(getDynTabMethod())
              .addMethod(getDynThumbMethod())
              .addMethod(getDynUnLoginRcmdMethod())
              .addMethod(getDynVideoMethod())
              .addMethod(getDynVideoPersonalMethod())
              .addMethod(getDynVideoUpdOffsetMethod())
              .addMethod(getDynVoteMethod())
              .addMethod(getFeedFilterMethod())
              .addMethod(getFetchTabSettingMethod())
              .addMethod(getHomeSubscribeMethod())
              .addMethod(getLbsPoiMethod())
              .addMethod(getLegacyTopicFeedMethod())
              .addMethod(getLikeListMethod())
              .addMethod(getOfficialAccountsMethod())
              .addMethod(getOfficialDynamicsMethod())
              .addMethod(getReactionListMethod())
              .addMethod(getRepostListMethod())
              .addMethod(getSchoolRecommendMethod())
              .addMethod(getSchoolSearchMethod())
              .addMethod(getSetDecisionMethod())
              .addMethod(getSetRecentCampusMethod())
              .addMethod(getSubscribeCampusMethod())
              .addMethod(getTopicListMethod())
              .addMethod(getTopicSquareMethod())
              .addMethod(getUnfollowMatchMethod())
              .addMethod(getUpdateTabSettingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
