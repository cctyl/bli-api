package bilibili.app.view.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/app/view/v1/view.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ViewGrpc {

  private ViewGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.view.v1.View";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewReq,
      bilibili.app.view.v1.ViewReply> getViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "View",
      requestType = bilibili.app.view.v1.ViewReq.class,
      responseType = bilibili.app.view.v1.ViewReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewReq,
      bilibili.app.view.v1.ViewReply> getViewMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewReq, bilibili.app.view.v1.ViewReply> getViewMethod;
    if ((getViewMethod = ViewGrpc.getViewMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getViewMethod = ViewGrpc.getViewMethod) == null) {
          ViewGrpc.getViewMethod = getViewMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ViewReq, bilibili.app.view.v1.ViewReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "View"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ViewReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ViewReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("View"))
              .build();
        }
      }
    }
    return getViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewTagReq,
      bilibili.app.view.v1.ViewTagReply> getViewTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewTag",
      requestType = bilibili.app.view.v1.ViewTagReq.class,
      responseType = bilibili.app.view.v1.ViewTagReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewTagReq,
      bilibili.app.view.v1.ViewTagReply> getViewTagMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewTagReq, bilibili.app.view.v1.ViewTagReply> getViewTagMethod;
    if ((getViewTagMethod = ViewGrpc.getViewTagMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getViewTagMethod = ViewGrpc.getViewTagMethod) == null) {
          ViewGrpc.getViewTagMethod = getViewTagMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ViewTagReq, bilibili.app.view.v1.ViewTagReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ViewTagReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ViewTagReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ViewTag"))
              .build();
        }
      }
    }
    return getViewTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewMaterialReq,
      bilibili.app.view.v1.ViewMaterialReply> getViewMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMaterial",
      requestType = bilibili.app.view.v1.ViewMaterialReq.class,
      responseType = bilibili.app.view.v1.ViewMaterialReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewMaterialReq,
      bilibili.app.view.v1.ViewMaterialReply> getViewMaterialMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewMaterialReq, bilibili.app.view.v1.ViewMaterialReply> getViewMaterialMethod;
    if ((getViewMaterialMethod = ViewGrpc.getViewMaterialMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getViewMaterialMethod = ViewGrpc.getViewMaterialMethod) == null) {
          ViewGrpc.getViewMaterialMethod = getViewMaterialMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ViewMaterialReq, bilibili.app.view.v1.ViewMaterialReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ViewMaterialReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ViewMaterialReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ViewMaterial"))
              .build();
        }
      }
    }
    return getViewMaterialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewProgressReq,
      bilibili.app.view.v1.ViewProgressReply> getViewProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProgress",
      requestType = bilibili.app.view.v1.ViewProgressReq.class,
      responseType = bilibili.app.view.v1.ViewProgressReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewProgressReq,
      bilibili.app.view.v1.ViewProgressReply> getViewProgressMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ViewProgressReq, bilibili.app.view.v1.ViewProgressReply> getViewProgressMethod;
    if ((getViewProgressMethod = ViewGrpc.getViewProgressMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getViewProgressMethod = ViewGrpc.getViewProgressMethod) == null) {
          ViewGrpc.getViewProgressMethod = getViewProgressMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ViewProgressReq, bilibili.app.view.v1.ViewProgressReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ViewProgressReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ViewProgressReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ViewProgress"))
              .build();
        }
      }
    }
    return getViewProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ShortFormVideoDownloadReq,
      bilibili.app.view.v1.ShortFormVideoDownloadReply> getShortFormVideoDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShortFormVideoDownload",
      requestType = bilibili.app.view.v1.ShortFormVideoDownloadReq.class,
      responseType = bilibili.app.view.v1.ShortFormVideoDownloadReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ShortFormVideoDownloadReq,
      bilibili.app.view.v1.ShortFormVideoDownloadReply> getShortFormVideoDownloadMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ShortFormVideoDownloadReq, bilibili.app.view.v1.ShortFormVideoDownloadReply> getShortFormVideoDownloadMethod;
    if ((getShortFormVideoDownloadMethod = ViewGrpc.getShortFormVideoDownloadMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getShortFormVideoDownloadMethod = ViewGrpc.getShortFormVideoDownloadMethod) == null) {
          ViewGrpc.getShortFormVideoDownloadMethod = getShortFormVideoDownloadMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ShortFormVideoDownloadReq, bilibili.app.view.v1.ShortFormVideoDownloadReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShortFormVideoDownload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ShortFormVideoDownloadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ShortFormVideoDownloadReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ShortFormVideoDownload"))
              .build();
        }
      }
    }
    return getShortFormVideoDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ClickPlayerCardReq,
      bilibili.app.view.v1.NoReply> getClickPlayerCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClickPlayerCard",
      requestType = bilibili.app.view.v1.ClickPlayerCardReq.class,
      responseType = bilibili.app.view.v1.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ClickPlayerCardReq,
      bilibili.app.view.v1.NoReply> getClickPlayerCardMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ClickPlayerCardReq, bilibili.app.view.v1.NoReply> getClickPlayerCardMethod;
    if ((getClickPlayerCardMethod = ViewGrpc.getClickPlayerCardMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getClickPlayerCardMethod = ViewGrpc.getClickPlayerCardMethod) == null) {
          ViewGrpc.getClickPlayerCardMethod = getClickPlayerCardMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ClickPlayerCardReq, bilibili.app.view.v1.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClickPlayerCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ClickPlayerCardReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ClickPlayerCard"))
              .build();
        }
      }
    }
    return getClickPlayerCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ClickActivitySeasonReq,
      bilibili.app.view.v1.NoReply> getClickActivitySeasonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClickActivitySeason",
      requestType = bilibili.app.view.v1.ClickActivitySeasonReq.class,
      responseType = bilibili.app.view.v1.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ClickActivitySeasonReq,
      bilibili.app.view.v1.NoReply> getClickActivitySeasonMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ClickActivitySeasonReq, bilibili.app.view.v1.NoReply> getClickActivitySeasonMethod;
    if ((getClickActivitySeasonMethod = ViewGrpc.getClickActivitySeasonMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getClickActivitySeasonMethod = ViewGrpc.getClickActivitySeasonMethod) == null) {
          ViewGrpc.getClickActivitySeasonMethod = getClickActivitySeasonMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ClickActivitySeasonReq, bilibili.app.view.v1.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClickActivitySeason"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ClickActivitySeasonReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ClickActivitySeason"))
              .build();
        }
      }
    }
    return getClickActivitySeasonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonReq,
      bilibili.app.view.v1.SeasonReply> getSeasonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Season",
      requestType = bilibili.app.view.v1.SeasonReq.class,
      responseType = bilibili.app.view.v1.SeasonReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonReq,
      bilibili.app.view.v1.SeasonReply> getSeasonMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonReq, bilibili.app.view.v1.SeasonReply> getSeasonMethod;
    if ((getSeasonMethod = ViewGrpc.getSeasonMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getSeasonMethod = ViewGrpc.getSeasonMethod) == null) {
          ViewGrpc.getSeasonMethod = getSeasonMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.SeasonReq, bilibili.app.view.v1.SeasonReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Season"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.SeasonReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.SeasonReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("Season"))
              .build();
        }
      }
    }
    return getSeasonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ExposePlayerCardReq,
      bilibili.app.view.v1.NoReply> getExposePlayerCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExposePlayerCard",
      requestType = bilibili.app.view.v1.ExposePlayerCardReq.class,
      responseType = bilibili.app.view.v1.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ExposePlayerCardReq,
      bilibili.app.view.v1.NoReply> getExposePlayerCardMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ExposePlayerCardReq, bilibili.app.view.v1.NoReply> getExposePlayerCardMethod;
    if ((getExposePlayerCardMethod = ViewGrpc.getExposePlayerCardMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getExposePlayerCardMethod = ViewGrpc.getExposePlayerCardMethod) == null) {
          ViewGrpc.getExposePlayerCardMethod = getExposePlayerCardMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ExposePlayerCardReq, bilibili.app.view.v1.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExposePlayerCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ExposePlayerCardReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ExposePlayerCard"))
              .build();
        }
      }
    }
    return getExposePlayerCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.AddContractReq,
      bilibili.app.view.v1.NoReply> getAddContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddContract",
      requestType = bilibili.app.view.v1.AddContractReq.class,
      responseType = bilibili.app.view.v1.NoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.AddContractReq,
      bilibili.app.view.v1.NoReply> getAddContractMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.AddContractReq, bilibili.app.view.v1.NoReply> getAddContractMethod;
    if ((getAddContractMethod = ViewGrpc.getAddContractMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getAddContractMethod = ViewGrpc.getAddContractMethod) == null) {
          ViewGrpc.getAddContractMethod = getAddContractMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.AddContractReq, bilibili.app.view.v1.NoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.AddContractReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.NoReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("AddContract"))
              .build();
        }
      }
    }
    return getAddContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ChronosPkgReq,
      bilibili.app.view.v1.Chronos> getChronosPkgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChronosPkg",
      requestType = bilibili.app.view.v1.ChronosPkgReq.class,
      responseType = bilibili.app.view.v1.Chronos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ChronosPkgReq,
      bilibili.app.view.v1.Chronos> getChronosPkgMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ChronosPkgReq, bilibili.app.view.v1.Chronos> getChronosPkgMethod;
    if ((getChronosPkgMethod = ViewGrpc.getChronosPkgMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getChronosPkgMethod = ViewGrpc.getChronosPkgMethod) == null) {
          ViewGrpc.getChronosPkgMethod = getChronosPkgMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ChronosPkgReq, bilibili.app.view.v1.Chronos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChronosPkg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ChronosPkgReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.Chronos.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ChronosPkg"))
              .build();
        }
      }
    }
    return getChronosPkgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.CacheViewReq,
      bilibili.app.view.v1.CacheViewReply> getCacheViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CacheView",
      requestType = bilibili.app.view.v1.CacheViewReq.class,
      responseType = bilibili.app.view.v1.CacheViewReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.CacheViewReq,
      bilibili.app.view.v1.CacheViewReply> getCacheViewMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.CacheViewReq, bilibili.app.view.v1.CacheViewReply> getCacheViewMethod;
    if ((getCacheViewMethod = ViewGrpc.getCacheViewMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getCacheViewMethod = ViewGrpc.getCacheViewMethod) == null) {
          ViewGrpc.getCacheViewMethod = getCacheViewMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.CacheViewReq, bilibili.app.view.v1.CacheViewReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CacheView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.CacheViewReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.CacheViewReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("CacheView"))
              .build();
        }
      }
    }
    return getCacheViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ContinuousPlayReq,
      bilibili.app.view.v1.ContinuousPlayReply> getContinuousPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContinuousPlay",
      requestType = bilibili.app.view.v1.ContinuousPlayReq.class,
      responseType = bilibili.app.view.v1.ContinuousPlayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ContinuousPlayReq,
      bilibili.app.view.v1.ContinuousPlayReply> getContinuousPlayMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ContinuousPlayReq, bilibili.app.view.v1.ContinuousPlayReply> getContinuousPlayMethod;
    if ((getContinuousPlayMethod = ViewGrpc.getContinuousPlayMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getContinuousPlayMethod = ViewGrpc.getContinuousPlayMethod) == null) {
          ViewGrpc.getContinuousPlayMethod = getContinuousPlayMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ContinuousPlayReq, bilibili.app.view.v1.ContinuousPlayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContinuousPlay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ContinuousPlayReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ContinuousPlayReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ContinuousPlay"))
              .build();
        }
      }
    }
    return getContinuousPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.RelatesFeedReq,
      bilibili.app.view.v1.RelatesFeedReply> getRelatesFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelatesFeed",
      requestType = bilibili.app.view.v1.RelatesFeedReq.class,
      responseType = bilibili.app.view.v1.RelatesFeedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.RelatesFeedReq,
      bilibili.app.view.v1.RelatesFeedReply> getRelatesFeedMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.RelatesFeedReq, bilibili.app.view.v1.RelatesFeedReply> getRelatesFeedMethod;
    if ((getRelatesFeedMethod = ViewGrpc.getRelatesFeedMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getRelatesFeedMethod = ViewGrpc.getRelatesFeedMethod) == null) {
          ViewGrpc.getRelatesFeedMethod = getRelatesFeedMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.RelatesFeedReq, bilibili.app.view.v1.RelatesFeedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelatesFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.RelatesFeedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.RelatesFeedReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("RelatesFeed"))
              .build();
        }
      }
    }
    return getRelatesFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.PremiereArchiveReq,
      bilibili.app.view.v1.PremiereArchiveReply> getPremiereArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PremiereArchive",
      requestType = bilibili.app.view.v1.PremiereArchiveReq.class,
      responseType = bilibili.app.view.v1.PremiereArchiveReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.PremiereArchiveReq,
      bilibili.app.view.v1.PremiereArchiveReply> getPremiereArchiveMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.PremiereArchiveReq, bilibili.app.view.v1.PremiereArchiveReply> getPremiereArchiveMethod;
    if ((getPremiereArchiveMethod = ViewGrpc.getPremiereArchiveMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getPremiereArchiveMethod = ViewGrpc.getPremiereArchiveMethod) == null) {
          ViewGrpc.getPremiereArchiveMethod = getPremiereArchiveMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.PremiereArchiveReq, bilibili.app.view.v1.PremiereArchiveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PremiereArchive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.PremiereArchiveReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.PremiereArchiveReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("PremiereArchive"))
              .build();
        }
      }
    }
    return getPremiereArchiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.ReserveReq,
      bilibili.app.view.v1.ReserveReply> getReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reserve",
      requestType = bilibili.app.view.v1.ReserveReq.class,
      responseType = bilibili.app.view.v1.ReserveReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.ReserveReq,
      bilibili.app.view.v1.ReserveReply> getReserveMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.ReserveReq, bilibili.app.view.v1.ReserveReply> getReserveMethod;
    if ((getReserveMethod = ViewGrpc.getReserveMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getReserveMethod = ViewGrpc.getReserveMethod) == null) {
          ViewGrpc.getReserveMethod = getReserveMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.ReserveReq, bilibili.app.view.v1.ReserveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ReserveReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.ReserveReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("Reserve"))
              .build();
        }
      }
    }
    return getReserveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.PlayerRelatesReq,
      bilibili.app.view.v1.PlayerRelatesReply> getPlayerRelatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayerRelates",
      requestType = bilibili.app.view.v1.PlayerRelatesReq.class,
      responseType = bilibili.app.view.v1.PlayerRelatesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.PlayerRelatesReq,
      bilibili.app.view.v1.PlayerRelatesReply> getPlayerRelatesMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.PlayerRelatesReq, bilibili.app.view.v1.PlayerRelatesReply> getPlayerRelatesMethod;
    if ((getPlayerRelatesMethod = ViewGrpc.getPlayerRelatesMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getPlayerRelatesMethod = ViewGrpc.getPlayerRelatesMethod) == null) {
          ViewGrpc.getPlayerRelatesMethod = getPlayerRelatesMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.PlayerRelatesReq, bilibili.app.view.v1.PlayerRelatesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayerRelates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.PlayerRelatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.PlayerRelatesReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("PlayerRelates"))
              .build();
        }
      }
    }
    return getPlayerRelatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonActivityRecordReq,
      bilibili.app.view.v1.SeasonActivityRecordReply> getSeasonActivityRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SeasonActivityRecord",
      requestType = bilibili.app.view.v1.SeasonActivityRecordReq.class,
      responseType = bilibili.app.view.v1.SeasonActivityRecordReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonActivityRecordReq,
      bilibili.app.view.v1.SeasonActivityRecordReply> getSeasonActivityRecordMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonActivityRecordReq, bilibili.app.view.v1.SeasonActivityRecordReply> getSeasonActivityRecordMethod;
    if ((getSeasonActivityRecordMethod = ViewGrpc.getSeasonActivityRecordMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getSeasonActivityRecordMethod = ViewGrpc.getSeasonActivityRecordMethod) == null) {
          ViewGrpc.getSeasonActivityRecordMethod = getSeasonActivityRecordMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.SeasonActivityRecordReq, bilibili.app.view.v1.SeasonActivityRecordReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SeasonActivityRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.SeasonActivityRecordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.SeasonActivityRecordReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("SeasonActivityRecord"))
              .build();
        }
      }
    }
    return getSeasonActivityRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonWidgetExposeReq,
      bilibili.app.view.v1.SeasonWidgetExposeReply> getSeasonWidgetExposeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SeasonWidgetExpose",
      requestType = bilibili.app.view.v1.SeasonWidgetExposeReq.class,
      responseType = bilibili.app.view.v1.SeasonWidgetExposeReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonWidgetExposeReq,
      bilibili.app.view.v1.SeasonWidgetExposeReply> getSeasonWidgetExposeMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.SeasonWidgetExposeReq, bilibili.app.view.v1.SeasonWidgetExposeReply> getSeasonWidgetExposeMethod;
    if ((getSeasonWidgetExposeMethod = ViewGrpc.getSeasonWidgetExposeMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getSeasonWidgetExposeMethod = ViewGrpc.getSeasonWidgetExposeMethod) == null) {
          ViewGrpc.getSeasonWidgetExposeMethod = getSeasonWidgetExposeMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.SeasonWidgetExposeReq, bilibili.app.view.v1.SeasonWidgetExposeReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SeasonWidgetExpose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.SeasonWidgetExposeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.SeasonWidgetExposeReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("SeasonWidgetExpose"))
              .build();
        }
      }
    }
    return getSeasonWidgetExposeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.view.v1.GetArcsPlayerReq,
      bilibili.app.view.v1.GetArcsPlayerReply> getGetArcsPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArcsPlayer",
      requestType = bilibili.app.view.v1.GetArcsPlayerReq.class,
      responseType = bilibili.app.view.v1.GetArcsPlayerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.view.v1.GetArcsPlayerReq,
      bilibili.app.view.v1.GetArcsPlayerReply> getGetArcsPlayerMethod() {
    io.grpc.MethodDescriptor<bilibili.app.view.v1.GetArcsPlayerReq, bilibili.app.view.v1.GetArcsPlayerReply> getGetArcsPlayerMethod;
    if ((getGetArcsPlayerMethod = ViewGrpc.getGetArcsPlayerMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getGetArcsPlayerMethod = ViewGrpc.getGetArcsPlayerMethod) == null) {
          ViewGrpc.getGetArcsPlayerMethod = getGetArcsPlayerMethod =
              io.grpc.MethodDescriptor.<bilibili.app.view.v1.GetArcsPlayerReq, bilibili.app.view.v1.GetArcsPlayerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetArcsPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.GetArcsPlayerReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.view.v1.GetArcsPlayerReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("GetArcsPlayer"))
              .build();
        }
      }
    }
    return getGetArcsPlayerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ViewStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ViewStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ViewStub>() {
        @java.lang.Override
        public ViewStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ViewStub(channel, callOptions);
        }
      };
    return ViewStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ViewBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ViewBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ViewBlockingStub>() {
        @java.lang.Override
        public ViewBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ViewBlockingStub(channel, callOptions);
        }
      };
    return ViewBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ViewFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ViewFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ViewFutureStub>() {
        @java.lang.Override
        public ViewFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ViewFutureStub(channel, callOptions);
        }
      };
    return ViewFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 视频页详情页
     * </pre>
     */
    default void view(bilibili.app.view.v1.ViewReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMethod(), responseObserver);
    }

    /**
     */
    default void viewTag(bilibili.app.view.v1.ViewTagReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewTagReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewTagMethod(), responseObserver);
    }

    /**
     */
    default void viewMaterial(bilibili.app.view.v1.ViewMaterialReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewMaterialReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMaterialMethod(), responseObserver);
    }

    /**
     * <pre>
     * 视频播放过程中的数据
     * </pre>
     */
    default void viewProgress(bilibili.app.view.v1.ViewProgressReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewProgressReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * 短视频下载
     * </pre>
     */
    default void shortFormVideoDownload(bilibili.app.view.v1.ShortFormVideoDownloadReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ShortFormVideoDownloadReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShortFormVideoDownloadMethod(), responseObserver);
    }

    /**
     * <pre>
     * 点击播放器卡片事件
     * </pre>
     */
    default void clickPlayerCard(bilibili.app.view.v1.ClickPlayerCardReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClickPlayerCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * 点击大型活动页预约
     * </pre>
     */
    default void clickActivitySeason(bilibili.app.view.v1.ClickActivitySeasonReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClickActivitySeasonMethod(), responseObserver);
    }

    /**
     * <pre>
     * 合集详情页
     * </pre>
     */
    default void season(bilibili.app.view.v1.SeasonReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSeasonMethod(), responseObserver);
    }

    /**
     * <pre>
     * 播放器卡片曝光
     * </pre>
     */
    default void exposePlayerCard(bilibili.app.view.v1.ExposePlayerCardReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExposePlayerCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * 点击签订契约
     * </pre>
     */
    default void addContract(bilibili.app.view.v1.AddContractReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * 资源包
     * </pre>
     */
    default void chronosPkg(bilibili.app.view.v1.ChronosPkgReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.Chronos> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChronosPkgMethod(), responseObserver);
    }

    /**
     */
    default void cacheView(bilibili.app.view.v1.CacheViewReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.CacheViewReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCacheViewMethod(), responseObserver);
    }

    /**
     */
    default void continuousPlay(bilibili.app.view.v1.ContinuousPlayReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ContinuousPlayReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContinuousPlayMethod(), responseObserver);
    }

    /**
     * <pre>
     * 播放页推荐IFS
     * </pre>
     */
    default void relatesFeed(bilibili.app.view.v1.RelatesFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.RelatesFeedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelatesFeedMethod(), responseObserver);
    }

    /**
     */
    default void premiereArchive(bilibili.app.view.v1.PremiereArchiveReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.PremiereArchiveReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPremiereArchiveMethod(), responseObserver);
    }

    /**
     */
    default void reserve(bilibili.app.view.v1.ReserveReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ReserveReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveMethod(), responseObserver);
    }

    /**
     */
    default void playerRelates(bilibili.app.view.v1.PlayerRelatesReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.PlayerRelatesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayerRelatesMethod(), responseObserver);
    }

    /**
     */
    default void seasonActivityRecord(bilibili.app.view.v1.SeasonActivityRecordReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonActivityRecordReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSeasonActivityRecordMethod(), responseObserver);
    }

    /**
     */
    default void seasonWidgetExpose(bilibili.app.view.v1.SeasonWidgetExposeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonWidgetExposeReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSeasonWidgetExposeMethod(), responseObserver);
    }

    /**
     */
    default void getArcsPlayer(bilibili.app.view.v1.GetArcsPlayerReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.GetArcsPlayerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetArcsPlayerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service View.
   */
  public static abstract class ViewImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ViewGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service View.
   */
  public static final class ViewStub
      extends io.grpc.stub.AbstractAsyncStub<ViewStub> {
    private ViewStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViewStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ViewStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频页详情页
     * </pre>
     */
    public void view(bilibili.app.view.v1.ViewReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewTag(bilibili.app.view.v1.ViewTagReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewTagReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewMaterial(bilibili.app.view.v1.ViewMaterialReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewMaterialReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMaterialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 视频播放过程中的数据
     * </pre>
     */
    public void viewProgress(bilibili.app.view.v1.ViewProgressReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewProgressReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 短视频下载
     * </pre>
     */
    public void shortFormVideoDownload(bilibili.app.view.v1.ShortFormVideoDownloadReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ShortFormVideoDownloadReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShortFormVideoDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 点击播放器卡片事件
     * </pre>
     */
    public void clickPlayerCard(bilibili.app.view.v1.ClickPlayerCardReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClickPlayerCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 点击大型活动页预约
     * </pre>
     */
    public void clickActivitySeason(bilibili.app.view.v1.ClickActivitySeasonReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClickActivitySeasonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 合集详情页
     * </pre>
     */
    public void season(bilibili.app.view.v1.SeasonReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSeasonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 播放器卡片曝光
     * </pre>
     */
    public void exposePlayerCard(bilibili.app.view.v1.ExposePlayerCardReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExposePlayerCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 点击签订契约
     * </pre>
     */
    public void addContract(bilibili.app.view.v1.AddContractReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 资源包
     * </pre>
     */
    public void chronosPkg(bilibili.app.view.v1.ChronosPkgReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.Chronos> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChronosPkgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cacheView(bilibili.app.view.v1.CacheViewReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.CacheViewReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCacheViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void continuousPlay(bilibili.app.view.v1.ContinuousPlayReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ContinuousPlayReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContinuousPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 播放页推荐IFS
     * </pre>
     */
    public void relatesFeed(bilibili.app.view.v1.RelatesFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.RelatesFeedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelatesFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void premiereArchive(bilibili.app.view.v1.PremiereArchiveReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.PremiereArchiveReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPremiereArchiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reserve(bilibili.app.view.v1.ReserveReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.ReserveReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playerRelates(bilibili.app.view.v1.PlayerRelatesReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.PlayerRelatesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayerRelatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seasonActivityRecord(bilibili.app.view.v1.SeasonActivityRecordReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonActivityRecordReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSeasonActivityRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seasonWidgetExpose(bilibili.app.view.v1.SeasonWidgetExposeReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonWidgetExposeReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSeasonWidgetExposeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArcsPlayer(bilibili.app.view.v1.GetArcsPlayerReq request,
        io.grpc.stub.StreamObserver<bilibili.app.view.v1.GetArcsPlayerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetArcsPlayerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service View.
   */
  public static final class ViewBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ViewBlockingStub> {
    private ViewBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViewBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ViewBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频页详情页
     * </pre>
     */
    public bilibili.app.view.v1.ViewReply view(bilibili.app.view.v1.ViewReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.ViewTagReply viewTag(bilibili.app.view.v1.ViewTagReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.ViewMaterialReply viewMaterial(bilibili.app.view.v1.ViewMaterialReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMaterialMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 视频播放过程中的数据
     * </pre>
     */
    public bilibili.app.view.v1.ViewProgressReply viewProgress(bilibili.app.view.v1.ViewProgressReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 短视频下载
     * </pre>
     */
    public bilibili.app.view.v1.ShortFormVideoDownloadReply shortFormVideoDownload(bilibili.app.view.v1.ShortFormVideoDownloadReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShortFormVideoDownloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 点击播放器卡片事件
     * </pre>
     */
    public bilibili.app.view.v1.NoReply clickPlayerCard(bilibili.app.view.v1.ClickPlayerCardReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClickPlayerCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 点击大型活动页预约
     * </pre>
     */
    public bilibili.app.view.v1.NoReply clickActivitySeason(bilibili.app.view.v1.ClickActivitySeasonReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClickActivitySeasonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 合集详情页
     * </pre>
     */
    public bilibili.app.view.v1.SeasonReply season(bilibili.app.view.v1.SeasonReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSeasonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 播放器卡片曝光
     * </pre>
     */
    public bilibili.app.view.v1.NoReply exposePlayerCard(bilibili.app.view.v1.ExposePlayerCardReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExposePlayerCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 点击签订契约
     * </pre>
     */
    public bilibili.app.view.v1.NoReply addContract(bilibili.app.view.v1.AddContractReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 资源包
     * </pre>
     */
    public bilibili.app.view.v1.Chronos chronosPkg(bilibili.app.view.v1.ChronosPkgReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChronosPkgMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.CacheViewReply cacheView(bilibili.app.view.v1.CacheViewReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCacheViewMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.ContinuousPlayReply continuousPlay(bilibili.app.view.v1.ContinuousPlayReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContinuousPlayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 播放页推荐IFS
     * </pre>
     */
    public bilibili.app.view.v1.RelatesFeedReply relatesFeed(bilibili.app.view.v1.RelatesFeedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelatesFeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.PremiereArchiveReply premiereArchive(bilibili.app.view.v1.PremiereArchiveReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPremiereArchiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.ReserveReply reserve(bilibili.app.view.v1.ReserveReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.PlayerRelatesReply playerRelates(bilibili.app.view.v1.PlayerRelatesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayerRelatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.SeasonActivityRecordReply seasonActivityRecord(bilibili.app.view.v1.SeasonActivityRecordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSeasonActivityRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.SeasonWidgetExposeReply seasonWidgetExpose(bilibili.app.view.v1.SeasonWidgetExposeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSeasonWidgetExposeMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.view.v1.GetArcsPlayerReply getArcsPlayer(bilibili.app.view.v1.GetArcsPlayerReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetArcsPlayerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service View.
   */
  public static final class ViewFutureStub
      extends io.grpc.stub.AbstractFutureStub<ViewFutureStub> {
    private ViewFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViewFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ViewFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 视频页详情页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.ViewReply> view(
        bilibili.app.view.v1.ViewReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.ViewTagReply> viewTag(
        bilibili.app.view.v1.ViewTagReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.ViewMaterialReply> viewMaterial(
        bilibili.app.view.v1.ViewMaterialReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMaterialMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 视频播放过程中的数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.ViewProgressReply> viewProgress(
        bilibili.app.view.v1.ViewProgressReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProgressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 短视频下载
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.ShortFormVideoDownloadReply> shortFormVideoDownload(
        bilibili.app.view.v1.ShortFormVideoDownloadReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShortFormVideoDownloadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 点击播放器卡片事件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.NoReply> clickPlayerCard(
        bilibili.app.view.v1.ClickPlayerCardReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClickPlayerCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 点击大型活动页预约
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.NoReply> clickActivitySeason(
        bilibili.app.view.v1.ClickActivitySeasonReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClickActivitySeasonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 合集详情页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.SeasonReply> season(
        bilibili.app.view.v1.SeasonReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSeasonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 播放器卡片曝光
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.NoReply> exposePlayerCard(
        bilibili.app.view.v1.ExposePlayerCardReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExposePlayerCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 点击签订契约
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.NoReply> addContract(
        bilibili.app.view.v1.AddContractReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 资源包
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.Chronos> chronosPkg(
        bilibili.app.view.v1.ChronosPkgReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChronosPkgMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.CacheViewReply> cacheView(
        bilibili.app.view.v1.CacheViewReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCacheViewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.ContinuousPlayReply> continuousPlay(
        bilibili.app.view.v1.ContinuousPlayReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContinuousPlayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 播放页推荐IFS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.RelatesFeedReply> relatesFeed(
        bilibili.app.view.v1.RelatesFeedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelatesFeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.PremiereArchiveReply> premiereArchive(
        bilibili.app.view.v1.PremiereArchiveReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPremiereArchiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.ReserveReply> reserve(
        bilibili.app.view.v1.ReserveReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.PlayerRelatesReply> playerRelates(
        bilibili.app.view.v1.PlayerRelatesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayerRelatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.SeasonActivityRecordReply> seasonActivityRecord(
        bilibili.app.view.v1.SeasonActivityRecordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSeasonActivityRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.SeasonWidgetExposeReply> seasonWidgetExpose(
        bilibili.app.view.v1.SeasonWidgetExposeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSeasonWidgetExposeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.view.v1.GetArcsPlayerReply> getArcsPlayer(
        bilibili.app.view.v1.GetArcsPlayerReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetArcsPlayerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW = 0;
  private static final int METHODID_VIEW_TAG = 1;
  private static final int METHODID_VIEW_MATERIAL = 2;
  private static final int METHODID_VIEW_PROGRESS = 3;
  private static final int METHODID_SHORT_FORM_VIDEO_DOWNLOAD = 4;
  private static final int METHODID_CLICK_PLAYER_CARD = 5;
  private static final int METHODID_CLICK_ACTIVITY_SEASON = 6;
  private static final int METHODID_SEASON = 7;
  private static final int METHODID_EXPOSE_PLAYER_CARD = 8;
  private static final int METHODID_ADD_CONTRACT = 9;
  private static final int METHODID_CHRONOS_PKG = 10;
  private static final int METHODID_CACHE_VIEW = 11;
  private static final int METHODID_CONTINUOUS_PLAY = 12;
  private static final int METHODID_RELATES_FEED = 13;
  private static final int METHODID_PREMIERE_ARCHIVE = 14;
  private static final int METHODID_RESERVE = 15;
  private static final int METHODID_PLAYER_RELATES = 16;
  private static final int METHODID_SEASON_ACTIVITY_RECORD = 17;
  private static final int METHODID_SEASON_WIDGET_EXPOSE = 18;
  private static final int METHODID_GET_ARCS_PLAYER = 19;

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
        case METHODID_VIEW:
          serviceImpl.view((bilibili.app.view.v1.ViewReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewReply>) responseObserver);
          break;
        case METHODID_VIEW_TAG:
          serviceImpl.viewTag((bilibili.app.view.v1.ViewTagReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewTagReply>) responseObserver);
          break;
        case METHODID_VIEW_MATERIAL:
          serviceImpl.viewMaterial((bilibili.app.view.v1.ViewMaterialReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewMaterialReply>) responseObserver);
          break;
        case METHODID_VIEW_PROGRESS:
          serviceImpl.viewProgress((bilibili.app.view.v1.ViewProgressReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.ViewProgressReply>) responseObserver);
          break;
        case METHODID_SHORT_FORM_VIDEO_DOWNLOAD:
          serviceImpl.shortFormVideoDownload((bilibili.app.view.v1.ShortFormVideoDownloadReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.ShortFormVideoDownloadReply>) responseObserver);
          break;
        case METHODID_CLICK_PLAYER_CARD:
          serviceImpl.clickPlayerCard((bilibili.app.view.v1.ClickPlayerCardReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply>) responseObserver);
          break;
        case METHODID_CLICK_ACTIVITY_SEASON:
          serviceImpl.clickActivitySeason((bilibili.app.view.v1.ClickActivitySeasonReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply>) responseObserver);
          break;
        case METHODID_SEASON:
          serviceImpl.season((bilibili.app.view.v1.SeasonReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonReply>) responseObserver);
          break;
        case METHODID_EXPOSE_PLAYER_CARD:
          serviceImpl.exposePlayerCard((bilibili.app.view.v1.ExposePlayerCardReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply>) responseObserver);
          break;
        case METHODID_ADD_CONTRACT:
          serviceImpl.addContract((bilibili.app.view.v1.AddContractReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.NoReply>) responseObserver);
          break;
        case METHODID_CHRONOS_PKG:
          serviceImpl.chronosPkg((bilibili.app.view.v1.ChronosPkgReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.Chronos>) responseObserver);
          break;
        case METHODID_CACHE_VIEW:
          serviceImpl.cacheView((bilibili.app.view.v1.CacheViewReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.CacheViewReply>) responseObserver);
          break;
        case METHODID_CONTINUOUS_PLAY:
          serviceImpl.continuousPlay((bilibili.app.view.v1.ContinuousPlayReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.ContinuousPlayReply>) responseObserver);
          break;
        case METHODID_RELATES_FEED:
          serviceImpl.relatesFeed((bilibili.app.view.v1.RelatesFeedReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.RelatesFeedReply>) responseObserver);
          break;
        case METHODID_PREMIERE_ARCHIVE:
          serviceImpl.premiereArchive((bilibili.app.view.v1.PremiereArchiveReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.PremiereArchiveReply>) responseObserver);
          break;
        case METHODID_RESERVE:
          serviceImpl.reserve((bilibili.app.view.v1.ReserveReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.ReserveReply>) responseObserver);
          break;
        case METHODID_PLAYER_RELATES:
          serviceImpl.playerRelates((bilibili.app.view.v1.PlayerRelatesReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.PlayerRelatesReply>) responseObserver);
          break;
        case METHODID_SEASON_ACTIVITY_RECORD:
          serviceImpl.seasonActivityRecord((bilibili.app.view.v1.SeasonActivityRecordReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonActivityRecordReply>) responseObserver);
          break;
        case METHODID_SEASON_WIDGET_EXPOSE:
          serviceImpl.seasonWidgetExpose((bilibili.app.view.v1.SeasonWidgetExposeReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.SeasonWidgetExposeReply>) responseObserver);
          break;
        case METHODID_GET_ARCS_PLAYER:
          serviceImpl.getArcsPlayer((bilibili.app.view.v1.GetArcsPlayerReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.view.v1.GetArcsPlayerReply>) responseObserver);
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
          getViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ViewReq,
              bilibili.app.view.v1.ViewReply>(
                service, METHODID_VIEW)))
        .addMethod(
          getViewTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ViewTagReq,
              bilibili.app.view.v1.ViewTagReply>(
                service, METHODID_VIEW_TAG)))
        .addMethod(
          getViewMaterialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ViewMaterialReq,
              bilibili.app.view.v1.ViewMaterialReply>(
                service, METHODID_VIEW_MATERIAL)))
        .addMethod(
          getViewProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ViewProgressReq,
              bilibili.app.view.v1.ViewProgressReply>(
                service, METHODID_VIEW_PROGRESS)))
        .addMethod(
          getShortFormVideoDownloadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ShortFormVideoDownloadReq,
              bilibili.app.view.v1.ShortFormVideoDownloadReply>(
                service, METHODID_SHORT_FORM_VIDEO_DOWNLOAD)))
        .addMethod(
          getClickPlayerCardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ClickPlayerCardReq,
              bilibili.app.view.v1.NoReply>(
                service, METHODID_CLICK_PLAYER_CARD)))
        .addMethod(
          getClickActivitySeasonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ClickActivitySeasonReq,
              bilibili.app.view.v1.NoReply>(
                service, METHODID_CLICK_ACTIVITY_SEASON)))
        .addMethod(
          getSeasonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.SeasonReq,
              bilibili.app.view.v1.SeasonReply>(
                service, METHODID_SEASON)))
        .addMethod(
          getExposePlayerCardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ExposePlayerCardReq,
              bilibili.app.view.v1.NoReply>(
                service, METHODID_EXPOSE_PLAYER_CARD)))
        .addMethod(
          getAddContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.AddContractReq,
              bilibili.app.view.v1.NoReply>(
                service, METHODID_ADD_CONTRACT)))
        .addMethod(
          getChronosPkgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ChronosPkgReq,
              bilibili.app.view.v1.Chronos>(
                service, METHODID_CHRONOS_PKG)))
        .addMethod(
          getCacheViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.CacheViewReq,
              bilibili.app.view.v1.CacheViewReply>(
                service, METHODID_CACHE_VIEW)))
        .addMethod(
          getContinuousPlayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ContinuousPlayReq,
              bilibili.app.view.v1.ContinuousPlayReply>(
                service, METHODID_CONTINUOUS_PLAY)))
        .addMethod(
          getRelatesFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.RelatesFeedReq,
              bilibili.app.view.v1.RelatesFeedReply>(
                service, METHODID_RELATES_FEED)))
        .addMethod(
          getPremiereArchiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.PremiereArchiveReq,
              bilibili.app.view.v1.PremiereArchiveReply>(
                service, METHODID_PREMIERE_ARCHIVE)))
        .addMethod(
          getReserveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.ReserveReq,
              bilibili.app.view.v1.ReserveReply>(
                service, METHODID_RESERVE)))
        .addMethod(
          getPlayerRelatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.PlayerRelatesReq,
              bilibili.app.view.v1.PlayerRelatesReply>(
                service, METHODID_PLAYER_RELATES)))
        .addMethod(
          getSeasonActivityRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.SeasonActivityRecordReq,
              bilibili.app.view.v1.SeasonActivityRecordReply>(
                service, METHODID_SEASON_ACTIVITY_RECORD)))
        .addMethod(
          getSeasonWidgetExposeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.SeasonWidgetExposeReq,
              bilibili.app.view.v1.SeasonWidgetExposeReply>(
                service, METHODID_SEASON_WIDGET_EXPOSE)))
        .addMethod(
          getGetArcsPlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.view.v1.GetArcsPlayerReq,
              bilibili.app.view.v1.GetArcsPlayerReply>(
                service, METHODID_GET_ARCS_PLAYER)))
        .build();
  }

  private static abstract class ViewBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ViewBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("View");
    }
  }

  private static final class ViewFileDescriptorSupplier
      extends ViewBaseDescriptorSupplier {
    ViewFileDescriptorSupplier() {}
  }

  private static final class ViewMethodDescriptorSupplier
      extends ViewBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ViewMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ViewGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ViewFileDescriptorSupplier())
              .addMethod(getViewMethod())
              .addMethod(getViewTagMethod())
              .addMethod(getViewMaterialMethod())
              .addMethod(getViewProgressMethod())
              .addMethod(getShortFormVideoDownloadMethod())
              .addMethod(getClickPlayerCardMethod())
              .addMethod(getClickActivitySeasonMethod())
              .addMethod(getSeasonMethod())
              .addMethod(getExposePlayerCardMethod())
              .addMethod(getAddContractMethod())
              .addMethod(getChronosPkgMethod())
              .addMethod(getCacheViewMethod())
              .addMethod(getContinuousPlayMethod())
              .addMethod(getRelatesFeedMethod())
              .addMethod(getPremiereArchiveMethod())
              .addMethod(getReserveMethod())
              .addMethod(getPlayerRelatesMethod())
              .addMethod(getSeasonActivityRecordMethod())
              .addMethod(getSeasonWidgetExposeMethod())
              .addMethod(getGetArcsPlayerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
