package bilibili.main.community.reply.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 评论区
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/main/community/reply/v1/reply.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReplyGrpc {

  private ReplyGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.main.community.reply.v1.Reply";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply> getMainListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MainList",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply> getMainListMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq, bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply> getMainListMethod;
    if ((getMainListMethod = ReplyGrpc.getMainListMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getMainListMethod = ReplyGrpc.getMainListMethod) == null) {
          ReplyGrpc.getMainListMethod = getMainListMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq, bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MainList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("MainList"))
              .build();
        }
      }
    }
    return getMainListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply> getDetailListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetailList",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply> getDetailListMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq, bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply> getDetailListMethod;
    if ((getDetailListMethod = ReplyGrpc.getDetailListMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getDetailListMethod = ReplyGrpc.getDetailListMethod) == null) {
          ReplyGrpc.getDetailListMethod = getDetailListMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq, bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetailList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("DetailList"))
              .build();
        }
      }
    }
    return getDetailListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply> getDialogListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DialogList",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply> getDialogListMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq, bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply> getDialogListMethod;
    if ((getDialogListMethod = ReplyGrpc.getDialogListMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getDialogListMethod = ReplyGrpc.getDialogListMethod) == null) {
          ReplyGrpc.getDialogListMethod = getDialogListMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq, bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DialogList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("DialogList"))
              .build();
        }
      }
    }
    return getDialogListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply> getPreviewListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreviewList",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply> getPreviewListMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq, bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply> getPreviewListMethod;
    if ((getPreviewListMethod = ReplyGrpc.getPreviewListMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getPreviewListMethod = ReplyGrpc.getPreviewListMethod) == null) {
          ReplyGrpc.getPreviewListMethod = getPreviewListMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq, bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreviewList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("PreviewList"))
              .build();
        }
      }
    }
    return getPreviewListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply> getSearchItemPreHookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchItemPreHook",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply> getSearchItemPreHookMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq, bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply> getSearchItemPreHookMethod;
    if ((getSearchItemPreHookMethod = ReplyGrpc.getSearchItemPreHookMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getSearchItemPreHookMethod = ReplyGrpc.getSearchItemPreHookMethod) == null) {
          ReplyGrpc.getSearchItemPreHookMethod = getSearchItemPreHookMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq, bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchItemPreHook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("SearchItemPreHook"))
              .build();
        }
      }
    }
    return getSearchItemPreHookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply> getSearchItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchItem",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply> getSearchItemMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq, bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply> getSearchItemMethod;
    if ((getSearchItemMethod = ReplyGrpc.getSearchItemMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getSearchItemMethod = ReplyGrpc.getSearchItemMethod) == null) {
          ReplyGrpc.getSearchItemMethod = getSearchItemMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq, bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("SearchItem"))
              .build();
        }
      }
    }
    return getSearchItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply> getAtSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AtSearch",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply> getAtSearchMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq, bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply> getAtSearchMethod;
    if ((getAtSearchMethod = ReplyGrpc.getAtSearchMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getAtSearchMethod = ReplyGrpc.getAtSearchMethod) == null) {
          ReplyGrpc.getAtSearchMethod = getAtSearchMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq, bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AtSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("AtSearch"))
              .build();
        }
      }
    }
    return getAtSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply> getReplyInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplyInfo",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply> getReplyInfoMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq, bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply> getReplyInfoMethod;
    if ((getReplyInfoMethod = ReplyGrpc.getReplyInfoMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getReplyInfoMethod = ReplyGrpc.getReplyInfoMethod) == null) {
          ReplyGrpc.getReplyInfoMethod = getReplyInfoMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq, bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplyInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("ReplyInfo"))
              .build();
        }
      }
    }
    return getReplyInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply> getUserCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserCallback",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply> getUserCallbackMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq, bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply> getUserCallbackMethod;
    if ((getUserCallbackMethod = ReplyGrpc.getUserCallbackMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getUserCallbackMethod = ReplyGrpc.getUserCallbackMethod) == null) {
          ReplyGrpc.getUserCallbackMethod = getUserCallbackMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq, bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("UserCallback"))
              .build();
        }
      }
    }
    return getUserCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp> getShareRepliesInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShareRepliesInfo",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp> getShareRepliesInfoMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq, bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp> getShareRepliesInfoMethod;
    if ((getShareRepliesInfoMethod = ReplyGrpc.getShareRepliesInfoMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getShareRepliesInfoMethod = ReplyGrpc.getShareRepliesInfoMethod) == null) {
          ReplyGrpc.getShareRepliesInfoMethod = getShareRepliesInfoMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq, bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShareRepliesInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("ShareRepliesInfo"))
              .build();
        }
      }
    }
    return getShareRepliesInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp> getSuggestEmotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestEmotes",
      requestType = bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq.class,
      responseType = bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq,
      bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp> getSuggestEmotesMethod() {
    io.grpc.MethodDescriptor<bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq, bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp> getSuggestEmotesMethod;
    if ((getSuggestEmotesMethod = ReplyGrpc.getSuggestEmotesMethod) == null) {
      synchronized (ReplyGrpc.class) {
        if ((getSuggestEmotesMethod = ReplyGrpc.getSuggestEmotesMethod) == null) {
          ReplyGrpc.getSuggestEmotesMethod = getSuggestEmotesMethod =
              io.grpc.MethodDescriptor.<bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq, bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestEmotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp.getDefaultInstance()))
              .setSchemaDescriptor(new ReplyMethodDescriptorSupplier("SuggestEmotes"))
              .build();
        }
      }
    }
    return getSuggestEmotesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReplyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReplyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReplyStub>() {
        @java.lang.Override
        public ReplyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReplyStub(channel, callOptions);
        }
      };
    return ReplyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReplyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReplyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReplyBlockingStub>() {
        @java.lang.Override
        public ReplyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReplyBlockingStub(channel, callOptions);
        }
      };
    return ReplyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReplyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReplyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReplyFutureStub>() {
        @java.lang.Override
        public ReplyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReplyFutureStub(channel, callOptions);
        }
      };
    return ReplyFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 评论区
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 主评论列表接口
     * </pre>
     */
    default void mainList(bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMainListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 二级评论明细接口
     * </pre>
     */
    default void detailList(bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 对话评论树接口
     * </pre>
     */
    default void dialogList(bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDialogListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 评论预览接口
     * </pre>
     */
    default void previewList(bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreviewListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 评论搜索item前置发布接口
     * </pre>
     */
    default void searchItemPreHook(bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchItemPreHookMethod(), responseObserver);
    }

    /**
     * <pre>
     * 评论搜索插入项目接口
     * </pre>
     */
    default void searchItem(bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * 评论at用户搜索接口
     * </pre>
     */
    default void atSearch(bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAtSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询单条评论接口
     * </pre>
     */
    default void replyInfo(bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplyInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 用户回调上报接口
     * </pre>
     */
    default void userCallback(bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserCallbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * 评论分享材料接口
     * </pre>
     */
    default void shareRepliesInfo(bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShareRepliesInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 评论表情推荐列表接口
     * </pre>
     */
    default void suggestEmotes(bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestEmotesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Reply.
   * <pre>
   * 评论区
   * </pre>
   */
  public static abstract class ReplyImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReplyGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Reply.
   * <pre>
   * 评论区
   * </pre>
   */
  public static final class ReplyStub
      extends io.grpc.stub.AbstractAsyncStub<ReplyStub> {
    private ReplyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReplyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReplyStub(channel, callOptions);
    }

    /**
     * <pre>
     * 主评论列表接口
     * </pre>
     */
    public void mainList(bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMainListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 二级评论明细接口
     * </pre>
     */
    public void detailList(bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 对话评论树接口
     * </pre>
     */
    public void dialogList(bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDialogListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 评论预览接口
     * </pre>
     */
    public void previewList(bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreviewListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 评论搜索item前置发布接口
     * </pre>
     */
    public void searchItemPreHook(bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchItemPreHookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 评论搜索插入项目接口
     * </pre>
     */
    public void searchItem(bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 评论at用户搜索接口
     * </pre>
     */
    public void atSearch(bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAtSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询单条评论接口
     * </pre>
     */
    public void replyInfo(bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplyInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户回调上报接口
     * </pre>
     */
    public void userCallback(bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 评论分享材料接口
     * </pre>
     */
    public void shareRepliesInfo(bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShareRepliesInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 评论表情推荐列表接口
     * </pre>
     */
    public void suggestEmotes(bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq request,
        io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestEmotesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Reply.
   * <pre>
   * 评论区
   * </pre>
   */
  public static final class ReplyBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReplyBlockingStub> {
    private ReplyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReplyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReplyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 主评论列表接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply mainList(bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMainListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 二级评论明细接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply detailList(bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 对话评论树接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply dialogList(bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDialogListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 评论预览接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply previewList(bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreviewListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 评论搜索item前置发布接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply searchItemPreHook(bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchItemPreHookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 评论搜索插入项目接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply searchItem(bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 评论at用户搜索接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply atSearch(bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAtSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询单条评论接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply replyInfo(bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplyInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户回调上报接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply userCallback(bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserCallbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 评论分享材料接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp shareRepliesInfo(bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShareRepliesInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 评论表情推荐列表接口
     * </pre>
     */
    public bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp suggestEmotes(bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestEmotesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Reply.
   * <pre>
   * 评论区
   * </pre>
   */
  public static final class ReplyFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReplyFutureStub> {
    private ReplyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReplyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReplyFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 主评论列表接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply> mainList(
        bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMainListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 二级评论明细接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply> detailList(
        bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 对话评论树接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply> dialogList(
        bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDialogListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 评论预览接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply> previewList(
        bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreviewListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 评论搜索item前置发布接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply> searchItemPreHook(
        bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchItemPreHookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 评论搜索插入项目接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply> searchItem(
        bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 评论at用户搜索接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply> atSearch(
        bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAtSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询单条评论接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply> replyInfo(
        bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplyInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户回调上报接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply> userCallback(
        bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserCallbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 评论分享材料接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp> shareRepliesInfo(
        bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShareRepliesInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 评论表情推荐列表接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp> suggestEmotes(
        bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestEmotesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MAIN_LIST = 0;
  private static final int METHODID_DETAIL_LIST = 1;
  private static final int METHODID_DIALOG_LIST = 2;
  private static final int METHODID_PREVIEW_LIST = 3;
  private static final int METHODID_SEARCH_ITEM_PRE_HOOK = 4;
  private static final int METHODID_SEARCH_ITEM = 5;
  private static final int METHODID_AT_SEARCH = 6;
  private static final int METHODID_REPLY_INFO = 7;
  private static final int METHODID_USER_CALLBACK = 8;
  private static final int METHODID_SHARE_REPLIES_INFO = 9;
  private static final int METHODID_SUGGEST_EMOTES = 10;

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
        case METHODID_MAIN_LIST:
          serviceImpl.mainList((bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply>) responseObserver);
          break;
        case METHODID_DETAIL_LIST:
          serviceImpl.detailList((bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply>) responseObserver);
          break;
        case METHODID_DIALOG_LIST:
          serviceImpl.dialogList((bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply>) responseObserver);
          break;
        case METHODID_PREVIEW_LIST:
          serviceImpl.previewList((bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply>) responseObserver);
          break;
        case METHODID_SEARCH_ITEM_PRE_HOOK:
          serviceImpl.searchItemPreHook((bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply>) responseObserver);
          break;
        case METHODID_SEARCH_ITEM:
          serviceImpl.searchItem((bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply>) responseObserver);
          break;
        case METHODID_AT_SEARCH:
          serviceImpl.atSearch((bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply>) responseObserver);
          break;
        case METHODID_REPLY_INFO:
          serviceImpl.replyInfo((bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply>) responseObserver);
          break;
        case METHODID_USER_CALLBACK:
          serviceImpl.userCallback((bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply>) responseObserver);
          break;
        case METHODID_SHARE_REPLIES_INFO:
          serviceImpl.shareRepliesInfo((bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp>) responseObserver);
          break;
        case METHODID_SUGGEST_EMOTES:
          serviceImpl.suggestEmotes((bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq) request,
              (io.grpc.stub.StreamObserver<bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp>) responseObserver);
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
          getMainListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.MainListReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.MainListReply>(
                service, METHODID_MAIN_LIST)))
        .addMethod(
          getDetailListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.DetailListReply>(
                service, METHODID_DETAIL_LIST)))
        .addMethod(
          getDialogListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.DialogListReply>(
                service, METHODID_DIALOG_LIST)))
        .addMethod(
          getPreviewListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.PreviewListReply>(
                service, METHODID_PREVIEW_LIST)))
        .addMethod(
          getSearchItemPreHookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemPreHookReply>(
                service, METHODID_SEARCH_ITEM_PRE_HOOK)))
        .addMethod(
          getSearchItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.SearchItemReply>(
                service, METHODID_SEARCH_ITEM)))
        .addMethod(
          getAtSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.AtSearchReply>(
                service, METHODID_AT_SEARCH)))
        .addMethod(
          getReplyInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.ReplyInfoReply>(
                service, METHODID_REPLY_INFO)))
        .addMethod(
          getUserCallbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.UserCallbackReply>(
                service, METHODID_USER_CALLBACK)))
        .addMethod(
          getShareRepliesInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.ShareRepliesInfoResp>(
                service, METHODID_SHARE_REPLIES_INFO)))
        .addMethod(
          getSuggestEmotesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesReq,
              bilibili.main.community.reply.v1.ReplyRpcProto.SuggestEmotesResp>(
                service, METHODID_SUGGEST_EMOTES)))
        .build();
  }

  private static abstract class ReplyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReplyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.main.community.reply.v1.ReplyRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Reply");
    }
  }

  private static final class ReplyFileDescriptorSupplier
      extends ReplyBaseDescriptorSupplier {
    ReplyFileDescriptorSupplier() {}
  }

  private static final class ReplyMethodDescriptorSupplier
      extends ReplyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReplyMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ReplyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReplyFileDescriptorSupplier())
              .addMethod(getMainListMethod())
              .addMethod(getDetailListMethod())
              .addMethod(getDialogListMethod())
              .addMethod(getPreviewListMethod())
              .addMethod(getSearchItemPreHookMethod())
              .addMethod(getSearchItemMethod())
              .addMethod(getAtSearchMethod())
              .addMethod(getReplyInfoMethod())
              .addMethod(getUserCallbackMethod())
              .addMethod(getShareRepliesInfoMethod())
              .addMethod(getSuggestEmotesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
