package bilibili.app.dynamic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * v1动态
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/dynamic/v1/dynamic.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DynamicGrpc {

  private DynamicGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.dynamic.v1.Dynamic";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply> getDynVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynVideo",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply> getDynVideoMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply> getDynVideoMethod;
    if ((getDynVideoMethod = DynamicGrpc.getDynVideoMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynVideoMethod = DynamicGrpc.getDynVideoMethod) == null) {
          DynamicGrpc.getDynVideoMethod = getDynVideoMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynVideo"))
              .build();
        }
      }
    }
    return getDynVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply> getDynDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynDetails",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply> getDynDetailsMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply> getDynDetailsMethod;
    if ((getDynDetailsMethod = DynamicGrpc.getDynDetailsMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynDetailsMethod = DynamicGrpc.getDynDetailsMethod) == null) {
          DynamicGrpc.getDynDetailsMethod = getDynDetailsMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynDetails"))
              .build();
        }
      }
    }
    return getDynDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply> getSVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SVideo",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply> getSVideoMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq, bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply> getSVideoMethod;
    if ((getSVideoMethod = DynamicGrpc.getSVideoMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getSVideoMethod = DynamicGrpc.getSVideoMethod) == null) {
          DynamicGrpc.getSVideoMethod = getSVideoMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq, bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("SVideo"))
              .build();
        }
      }
    }
    return getSVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply> getDynTabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynTab",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply> getDynTabMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply> getDynTabMethod;
    if ((getDynTabMethod = DynamicGrpc.getDynTabMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynTabMethod = DynamicGrpc.getDynTabMethod) == null) {
          DynamicGrpc.getDynTabMethod = getDynTabMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynTab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynTab"))
              .build();
        }
      }
    }
    return getDynTabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> getDynOurCitySwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynOurCitySwitch",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> getDynOurCitySwitchMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq, bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> getDynOurCitySwitchMethod;
    if ((getDynOurCitySwitchMethod = DynamicGrpc.getDynOurCitySwitchMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynOurCitySwitchMethod = DynamicGrpc.getDynOurCitySwitchMethod) == null) {
          DynamicGrpc.getDynOurCitySwitchMethod = getDynOurCitySwitchMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq, bilibili.app.dynamic.v1.DynamicRpcProto.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynOurCitySwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynOurCitySwitch"))
              .build();
        }
      }
    }
    return getDynOurCitySwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply> getDynOurCityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynOurCity",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply> getDynOurCityMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply> getDynOurCityMethod;
    if ((getDynOurCityMethod = DynamicGrpc.getDynOurCityMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynOurCityMethod = DynamicGrpc.getDynOurCityMethod) == null) {
          DynamicGrpc.getDynOurCityMethod = getDynOurCityMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynOurCity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynOurCity"))
              .build();
        }
      }
    }
    return getDynOurCityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply> getDynVideoPersonalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynVideoPersonal",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply> getDynVideoPersonalMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply> getDynVideoPersonalMethod;
    if ((getDynVideoPersonalMethod = DynamicGrpc.getDynVideoPersonalMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynVideoPersonalMethod = DynamicGrpc.getDynVideoPersonalMethod) == null) {
          DynamicGrpc.getDynVideoPersonalMethod = getDynVideoPersonalMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynVideoPersonal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynVideoPersonal"))
              .build();
        }
      }
    }
    return getDynVideoPersonalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> getDynUpdOffsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynUpdOffset",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> getDynUpdOffsetMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq, bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> getDynUpdOffsetMethod;
    if ((getDynUpdOffsetMethod = DynamicGrpc.getDynUpdOffsetMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynUpdOffsetMethod = DynamicGrpc.getDynUpdOffsetMethod) == null) {
          DynamicGrpc.getDynUpdOffsetMethod = getDynUpdOffsetMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq, bilibili.app.dynamic.v1.DynamicRpcProto.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynUpdOffset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynUpdOffset"))
              .build();
        }
      }
    }
    return getDynUpdOffsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply> getDynRedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynRed",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply> getDynRedMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply> getDynRedMethod;
    if ((getDynRedMethod = DynamicGrpc.getDynRedMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynRedMethod = DynamicGrpc.getDynRedMethod) == null) {
          DynamicGrpc.getDynRedMethod = getDynRedMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynRed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynRed"))
              .build();
        }
      }
    }
    return getDynRedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.NoReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply> getDynMixUpListViewMoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynMixUpListViewMore",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.NoReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.NoReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply> getDynMixUpListViewMoreMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.NoReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply> getDynMixUpListViewMoreMethod;
    if ((getDynMixUpListViewMoreMethod = DynamicGrpc.getDynMixUpListViewMoreMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynMixUpListViewMoreMethod = DynamicGrpc.getDynMixUpListViewMoreMethod) == null) {
          DynamicGrpc.getDynMixUpListViewMoreMethod = getDynMixUpListViewMoreMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.NoReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynMixUpListViewMore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.NoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynMixUpListViewMore"))
              .build();
        }
      }
    }
    return getDynMixUpListViewMoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply> getDynMixUpListSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DynMixUpListSearch",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply> getDynMixUpListSearchMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply> getDynMixUpListSearchMethod;
    if ((getDynMixUpListSearchMethod = DynamicGrpc.getDynMixUpListSearchMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getDynMixUpListSearchMethod = DynamicGrpc.getDynMixUpListSearchMethod) == null) {
          DynamicGrpc.getDynMixUpListSearchMethod = getDynMixUpListSearchMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq, bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DynMixUpListSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("DynMixUpListSearch"))
              .build();
        }
      }
    }
    return getDynMixUpListSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply> getOurCityClickReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OurCityClickReport",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply> getOurCityClickReportMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq, bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply> getOurCityClickReportMethod;
    if ((getOurCityClickReportMethod = DynamicGrpc.getOurCityClickReportMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getOurCityClickReportMethod = DynamicGrpc.getOurCityClickReportMethod) == null) {
          DynamicGrpc.getOurCityClickReportMethod = getOurCityClickReportMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq, bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OurCityClickReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("OurCityClickReport"))
              .build();
        }
      }
    }
    return getOurCityClickReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply> getGeoCoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeoCoder",
      requestType = bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq.class,
      responseType = bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq,
      bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply> getGeoCoderMethod() {
    io.grpc.MethodDescriptor<bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq, bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply> getGeoCoderMethod;
    if ((getGeoCoderMethod = DynamicGrpc.getGeoCoderMethod) == null) {
      synchronized (DynamicGrpc.class) {
        if ((getGeoCoderMethod = DynamicGrpc.getGeoCoderMethod) == null) {
          DynamicGrpc.getGeoCoderMethod = getGeoCoderMethod =
              io.grpc.MethodDescriptor.<bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq, bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeoCoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicMethodDescriptorSupplier("GeoCoder"))
              .build();
        }
      }
    }
    return getGeoCoderMethod;
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
   * v1动态
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 动态视频页
     * </pre>
     */
    default void dynVideo(bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量动态id获取动态详情
     * </pre>
     */
    default void dynDetails(bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 小视频连播页
     * </pre>
     */
    default void sVideo(bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态tab页
     * </pre>
     */
    default void dynTab(bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynTabMethod(), responseObserver);
    }

    /**
     * <pre>
     * 同城接口开关
     * </pre>
     */
    default void dynOurCitySwitch(bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynOurCitySwitchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态同城页
     * </pre>
     */
    default void dynOurCity(bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynOurCityMethod(), responseObserver);
    }

    /**
     * <pre>
     * 最近访问-个人视频feed流
     * </pre>
     */
    default void dynVideoPersonal(bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynVideoPersonalMethod(), responseObserver);
    }

    /**
     * <pre>
     * 最近访问-标记已读
     * </pre>
     */
    default void dynUpdOffset(bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynUpdOffsetMethod(), responseObserver);
    }

    /**
     * <pre>
     * 动态红点接口
     * </pre>
     */
    default void dynRed(bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynRedMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查看更多-列表
     * </pre>
     */
    default void dynMixUpListViewMore(bilibili.app.dynamic.v1.DynamicRpcProto.NoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynMixUpListViewMoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查看更多-搜索
     * </pre>
     */
    default void dynMixUpListSearch(bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDynMixUpListSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 同城点击上报
     * </pre>
     */
    default void ourCityClickReport(bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOurCityClickReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * 位置定位
     * </pre>
     */
    default void geoCoder(bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeoCoderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Dynamic.
   * <pre>
   * v1动态
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
   * v1动态
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
     * 动态视频页
     * </pre>
     */
    public void dynVideo(bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量动态id获取动态详情
     * </pre>
     */
    public void dynDetails(bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 小视频连播页
     * </pre>
     */
    public void sVideo(bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态tab页
     * </pre>
     */
    public void dynTab(bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynTabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 同城接口开关
     * </pre>
     */
    public void dynOurCitySwitch(bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynOurCitySwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态同城页
     * </pre>
     */
    public void dynOurCity(bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynOurCityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 最近访问-个人视频feed流
     * </pre>
     */
    public void dynVideoPersonal(bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynVideoPersonalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 最近访问-标记已读
     * </pre>
     */
    public void dynUpdOffset(bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynUpdOffsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 动态红点接口
     * </pre>
     */
    public void dynRed(bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynRedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查看更多-列表
     * </pre>
     */
    public void dynMixUpListViewMore(bilibili.app.dynamic.v1.DynamicRpcProto.NoReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynMixUpListViewMoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查看更多-搜索
     * </pre>
     */
    public void dynMixUpListSearch(bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDynMixUpListSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 同城点击上报
     * </pre>
     */
    public void ourCityClickReport(bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOurCityClickReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 位置定位
     * </pre>
     */
    public void geoCoder(bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq request,
        io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeoCoderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Dynamic.
   * <pre>
   * v1动态
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
     * 动态视频页
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply dynVideo(bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量动态id获取动态详情
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply dynDetails(bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 小视频连播页
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply sVideo(bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态tab页
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply dynTab(bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynTabMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 同城接口开关
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.NoReply dynOurCitySwitch(bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynOurCitySwitchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态同城页
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply dynOurCity(bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynOurCityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 最近访问-个人视频feed流
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply dynVideoPersonal(bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynVideoPersonalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 最近访问-标记已读
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.NoReply dynUpdOffset(bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynUpdOffsetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 动态红点接口
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply dynRed(bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynRedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查看更多-列表
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply dynMixUpListViewMore(bilibili.app.dynamic.v1.DynamicRpcProto.NoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynMixUpListViewMoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查看更多-搜索
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply dynMixUpListSearch(bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDynMixUpListSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 同城点击上报
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply ourCityClickReport(bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOurCityClickReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 位置定位
     * </pre>
     */
    public bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply geoCoder(bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeoCoderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Dynamic.
   * <pre>
   * v1动态
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
     * 动态视频页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply> dynVideo(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynVideoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量动态id获取动态详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply> dynDetails(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 小视频连播页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply> sVideo(
        bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSVideoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态tab页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply> dynTab(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynTabMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 同城接口开关
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> dynOurCitySwitch(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynOurCitySwitchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态同城页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply> dynOurCity(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynOurCityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 最近访问-个人视频feed流
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply> dynVideoPersonal(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynVideoPersonalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 最近访问-标记已读
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.NoReply> dynUpdOffset(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynUpdOffsetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 动态红点接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply> dynRed(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynRedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查看更多-列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply> dynMixUpListViewMore(
        bilibili.app.dynamic.v1.DynamicRpcProto.NoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynMixUpListViewMoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查看更多-搜索
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply> dynMixUpListSearch(
        bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDynMixUpListSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 同城点击上报
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply> ourCityClickReport(
        bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOurCityClickReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 位置定位
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply> geoCoder(
        bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeoCoderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DYN_VIDEO = 0;
  private static final int METHODID_DYN_DETAILS = 1;
  private static final int METHODID_SVIDEO = 2;
  private static final int METHODID_DYN_TAB = 3;
  private static final int METHODID_DYN_OUR_CITY_SWITCH = 4;
  private static final int METHODID_DYN_OUR_CITY = 5;
  private static final int METHODID_DYN_VIDEO_PERSONAL = 6;
  private static final int METHODID_DYN_UPD_OFFSET = 7;
  private static final int METHODID_DYN_RED = 8;
  private static final int METHODID_DYN_MIX_UP_LIST_VIEW_MORE = 9;
  private static final int METHODID_DYN_MIX_UP_LIST_SEARCH = 10;
  private static final int METHODID_OUR_CITY_CLICK_REPORT = 11;
  private static final int METHODID_GEO_CODER = 12;

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
        case METHODID_DYN_VIDEO:
          serviceImpl.dynVideo((bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply>) responseObserver);
          break;
        case METHODID_DYN_DETAILS:
          serviceImpl.dynDetails((bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply>) responseObserver);
          break;
        case METHODID_SVIDEO:
          serviceImpl.sVideo((bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply>) responseObserver);
          break;
        case METHODID_DYN_TAB:
          serviceImpl.dynTab((bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply>) responseObserver);
          break;
        case METHODID_DYN_OUR_CITY_SWITCH:
          serviceImpl.dynOurCitySwitch((bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.NoReply>) responseObserver);
          break;
        case METHODID_DYN_OUR_CITY:
          serviceImpl.dynOurCity((bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply>) responseObserver);
          break;
        case METHODID_DYN_VIDEO_PERSONAL:
          serviceImpl.dynVideoPersonal((bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply>) responseObserver);
          break;
        case METHODID_DYN_UPD_OFFSET:
          serviceImpl.dynUpdOffset((bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.NoReply>) responseObserver);
          break;
        case METHODID_DYN_RED:
          serviceImpl.dynRed((bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply>) responseObserver);
          break;
        case METHODID_DYN_MIX_UP_LIST_VIEW_MORE:
          serviceImpl.dynMixUpListViewMore((bilibili.app.dynamic.v1.DynamicRpcProto.NoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply>) responseObserver);
          break;
        case METHODID_DYN_MIX_UP_LIST_SEARCH:
          serviceImpl.dynMixUpListSearch((bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply>) responseObserver);
          break;
        case METHODID_OUR_CITY_CLICK_REPORT:
          serviceImpl.ourCityClickReport((bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply>) responseObserver);
          break;
        case METHODID_GEO_CODER:
          serviceImpl.geoCoder((bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply>) responseObserver);
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
          getDynVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoReqReply>(
                service, METHODID_DYN_VIDEO)))
        .addMethod(
          getDynDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.DynDetailsReply>(
                service, METHODID_DYN_DETAILS)))
        .addMethod(
          getSVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.SVideoReply>(
                service, METHODID_SVIDEO)))
        .addMethod(
          getDynTabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.DynTabReply>(
                service, METHODID_DYN_TAB)))
        .addMethod(
          getDynOurCitySwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCitySwitchReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.NoReply>(
                service, METHODID_DYN_OUR_CITY_SWITCH)))
        .addMethod(
          getDynOurCityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.DynOurCityReply>(
                service, METHODID_DYN_OUR_CITY)))
        .addMethod(
          getDynVideoPersonalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.DynVideoPersonalReply>(
                service, METHODID_DYN_VIDEO_PERSONAL)))
        .addMethod(
          getDynUpdOffsetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynUpdOffsetReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.NoReply>(
                service, METHODID_DYN_UPD_OFFSET)))
        .addMethod(
          getDynRedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.DynRedReply>(
                service, METHODID_DYN_RED)))
        .addMethod(
          getDynMixUpListViewMoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.NoReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListViewMoreReply>(
                service, METHODID_DYN_MIX_UP_LIST_VIEW_MORE)))
        .addMethod(
          getDynMixUpListSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.DynMixUpListSearchReply>(
                service, METHODID_DYN_MIX_UP_LIST_SEARCH)))
        .addMethod(
          getOurCityClickReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.OurCityClickReportReply>(
                service, METHODID_OUR_CITY_CLICK_REPORT)))
        .addMethod(
          getGeoCoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReq,
              bilibili.app.dynamic.v1.DynamicRpcProto.GeoCoderReply>(
                service, METHODID_GEO_CODER)))
        .build();
  }

  private static abstract class DynamicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DynamicBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.dynamic.v1.DynamicRpcProto.getDescriptor();
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
              .addMethod(getDynVideoMethod())
              .addMethod(getDynDetailsMethod())
              .addMethod(getSVideoMethod())
              .addMethod(getDynTabMethod())
              .addMethod(getDynOurCitySwitchMethod())
              .addMethod(getDynOurCityMethod())
              .addMethod(getDynVideoPersonalMethod())
              .addMethod(getDynUpdOffsetMethod())
              .addMethod(getDynRedMethod())
              .addMethod(getDynMixUpListViewMoreMethod())
              .addMethod(getDynMixUpListSearchMethod())
              .addMethod(getOurCityClickReportMethod())
              .addMethod(getGeoCoderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
