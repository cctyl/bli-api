package bilibili.app.listener.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 听视频
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/listener/v1/listener.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ListenerGrpc {

  private ListenerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.listener.v1.Listener";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getPingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getPingMethod;
    if ((getPingMethod = ListenerGrpc.getPingMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPingMethod = ListenerGrpc.getPingMethod) == null) {
          ListenerGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayURLReq,
      bilibili.app.listener.v1.PlayURLResp> getPlayUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayUrl",
      requestType = bilibili.app.listener.v1.PlayURLReq.class,
      responseType = bilibili.app.listener.v1.PlayURLResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayURLReq,
      bilibili.app.listener.v1.PlayURLResp> getPlayUrlMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayURLReq, bilibili.app.listener.v1.PlayURLResp> getPlayUrlMethod;
    if ((getPlayUrlMethod = ListenerGrpc.getPlayUrlMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPlayUrlMethod = ListenerGrpc.getPlayUrlMethod) == null) {
          ListenerGrpc.getPlayUrlMethod = getPlayUrlMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PlayURLReq, bilibili.app.listener.v1.PlayURLResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlayURLReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlayURLResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PlayUrl"))
              .build();
        }
      }
    }
    return getPlayUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.BKArcDetailsReq,
      bilibili.app.listener.v1.BKArcDetailsResp> getBkarcDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BkarcDetails",
      requestType = bilibili.app.listener.v1.BKArcDetailsReq.class,
      responseType = bilibili.app.listener.v1.BKArcDetailsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.BKArcDetailsReq,
      bilibili.app.listener.v1.BKArcDetailsResp> getBkarcDetailsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.BKArcDetailsReq, bilibili.app.listener.v1.BKArcDetailsResp> getBkarcDetailsMethod;
    if ((getBkarcDetailsMethod = ListenerGrpc.getBkarcDetailsMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getBkarcDetailsMethod = ListenerGrpc.getBkarcDetailsMethod) == null) {
          ListenerGrpc.getBkarcDetailsMethod = getBkarcDetailsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.BKArcDetailsReq, bilibili.app.listener.v1.BKArcDetailsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BkarcDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.BKArcDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.BKArcDetailsResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("BkarcDetails"))
              .build();
        }
      }
    }
    return getBkarcDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistReq,
      bilibili.app.listener.v1.PlaylistResp> getPlaylistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Playlist",
      requestType = bilibili.app.listener.v1.PlaylistReq.class,
      responseType = bilibili.app.listener.v1.PlaylistResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistReq,
      bilibili.app.listener.v1.PlaylistResp> getPlaylistMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistReq, bilibili.app.listener.v1.PlaylistResp> getPlaylistMethod;
    if ((getPlaylistMethod = ListenerGrpc.getPlaylistMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPlaylistMethod = ListenerGrpc.getPlaylistMethod) == null) {
          ListenerGrpc.getPlaylistMethod = getPlaylistMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PlaylistReq, bilibili.app.listener.v1.PlaylistResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Playlist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlaylistReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlaylistResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("Playlist"))
              .build();
        }
      }
    }
    return getPlaylistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistAddReq,
      com.google.protobuf.Empty> getPlaylistAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaylistAdd",
      requestType = bilibili.app.listener.v1.PlaylistAddReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistAddReq,
      com.google.protobuf.Empty> getPlaylistAddMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistAddReq, com.google.protobuf.Empty> getPlaylistAddMethod;
    if ((getPlaylistAddMethod = ListenerGrpc.getPlaylistAddMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPlaylistAddMethod = ListenerGrpc.getPlaylistAddMethod) == null) {
          ListenerGrpc.getPlaylistAddMethod = getPlaylistAddMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PlaylistAddReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaylistAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlaylistAddReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PlaylistAdd"))
              .build();
        }
      }
    }
    return getPlaylistAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistDelReq,
      com.google.protobuf.Empty> getPlaylistDelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaylistDel",
      requestType = bilibili.app.listener.v1.PlaylistDelReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistDelReq,
      com.google.protobuf.Empty> getPlaylistDelMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlaylistDelReq, com.google.protobuf.Empty> getPlaylistDelMethod;
    if ((getPlaylistDelMethod = ListenerGrpc.getPlaylistDelMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPlaylistDelMethod = ListenerGrpc.getPlaylistDelMethod) == null) {
          ListenerGrpc.getPlaylistDelMethod = getPlaylistDelMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PlaylistDelReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaylistDel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlaylistDelReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PlaylistDel"))
              .build();
        }
      }
    }
    return getPlaylistDelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.RcmdPlaylistReq,
      bilibili.app.listener.v1.RcmdPlaylistResp> getRcmdPlaylistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RcmdPlaylist",
      requestType = bilibili.app.listener.v1.RcmdPlaylistReq.class,
      responseType = bilibili.app.listener.v1.RcmdPlaylistResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.RcmdPlaylistReq,
      bilibili.app.listener.v1.RcmdPlaylistResp> getRcmdPlaylistMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.RcmdPlaylistReq, bilibili.app.listener.v1.RcmdPlaylistResp> getRcmdPlaylistMethod;
    if ((getRcmdPlaylistMethod = ListenerGrpc.getRcmdPlaylistMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getRcmdPlaylistMethod = ListenerGrpc.getRcmdPlaylistMethod) == null) {
          ListenerGrpc.getRcmdPlaylistMethod = getRcmdPlaylistMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.RcmdPlaylistReq, bilibili.app.listener.v1.RcmdPlaylistResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RcmdPlaylist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.RcmdPlaylistReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.RcmdPlaylistResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("RcmdPlaylist"))
              .build();
        }
      }
    }
    return getRcmdPlaylistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryReq,
      bilibili.app.listener.v1.PlayHistoryResp> getPlayHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayHistory",
      requestType = bilibili.app.listener.v1.PlayHistoryReq.class,
      responseType = bilibili.app.listener.v1.PlayHistoryResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryReq,
      bilibili.app.listener.v1.PlayHistoryResp> getPlayHistoryMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryReq, bilibili.app.listener.v1.PlayHistoryResp> getPlayHistoryMethod;
    if ((getPlayHistoryMethod = ListenerGrpc.getPlayHistoryMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPlayHistoryMethod = ListenerGrpc.getPlayHistoryMethod) == null) {
          ListenerGrpc.getPlayHistoryMethod = getPlayHistoryMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PlayHistoryReq, bilibili.app.listener.v1.PlayHistoryResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlayHistoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlayHistoryResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PlayHistory"))
              .build();
        }
      }
    }
    return getPlayHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryAddReq,
      com.google.protobuf.Empty> getPlayHistoryAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayHistoryAdd",
      requestType = bilibili.app.listener.v1.PlayHistoryAddReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryAddReq,
      com.google.protobuf.Empty> getPlayHistoryAddMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryAddReq, com.google.protobuf.Empty> getPlayHistoryAddMethod;
    if ((getPlayHistoryAddMethod = ListenerGrpc.getPlayHistoryAddMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPlayHistoryAddMethod = ListenerGrpc.getPlayHistoryAddMethod) == null) {
          ListenerGrpc.getPlayHistoryAddMethod = getPlayHistoryAddMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PlayHistoryAddReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayHistoryAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlayHistoryAddReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PlayHistoryAdd"))
              .build();
        }
      }
    }
    return getPlayHistoryAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryDelReq,
      com.google.protobuf.Empty> getPlayHistoryDelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayHistoryDel",
      requestType = bilibili.app.listener.v1.PlayHistoryDelReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryDelReq,
      com.google.protobuf.Empty> getPlayHistoryDelMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayHistoryDelReq, com.google.protobuf.Empty> getPlayHistoryDelMethod;
    if ((getPlayHistoryDelMethod = ListenerGrpc.getPlayHistoryDelMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPlayHistoryDelMethod = ListenerGrpc.getPlayHistoryDelMethod) == null) {
          ListenerGrpc.getPlayHistoryDelMethod = getPlayHistoryDelMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PlayHistoryDelReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayHistoryDel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlayHistoryDelReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PlayHistoryDel"))
              .build();
        }
      }
    }
    return getPlayHistoryDelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayActionReportReq,
      com.google.protobuf.Empty> getPlayActionReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayActionReport",
      requestType = bilibili.app.listener.v1.PlayActionReportReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayActionReportReq,
      com.google.protobuf.Empty> getPlayActionReportMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PlayActionReportReq, com.google.protobuf.Empty> getPlayActionReportMethod;
    if ((getPlayActionReportMethod = ListenerGrpc.getPlayActionReportMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPlayActionReportMethod = ListenerGrpc.getPlayActionReportMethod) == null) {
          ListenerGrpc.getPlayActionReportMethod = getPlayActionReportMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PlayActionReportReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayActionReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PlayActionReportReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PlayActionReport"))
              .build();
        }
      }
    }
    return getPlayActionReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.TripleLikeReq,
      bilibili.app.listener.v1.TripleLikeResp> getTripleLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TripleLike",
      requestType = bilibili.app.listener.v1.TripleLikeReq.class,
      responseType = bilibili.app.listener.v1.TripleLikeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.TripleLikeReq,
      bilibili.app.listener.v1.TripleLikeResp> getTripleLikeMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.TripleLikeReq, bilibili.app.listener.v1.TripleLikeResp> getTripleLikeMethod;
    if ((getTripleLikeMethod = ListenerGrpc.getTripleLikeMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getTripleLikeMethod = ListenerGrpc.getTripleLikeMethod) == null) {
          ListenerGrpc.getTripleLikeMethod = getTripleLikeMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.TripleLikeReq, bilibili.app.listener.v1.TripleLikeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TripleLike"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.TripleLikeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.TripleLikeResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("TripleLike"))
              .build();
        }
      }
    }
    return getTripleLikeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.ThumbUpReq,
      bilibili.app.listener.v1.ThumbUpResp> getThumbUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ThumbUp",
      requestType = bilibili.app.listener.v1.ThumbUpReq.class,
      responseType = bilibili.app.listener.v1.ThumbUpResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.ThumbUpReq,
      bilibili.app.listener.v1.ThumbUpResp> getThumbUpMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.ThumbUpReq, bilibili.app.listener.v1.ThumbUpResp> getThumbUpMethod;
    if ((getThumbUpMethod = ListenerGrpc.getThumbUpMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getThumbUpMethod = ListenerGrpc.getThumbUpMethod) == null) {
          ListenerGrpc.getThumbUpMethod = getThumbUpMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.ThumbUpReq, bilibili.app.listener.v1.ThumbUpResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ThumbUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ThumbUpReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.ThumbUpResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("ThumbUp"))
              .build();
        }
      }
    }
    return getThumbUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.CoinAddReq,
      bilibili.app.listener.v1.CoinAddResp> getCoinAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoinAdd",
      requestType = bilibili.app.listener.v1.CoinAddReq.class,
      responseType = bilibili.app.listener.v1.CoinAddResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.CoinAddReq,
      bilibili.app.listener.v1.CoinAddResp> getCoinAddMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.CoinAddReq, bilibili.app.listener.v1.CoinAddResp> getCoinAddMethod;
    if ((getCoinAddMethod = ListenerGrpc.getCoinAddMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getCoinAddMethod = ListenerGrpc.getCoinAddMethod) == null) {
          ListenerGrpc.getCoinAddMethod = getCoinAddMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.CoinAddReq, bilibili.app.listener.v1.CoinAddResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoinAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.CoinAddReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.CoinAddResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("CoinAdd"))
              .build();
        }
      }
    }
    return getCoinAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemAddReq,
      bilibili.app.listener.v1.FavItemAddResp> getFavItemAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavItemAdd",
      requestType = bilibili.app.listener.v1.FavItemAddReq.class,
      responseType = bilibili.app.listener.v1.FavItemAddResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemAddReq,
      bilibili.app.listener.v1.FavItemAddResp> getFavItemAddMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemAddReq, bilibili.app.listener.v1.FavItemAddResp> getFavItemAddMethod;
    if ((getFavItemAddMethod = ListenerGrpc.getFavItemAddMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getFavItemAddMethod = ListenerGrpc.getFavItemAddMethod) == null) {
          ListenerGrpc.getFavItemAddMethod = getFavItemAddMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.FavItemAddReq, bilibili.app.listener.v1.FavItemAddResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavItemAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavItemAddReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavItemAddResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("FavItemAdd"))
              .build();
        }
      }
    }
    return getFavItemAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemDelReq,
      bilibili.app.listener.v1.FavItemDelResp> getFavItemDelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavItemDel",
      requestType = bilibili.app.listener.v1.FavItemDelReq.class,
      responseType = bilibili.app.listener.v1.FavItemDelResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemDelReq,
      bilibili.app.listener.v1.FavItemDelResp> getFavItemDelMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemDelReq, bilibili.app.listener.v1.FavItemDelResp> getFavItemDelMethod;
    if ((getFavItemDelMethod = ListenerGrpc.getFavItemDelMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getFavItemDelMethod = ListenerGrpc.getFavItemDelMethod) == null) {
          ListenerGrpc.getFavItemDelMethod = getFavItemDelMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.FavItemDelReq, bilibili.app.listener.v1.FavItemDelResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavItemDel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavItemDelReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavItemDelResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("FavItemDel"))
              .build();
        }
      }
    }
    return getFavItemDelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemBatchReq,
      bilibili.app.listener.v1.FavItemBatchResp> getFavItemBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavItemBatch",
      requestType = bilibili.app.listener.v1.FavItemBatchReq.class,
      responseType = bilibili.app.listener.v1.FavItemBatchResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemBatchReq,
      bilibili.app.listener.v1.FavItemBatchResp> getFavItemBatchMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavItemBatchReq, bilibili.app.listener.v1.FavItemBatchResp> getFavItemBatchMethod;
    if ((getFavItemBatchMethod = ListenerGrpc.getFavItemBatchMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getFavItemBatchMethod = ListenerGrpc.getFavItemBatchMethod) == null) {
          ListenerGrpc.getFavItemBatchMethod = getFavItemBatchMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.FavItemBatchReq, bilibili.app.listener.v1.FavItemBatchResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavItemBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavItemBatchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavItemBatchResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("FavItemBatch"))
              .build();
        }
      }
    }
    return getFavItemBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavoredInAnyFoldersReq,
      bilibili.app.listener.v1.FavoredInAnyFoldersResp> getFavoredInAnyFoldersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavoredInAnyFolders",
      requestType = bilibili.app.listener.v1.FavoredInAnyFoldersReq.class,
      responseType = bilibili.app.listener.v1.FavoredInAnyFoldersResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavoredInAnyFoldersReq,
      bilibili.app.listener.v1.FavoredInAnyFoldersResp> getFavoredInAnyFoldersMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavoredInAnyFoldersReq, bilibili.app.listener.v1.FavoredInAnyFoldersResp> getFavoredInAnyFoldersMethod;
    if ((getFavoredInAnyFoldersMethod = ListenerGrpc.getFavoredInAnyFoldersMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getFavoredInAnyFoldersMethod = ListenerGrpc.getFavoredInAnyFoldersMethod) == null) {
          ListenerGrpc.getFavoredInAnyFoldersMethod = getFavoredInAnyFoldersMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.FavoredInAnyFoldersReq, bilibili.app.listener.v1.FavoredInAnyFoldersResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavoredInAnyFolders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavoredInAnyFoldersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavoredInAnyFoldersResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("FavoredInAnyFolders"))
              .build();
        }
      }
    }
    return getFavoredInAnyFoldersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderListReq,
      bilibili.app.listener.v1.FavFolderListResp> getFavFolderListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavFolderList",
      requestType = bilibili.app.listener.v1.FavFolderListReq.class,
      responseType = bilibili.app.listener.v1.FavFolderListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderListReq,
      bilibili.app.listener.v1.FavFolderListResp> getFavFolderListMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderListReq, bilibili.app.listener.v1.FavFolderListResp> getFavFolderListMethod;
    if ((getFavFolderListMethod = ListenerGrpc.getFavFolderListMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getFavFolderListMethod = ListenerGrpc.getFavFolderListMethod) == null) {
          ListenerGrpc.getFavFolderListMethod = getFavFolderListMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.FavFolderListReq, bilibili.app.listener.v1.FavFolderListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavFolderList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavFolderListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavFolderListResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("FavFolderList"))
              .build();
        }
      }
    }
    return getFavFolderListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderDetailReq,
      bilibili.app.listener.v1.FavFolderDetailResp> getFavFolderDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavFolderDetail",
      requestType = bilibili.app.listener.v1.FavFolderDetailReq.class,
      responseType = bilibili.app.listener.v1.FavFolderDetailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderDetailReq,
      bilibili.app.listener.v1.FavFolderDetailResp> getFavFolderDetailMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderDetailReq, bilibili.app.listener.v1.FavFolderDetailResp> getFavFolderDetailMethod;
    if ((getFavFolderDetailMethod = ListenerGrpc.getFavFolderDetailMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getFavFolderDetailMethod = ListenerGrpc.getFavFolderDetailMethod) == null) {
          ListenerGrpc.getFavFolderDetailMethod = getFavFolderDetailMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.FavFolderDetailReq, bilibili.app.listener.v1.FavFolderDetailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavFolderDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavFolderDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavFolderDetailResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("FavFolderDetail"))
              .build();
        }
      }
    }
    return getFavFolderDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderCreateReq,
      bilibili.app.listener.v1.FavFolderCreateResp> getFavFolderCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavFolderCreate",
      requestType = bilibili.app.listener.v1.FavFolderCreateReq.class,
      responseType = bilibili.app.listener.v1.FavFolderCreateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderCreateReq,
      bilibili.app.listener.v1.FavFolderCreateResp> getFavFolderCreateMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderCreateReq, bilibili.app.listener.v1.FavFolderCreateResp> getFavFolderCreateMethod;
    if ((getFavFolderCreateMethod = ListenerGrpc.getFavFolderCreateMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getFavFolderCreateMethod = ListenerGrpc.getFavFolderCreateMethod) == null) {
          ListenerGrpc.getFavFolderCreateMethod = getFavFolderCreateMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.FavFolderCreateReq, bilibili.app.listener.v1.FavFolderCreateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavFolderCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavFolderCreateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavFolderCreateResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("FavFolderCreate"))
              .build();
        }
      }
    }
    return getFavFolderCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderDeleteReq,
      bilibili.app.listener.v1.FavFolderDeleteResp> getFavFolderDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FavFolderDelete",
      requestType = bilibili.app.listener.v1.FavFolderDeleteReq.class,
      responseType = bilibili.app.listener.v1.FavFolderDeleteResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderDeleteReq,
      bilibili.app.listener.v1.FavFolderDeleteResp> getFavFolderDeleteMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.FavFolderDeleteReq, bilibili.app.listener.v1.FavFolderDeleteResp> getFavFolderDeleteMethod;
    if ((getFavFolderDeleteMethod = ListenerGrpc.getFavFolderDeleteMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getFavFolderDeleteMethod = ListenerGrpc.getFavFolderDeleteMethod) == null) {
          ListenerGrpc.getFavFolderDeleteMethod = getFavFolderDeleteMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.FavFolderDeleteReq, bilibili.app.listener.v1.FavFolderDeleteResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FavFolderDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavFolderDeleteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.FavFolderDeleteResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("FavFolderDelete"))
              .build();
        }
      }
    }
    return getFavFolderDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PickFeedReq,
      bilibili.app.listener.v1.PickFeedResp> getPickFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PickFeed",
      requestType = bilibili.app.listener.v1.PickFeedReq.class,
      responseType = bilibili.app.listener.v1.PickFeedResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PickFeedReq,
      bilibili.app.listener.v1.PickFeedResp> getPickFeedMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PickFeedReq, bilibili.app.listener.v1.PickFeedResp> getPickFeedMethod;
    if ((getPickFeedMethod = ListenerGrpc.getPickFeedMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPickFeedMethod = ListenerGrpc.getPickFeedMethod) == null) {
          ListenerGrpc.getPickFeedMethod = getPickFeedMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PickFeedReq, bilibili.app.listener.v1.PickFeedResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PickFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PickFeedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PickFeedResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PickFeed"))
              .build();
        }
      }
    }
    return getPickFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.PickCardDetailReq,
      bilibili.app.listener.v1.PickCardDetailResp> getPickCardDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PickCardDetail",
      requestType = bilibili.app.listener.v1.PickCardDetailReq.class,
      responseType = bilibili.app.listener.v1.PickCardDetailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.PickCardDetailReq,
      bilibili.app.listener.v1.PickCardDetailResp> getPickCardDetailMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.PickCardDetailReq, bilibili.app.listener.v1.PickCardDetailResp> getPickCardDetailMethod;
    if ((getPickCardDetailMethod = ListenerGrpc.getPickCardDetailMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getPickCardDetailMethod = ListenerGrpc.getPickCardDetailMethod) == null) {
          ListenerGrpc.getPickCardDetailMethod = getPickCardDetailMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.PickCardDetailReq, bilibili.app.listener.v1.PickCardDetailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PickCardDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PickCardDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.PickCardDetailResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("PickCardDetail"))
              .build();
        }
      }
    }
    return getPickCardDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.MedialistReq,
      bilibili.app.listener.v1.MedialistResp> getMedialistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Medialist",
      requestType = bilibili.app.listener.v1.MedialistReq.class,
      responseType = bilibili.app.listener.v1.MedialistResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.MedialistReq,
      bilibili.app.listener.v1.MedialistResp> getMedialistMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.MedialistReq, bilibili.app.listener.v1.MedialistResp> getMedialistMethod;
    if ((getMedialistMethod = ListenerGrpc.getMedialistMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getMedialistMethod = ListenerGrpc.getMedialistMethod) == null) {
          ListenerGrpc.getMedialistMethod = getMedialistMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.MedialistReq, bilibili.app.listener.v1.MedialistResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Medialist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.MedialistReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.MedialistResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("Medialist"))
              .build();
        }
      }
    }
    return getMedialistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.listener.v1.EventReq,
      bilibili.app.listener.v1.EventResp> getEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Event",
      requestType = bilibili.app.listener.v1.EventReq.class,
      responseType = bilibili.app.listener.v1.EventResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.listener.v1.EventReq,
      bilibili.app.listener.v1.EventResp> getEventMethod() {
    io.grpc.MethodDescriptor<bilibili.app.listener.v1.EventReq, bilibili.app.listener.v1.EventResp> getEventMethod;
    if ((getEventMethod = ListenerGrpc.getEventMethod) == null) {
      synchronized (ListenerGrpc.class) {
        if ((getEventMethod = ListenerGrpc.getEventMethod) == null) {
          ListenerGrpc.getEventMethod = getEventMethod =
              io.grpc.MethodDescriptor.<bilibili.app.listener.v1.EventReq, bilibili.app.listener.v1.EventResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Event"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.EventReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.listener.v1.EventResp.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerMethodDescriptorSupplier("Event"))
              .build();
        }
      }
    }
    return getEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListenerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListenerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListenerStub>() {
        @java.lang.Override
        public ListenerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListenerStub(channel, callOptions);
        }
      };
    return ListenerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListenerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListenerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListenerBlockingStub>() {
        @java.lang.Override
        public ListenerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListenerBlockingStub(channel, callOptions);
        }
      };
    return ListenerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListenerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListenerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListenerFutureStub>() {
        @java.lang.Override
        public ListenerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListenerFutureStub(channel, callOptions);
        }
      };
    return ListenerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 听视频
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取音频URL
     * </pre>
     */
    default void playUrl(bilibili.app.listener.v1.PlayURLReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlayURLResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayUrlMethod(), responseObserver);
    }

    /**
     */
    default void bkarcDetails(bilibili.app.listener.v1.BKArcDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.BKArcDetailsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBkarcDetailsMethod(), responseObserver);
    }

    /**
     */
    default void playlist(bilibili.app.listener.v1.PlaylistReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlaylistResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaylistMethod(), responseObserver);
    }

    /**
     */
    default void playlistAdd(bilibili.app.listener.v1.PlaylistAddReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaylistAddMethod(), responseObserver);
    }

    /**
     */
    default void playlistDel(bilibili.app.listener.v1.PlaylistDelReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaylistDelMethod(), responseObserver);
    }

    /**
     * <pre>
     * 推荐列表
     * </pre>
     */
    default void rcmdPlaylist(bilibili.app.listener.v1.RcmdPlaylistReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.RcmdPlaylistResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRcmdPlaylistMethod(), responseObserver);
    }

    /**
     */
    default void playHistory(bilibili.app.listener.v1.PlayHistoryReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlayHistoryResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * 添加历史记录
     * </pre>
     */
    default void playHistoryAdd(bilibili.app.listener.v1.PlayHistoryAddReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayHistoryAddMethod(), responseObserver);
    }

    /**
     */
    default void playHistoryDel(bilibili.app.listener.v1.PlayHistoryDelReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayHistoryDelMethod(), responseObserver);
    }

    /**
     * <pre>
     * 播放上报
     * </pre>
     */
    default void playActionReport(bilibili.app.listener.v1.PlayActionReportReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayActionReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * 三联
     * </pre>
     */
    default void tripleLike(bilibili.app.listener.v1.TripleLikeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.TripleLikeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTripleLikeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 点赞
     * </pre>
     */
    default void thumbUp(bilibili.app.listener.v1.ThumbUpReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ThumbUpResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getThumbUpMethod(), responseObserver);
    }

    /**
     * <pre>
     * 投币
     * </pre>
     */
    default void coinAdd(bilibili.app.listener.v1.CoinAddReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.CoinAddResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoinAddMethod(), responseObserver);
    }

    /**
     */
    default void favItemAdd(bilibili.app.listener.v1.FavItemAddReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemAddResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavItemAddMethod(), responseObserver);
    }

    /**
     */
    default void favItemDel(bilibili.app.listener.v1.FavItemDelReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemDelResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavItemDelMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量处理收藏
     * </pre>
     */
    default void favItemBatch(bilibili.app.listener.v1.FavItemBatchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemBatchResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavItemBatchMethod(), responseObserver);
    }

    /**
     */
    default void favoredInAnyFolders(bilibili.app.listener.v1.FavoredInAnyFoldersReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavoredInAnyFoldersResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavoredInAnyFoldersMethod(), responseObserver);
    }

    /**
     * <pre>
     * 用户收藏夹列表
     * </pre>
     */
    default void favFolderList(bilibili.app.listener.v1.FavFolderListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavFolderListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 收藏夹详细信息
     * </pre>
     */
    default void favFolderDetail(bilibili.app.listener.v1.FavFolderDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderDetailResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavFolderDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建收藏夹
     * </pre>
     */
    default void favFolderCreate(bilibili.app.listener.v1.FavFolderCreateReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderCreateResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavFolderCreateMethod(), responseObserver);
    }

    /**
     */
    default void favFolderDelete(bilibili.app.listener.v1.FavFolderDeleteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderDeleteResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFavFolderDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 每日播单列表
     * </pre>
     */
    default void pickFeed(bilibili.app.listener.v1.PickFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PickFeedResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPickFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * 每日播单详情
     * </pre>
     */
    default void pickCardDetail(bilibili.app.listener.v1.PickCardDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PickCardDetailResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPickCardDetailMethod(), responseObserver);
    }

    /**
     */
    default void medialist(bilibili.app.listener.v1.MedialistReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.MedialistResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMedialistMethod(), responseObserver);
    }

    /**
     */
    default void event(bilibili.app.listener.v1.EventReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.EventResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Listener.
   * <pre>
   * 听视频
   * </pre>
   */
  public static abstract class ListenerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ListenerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Listener.
   * <pre>
   * 听视频
   * </pre>
   */
  public static final class ListenerStub
      extends io.grpc.stub.AbstractAsyncStub<ListenerStub> {
    private ListenerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListenerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListenerStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取音频URL
     * </pre>
     */
    public void playUrl(bilibili.app.listener.v1.PlayURLReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlayURLResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bkarcDetails(bilibili.app.listener.v1.BKArcDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.BKArcDetailsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBkarcDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playlist(bilibili.app.listener.v1.PlaylistReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlaylistResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaylistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playlistAdd(bilibili.app.listener.v1.PlaylistAddReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaylistAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playlistDel(bilibili.app.listener.v1.PlaylistDelReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaylistDelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 推荐列表
     * </pre>
     */
    public void rcmdPlaylist(bilibili.app.listener.v1.RcmdPlaylistReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.RcmdPlaylistResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRcmdPlaylistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playHistory(bilibili.app.listener.v1.PlayHistoryReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlayHistoryResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 添加历史记录
     * </pre>
     */
    public void playHistoryAdd(bilibili.app.listener.v1.PlayHistoryAddReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayHistoryAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playHistoryDel(bilibili.app.listener.v1.PlayHistoryDelReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayHistoryDelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 播放上报
     * </pre>
     */
    public void playActionReport(bilibili.app.listener.v1.PlayActionReportReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayActionReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 三联
     * </pre>
     */
    public void tripleLike(bilibili.app.listener.v1.TripleLikeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.TripleLikeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTripleLikeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 点赞
     * </pre>
     */
    public void thumbUp(bilibili.app.listener.v1.ThumbUpReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ThumbUpResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getThumbUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 投币
     * </pre>
     */
    public void coinAdd(bilibili.app.listener.v1.CoinAddReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.CoinAddResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCoinAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void favItemAdd(bilibili.app.listener.v1.FavItemAddReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemAddResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavItemAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void favItemDel(bilibili.app.listener.v1.FavItemDelReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemDelResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavItemDelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量处理收藏
     * </pre>
     */
    public void favItemBatch(bilibili.app.listener.v1.FavItemBatchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemBatchResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavItemBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void favoredInAnyFolders(bilibili.app.listener.v1.FavoredInAnyFoldersReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavoredInAnyFoldersResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavoredInAnyFoldersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户收藏夹列表
     * </pre>
     */
    public void favFolderList(bilibili.app.listener.v1.FavFolderListReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavFolderListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 收藏夹详细信息
     * </pre>
     */
    public void favFolderDetail(bilibili.app.listener.v1.FavFolderDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderDetailResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavFolderDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建收藏夹
     * </pre>
     */
    public void favFolderCreate(bilibili.app.listener.v1.FavFolderCreateReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderCreateResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavFolderCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void favFolderDelete(bilibili.app.listener.v1.FavFolderDeleteReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderDeleteResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFavFolderDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 每日播单列表
     * </pre>
     */
    public void pickFeed(bilibili.app.listener.v1.PickFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PickFeedResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPickFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 每日播单详情
     * </pre>
     */
    public void pickCardDetail(bilibili.app.listener.v1.PickCardDetailReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PickCardDetailResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPickCardDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void medialist(bilibili.app.listener.v1.MedialistReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.MedialistResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMedialistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void event(bilibili.app.listener.v1.EventReq request,
        io.grpc.stub.StreamObserver<bilibili.app.listener.v1.EventResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Listener.
   * <pre>
   * 听视频
   * </pre>
   */
  public static final class ListenerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ListenerBlockingStub> {
    private ListenerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListenerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListenerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty ping(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取音频URL
     * </pre>
     */
    public bilibili.app.listener.v1.PlayURLResp playUrl(bilibili.app.listener.v1.PlayURLReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.BKArcDetailsResp bkarcDetails(bilibili.app.listener.v1.BKArcDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBkarcDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.PlaylistResp playlist(bilibili.app.listener.v1.PlaylistReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaylistMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty playlistAdd(bilibili.app.listener.v1.PlaylistAddReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaylistAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty playlistDel(bilibili.app.listener.v1.PlaylistDelReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaylistDelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 推荐列表
     * </pre>
     */
    public bilibili.app.listener.v1.RcmdPlaylistResp rcmdPlaylist(bilibili.app.listener.v1.RcmdPlaylistReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRcmdPlaylistMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.PlayHistoryResp playHistory(bilibili.app.listener.v1.PlayHistoryReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 添加历史记录
     * </pre>
     */
    public com.google.protobuf.Empty playHistoryAdd(bilibili.app.listener.v1.PlayHistoryAddReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayHistoryAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty playHistoryDel(bilibili.app.listener.v1.PlayHistoryDelReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayHistoryDelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 播放上报
     * </pre>
     */
    public com.google.protobuf.Empty playActionReport(bilibili.app.listener.v1.PlayActionReportReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayActionReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 三联
     * </pre>
     */
    public bilibili.app.listener.v1.TripleLikeResp tripleLike(bilibili.app.listener.v1.TripleLikeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTripleLikeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 点赞
     * </pre>
     */
    public bilibili.app.listener.v1.ThumbUpResp thumbUp(bilibili.app.listener.v1.ThumbUpReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getThumbUpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 投币
     * </pre>
     */
    public bilibili.app.listener.v1.CoinAddResp coinAdd(bilibili.app.listener.v1.CoinAddReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCoinAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.FavItemAddResp favItemAdd(bilibili.app.listener.v1.FavItemAddReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavItemAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.FavItemDelResp favItemDel(bilibili.app.listener.v1.FavItemDelReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavItemDelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量处理收藏
     * </pre>
     */
    public bilibili.app.listener.v1.FavItemBatchResp favItemBatch(bilibili.app.listener.v1.FavItemBatchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavItemBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.FavoredInAnyFoldersResp favoredInAnyFolders(bilibili.app.listener.v1.FavoredInAnyFoldersReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavoredInAnyFoldersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户收藏夹列表
     * </pre>
     */
    public bilibili.app.listener.v1.FavFolderListResp favFolderList(bilibili.app.listener.v1.FavFolderListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavFolderListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 收藏夹详细信息
     * </pre>
     */
    public bilibili.app.listener.v1.FavFolderDetailResp favFolderDetail(bilibili.app.listener.v1.FavFolderDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavFolderDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建收藏夹
     * </pre>
     */
    public bilibili.app.listener.v1.FavFolderCreateResp favFolderCreate(bilibili.app.listener.v1.FavFolderCreateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavFolderCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.FavFolderDeleteResp favFolderDelete(bilibili.app.listener.v1.FavFolderDeleteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFavFolderDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 每日播单列表
     * </pre>
     */
    public bilibili.app.listener.v1.PickFeedResp pickFeed(bilibili.app.listener.v1.PickFeedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPickFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 每日播单详情
     * </pre>
     */
    public bilibili.app.listener.v1.PickCardDetailResp pickCardDetail(bilibili.app.listener.v1.PickCardDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPickCardDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.MedialistResp medialist(bilibili.app.listener.v1.MedialistReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMedialistMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.listener.v1.EventResp event(bilibili.app.listener.v1.EventReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Listener.
   * <pre>
   * 听视频
   * </pre>
   */
  public static final class ListenerFutureStub
      extends io.grpc.stub.AbstractFutureStub<ListenerFutureStub> {
    private ListenerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListenerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListenerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取音频URL
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.PlayURLResp> playUrl(
        bilibili.app.listener.v1.PlayURLReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.BKArcDetailsResp> bkarcDetails(
        bilibili.app.listener.v1.BKArcDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBkarcDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.PlaylistResp> playlist(
        bilibili.app.listener.v1.PlaylistReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaylistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> playlistAdd(
        bilibili.app.listener.v1.PlaylistAddReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaylistAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> playlistDel(
        bilibili.app.listener.v1.PlaylistDelReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaylistDelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 推荐列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.RcmdPlaylistResp> rcmdPlaylist(
        bilibili.app.listener.v1.RcmdPlaylistReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRcmdPlaylistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.PlayHistoryResp> playHistory(
        bilibili.app.listener.v1.PlayHistoryReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 添加历史记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> playHistoryAdd(
        bilibili.app.listener.v1.PlayHistoryAddReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayHistoryAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> playHistoryDel(
        bilibili.app.listener.v1.PlayHistoryDelReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayHistoryDelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 播放上报
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> playActionReport(
        bilibili.app.listener.v1.PlayActionReportReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayActionReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 三联
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.TripleLikeResp> tripleLike(
        bilibili.app.listener.v1.TripleLikeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTripleLikeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 点赞
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.ThumbUpResp> thumbUp(
        bilibili.app.listener.v1.ThumbUpReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getThumbUpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 投币
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.CoinAddResp> coinAdd(
        bilibili.app.listener.v1.CoinAddReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCoinAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.FavItemAddResp> favItemAdd(
        bilibili.app.listener.v1.FavItemAddReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavItemAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.FavItemDelResp> favItemDel(
        bilibili.app.listener.v1.FavItemDelReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavItemDelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量处理收藏
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.FavItemBatchResp> favItemBatch(
        bilibili.app.listener.v1.FavItemBatchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavItemBatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.FavoredInAnyFoldersResp> favoredInAnyFolders(
        bilibili.app.listener.v1.FavoredInAnyFoldersReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavoredInAnyFoldersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户收藏夹列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.FavFolderListResp> favFolderList(
        bilibili.app.listener.v1.FavFolderListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavFolderListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 收藏夹详细信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.FavFolderDetailResp> favFolderDetail(
        bilibili.app.listener.v1.FavFolderDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavFolderDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建收藏夹
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.FavFolderCreateResp> favFolderCreate(
        bilibili.app.listener.v1.FavFolderCreateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavFolderCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.FavFolderDeleteResp> favFolderDelete(
        bilibili.app.listener.v1.FavFolderDeleteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFavFolderDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 每日播单列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.PickFeedResp> pickFeed(
        bilibili.app.listener.v1.PickFeedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPickFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 每日播单详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.PickCardDetailResp> pickCardDetail(
        bilibili.app.listener.v1.PickCardDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPickCardDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.MedialistResp> medialist(
        bilibili.app.listener.v1.MedialistReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMedialistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.listener.v1.EventResp> event(
        bilibili.app.listener.v1.EventReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_PLAY_URL = 1;
  private static final int METHODID_BKARC_DETAILS = 2;
  private static final int METHODID_PLAYLIST = 3;
  private static final int METHODID_PLAYLIST_ADD = 4;
  private static final int METHODID_PLAYLIST_DEL = 5;
  private static final int METHODID_RCMD_PLAYLIST = 6;
  private static final int METHODID_PLAY_HISTORY = 7;
  private static final int METHODID_PLAY_HISTORY_ADD = 8;
  private static final int METHODID_PLAY_HISTORY_DEL = 9;
  private static final int METHODID_PLAY_ACTION_REPORT = 10;
  private static final int METHODID_TRIPLE_LIKE = 11;
  private static final int METHODID_THUMB_UP = 12;
  private static final int METHODID_COIN_ADD = 13;
  private static final int METHODID_FAV_ITEM_ADD = 14;
  private static final int METHODID_FAV_ITEM_DEL = 15;
  private static final int METHODID_FAV_ITEM_BATCH = 16;
  private static final int METHODID_FAVORED_IN_ANY_FOLDERS = 17;
  private static final int METHODID_FAV_FOLDER_LIST = 18;
  private static final int METHODID_FAV_FOLDER_DETAIL = 19;
  private static final int METHODID_FAV_FOLDER_CREATE = 20;
  private static final int METHODID_FAV_FOLDER_DELETE = 21;
  private static final int METHODID_PICK_FEED = 22;
  private static final int METHODID_PICK_CARD_DETAIL = 23;
  private static final int METHODID_MEDIALIST = 24;
  private static final int METHODID_EVENT = 25;

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
        case METHODID_PING:
          serviceImpl.ping((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PLAY_URL:
          serviceImpl.playUrl((bilibili.app.listener.v1.PlayURLReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlayURLResp>) responseObserver);
          break;
        case METHODID_BKARC_DETAILS:
          serviceImpl.bkarcDetails((bilibili.app.listener.v1.BKArcDetailsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.BKArcDetailsResp>) responseObserver);
          break;
        case METHODID_PLAYLIST:
          serviceImpl.playlist((bilibili.app.listener.v1.PlaylistReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlaylistResp>) responseObserver);
          break;
        case METHODID_PLAYLIST_ADD:
          serviceImpl.playlistAdd((bilibili.app.listener.v1.PlaylistAddReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PLAYLIST_DEL:
          serviceImpl.playlistDel((bilibili.app.listener.v1.PlaylistDelReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RCMD_PLAYLIST:
          serviceImpl.rcmdPlaylist((bilibili.app.listener.v1.RcmdPlaylistReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.RcmdPlaylistResp>) responseObserver);
          break;
        case METHODID_PLAY_HISTORY:
          serviceImpl.playHistory((bilibili.app.listener.v1.PlayHistoryReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PlayHistoryResp>) responseObserver);
          break;
        case METHODID_PLAY_HISTORY_ADD:
          serviceImpl.playHistoryAdd((bilibili.app.listener.v1.PlayHistoryAddReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PLAY_HISTORY_DEL:
          serviceImpl.playHistoryDel((bilibili.app.listener.v1.PlayHistoryDelReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PLAY_ACTION_REPORT:
          serviceImpl.playActionReport((bilibili.app.listener.v1.PlayActionReportReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TRIPLE_LIKE:
          serviceImpl.tripleLike((bilibili.app.listener.v1.TripleLikeReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.TripleLikeResp>) responseObserver);
          break;
        case METHODID_THUMB_UP:
          serviceImpl.thumbUp((bilibili.app.listener.v1.ThumbUpReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.ThumbUpResp>) responseObserver);
          break;
        case METHODID_COIN_ADD:
          serviceImpl.coinAdd((bilibili.app.listener.v1.CoinAddReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.CoinAddResp>) responseObserver);
          break;
        case METHODID_FAV_ITEM_ADD:
          serviceImpl.favItemAdd((bilibili.app.listener.v1.FavItemAddReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemAddResp>) responseObserver);
          break;
        case METHODID_FAV_ITEM_DEL:
          serviceImpl.favItemDel((bilibili.app.listener.v1.FavItemDelReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemDelResp>) responseObserver);
          break;
        case METHODID_FAV_ITEM_BATCH:
          serviceImpl.favItemBatch((bilibili.app.listener.v1.FavItemBatchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavItemBatchResp>) responseObserver);
          break;
        case METHODID_FAVORED_IN_ANY_FOLDERS:
          serviceImpl.favoredInAnyFolders((bilibili.app.listener.v1.FavoredInAnyFoldersReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavoredInAnyFoldersResp>) responseObserver);
          break;
        case METHODID_FAV_FOLDER_LIST:
          serviceImpl.favFolderList((bilibili.app.listener.v1.FavFolderListReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderListResp>) responseObserver);
          break;
        case METHODID_FAV_FOLDER_DETAIL:
          serviceImpl.favFolderDetail((bilibili.app.listener.v1.FavFolderDetailReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderDetailResp>) responseObserver);
          break;
        case METHODID_FAV_FOLDER_CREATE:
          serviceImpl.favFolderCreate((bilibili.app.listener.v1.FavFolderCreateReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderCreateResp>) responseObserver);
          break;
        case METHODID_FAV_FOLDER_DELETE:
          serviceImpl.favFolderDelete((bilibili.app.listener.v1.FavFolderDeleteReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.FavFolderDeleteResp>) responseObserver);
          break;
        case METHODID_PICK_FEED:
          serviceImpl.pickFeed((bilibili.app.listener.v1.PickFeedReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PickFeedResp>) responseObserver);
          break;
        case METHODID_PICK_CARD_DETAIL:
          serviceImpl.pickCardDetail((bilibili.app.listener.v1.PickCardDetailReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.PickCardDetailResp>) responseObserver);
          break;
        case METHODID_MEDIALIST:
          serviceImpl.medialist((bilibili.app.listener.v1.MedialistReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.MedialistResp>) responseObserver);
          break;
        case METHODID_EVENT:
          serviceImpl.event((bilibili.app.listener.v1.EventReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.listener.v1.EventResp>) responseObserver);
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
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_PING)))
        .addMethod(
          getPlayUrlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PlayURLReq,
              bilibili.app.listener.v1.PlayURLResp>(
                service, METHODID_PLAY_URL)))
        .addMethod(
          getBkarcDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.BKArcDetailsReq,
              bilibili.app.listener.v1.BKArcDetailsResp>(
                service, METHODID_BKARC_DETAILS)))
        .addMethod(
          getPlaylistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PlaylistReq,
              bilibili.app.listener.v1.PlaylistResp>(
                service, METHODID_PLAYLIST)))
        .addMethod(
          getPlaylistAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PlaylistAddReq,
              com.google.protobuf.Empty>(
                service, METHODID_PLAYLIST_ADD)))
        .addMethod(
          getPlaylistDelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PlaylistDelReq,
              com.google.protobuf.Empty>(
                service, METHODID_PLAYLIST_DEL)))
        .addMethod(
          getRcmdPlaylistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.RcmdPlaylistReq,
              bilibili.app.listener.v1.RcmdPlaylistResp>(
                service, METHODID_RCMD_PLAYLIST)))
        .addMethod(
          getPlayHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PlayHistoryReq,
              bilibili.app.listener.v1.PlayHistoryResp>(
                service, METHODID_PLAY_HISTORY)))
        .addMethod(
          getPlayHistoryAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PlayHistoryAddReq,
              com.google.protobuf.Empty>(
                service, METHODID_PLAY_HISTORY_ADD)))
        .addMethod(
          getPlayHistoryDelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PlayHistoryDelReq,
              com.google.protobuf.Empty>(
                service, METHODID_PLAY_HISTORY_DEL)))
        .addMethod(
          getPlayActionReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PlayActionReportReq,
              com.google.protobuf.Empty>(
                service, METHODID_PLAY_ACTION_REPORT)))
        .addMethod(
          getTripleLikeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.TripleLikeReq,
              bilibili.app.listener.v1.TripleLikeResp>(
                service, METHODID_TRIPLE_LIKE)))
        .addMethod(
          getThumbUpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.ThumbUpReq,
              bilibili.app.listener.v1.ThumbUpResp>(
                service, METHODID_THUMB_UP)))
        .addMethod(
          getCoinAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.CoinAddReq,
              bilibili.app.listener.v1.CoinAddResp>(
                service, METHODID_COIN_ADD)))
        .addMethod(
          getFavItemAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.FavItemAddReq,
              bilibili.app.listener.v1.FavItemAddResp>(
                service, METHODID_FAV_ITEM_ADD)))
        .addMethod(
          getFavItemDelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.FavItemDelReq,
              bilibili.app.listener.v1.FavItemDelResp>(
                service, METHODID_FAV_ITEM_DEL)))
        .addMethod(
          getFavItemBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.FavItemBatchReq,
              bilibili.app.listener.v1.FavItemBatchResp>(
                service, METHODID_FAV_ITEM_BATCH)))
        .addMethod(
          getFavoredInAnyFoldersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.FavoredInAnyFoldersReq,
              bilibili.app.listener.v1.FavoredInAnyFoldersResp>(
                service, METHODID_FAVORED_IN_ANY_FOLDERS)))
        .addMethod(
          getFavFolderListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.FavFolderListReq,
              bilibili.app.listener.v1.FavFolderListResp>(
                service, METHODID_FAV_FOLDER_LIST)))
        .addMethod(
          getFavFolderDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.FavFolderDetailReq,
              bilibili.app.listener.v1.FavFolderDetailResp>(
                service, METHODID_FAV_FOLDER_DETAIL)))
        .addMethod(
          getFavFolderCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.FavFolderCreateReq,
              bilibili.app.listener.v1.FavFolderCreateResp>(
                service, METHODID_FAV_FOLDER_CREATE)))
        .addMethod(
          getFavFolderDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.FavFolderDeleteReq,
              bilibili.app.listener.v1.FavFolderDeleteResp>(
                service, METHODID_FAV_FOLDER_DELETE)))
        .addMethod(
          getPickFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PickFeedReq,
              bilibili.app.listener.v1.PickFeedResp>(
                service, METHODID_PICK_FEED)))
        .addMethod(
          getPickCardDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.PickCardDetailReq,
              bilibili.app.listener.v1.PickCardDetailResp>(
                service, METHODID_PICK_CARD_DETAIL)))
        .addMethod(
          getMedialistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.MedialistReq,
              bilibili.app.listener.v1.MedialistResp>(
                service, METHODID_MEDIALIST)))
        .addMethod(
          getEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.listener.v1.EventReq,
              bilibili.app.listener.v1.EventResp>(
                service, METHODID_EVENT)))
        .build();
  }

  private static abstract class ListenerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListenerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.listener.v1.ListenerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Listener");
    }
  }

  private static final class ListenerFileDescriptorSupplier
      extends ListenerBaseDescriptorSupplier {
    ListenerFileDescriptorSupplier() {}
  }

  private static final class ListenerMethodDescriptorSupplier
      extends ListenerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ListenerMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ListenerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListenerFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getPlayUrlMethod())
              .addMethod(getBkarcDetailsMethod())
              .addMethod(getPlaylistMethod())
              .addMethod(getPlaylistAddMethod())
              .addMethod(getPlaylistDelMethod())
              .addMethod(getRcmdPlaylistMethod())
              .addMethod(getPlayHistoryMethod())
              .addMethod(getPlayHistoryAddMethod())
              .addMethod(getPlayHistoryDelMethod())
              .addMethod(getPlayActionReportMethod())
              .addMethod(getTripleLikeMethod())
              .addMethod(getThumbUpMethod())
              .addMethod(getCoinAddMethod())
              .addMethod(getFavItemAddMethod())
              .addMethod(getFavItemDelMethod())
              .addMethod(getFavItemBatchMethod())
              .addMethod(getFavoredInAnyFoldersMethod())
              .addMethod(getFavFolderListMethod())
              .addMethod(getFavFolderDetailMethod())
              .addMethod(getFavFolderCreateMethod())
              .addMethod(getFavFolderDeleteMethod())
              .addMethod(getPickFeedMethod())
              .addMethod(getPickCardDetailMethod())
              .addMethod(getMedialistMethod())
              .addMethod(getEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
