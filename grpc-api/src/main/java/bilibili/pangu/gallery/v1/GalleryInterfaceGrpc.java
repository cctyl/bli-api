package bilibili.pangu.gallery.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/pangu/gallery/v1/gallery.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GalleryInterfaceGrpc {

  private GalleryInterfaceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.pangu.gallery.v1.GalleryInterface";

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
    if ((getPingMethod = GalleryInterfaceGrpc.getPingMethod) == null) {
      synchronized (GalleryInterfaceGrpc.class) {
        if ((getPingMethod = GalleryInterfaceGrpc.getPingMethod) == null) {
          GalleryInterfaceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GalleryInterfaceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.GetUserInfoReq,
      bilibili.pangu.gallery.v1.GetUserInfoReply> getUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserInfo",
      requestType = bilibili.pangu.gallery.v1.GetUserInfoReq.class,
      responseType = bilibili.pangu.gallery.v1.GetUserInfoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.GetUserInfoReq,
      bilibili.pangu.gallery.v1.GetUserInfoReply> getUserInfoMethod() {
    io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.GetUserInfoReq, bilibili.pangu.gallery.v1.GetUserInfoReply> getUserInfoMethod;
    if ((getUserInfoMethod = GalleryInterfaceGrpc.getUserInfoMethod) == null) {
      synchronized (GalleryInterfaceGrpc.class) {
        if ((getUserInfoMethod = GalleryInterfaceGrpc.getUserInfoMethod) == null) {
          GalleryInterfaceGrpc.getUserInfoMethod = getUserInfoMethod =
              io.grpc.MethodDescriptor.<bilibili.pangu.gallery.v1.GetUserInfoReq, bilibili.pangu.gallery.v1.GetUserInfoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.GetUserInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.GetUserInfoReply.getDefaultInstance()))
              .setSchemaDescriptor(new GalleryInterfaceMethodDescriptorSupplier("UserInfo"))
              .build();
        }
      }
    }
    return getUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.ListNFTByMidReq,
      bilibili.pangu.gallery.v1.ListNFTByMidReply> getListNFTByMidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNFTByMid",
      requestType = bilibili.pangu.gallery.v1.ListNFTByMidReq.class,
      responseType = bilibili.pangu.gallery.v1.ListNFTByMidReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.ListNFTByMidReq,
      bilibili.pangu.gallery.v1.ListNFTByMidReply> getListNFTByMidMethod() {
    io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.ListNFTByMidReq, bilibili.pangu.gallery.v1.ListNFTByMidReply> getListNFTByMidMethod;
    if ((getListNFTByMidMethod = GalleryInterfaceGrpc.getListNFTByMidMethod) == null) {
      synchronized (GalleryInterfaceGrpc.class) {
        if ((getListNFTByMidMethod = GalleryInterfaceGrpc.getListNFTByMidMethod) == null) {
          GalleryInterfaceGrpc.getListNFTByMidMethod = getListNFTByMidMethod =
              io.grpc.MethodDescriptor.<bilibili.pangu.gallery.v1.ListNFTByMidReq, bilibili.pangu.gallery.v1.ListNFTByMidReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNFTByMid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.ListNFTByMidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.ListNFTByMidReply.getDefaultInstance()))
              .setSchemaDescriptor(new GalleryInterfaceMethodDescriptorSupplier("ListNFTByMid"))
              .build();
        }
      }
    }
    return getListNFTByMidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.ListOrderByMidReq,
      bilibili.pangu.gallery.v1.ListOrderByMidReply> getListOrderByMidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrderByMid",
      requestType = bilibili.pangu.gallery.v1.ListOrderByMidReq.class,
      responseType = bilibili.pangu.gallery.v1.ListOrderByMidReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.ListOrderByMidReq,
      bilibili.pangu.gallery.v1.ListOrderByMidReply> getListOrderByMidMethod() {
    io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.ListOrderByMidReq, bilibili.pangu.gallery.v1.ListOrderByMidReply> getListOrderByMidMethod;
    if ((getListOrderByMidMethod = GalleryInterfaceGrpc.getListOrderByMidMethod) == null) {
      synchronized (GalleryInterfaceGrpc.class) {
        if ((getListOrderByMidMethod = GalleryInterfaceGrpc.getListOrderByMidMethod) == null) {
          GalleryInterfaceGrpc.getListOrderByMidMethod = getListOrderByMidMethod =
              io.grpc.MethodDescriptor.<bilibili.pangu.gallery.v1.ListOrderByMidReq, bilibili.pangu.gallery.v1.ListOrderByMidReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrderByMid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.ListOrderByMidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.ListOrderByMidReply.getDefaultInstance()))
              .setSchemaDescriptor(new GalleryInterfaceMethodDescriptorSupplier("ListOrderByMid"))
              .build();
        }
      }
    }
    return getListOrderByMidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.BasicInfoReq,
      bilibili.pangu.gallery.v1.BasicInfoReply> getBasicInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BasicInfo",
      requestType = bilibili.pangu.gallery.v1.BasicInfoReq.class,
      responseType = bilibili.pangu.gallery.v1.BasicInfoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.BasicInfoReq,
      bilibili.pangu.gallery.v1.BasicInfoReply> getBasicInfoMethod() {
    io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.BasicInfoReq, bilibili.pangu.gallery.v1.BasicInfoReply> getBasicInfoMethod;
    if ((getBasicInfoMethod = GalleryInterfaceGrpc.getBasicInfoMethod) == null) {
      synchronized (GalleryInterfaceGrpc.class) {
        if ((getBasicInfoMethod = GalleryInterfaceGrpc.getBasicInfoMethod) == null) {
          GalleryInterfaceGrpc.getBasicInfoMethod = getBasicInfoMethod =
              io.grpc.MethodDescriptor.<bilibili.pangu.gallery.v1.BasicInfoReq, bilibili.pangu.gallery.v1.BasicInfoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BasicInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.BasicInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.BasicInfoReply.getDefaultInstance()))
              .setSchemaDescriptor(new GalleryInterfaceMethodDescriptorSupplier("BasicInfo"))
              .build();
        }
      }
    }
    return getBasicInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.UserCheckReq,
      bilibili.pangu.gallery.v1.UserCheckReply> getUserCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserCheck",
      requestType = bilibili.pangu.gallery.v1.UserCheckReq.class,
      responseType = bilibili.pangu.gallery.v1.UserCheckReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.UserCheckReq,
      bilibili.pangu.gallery.v1.UserCheckReply> getUserCheckMethod() {
    io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.UserCheckReq, bilibili.pangu.gallery.v1.UserCheckReply> getUserCheckMethod;
    if ((getUserCheckMethod = GalleryInterfaceGrpc.getUserCheckMethod) == null) {
      synchronized (GalleryInterfaceGrpc.class) {
        if ((getUserCheckMethod = GalleryInterfaceGrpc.getUserCheckMethod) == null) {
          GalleryInterfaceGrpc.getUserCheckMethod = getUserCheckMethod =
              io.grpc.MethodDescriptor.<bilibili.pangu.gallery.v1.UserCheckReq, bilibili.pangu.gallery.v1.UserCheckReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.UserCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.UserCheckReply.getDefaultInstance()))
              .setSchemaDescriptor(new GalleryInterfaceMethodDescriptorSupplier("UserCheck"))
              .build();
        }
      }
    }
    return getUserCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.AgreePolicyReq,
      bilibili.pangu.gallery.v1.AgreePolicyReply> getAgreePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgreePolicy",
      requestType = bilibili.pangu.gallery.v1.AgreePolicyReq.class,
      responseType = bilibili.pangu.gallery.v1.AgreePolicyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.AgreePolicyReq,
      bilibili.pangu.gallery.v1.AgreePolicyReply> getAgreePolicyMethod() {
    io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.AgreePolicyReq, bilibili.pangu.gallery.v1.AgreePolicyReply> getAgreePolicyMethod;
    if ((getAgreePolicyMethod = GalleryInterfaceGrpc.getAgreePolicyMethod) == null) {
      synchronized (GalleryInterfaceGrpc.class) {
        if ((getAgreePolicyMethod = GalleryInterfaceGrpc.getAgreePolicyMethod) == null) {
          GalleryInterfaceGrpc.getAgreePolicyMethod = getAgreePolicyMethod =
              io.grpc.MethodDescriptor.<bilibili.pangu.gallery.v1.AgreePolicyReq, bilibili.pangu.gallery.v1.AgreePolicyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgreePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.AgreePolicyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.AgreePolicyReply.getDefaultInstance()))
              .setSchemaDescriptor(new GalleryInterfaceMethodDescriptorSupplier("AgreePolicy"))
              .build();
        }
      }
    }
    return getAgreePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.GetLastPolicyReq,
      bilibili.pangu.gallery.v1.GetLastPolicyReply> getGetLastPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastPolicy",
      requestType = bilibili.pangu.gallery.v1.GetLastPolicyReq.class,
      responseType = bilibili.pangu.gallery.v1.GetLastPolicyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.GetLastPolicyReq,
      bilibili.pangu.gallery.v1.GetLastPolicyReply> getGetLastPolicyMethod() {
    io.grpc.MethodDescriptor<bilibili.pangu.gallery.v1.GetLastPolicyReq, bilibili.pangu.gallery.v1.GetLastPolicyReply> getGetLastPolicyMethod;
    if ((getGetLastPolicyMethod = GalleryInterfaceGrpc.getGetLastPolicyMethod) == null) {
      synchronized (GalleryInterfaceGrpc.class) {
        if ((getGetLastPolicyMethod = GalleryInterfaceGrpc.getGetLastPolicyMethod) == null) {
          GalleryInterfaceGrpc.getGetLastPolicyMethod = getGetLastPolicyMethod =
              io.grpc.MethodDescriptor.<bilibili.pangu.gallery.v1.GetLastPolicyReq, bilibili.pangu.gallery.v1.GetLastPolicyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.GetLastPolicyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.pangu.gallery.v1.GetLastPolicyReply.getDefaultInstance()))
              .setSchemaDescriptor(new GalleryInterfaceMethodDescriptorSupplier("GetLastPolicy"))
              .build();
        }
      }
    }
    return getGetLastPolicyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GalleryInterfaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GalleryInterfaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GalleryInterfaceStub>() {
        @java.lang.Override
        public GalleryInterfaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GalleryInterfaceStub(channel, callOptions);
        }
      };
    return GalleryInterfaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GalleryInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GalleryInterfaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GalleryInterfaceBlockingStub>() {
        @java.lang.Override
        public GalleryInterfaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GalleryInterfaceBlockingStub(channel, callOptions);
        }
      };
    return GalleryInterfaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GalleryInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GalleryInterfaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GalleryInterfaceFutureStub>() {
        @java.lang.Override
        public GalleryInterfaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GalleryInterfaceFutureStub(channel, callOptions);
        }
      };
    return GalleryInterfaceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    default void userInfo(bilibili.pangu.gallery.v1.GetUserInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.GetUserInfoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserInfoMethod(), responseObserver);
    }

    /**
     */
    default void listNFTByMid(bilibili.pangu.gallery.v1.ListNFTByMidReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.ListNFTByMidReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNFTByMidMethod(), responseObserver);
    }

    /**
     */
    default void listOrderByMid(bilibili.pangu.gallery.v1.ListOrderByMidReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.ListOrderByMidReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrderByMidMethod(), responseObserver);
    }

    /**
     */
    default void basicInfo(bilibili.pangu.gallery.v1.BasicInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.BasicInfoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBasicInfoMethod(), responseObserver);
    }

    /**
     */
    default void userCheck(bilibili.pangu.gallery.v1.UserCheckReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.UserCheckReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserCheckMethod(), responseObserver);
    }

    /**
     */
    default void agreePolicy(bilibili.pangu.gallery.v1.AgreePolicyReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.AgreePolicyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgreePolicyMethod(), responseObserver);
    }

    /**
     */
    default void getLastPolicy(bilibili.pangu.gallery.v1.GetLastPolicyReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.GetLastPolicyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastPolicyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GalleryInterface.
   */
  public static abstract class GalleryInterfaceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GalleryInterfaceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GalleryInterface.
   */
  public static final class GalleryInterfaceStub
      extends io.grpc.stub.AbstractAsyncStub<GalleryInterfaceStub> {
    private GalleryInterfaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GalleryInterfaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GalleryInterfaceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userInfo(bilibili.pangu.gallery.v1.GetUserInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.GetUserInfoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNFTByMid(bilibili.pangu.gallery.v1.ListNFTByMidReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.ListNFTByMidReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNFTByMidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrderByMid(bilibili.pangu.gallery.v1.ListOrderByMidReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.ListOrderByMidReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrderByMidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void basicInfo(bilibili.pangu.gallery.v1.BasicInfoReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.BasicInfoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBasicInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userCheck(bilibili.pangu.gallery.v1.UserCheckReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.UserCheckReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agreePolicy(bilibili.pangu.gallery.v1.AgreePolicyReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.AgreePolicyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgreePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastPolicy(bilibili.pangu.gallery.v1.GetLastPolicyReq request,
        io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.GetLastPolicyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastPolicyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GalleryInterface.
   */
  public static final class GalleryInterfaceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GalleryInterfaceBlockingStub> {
    private GalleryInterfaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GalleryInterfaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GalleryInterfaceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty ping(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.pangu.gallery.v1.GetUserInfoReply userInfo(bilibili.pangu.gallery.v1.GetUserInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.pangu.gallery.v1.ListNFTByMidReply listNFTByMid(bilibili.pangu.gallery.v1.ListNFTByMidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNFTByMidMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.pangu.gallery.v1.ListOrderByMidReply listOrderByMid(bilibili.pangu.gallery.v1.ListOrderByMidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrderByMidMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.pangu.gallery.v1.BasicInfoReply basicInfo(bilibili.pangu.gallery.v1.BasicInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBasicInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.pangu.gallery.v1.UserCheckReply userCheck(bilibili.pangu.gallery.v1.UserCheckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.pangu.gallery.v1.AgreePolicyReply agreePolicy(bilibili.pangu.gallery.v1.AgreePolicyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgreePolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.pangu.gallery.v1.GetLastPolicyReply getLastPolicy(bilibili.pangu.gallery.v1.GetLastPolicyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastPolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GalleryInterface.
   */
  public static final class GalleryInterfaceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GalleryInterfaceFutureStub> {
    private GalleryInterfaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GalleryInterfaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GalleryInterfaceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pangu.gallery.v1.GetUserInfoReply> userInfo(
        bilibili.pangu.gallery.v1.GetUserInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pangu.gallery.v1.ListNFTByMidReply> listNFTByMid(
        bilibili.pangu.gallery.v1.ListNFTByMidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNFTByMidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pangu.gallery.v1.ListOrderByMidReply> listOrderByMid(
        bilibili.pangu.gallery.v1.ListOrderByMidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrderByMidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pangu.gallery.v1.BasicInfoReply> basicInfo(
        bilibili.pangu.gallery.v1.BasicInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBasicInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pangu.gallery.v1.UserCheckReply> userCheck(
        bilibili.pangu.gallery.v1.UserCheckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pangu.gallery.v1.AgreePolicyReply> agreePolicy(
        bilibili.pangu.gallery.v1.AgreePolicyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgreePolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.pangu.gallery.v1.GetLastPolicyReply> getLastPolicy(
        bilibili.pangu.gallery.v1.GetLastPolicyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastPolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_USER_INFO = 1;
  private static final int METHODID_LIST_NFTBY_MID = 2;
  private static final int METHODID_LIST_ORDER_BY_MID = 3;
  private static final int METHODID_BASIC_INFO = 4;
  private static final int METHODID_USER_CHECK = 5;
  private static final int METHODID_AGREE_POLICY = 6;
  private static final int METHODID_GET_LAST_POLICY = 7;

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
        case METHODID_USER_INFO:
          serviceImpl.userInfo((bilibili.pangu.gallery.v1.GetUserInfoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.GetUserInfoReply>) responseObserver);
          break;
        case METHODID_LIST_NFTBY_MID:
          serviceImpl.listNFTByMid((bilibili.pangu.gallery.v1.ListNFTByMidReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.ListNFTByMidReply>) responseObserver);
          break;
        case METHODID_LIST_ORDER_BY_MID:
          serviceImpl.listOrderByMid((bilibili.pangu.gallery.v1.ListOrderByMidReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.ListOrderByMidReply>) responseObserver);
          break;
        case METHODID_BASIC_INFO:
          serviceImpl.basicInfo((bilibili.pangu.gallery.v1.BasicInfoReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.BasicInfoReply>) responseObserver);
          break;
        case METHODID_USER_CHECK:
          serviceImpl.userCheck((bilibili.pangu.gallery.v1.UserCheckReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.UserCheckReply>) responseObserver);
          break;
        case METHODID_AGREE_POLICY:
          serviceImpl.agreePolicy((bilibili.pangu.gallery.v1.AgreePolicyReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.AgreePolicyReply>) responseObserver);
          break;
        case METHODID_GET_LAST_POLICY:
          serviceImpl.getLastPolicy((bilibili.pangu.gallery.v1.GetLastPolicyReq) request,
              (io.grpc.stub.StreamObserver<bilibili.pangu.gallery.v1.GetLastPolicyReply>) responseObserver);
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
          getUserInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pangu.gallery.v1.GetUserInfoReq,
              bilibili.pangu.gallery.v1.GetUserInfoReply>(
                service, METHODID_USER_INFO)))
        .addMethod(
          getListNFTByMidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pangu.gallery.v1.ListNFTByMidReq,
              bilibili.pangu.gallery.v1.ListNFTByMidReply>(
                service, METHODID_LIST_NFTBY_MID)))
        .addMethod(
          getListOrderByMidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pangu.gallery.v1.ListOrderByMidReq,
              bilibili.pangu.gallery.v1.ListOrderByMidReply>(
                service, METHODID_LIST_ORDER_BY_MID)))
        .addMethod(
          getBasicInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pangu.gallery.v1.BasicInfoReq,
              bilibili.pangu.gallery.v1.BasicInfoReply>(
                service, METHODID_BASIC_INFO)))
        .addMethod(
          getUserCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pangu.gallery.v1.UserCheckReq,
              bilibili.pangu.gallery.v1.UserCheckReply>(
                service, METHODID_USER_CHECK)))
        .addMethod(
          getAgreePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pangu.gallery.v1.AgreePolicyReq,
              bilibili.pangu.gallery.v1.AgreePolicyReply>(
                service, METHODID_AGREE_POLICY)))
        .addMethod(
          getGetLastPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.pangu.gallery.v1.GetLastPolicyReq,
              bilibili.pangu.gallery.v1.GetLastPolicyReply>(
                service, METHODID_GET_LAST_POLICY)))
        .build();
  }

  private static abstract class GalleryInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GalleryInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.pangu.gallery.v1.Gallery.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GalleryInterface");
    }
  }

  private static final class GalleryInterfaceFileDescriptorSupplier
      extends GalleryInterfaceBaseDescriptorSupplier {
    GalleryInterfaceFileDescriptorSupplier() {}
  }

  private static final class GalleryInterfaceMethodDescriptorSupplier
      extends GalleryInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GalleryInterfaceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GalleryInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GalleryInterfaceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getUserInfoMethod())
              .addMethod(getListNFTByMidMethod())
              .addMethod(getListOrderByMidMethod())
              .addMethod(getBasicInfoMethod())
              .addMethod(getUserCheckMethod())
              .addMethod(getAgreePolicyMethod())
              .addMethod(getGetLastPolicyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
