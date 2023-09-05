package bilibili.im.interfaces.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 私信
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/im/interfaces/v1/im.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImInterfaceGrpc {

  private ImInterfaceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.im.interfaces.v1.ImInterface";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg,
      bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg> getSendMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMsg",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg,
      bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg> getSendMsgMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg, bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg> getSendMsgMethod;
    if ((getSendMsgMethod = ImInterfaceGrpc.getSendMsgMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getSendMsgMethod = ImInterfaceGrpc.getSendMsgMethod) == null) {
          ImInterfaceGrpc.getSendMsgMethod = getSendMsgMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg, bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("SendMsg"))
              .build();
        }
      }
    }
    return getSendMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync,
      bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync> getSyncRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncRelation",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync,
      bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync> getSyncRelationMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync, bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync> getSyncRelationMethod;
    if ((getSyncRelationMethod = ImInterfaceGrpc.getSyncRelationMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getSyncRelationMethod = ImInterfaceGrpc.getSyncRelationMethod) == null) {
          ImInterfaceGrpc.getSyncRelationMethod = getSyncRelationMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync, bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("SyncRelation"))
              .build();
        }
      }
    }
    return getSyncRelationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck,
      bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck> getSyncAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncAck",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck,
      bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck> getSyncAckMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck, bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck> getSyncAckMethod;
    if ((getSyncAckMethod = ImInterfaceGrpc.getSyncAckMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getSyncAckMethod = ImInterfaceGrpc.getSyncAckMethod) == null) {
          ImInterfaceGrpc.getSyncAckMethod = getSyncAckMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck, bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncAck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("SyncAck"))
              .build();
        }
      }
    }
    return getSyncAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> getSyncFetchSessionMsgsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncFetchSessionMsgs",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> getSyncFetchSessionMsgsMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg, bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> getSyncFetchSessionMsgsMethod;
    if ((getSyncFetchSessionMsgsMethod = ImInterfaceGrpc.getSyncFetchSessionMsgsMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getSyncFetchSessionMsgsMethod = ImInterfaceGrpc.getSyncFetchSessionMsgsMethod) == null) {
          ImInterfaceGrpc.getSyncFetchSessionMsgsMethod = getSyncFetchSessionMsgsMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg, bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncFetchSessionMsgs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("SyncFetchSessionMsgs"))
              .build();
        }
      }
    }
    return getSyncFetchSessionMsgsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getGetSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessions",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSessions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getGetSessionsMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions, bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getGetSessionsMethod;
    if ((getGetSessionsMethod = ImInterfaceGrpc.getGetSessionsMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getGetSessionsMethod = ImInterfaceGrpc.getGetSessionsMethod) == null) {
          ImInterfaceGrpc.getGetSessionsMethod = getGetSessionsMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions, bilibili.im.interfaces.v1.ImRpcProto.RspSessions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSessions.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("GetSessions"))
              .build();
        }
      }
    }
    return getGetSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getNewSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewSessions",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSessions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getNewSessionsMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions, bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getNewSessionsMethod;
    if ((getNewSessionsMethod = ImInterfaceGrpc.getNewSessionsMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getNewSessionsMethod = ImInterfaceGrpc.getNewSessionsMethod) == null) {
          ImInterfaceGrpc.getNewSessionsMethod = getNewSessionsMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions, bilibili.im.interfaces.v1.ImRpcProto.RspSessions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSessions.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("NewSessions"))
              .build();
        }
      }
    }
    return getNewSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getAckSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AckSessions",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSessions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getAckSessionsMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions, bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getAckSessionsMethod;
    if ((getAckSessionsMethod = ImInterfaceGrpc.getAckSessionsMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getAckSessionsMethod = ImInterfaceGrpc.getAckSessionsMethod) == null) {
          ImInterfaceGrpc.getAckSessionsMethod = getAckSessionsMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions, bilibili.im.interfaces.v1.ImRpcProto.RspSessions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AckSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSessions.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("AckSessions"))
              .build();
        }
      }
    }
    return getAckSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getUpdateAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAck",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getUpdateAckMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getUpdateAckMethod;
    if ((getUpdateAckMethod = ImInterfaceGrpc.getUpdateAckMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getUpdateAckMethod = ImInterfaceGrpc.getUpdateAckMethod) == null) {
          ImInterfaceGrpc.getUpdateAckMethod = getUpdateAckMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("UpdateAck"))
              .build();
        }
      }
    }
    return getUpdateAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getSetTopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTop",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getSetTopMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getSetTopMethod;
    if ((getSetTopMethod = ImInterfaceGrpc.getSetTopMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getSetTopMethod = ImInterfaceGrpc.getSetTopMethod) == null) {
          ImInterfaceGrpc.getSetTopMethod = getSetTopMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("SetTop"))
              .build();
        }
      }
    }
    return getSetTopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getRemoveSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSession",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getRemoveSessionMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getRemoveSessionMethod;
    if ((getRemoveSessionMethod = ImInterfaceGrpc.getRemoveSessionMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getRemoveSessionMethod = ImInterfaceGrpc.getRemoveSessionMethod) == null) {
          ImInterfaceGrpc.getRemoveSessionMethod = getRemoveSessionMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("RemoveSession"))
              .build();
        }
      }
    }
    return getRemoveSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread,
      bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread> getSingleUnreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SingleUnread",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread,
      bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread> getSingleUnreadMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread, bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread> getSingleUnreadMethod;
    if ((getSingleUnreadMethod = ImInterfaceGrpc.getSingleUnreadMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getSingleUnreadMethod = ImInterfaceGrpc.getSingleUnreadMethod) == null) {
          ImInterfaceGrpc.getSingleUnreadMethod = getSingleUnreadMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread, bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SingleUnread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("SingleUnread"))
              .build();
        }
      }
    }
    return getSingleUnreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.DummyReq,
      bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread> getMyGroupUnreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MyGroupUnread",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.DummyReq.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.DummyReq,
      bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread> getMyGroupUnreadMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.DummyReq, bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread> getMyGroupUnreadMethod;
    if ((getMyGroupUnreadMethod = ImInterfaceGrpc.getMyGroupUnreadMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getMyGroupUnreadMethod = ImInterfaceGrpc.getMyGroupUnreadMethod) == null) {
          ImInterfaceGrpc.getMyGroupUnreadMethod = getMyGroupUnreadMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.DummyReq, bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MyGroupUnread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.DummyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("MyGroupUnread"))
              .build();
        }
      }
    }
    return getMyGroupUnreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.DummyReq,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getUpdateUnflwReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUnflwRead",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.DummyReq.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.DummyReq,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getUpdateUnflwReadMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.DummyReq, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getUpdateUnflwReadMethod;
    if ((getUpdateUnflwReadMethod = ImInterfaceGrpc.getUpdateUnflwReadMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getUpdateUnflwReadMethod = ImInterfaceGrpc.getUpdateUnflwReadMethod) == null) {
          ImInterfaceGrpc.getUpdateUnflwReadMethod = getUpdateUnflwReadMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.DummyReq, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUnflwRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.DummyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("UpdateUnflwRead"))
              .build();
        }
      }
    }
    return getUpdateUnflwReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> getGroupAssisMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupAssisMsg",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> getGroupAssisMsgMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg, bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> getGroupAssisMsgMethod;
    if ((getGroupAssisMsgMethod = ImInterfaceGrpc.getGroupAssisMsgMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getGroupAssisMsgMethod = ImInterfaceGrpc.getGroupAssisMsgMethod) == null) {
          ImInterfaceGrpc.getGroupAssisMsgMethod = getGroupAssisMsgMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg, bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupAssisMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("GroupAssisMsg"))
              .build();
        }
      }
    }
    return getGroupAssisMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getAckAssisMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AckAssisMsg",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getAckAssisMsgMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getAckAssisMsgMethod;
    if ((getAckAssisMsgMethod = ImInterfaceGrpc.getAckAssisMsgMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getAckAssisMsgMethod = ImInterfaceGrpc.getAckAssisMsgMethod) == null) {
          ImInterfaceGrpc.getAckAssisMsgMethod = getAckAssisMsgMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AckAssisMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("AckAssisMsg"))
              .build();
        }
      }
    }
    return getAckAssisMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail,
      bilibili.im.type.ImRpcProto.SessionInfo> getSessionDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionDetail",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail.class,
      responseType = bilibili.im.type.ImRpcProto.SessionInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail,
      bilibili.im.type.ImRpcProto.SessionInfo> getSessionDetailMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail, bilibili.im.type.ImRpcProto.SessionInfo> getSessionDetailMethod;
    if ((getSessionDetailMethod = ImInterfaceGrpc.getSessionDetailMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getSessionDetailMethod = ImInterfaceGrpc.getSessionDetailMethod) == null) {
          ImInterfaceGrpc.getSessionDetailMethod = getSessionDetailMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail, bilibili.im.type.ImRpcProto.SessionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SessionDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.type.ImRpcProto.SessionInfo.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("SessionDetail"))
              .build();
        }
      }
    }
    return getSessionDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails> getBatchSessDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchSessDetail",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails> getBatchSessDetailMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails, bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails> getBatchSessDetailMethod;
    if ((getBatchSessDetailMethod = ImInterfaceGrpc.getBatchSessDetailMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getBatchSessDetailMethod = ImInterfaceGrpc.getBatchSessDetailMethod) == null) {
          ImInterfaceGrpc.getBatchSessDetailMethod = getBatchSessDetailMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails, bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchSessDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("BatchSessDetail"))
              .build();
        }
      }
    }
    return getBatchSessDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getBatchRmSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchRmSessions",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess,
      bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getBatchRmSessionsMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> getBatchRmSessionsMethod;
    if ((getBatchRmSessionsMethod = ImInterfaceGrpc.getBatchRmSessionsMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getBatchRmSessionsMethod = ImInterfaceGrpc.getBatchRmSessionsMethod) == null) {
          ImInterfaceGrpc.getBatchRmSessionsMethod = getBatchRmSessionsMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess, bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchRmSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.DummyRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("BatchRmSessions"))
              .build();
        }
      }
    }
    return getBatchRmSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqShareList,
      bilibili.im.interfaces.v1.ImRpcProto.RspShareList> getShareListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShareList",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqShareList.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspShareList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqShareList,
      bilibili.im.interfaces.v1.ImRpcProto.RspShareList> getShareListMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqShareList, bilibili.im.interfaces.v1.ImRpcProto.RspShareList> getShareListMethod;
    if ((getShareListMethod = ImInterfaceGrpc.getShareListMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getShareListMethod = ImInterfaceGrpc.getShareListMethod) == null) {
          ImInterfaceGrpc.getShareListMethod = getShareListMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqShareList, bilibili.im.interfaces.v1.ImRpcProto.RspShareList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShareList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqShareList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspShareList.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("ShareList"))
              .build();
        }
      }
    }
    return getShareListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread,
      bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread> getSpecificSingleUnreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpecificSingleUnread",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread,
      bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread> getSpecificSingleUnreadMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread, bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread> getSpecificSingleUnreadMethod;
    if ((getSpecificSingleUnreadMethod = ImInterfaceGrpc.getSpecificSingleUnreadMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getSpecificSingleUnreadMethod = ImInterfaceGrpc.getSpecificSingleUnreadMethod) == null) {
          ImInterfaceGrpc.getSpecificSingleUnreadMethod = getSpecificSingleUnreadMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread, bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpecificSingleUnread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("SpecificSingleUnread"))
              .build();
        }
      }
    }
    return getSpecificSingleUnreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getGetSpecificSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpecificSessions",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspSessions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions,
      bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getGetSpecificSessionsMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions, bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getGetSpecificSessionsMethod;
    if ((getGetSpecificSessionsMethod = ImInterfaceGrpc.getGetSpecificSessionsMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getGetSpecificSessionsMethod = ImInterfaceGrpc.getGetSpecificSessionsMethod) == null) {
          ImInterfaceGrpc.getGetSpecificSessionsMethod = getGetSpecificSessionsMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions, bilibili.im.interfaces.v1.ImRpcProto.RspSessions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpecificSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspSessions.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("GetSpecificSessions"))
              .build();
        }
      }
    }
    return getGetSpecificSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo,
      bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo> getGetLiveInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLiveInfo",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo,
      bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo> getGetLiveInfoMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo, bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo> getGetLiveInfoMethod;
    if ((getGetLiveInfoMethod = ImInterfaceGrpc.getGetLiveInfoMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getGetLiveInfoMethod = ImInterfaceGrpc.getGetLiveInfoMethod) == null) {
          ImInterfaceGrpc.getGetLiveInfoMethod = getGetLiveInfoMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo, bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLiveInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("GetLiveInfo"))
              .build();
        }
      }
    }
    return getGetLiveInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread,
      bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread> getGetTotalUnreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalUnread",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread,
      bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread> getGetTotalUnreadMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread, bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread> getGetTotalUnreadMethod;
    if ((getGetTotalUnreadMethod = ImInterfaceGrpc.getGetTotalUnreadMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getGetTotalUnreadMethod = ImInterfaceGrpc.getGetTotalUnreadMethod) == null) {
          ImInterfaceGrpc.getGetTotalUnreadMethod = getGetTotalUnreadMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread, bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTotalUnread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("GetTotalUnread"))
              .build();
        }
      }
    }
    return getGetTotalUnreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI,
      bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI> getShowClearUnreadUIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowClearUnreadUI",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI,
      bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI> getShowClearUnreadUIMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI, bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI> getShowClearUnreadUIMethod;
    if ((getShowClearUnreadUIMethod = ImInterfaceGrpc.getShowClearUnreadUIMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getShowClearUnreadUIMethod = ImInterfaceGrpc.getShowClearUnreadUIMethod) == null) {
          ImInterfaceGrpc.getShowClearUnreadUIMethod = getShowClearUnreadUIMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI, bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShowClearUnreadUI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("ShowClearUnreadUI"))
              .build();
        }
      }
    }
    return getShowClearUnreadUIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI,
      bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI> getCloseClearUnreadUIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseClearUnreadUI",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI,
      bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI> getCloseClearUnreadUIMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI, bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI> getCloseClearUnreadUIMethod;
    if ((getCloseClearUnreadUIMethod = ImInterfaceGrpc.getCloseClearUnreadUIMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getCloseClearUnreadUIMethod = ImInterfaceGrpc.getCloseClearUnreadUIMethod) == null) {
          ImInterfaceGrpc.getCloseClearUnreadUIMethod = getCloseClearUnreadUIMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI, bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseClearUnreadUI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("CloseClearUnreadUI"))
              .build();
        }
      }
    }
    return getCloseClearUnreadUIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread,
      bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread> getUpdateTotalUnreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTotalUnread",
      requestType = bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread.class,
      responseType = bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread,
      bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread> getUpdateTotalUnreadMethod() {
    io.grpc.MethodDescriptor<bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread, bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread> getUpdateTotalUnreadMethod;
    if ((getUpdateTotalUnreadMethod = ImInterfaceGrpc.getUpdateTotalUnreadMethod) == null) {
      synchronized (ImInterfaceGrpc.class) {
        if ((getUpdateTotalUnreadMethod = ImInterfaceGrpc.getUpdateTotalUnreadMethod) == null) {
          ImInterfaceGrpc.getUpdateTotalUnreadMethod = getUpdateTotalUnreadMethod =
              io.grpc.MethodDescriptor.<bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread, bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTotalUnread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread.getDefaultInstance()))
              .setSchemaDescriptor(new ImInterfaceMethodDescriptorSupplier("UpdateTotalUnread"))
              .build();
        }
      }
    }
    return getUpdateTotalUnreadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImInterfaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImInterfaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImInterfaceStub>() {
        @java.lang.Override
        public ImInterfaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImInterfaceStub(channel, callOptions);
        }
      };
    return ImInterfaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImInterfaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImInterfaceBlockingStub>() {
        @java.lang.Override
        public ImInterfaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImInterfaceBlockingStub(channel, callOptions);
        }
      };
    return ImInterfaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImInterfaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImInterfaceFutureStub>() {
        @java.lang.Override
        public ImInterfaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImInterfaceFutureStub(channel, callOptions);
        }
      };
    return ImInterfaceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 私信
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 发送消息
     * </pre>
     */
    default void sendMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 同步关系
     * </pre>
     */
    default void syncRelation(bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncRelationMethod(), responseObserver);
    }

    /**
     * <pre>
     * 确认同步进度
     * </pre>
     */
    default void syncAck(bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncAckMethod(), responseObserver);
    }

    /**
     * <pre>
     * 同步版本拉取消息
     * </pre>
     */
    default void syncFetchSessionMsgs(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncFetchSessionMsgsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 拉取会话记录列表
     * </pre>
     */
    default void getSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 拉取新消息
     * </pre>
     */
    default void newSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 拉取已读消息
     * </pre>
     */
    default void ackSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAckSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新已读进度
     * </pre>
     */
    default void updateAck(bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAckMethod(), responseObserver);
    }

    /**
     * <pre>
     * 置顶聊天
     * </pre>
     */
    default void setTop(bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTopMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除会话记录
     * </pre>
     */
    default void removeSession(bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 未读私信数
     * </pre>
     */
    default void singleUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSingleUnreadMethod(), responseObserver);
    }

    /**
     * <pre>
     * 我创建的应援团未读数
     * </pre>
     */
    default void myGroupUnread(bilibili.im.interfaces.v1.ImRpcProto.DummyReq request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMyGroupUnreadMethod(), responseObserver);
    }

    /**
     * <pre>
     * 未关注的人批量设置为已读
     * </pre>
     */
    default void updateUnflwRead(bilibili.im.interfaces.v1.ImRpcProto.DummyReq request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUnflwReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * 应援团消息助手
     * </pre>
     */
    default void groupAssisMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupAssisMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新应援团小助手消息已拉取进度
     * </pre>
     */
    default void ackAssisMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAckAssisMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 拉取会话详情
     * </pre>
     */
    default void sessionDetail(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail request,
        io.grpc.stub.StreamObserver<bilibili.im.type.ImRpcProto.SessionInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSessionDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量拉取会话详情
     * </pre>
     */
    default void batchSessDetail(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchSessDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量删除会话
     * </pre>
     */
    default void batchRmSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchRmSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 拉取最近私信分享列表
     * </pre>
     */
    default void shareList(bilibili.im.interfaces.v1.ImRpcProto.ReqShareList request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspShareList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShareListMethod(), responseObserver);
    }

    /**
     */
    default void specificSingleUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpecificSingleUnreadMethod(), responseObserver);
    }

    /**
     */
    default void getSpecificSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpecificSessionsMethod(), responseObserver);
    }

    /**
     */
    default void getLiveInfo(bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLiveInfoMethod(), responseObserver);
    }

    /**
     */
    default void getTotalUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTotalUnreadMethod(), responseObserver);
    }

    /**
     */
    default void showClearUnreadUI(bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowClearUnreadUIMethod(), responseObserver);
    }

    /**
     */
    default void closeClearUnreadUI(bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseClearUnreadUIMethod(), responseObserver);
    }

    /**
     */
    default void updateTotalUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTotalUnreadMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ImInterface.
   * <pre>
   * 私信
   * </pre>
   */
  public static abstract class ImInterfaceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ImInterfaceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ImInterface.
   * <pre>
   * 私信
   * </pre>
   */
  public static final class ImInterfaceStub
      extends io.grpc.stub.AbstractAsyncStub<ImInterfaceStub> {
    private ImInterfaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImInterfaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImInterfaceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送消息
     * </pre>
     */
    public void sendMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 同步关系
     * </pre>
     */
    public void syncRelation(bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncRelationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 确认同步进度
     * </pre>
     */
    public void syncAck(bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 同步版本拉取消息
     * </pre>
     */
    public void syncFetchSessionMsgs(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncFetchSessionMsgsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 拉取会话记录列表
     * </pre>
     */
    public void getSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 拉取新消息
     * </pre>
     */
    public void newSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 拉取已读消息
     * </pre>
     */
    public void ackSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAckSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新已读进度
     * </pre>
     */
    public void updateAck(bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 置顶聊天
     * </pre>
     */
    public void setTop(bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除会话记录
     * </pre>
     */
    public void removeSession(bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 未读私信数
     * </pre>
     */
    public void singleUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSingleUnreadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 我创建的应援团未读数
     * </pre>
     */
    public void myGroupUnread(bilibili.im.interfaces.v1.ImRpcProto.DummyReq request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMyGroupUnreadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 未关注的人批量设置为已读
     * </pre>
     */
    public void updateUnflwRead(bilibili.im.interfaces.v1.ImRpcProto.DummyReq request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUnflwReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 应援团消息助手
     * </pre>
     */
    public void groupAssisMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupAssisMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新应援团小助手消息已拉取进度
     * </pre>
     */
    public void ackAssisMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAckAssisMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 拉取会话详情
     * </pre>
     */
    public void sessionDetail(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail request,
        io.grpc.stub.StreamObserver<bilibili.im.type.ImRpcProto.SessionInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSessionDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量拉取会话详情
     * </pre>
     */
    public void batchSessDetail(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchSessDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量删除会话
     * </pre>
     */
    public void batchRmSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchRmSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 拉取最近私信分享列表
     * </pre>
     */
    public void shareList(bilibili.im.interfaces.v1.ImRpcProto.ReqShareList request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspShareList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShareListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void specificSingleUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpecificSingleUnreadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSpecificSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpecificSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLiveInfo(bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLiveInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTotalUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTotalUnreadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showClearUnreadUI(bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowClearUnreadUIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeClearUnreadUI(bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseClearUnreadUIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTotalUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread request,
        io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTotalUnreadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ImInterface.
   * <pre>
   * 私信
   * </pre>
   */
  public static final class ImInterfaceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ImInterfaceBlockingStub> {
    private ImInterfaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImInterfaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImInterfaceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送消息
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg sendMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 同步关系
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync syncRelation(bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncRelationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 确认同步进度
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck syncAck(bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncAckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 同步版本拉取消息
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg syncFetchSessionMsgs(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncFetchSessionMsgsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 拉取会话记录列表
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSessions getSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 拉取新消息
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSessions newSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 拉取已读消息
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSessions ackSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAckSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新已读进度
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.DummyRsp updateAck(bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 置顶聊天
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.DummyRsp setTop(bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除会话记录
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.DummyRsp removeSession(bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 未读私信数
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread singleUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSingleUnreadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 我创建的应援团未读数
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread myGroupUnread(bilibili.im.interfaces.v1.ImRpcProto.DummyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMyGroupUnreadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 未关注的人批量设置为已读
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.DummyRsp updateUnflwRead(bilibili.im.interfaces.v1.ImRpcProto.DummyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUnflwReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 应援团消息助手
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg groupAssisMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupAssisMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新应援团小助手消息已拉取进度
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.DummyRsp ackAssisMsg(bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAckAssisMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 拉取会话详情
     * </pre>
     */
    public bilibili.im.type.ImRpcProto.SessionInfo sessionDetail(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSessionDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量拉取会话详情
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails batchSessDetail(bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSessDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量删除会话
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.DummyRsp batchRmSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchRmSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 拉取最近私信分享列表
     * </pre>
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspShareList shareList(bilibili.im.interfaces.v1.ImRpcProto.ReqShareList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShareListMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread specificSingleUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpecificSingleUnreadMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspSessions getSpecificSessions(bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpecificSessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo getLiveInfo(bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLiveInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread getTotalUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTotalUnreadMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI showClearUnreadUI(bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowClearUnreadUIMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI closeClearUnreadUI(bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseClearUnreadUIMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread updateTotalUnread(bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTotalUnreadMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ImInterface.
   * <pre>
   * 私信
   * </pre>
   */
  public static final class ImInterfaceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ImInterfaceFutureStub> {
    private ImInterfaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImInterfaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImInterfaceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg> sendMsg(
        bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 同步关系
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync> syncRelation(
        bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncRelationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 确认同步进度
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck> syncAck(
        bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncAckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 同步版本拉取消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> syncFetchSessionMsgs(
        bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncFetchSessionMsgsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 拉取会话记录列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getSessions(
        bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 拉取新消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> newSessions(
        bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 拉取已读消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> ackSessions(
        bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAckSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新已读进度
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> updateAck(
        bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 置顶聊天
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> setTop(
        bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除会话记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> removeSession(
        bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 未读私信数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread> singleUnread(
        bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSingleUnreadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 我创建的应援团未读数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread> myGroupUnread(
        bilibili.im.interfaces.v1.ImRpcProto.DummyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMyGroupUnreadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 未关注的人批量设置为已读
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> updateUnflwRead(
        bilibili.im.interfaces.v1.ImRpcProto.DummyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUnflwReadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 应援团消息助手
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg> groupAssisMsg(
        bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupAssisMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新应援团小助手消息已拉取进度
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> ackAssisMsg(
        bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAckAssisMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 拉取会话详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.type.ImRpcProto.SessionInfo> sessionDetail(
        bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSessionDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量拉取会话详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails> batchSessDetail(
        bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchSessDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量删除会话
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp> batchRmSessions(
        bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchRmSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 拉取最近私信分享列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspShareList> shareList(
        bilibili.im.interfaces.v1.ImRpcProto.ReqShareList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShareListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread> specificSingleUnread(
        bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpecificSingleUnreadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspSessions> getSpecificSessions(
        bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpecificSessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo> getLiveInfo(
        bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLiveInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread> getTotalUnread(
        bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTotalUnreadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI> showClearUnreadUI(
        bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowClearUnreadUIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI> closeClearUnreadUI(
        bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseClearUnreadUIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread> updateTotalUnread(
        bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTotalUnreadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MSG = 0;
  private static final int METHODID_SYNC_RELATION = 1;
  private static final int METHODID_SYNC_ACK = 2;
  private static final int METHODID_SYNC_FETCH_SESSION_MSGS = 3;
  private static final int METHODID_GET_SESSIONS = 4;
  private static final int METHODID_NEW_SESSIONS = 5;
  private static final int METHODID_ACK_SESSIONS = 6;
  private static final int METHODID_UPDATE_ACK = 7;
  private static final int METHODID_SET_TOP = 8;
  private static final int METHODID_REMOVE_SESSION = 9;
  private static final int METHODID_SINGLE_UNREAD = 10;
  private static final int METHODID_MY_GROUP_UNREAD = 11;
  private static final int METHODID_UPDATE_UNFLW_READ = 12;
  private static final int METHODID_GROUP_ASSIS_MSG = 13;
  private static final int METHODID_ACK_ASSIS_MSG = 14;
  private static final int METHODID_SESSION_DETAIL = 15;
  private static final int METHODID_BATCH_SESS_DETAIL = 16;
  private static final int METHODID_BATCH_RM_SESSIONS = 17;
  private static final int METHODID_SHARE_LIST = 18;
  private static final int METHODID_SPECIFIC_SINGLE_UNREAD = 19;
  private static final int METHODID_GET_SPECIFIC_SESSIONS = 20;
  private static final int METHODID_GET_LIVE_INFO = 21;
  private static final int METHODID_GET_TOTAL_UNREAD = 22;
  private static final int METHODID_SHOW_CLEAR_UNREAD_UI = 23;
  private static final int METHODID_CLOSE_CLEAR_UNREAD_UI = 24;
  private static final int METHODID_UPDATE_TOTAL_UNREAD = 25;

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
        case METHODID_SEND_MSG:
          serviceImpl.sendMsg((bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg>) responseObserver);
          break;
        case METHODID_SYNC_RELATION:
          serviceImpl.syncRelation((bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync>) responseObserver);
          break;
        case METHODID_SYNC_ACK:
          serviceImpl.syncAck((bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck>) responseObserver);
          break;
        case METHODID_SYNC_FETCH_SESSION_MSGS:
          serviceImpl.syncFetchSessionMsgs((bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg>) responseObserver);
          break;
        case METHODID_GET_SESSIONS:
          serviceImpl.getSessions((bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions>) responseObserver);
          break;
        case METHODID_NEW_SESSIONS:
          serviceImpl.newSessions((bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions>) responseObserver);
          break;
        case METHODID_ACK_SESSIONS:
          serviceImpl.ackSessions((bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions>) responseObserver);
          break;
        case METHODID_UPDATE_ACK:
          serviceImpl.updateAck((bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>) responseObserver);
          break;
        case METHODID_SET_TOP:
          serviceImpl.setTop((bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>) responseObserver);
          break;
        case METHODID_REMOVE_SESSION:
          serviceImpl.removeSession((bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>) responseObserver);
          break;
        case METHODID_SINGLE_UNREAD:
          serviceImpl.singleUnread((bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread>) responseObserver);
          break;
        case METHODID_MY_GROUP_UNREAD:
          serviceImpl.myGroupUnread((bilibili.im.interfaces.v1.ImRpcProto.DummyReq) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread>) responseObserver);
          break;
        case METHODID_UPDATE_UNFLW_READ:
          serviceImpl.updateUnflwRead((bilibili.im.interfaces.v1.ImRpcProto.DummyReq) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>) responseObserver);
          break;
        case METHODID_GROUP_ASSIS_MSG:
          serviceImpl.groupAssisMsg((bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg>) responseObserver);
          break;
        case METHODID_ACK_ASSIS_MSG:
          serviceImpl.ackAssisMsg((bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>) responseObserver);
          break;
        case METHODID_SESSION_DETAIL:
          serviceImpl.sessionDetail((bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail) request,
              (io.grpc.stub.StreamObserver<bilibili.im.type.ImRpcProto.SessionInfo>) responseObserver);
          break;
        case METHODID_BATCH_SESS_DETAIL:
          serviceImpl.batchSessDetail((bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails>) responseObserver);
          break;
        case METHODID_BATCH_RM_SESSIONS:
          serviceImpl.batchRmSessions((bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>) responseObserver);
          break;
        case METHODID_SHARE_LIST:
          serviceImpl.shareList((bilibili.im.interfaces.v1.ImRpcProto.ReqShareList) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspShareList>) responseObserver);
          break;
        case METHODID_SPECIFIC_SINGLE_UNREAD:
          serviceImpl.specificSingleUnread((bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread>) responseObserver);
          break;
        case METHODID_GET_SPECIFIC_SESSIONS:
          serviceImpl.getSpecificSessions((bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspSessions>) responseObserver);
          break;
        case METHODID_GET_LIVE_INFO:
          serviceImpl.getLiveInfo((bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo>) responseObserver);
          break;
        case METHODID_GET_TOTAL_UNREAD:
          serviceImpl.getTotalUnread((bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread>) responseObserver);
          break;
        case METHODID_SHOW_CLEAR_UNREAD_UI:
          serviceImpl.showClearUnreadUI((bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI>) responseObserver);
          break;
        case METHODID_CLOSE_CLEAR_UNREAD_UI:
          serviceImpl.closeClearUnreadUI((bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI>) responseObserver);
          break;
        case METHODID_UPDATE_TOTAL_UNREAD:
          serviceImpl.updateTotalUnread((bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread) request,
              (io.grpc.stub.StreamObserver<bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread>) responseObserver);
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
          getSendMsgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqSendMsg,
              bilibili.im.interfaces.v1.ImRpcProto.RspSendMsg>(
                service, METHODID_SEND_MSG)))
        .addMethod(
          getSyncRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqRelationSync,
              bilibili.im.interfaces.v1.ImRpcProto.RspRelationSync>(
                service, METHODID_SYNC_RELATION)))
        .addMethod(
          getSyncAckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqSyncAck,
              bilibili.im.interfaces.v1.ImRpcProto.RspSyncAck>(
                service, METHODID_SYNC_ACK)))
        .addMethod(
          getSyncFetchSessionMsgsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqSessionMsg,
              bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg>(
                service, METHODID_SYNC_FETCH_SESSION_MSGS)))
        .addMethod(
          getGetSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqGetSessions,
              bilibili.im.interfaces.v1.ImRpcProto.RspSessions>(
                service, METHODID_GET_SESSIONS)))
        .addMethod(
          getNewSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqNewSessions,
              bilibili.im.interfaces.v1.ImRpcProto.RspSessions>(
                service, METHODID_NEW_SESSIONS)))
        .addMethod(
          getAckSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqAckSessions,
              bilibili.im.interfaces.v1.ImRpcProto.RspSessions>(
                service, METHODID_ACK_SESSIONS)))
        .addMethod(
          getUpdateAckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateAck,
              bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>(
                service, METHODID_UPDATE_ACK)))
        .addMethod(
          getSetTopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqSetTop,
              bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>(
                service, METHODID_SET_TOP)))
        .addMethod(
          getRemoveSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqRemoveSession,
              bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>(
                service, METHODID_REMOVE_SESSION)))
        .addMethod(
          getSingleUnreadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqSingleUnread,
              bilibili.im.interfaces.v1.ImRpcProto.RspSingleUnread>(
                service, METHODID_SINGLE_UNREAD)))
        .addMethod(
          getMyGroupUnreadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.DummyReq,
              bilibili.im.interfaces.v1.ImRpcProto.RspMyGroupUnread>(
                service, METHODID_MY_GROUP_UNREAD)))
        .addMethod(
          getUpdateUnflwReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.DummyReq,
              bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>(
                service, METHODID_UPDATE_UNFLW_READ)))
        .addMethod(
          getGroupAssisMsgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqGroupAssisMsg,
              bilibili.im.interfaces.v1.ImRpcProto.RspSessionMsg>(
                service, METHODID_GROUP_ASSIS_MSG)))
        .addMethod(
          getAckAssisMsgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqAckAssisMsg,
              bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>(
                service, METHODID_ACK_ASSIS_MSG)))
        .addMethod(
          getSessionDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetail,
              bilibili.im.type.ImRpcProto.SessionInfo>(
                service, METHODID_SESSION_DETAIL)))
        .addMethod(
          getBatchSessDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqSessionDetails,
              bilibili.im.interfaces.v1.ImRpcProto.RspSessionDetails>(
                service, METHODID_BATCH_SESS_DETAIL)))
        .addMethod(
          getBatchRmSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqBatRmSess,
              bilibili.im.interfaces.v1.ImRpcProto.DummyRsp>(
                service, METHODID_BATCH_RM_SESSIONS)))
        .addMethod(
          getShareListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqShareList,
              bilibili.im.interfaces.v1.ImRpcProto.RspShareList>(
                service, METHODID_SHARE_LIST)))
        .addMethod(
          getSpecificSingleUnreadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqSpecificSingleUnread,
              bilibili.im.interfaces.v1.ImRpcProto.RspSpecificSingleUnread>(
                service, METHODID_SPECIFIC_SINGLE_UNREAD)))
        .addMethod(
          getGetSpecificSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqGetSpecificSessions,
              bilibili.im.interfaces.v1.ImRpcProto.RspSessions>(
                service, METHODID_GET_SPECIFIC_SESSIONS)))
        .addMethod(
          getGetLiveInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqLiveInfo,
              bilibili.im.interfaces.v1.ImRpcProto.RspLiveInfo>(
                service, METHODID_GET_LIVE_INFO)))
        .addMethod(
          getGetTotalUnreadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqTotalUnread,
              bilibili.im.interfaces.v1.ImRpcProto.RspTotalUnread>(
                service, METHODID_GET_TOTAL_UNREAD)))
        .addMethod(
          getShowClearUnreadUIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqShowClearUnreadUI,
              bilibili.im.interfaces.v1.ImRpcProto.RspShowClearUnreadUI>(
                service, METHODID_SHOW_CLEAR_UNREAD_UI)))
        .addMethod(
          getCloseClearUnreadUIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqCloseClearUnreadUI,
              bilibili.im.interfaces.v1.ImRpcProto.RspCloseClearUnreadUI>(
                service, METHODID_CLOSE_CLEAR_UNREAD_UI)))
        .addMethod(
          getUpdateTotalUnreadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.im.interfaces.v1.ImRpcProto.ReqUpdateTotalUnread,
              bilibili.im.interfaces.v1.ImRpcProto.RspUpdateTotalUnread>(
                service, METHODID_UPDATE_TOTAL_UNREAD)))
        .build();
  }

  private static abstract class ImInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.im.interfaces.v1.ImRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImInterface");
    }
  }

  private static final class ImInterfaceFileDescriptorSupplier
      extends ImInterfaceBaseDescriptorSupplier {
    ImInterfaceFileDescriptorSupplier() {}
  }

  private static final class ImInterfaceMethodDescriptorSupplier
      extends ImInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ImInterfaceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ImInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImInterfaceFileDescriptorSupplier())
              .addMethod(getSendMsgMethod())
              .addMethod(getSyncRelationMethod())
              .addMethod(getSyncAckMethod())
              .addMethod(getSyncFetchSessionMsgsMethod())
              .addMethod(getGetSessionsMethod())
              .addMethod(getNewSessionsMethod())
              .addMethod(getAckSessionsMethod())
              .addMethod(getUpdateAckMethod())
              .addMethod(getSetTopMethod())
              .addMethod(getRemoveSessionMethod())
              .addMethod(getSingleUnreadMethod())
              .addMethod(getMyGroupUnreadMethod())
              .addMethod(getUpdateUnflwReadMethod())
              .addMethod(getGroupAssisMsgMethod())
              .addMethod(getAckAssisMsgMethod())
              .addMethod(getSessionDetailMethod())
              .addMethod(getBatchSessDetailMethod())
              .addMethod(getBatchRmSessionsMethod())
              .addMethod(getShareListMethod())
              .addMethod(getSpecificSingleUnreadMethod())
              .addMethod(getGetSpecificSessionsMethod())
              .addMethod(getGetLiveInfoMethod())
              .addMethod(getGetTotalUnreadMethod())
              .addMethod(getShowClearUnreadUIMethod())
              .addMethod(getCloseClearUnreadUIMethod())
              .addMethod(getUpdateTotalUnreadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
