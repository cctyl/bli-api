package bilibili.main.dynamic.feed.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/dynamic/interfaces/feed/v1/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedGrpc {

  private FeedGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.main.dynamic.feed.v1.Feed";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq,
      bilibili.dynamic.DynamicRpcProto.CreateCheckResp> getCreateInitCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInitCheck",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq.class,
      responseType = bilibili.dynamic.DynamicRpcProto.CreateCheckResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq,
      bilibili.dynamic.DynamicRpcProto.CreateCheckResp> getCreateInitCheckMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq, bilibili.dynamic.DynamicRpcProto.CreateCheckResp> getCreateInitCheckMethod;
    if ((getCreateInitCheckMethod = FeedGrpc.getCreateInitCheckMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getCreateInitCheckMethod = FeedGrpc.getCreateInitCheckMethod) == null) {
          FeedGrpc.getCreateInitCheckMethod = getCreateInitCheckMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq, bilibili.dynamic.DynamicRpcProto.CreateCheckResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInitCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.dynamic.DynamicRpcProto.CreateCheckResp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("CreateInitCheck"))
              .build();
        }
      }
    }
    return getCreateInitCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp> getSubmitCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitCheck",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq.class,
      responseType = bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp> getSubmitCheckMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp> getSubmitCheckMethod;
    if ((getSubmitCheckMethod = FeedGrpc.getSubmitCheckMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getSubmitCheckMethod = FeedGrpc.getSubmitCheckMethod) == null) {
          FeedGrpc.getSubmitCheckMethod = getSubmitCheckMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("SubmitCheck"))
              .build();
        }
      }
    }
    return getSubmitCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq,
      bilibili.dynamic.DynamicRpcProto.CreateResp> getCreateDynMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDyn",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq.class,
      responseType = bilibili.dynamic.DynamicRpcProto.CreateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq,
      bilibili.dynamic.DynamicRpcProto.CreateResp> getCreateDynMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq, bilibili.dynamic.DynamicRpcProto.CreateResp> getCreateDynMethod;
    if ((getCreateDynMethod = FeedGrpc.getCreateDynMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getCreateDynMethod = FeedGrpc.getCreateDynMethod) == null) {
          FeedGrpc.getCreateDynMethod = getCreateDynMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq, bilibili.dynamic.DynamicRpcProto.CreateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDyn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.dynamic.DynamicRpcProto.CreateResp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("CreateDyn"))
              .build();
        }
      }
    }
    return getCreateDynMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.GetUidByNameReq,
      bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp> getGetUidByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUidByName",
      requestType = bilibili.dynamic.DynamicRpcProto.GetUidByNameReq.class,
      responseType = bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.GetUidByNameReq,
      bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp> getGetUidByNameMethod() {
    io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.GetUidByNameReq, bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp> getGetUidByNameMethod;
    if ((getGetUidByNameMethod = FeedGrpc.getGetUidByNameMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getGetUidByNameMethod = FeedGrpc.getGetUidByNameMethod) == null) {
          FeedGrpc.getGetUidByNameMethod = getGetUidByNameMethod =
              io.grpc.MethodDescriptor.<bilibili.dynamic.DynamicRpcProto.GetUidByNameReq, bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUidByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.dynamic.DynamicRpcProto.GetUidByNameReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("GetUidByName"))
              .build();
        }
      }
    }
    return getGetUidByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.AtListReq,
      bilibili.dynamic.DynamicRpcProto.AtListRsp> getAtListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AtList",
      requestType = bilibili.dynamic.DynamicRpcProto.AtListReq.class,
      responseType = bilibili.dynamic.DynamicRpcProto.AtListRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.AtListReq,
      bilibili.dynamic.DynamicRpcProto.AtListRsp> getAtListMethod() {
    io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.AtListReq, bilibili.dynamic.DynamicRpcProto.AtListRsp> getAtListMethod;
    if ((getAtListMethod = FeedGrpc.getAtListMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getAtListMethod = FeedGrpc.getAtListMethod) == null) {
          FeedGrpc.getAtListMethod = getAtListMethod =
              io.grpc.MethodDescriptor.<bilibili.dynamic.DynamicRpcProto.AtListReq, bilibili.dynamic.DynamicRpcProto.AtListRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AtList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.dynamic.DynamicRpcProto.AtListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.dynamic.DynamicRpcProto.AtListRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("AtList"))
              .build();
        }
      }
    }
    return getAtListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.AtSearchReq,
      bilibili.dynamic.DynamicRpcProto.AtListRsp> getAtSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AtSearch",
      requestType = bilibili.dynamic.DynamicRpcProto.AtSearchReq.class,
      responseType = bilibili.dynamic.DynamicRpcProto.AtListRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.AtSearchReq,
      bilibili.dynamic.DynamicRpcProto.AtListRsp> getAtSearchMethod() {
    io.grpc.MethodDescriptor<bilibili.dynamic.DynamicRpcProto.AtSearchReq, bilibili.dynamic.DynamicRpcProto.AtListRsp> getAtSearchMethod;
    if ((getAtSearchMethod = FeedGrpc.getAtSearchMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getAtSearchMethod = FeedGrpc.getAtSearchMethod) == null) {
          FeedGrpc.getAtSearchMethod = getAtSearchMethod =
              io.grpc.MethodDescriptor.<bilibili.dynamic.DynamicRpcProto.AtSearchReq, bilibili.dynamic.DynamicRpcProto.AtListRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AtSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.dynamic.DynamicRpcProto.AtSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.dynamic.DynamicRpcProto.AtListRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("AtSearch"))
              .build();
        }
      }
    }
    return getAtSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp> getReserveButtonClickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveButtonClick",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq.class,
      responseType = bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp> getReserveButtonClickMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp> getReserveButtonClickMethod;
    if ((getReserveButtonClickMethod = FeedGrpc.getReserveButtonClickMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getReserveButtonClickMethod = FeedGrpc.getReserveButtonClickMethod) == null) {
          FeedGrpc.getReserveButtonClickMethod = getReserveButtonClickMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReserveButtonClick"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("ReserveButtonClick"))
              .build();
        }
      }
    }
    return getReserveButtonClickMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp> getCreatePlusButtonClickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePlusButtonClick",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq.class,
      responseType = bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp> getCreatePlusButtonClickMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp> getCreatePlusButtonClickMethod;
    if ((getCreatePlusButtonClickMethod = FeedGrpc.getCreatePlusButtonClickMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getCreatePlusButtonClickMethod = FeedGrpc.getCreatePlusButtonClickMethod) == null) {
          FeedGrpc.getCreatePlusButtonClickMethod = getCreatePlusButtonClickMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePlusButtonClick"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("CreatePlusButtonClick"))
              .build();
        }
      }
    }
    return getCreatePlusButtonClickMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp> getHotSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HotSearch",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq.class,
      responseType = bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp> getHotSearchMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp> getHotSearchMethod;
    if ((getHotSearchMethod = FeedGrpc.getHotSearchMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getHotSearchMethod = FeedGrpc.getHotSearchMethod) == null) {
          FeedGrpc.getHotSearchMethod = getHotSearchMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HotSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("HotSearch"))
              .build();
        }
      }
    }
    return getHotSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp> getSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suggest",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq.class,
      responseType = bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp> getSuggestMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp> getSuggestMethod;
    if ((getSuggestMethod = FeedGrpc.getSuggestMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getSuggestMethod = FeedGrpc.getSuggestMethod) == null) {
          FeedGrpc.getSuggestMethod = getSuggestMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Suggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("Suggest"))
              .build();
        }
      }
    }
    return getSuggestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp> getDynamicButtonClickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynamicButtonClick",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq.class,
      responseType = bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp> getDynamicButtonClickMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp> getDynamicButtonClickMethod;
    if ((getDynamicButtonClickMethod = FeedGrpc.getDynamicButtonClickMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getDynamicButtonClickMethod = FeedGrpc.getDynamicButtonClickMethod) == null) {
          FeedGrpc.getDynamicButtonClickMethod = getDynamicButtonClickMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynamicButtonClick"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("DynamicButtonClick"))
              .build();
        }
      }
    }
    return getDynamicButtonClickMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp> getCreatePermissionButtonClickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePermissionButtonClick",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq.class,
      responseType = bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp> getCreatePermissionButtonClickMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp> getCreatePermissionButtonClickMethod;
    if ((getCreatePermissionButtonClickMethod = FeedGrpc.getCreatePermissionButtonClickMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getCreatePermissionButtonClickMethod = FeedGrpc.getCreatePermissionButtonClickMethod) == null) {
          FeedGrpc.getCreatePermissionButtonClickMethod = getCreatePermissionButtonClickMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePermissionButtonClick"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("CreatePermissionButtonClick"))
              .build();
        }
      }
    }
    return getCreatePermissionButtonClickMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp> getCreatePageInfosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePageInfos",
      requestType = bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq.class,
      responseType = bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq,
      bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp> getCreatePageInfosMethod() {
    io.grpc.MethodDescriptor<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp> getCreatePageInfosMethod;
    if ((getCreatePageInfosMethod = FeedGrpc.getCreatePageInfosMethod) == null) {
      synchronized (FeedGrpc.class) {
        if ((getCreatePageInfosMethod = FeedGrpc.getCreatePageInfosMethod) == null) {
          FeedGrpc.getCreatePageInfosMethod = getCreatePageInfosMethod =
              io.grpc.MethodDescriptor.<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq, bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePageInfos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMethodDescriptorSupplier("CreatePageInfos"))
              .build();
        }
      }
    }
    return getCreatePageInfosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedStub>() {
        @java.lang.Override
        public FeedStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedStub(channel, callOptions);
        }
      };
    return FeedStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedBlockingStub>() {
        @java.lang.Override
        public FeedBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedBlockingStub(channel, callOptions);
        }
      };
    return FeedBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedFutureStub>() {
        @java.lang.Override
        public FeedFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedFutureStub(channel, callOptions);
        }
      };
    return FeedFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 发布页预校验
     * </pre>
     */
    default void createInitCheck(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.CreateCheckResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInitCheckMethod(), responseObserver);
    }

    /**
     */
    default void submitCheck(bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建动态
     * </pre>
     */
    default void createDyn(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.CreateResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDynMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据name取uid
     * </pre>
     */
    default void getUidByName(bilibili.dynamic.DynamicRpcProto.GetUidByNameReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUidByNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * at用户推荐列表
     * </pre>
     */
    default void atList(bilibili.dynamic.DynamicRpcProto.AtListReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.AtListRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAtListMethod(), responseObserver);
    }

    /**
     * <pre>
     * at用户搜索列表
     * </pre>
     */
    default void atSearch(bilibili.dynamic.DynamicRpcProto.AtSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.AtListRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAtSearchMethod(), responseObserver);
    }

    /**
     */
    default void reserveButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveButtonClickMethod(), responseObserver);
    }

    /**
     */
    default void createPlusButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePlusButtonClickMethod(), responseObserver);
    }

    /**
     */
    default void hotSearch(bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHotSearchMethod(), responseObserver);
    }

    /**
     */
    default void suggest(bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestMethod(), responseObserver);
    }

    /**
     */
    default void dynamicButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynamicButtonClickMethod(), responseObserver);
    }

    /**
     */
    default void createPermissionButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePermissionButtonClickMethod(), responseObserver);
    }

    /**
     */
    default void createPageInfos(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePageInfosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Feed.
   */
  public static abstract class FeedImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeedGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Feed.
   */
  public static final class FeedStub
      extends io.grpc.stub.AbstractAsyncStub<FeedStub> {
    private FeedStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发布页预校验
     * </pre>
     */
    public void createInitCheck(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.CreateCheckResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInitCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitCheck(bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建动态
     * </pre>
     */
    public void createDyn(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.CreateResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDynMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据name取uid
     * </pre>
     */
    public void getUidByName(bilibili.dynamic.DynamicRpcProto.GetUidByNameReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUidByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * at用户推荐列表
     * </pre>
     */
    public void atList(bilibili.dynamic.DynamicRpcProto.AtListReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.AtListRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAtListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * at用户搜索列表
     * </pre>
     */
    public void atSearch(bilibili.dynamic.DynamicRpcProto.AtSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.AtListRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAtSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reserveButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveButtonClickMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPlusButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePlusButtonClickMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hotSearch(bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHotSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void suggest(bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dynamicButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynamicButtonClickMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPermissionButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePermissionButtonClickMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPageInfos(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq request,
        io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePageInfosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Feed.
   */
  public static final class FeedBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeedBlockingStub> {
    private FeedBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发布页预校验
     * </pre>
     */
    public bilibili.dynamic.DynamicRpcProto.CreateCheckResp createInitCheck(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInitCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp submitCheck(bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建动态
     * </pre>
     */
    public bilibili.dynamic.DynamicRpcProto.CreateResp createDyn(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDynMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据name取uid
     * </pre>
     */
    public bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp getUidByName(bilibili.dynamic.DynamicRpcProto.GetUidByNameReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUidByNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * at用户推荐列表
     * </pre>
     */
    public bilibili.dynamic.DynamicRpcProto.AtListRsp atList(bilibili.dynamic.DynamicRpcProto.AtListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAtListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * at用户搜索列表
     * </pre>
     */
    public bilibili.dynamic.DynamicRpcProto.AtListRsp atSearch(bilibili.dynamic.DynamicRpcProto.AtSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAtSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp reserveButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveButtonClickMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp createPlusButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePlusButtonClickMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp hotSearch(bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHotSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp suggest(bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp dynamicButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynamicButtonClickMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp createPermissionButtonClick(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePermissionButtonClickMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp createPageInfos(bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePageInfosMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Feed.
   */
  public static final class FeedFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeedFutureStub> {
    private FeedFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发布页预校验
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.dynamic.DynamicRpcProto.CreateCheckResp> createInitCheck(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInitCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp> submitCheck(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建动态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.dynamic.DynamicRpcProto.CreateResp> createDyn(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDynMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据name取uid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp> getUidByName(
        bilibili.dynamic.DynamicRpcProto.GetUidByNameReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUidByNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * at用户推荐列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.dynamic.DynamicRpcProto.AtListRsp> atList(
        bilibili.dynamic.DynamicRpcProto.AtListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAtListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * at用户搜索列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.dynamic.DynamicRpcProto.AtListRsp> atSearch(
        bilibili.dynamic.DynamicRpcProto.AtSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAtSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp> reserveButtonClick(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveButtonClickMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp> createPlusButtonClick(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePlusButtonClickMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp> hotSearch(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHotSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp> suggest(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp> dynamicButtonClick(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynamicButtonClickMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp> createPermissionButtonClick(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePermissionButtonClickMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp> createPageInfos(
        bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePageInfosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INIT_CHECK = 0;
  private static final int METHODID_SUBMIT_CHECK = 1;
  private static final int METHODID_CREATE_DYN = 2;
  private static final int METHODID_GET_UID_BY_NAME = 3;
  private static final int METHODID_AT_LIST = 4;
  private static final int METHODID_AT_SEARCH = 5;
  private static final int METHODID_RESERVE_BUTTON_CLICK = 6;
  private static final int METHODID_CREATE_PLUS_BUTTON_CLICK = 7;
  private static final int METHODID_HOT_SEARCH = 8;
  private static final int METHODID_SUGGEST = 9;
  private static final int METHODID_DYNAMIC_BUTTON_CLICK = 10;
  private static final int METHODID_CREATE_PERMISSION_BUTTON_CLICK = 11;
  private static final int METHODID_CREATE_PAGE_INFOS = 12;

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
        case METHODID_CREATE_INIT_CHECK:
          serviceImpl.createInitCheck((bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq) request,
              (io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.CreateCheckResp>) responseObserver);
          break;
        case METHODID_SUBMIT_CHECK:
          serviceImpl.submitCheck((bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp>) responseObserver);
          break;
        case METHODID_CREATE_DYN:
          serviceImpl.createDyn((bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq) request,
              (io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.CreateResp>) responseObserver);
          break;
        case METHODID_GET_UID_BY_NAME:
          serviceImpl.getUidByName((bilibili.dynamic.DynamicRpcProto.GetUidByNameReq) request,
              (io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp>) responseObserver);
          break;
        case METHODID_AT_LIST:
          serviceImpl.atList((bilibili.dynamic.DynamicRpcProto.AtListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.AtListRsp>) responseObserver);
          break;
        case METHODID_AT_SEARCH:
          serviceImpl.atSearch((bilibili.dynamic.DynamicRpcProto.AtSearchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.dynamic.DynamicRpcProto.AtListRsp>) responseObserver);
          break;
        case METHODID_RESERVE_BUTTON_CLICK:
          serviceImpl.reserveButtonClick((bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp>) responseObserver);
          break;
        case METHODID_CREATE_PLUS_BUTTON_CLICK:
          serviceImpl.createPlusButtonClick((bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp>) responseObserver);
          break;
        case METHODID_HOT_SEARCH:
          serviceImpl.hotSearch((bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp>) responseObserver);
          break;
        case METHODID_SUGGEST:
          serviceImpl.suggest((bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp>) responseObserver);
          break;
        case METHODID_DYNAMIC_BUTTON_CLICK:
          serviceImpl.dynamicButtonClick((bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp>) responseObserver);
          break;
        case METHODID_CREATE_PERMISSION_BUTTON_CLICK:
          serviceImpl.createPermissionButtonClick((bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp>) responseObserver);
          break;
        case METHODID_CREATE_PAGE_INFOS:
          serviceImpl.createPageInfos((bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp>) responseObserver);
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
          getCreateInitCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateInitCheckReq,
              bilibili.dynamic.DynamicRpcProto.CreateCheckResp>(
                service, METHODID_CREATE_INIT_CHECK)))
        .addMethod(
          getSubmitCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckReq,
              bilibili.main.dynamic.feed.v1.ApiRpcProto.SubmitCheckRsp>(
                service, METHODID_SUBMIT_CHECK)))
        .addMethod(
          getCreateDynMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.CreateDynReq,
              bilibili.dynamic.DynamicRpcProto.CreateResp>(
                service, METHODID_CREATE_DYN)))
        .addMethod(
          getGetUidByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.dynamic.DynamicRpcProto.GetUidByNameReq,
              bilibili.dynamic.DynamicRpcProto.GetUidByNameRsp>(
                service, METHODID_GET_UID_BY_NAME)))
        .addMethod(
          getAtListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.dynamic.DynamicRpcProto.AtListReq,
              bilibili.dynamic.DynamicRpcProto.AtListRsp>(
                service, METHODID_AT_LIST)))
        .addMethod(
          getAtSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.dynamic.DynamicRpcProto.AtSearchReq,
              bilibili.dynamic.DynamicRpcProto.AtListRsp>(
                service, METHODID_AT_SEARCH)))
        .addMethod(
          getReserveButtonClickMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickReq,
              bilibili.main.dynamic.feed.v1.ApiRpcProto.ReserveButtonClickResp>(
                service, METHODID_RESERVE_BUTTON_CLICK)))
        .addMethod(
          getCreatePlusButtonClickMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickReq,
              bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePlusButtonClickRsp>(
                service, METHODID_CREATE_PLUS_BUTTON_CLICK)))
        .addMethod(
          getHotSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchReq,
              bilibili.main.dynamic.feed.v1.ApiRpcProto.HotSearchRsp>(
                service, METHODID_HOT_SEARCH)))
        .addMethod(
          getSuggestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestReq,
              bilibili.main.dynamic.feed.v1.ApiRpcProto.SuggestRsp>(
                service, METHODID_SUGGEST)))
        .addMethod(
          getDynamicButtonClickMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickReq,
              bilibili.main.dynamic.feed.v1.ApiRpcProto.DynamicButtonClickRsp>(
                service, METHODID_DYNAMIC_BUTTON_CLICK)))
        .addMethod(
          getCreatePermissionButtonClickMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickReq,
              bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePermissionButtonClickRsp>(
                service, METHODID_CREATE_PERMISSION_BUTTON_CLICK)))
        .addMethod(
          getCreatePageInfosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosReq,
              bilibili.main.dynamic.feed.v1.ApiRpcProto.CreatePageInfosRsp>(
                service, METHODID_CREATE_PAGE_INFOS)))
        .build();
  }

  private static abstract class FeedBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.main.dynamic.feed.v1.ApiRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Feed");
    }
  }

  private static final class FeedFileDescriptorSupplier
      extends FeedBaseDescriptorSupplier {
    FeedFileDescriptorSupplier() {}
  }

  private static final class FeedMethodDescriptorSupplier
      extends FeedBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FeedMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FeedGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedFileDescriptorSupplier())
              .addMethod(getCreateInitCheckMethod())
              .addMethod(getSubmitCheckMethod())
              .addMethod(getCreateDynMethod())
              .addMethod(getGetUidByNameMethod())
              .addMethod(getAtListMethod())
              .addMethod(getAtSearchMethod())
              .addMethod(getReserveButtonClickMethod())
              .addMethod(getCreatePlusButtonClickMethod())
              .addMethod(getHotSearchMethod())
              .addMethod(getSuggestMethod())
              .addMethod(getDynamicButtonClickMethod())
              .addMethod(getCreatePermissionButtonClickMethod())
              .addMethod(getCreatePageInfosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
