package bilibili.polymer.contract.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 契约
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bilibili/polymer/contract/v1/contract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContractGrpc {

  private ContractGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.polymer.contract.v1.Contract";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq,
      com.google.protobuf.Empty> getAddContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddContract",
      requestType = bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq,
      com.google.protobuf.Empty> getAddContractMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq, com.google.protobuf.Empty> getAddContractMethod;
    if ((getAddContractMethod = ContractGrpc.getAddContractMethod) == null) {
      synchronized (ContractGrpc.class) {
        if ((getAddContractMethod = ContractGrpc.getAddContractMethod) == null) {
          ContractGrpc.getAddContractMethod = getAddContractMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ContractMethodDescriptorSupplier("AddContract"))
              .build();
        }
      }
    }
    return getAddContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq,
      bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply> getAddContractV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddContractV2",
      requestType = bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq.class,
      responseType = bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq,
      bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply> getAddContractV2Method() {
    io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq, bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply> getAddContractV2Method;
    if ((getAddContractV2Method = ContractGrpc.getAddContractV2Method) == null) {
      synchronized (ContractGrpc.class) {
        if ((getAddContractV2Method = ContractGrpc.getAddContractV2Method) == null) {
          ContractGrpc.getAddContractV2Method = getAddContractV2Method =
              io.grpc.MethodDescriptor.<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq, bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddContractV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply.getDefaultInstance()))
              .setSchemaDescriptor(new ContractMethodDescriptorSupplier("AddContractV2"))
              .build();
        }
      }
    }
    return getAddContractV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq,
      bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply> getContractConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractConfig",
      requestType = bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq.class,
      responseType = bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq,
      bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply> getContractConfigMethod() {
    io.grpc.MethodDescriptor<bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq, bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply> getContractConfigMethod;
    if ((getContractConfigMethod = ContractGrpc.getContractConfigMethod) == null) {
      synchronized (ContractGrpc.class) {
        if ((getContractConfigMethod = ContractGrpc.getContractConfigMethod) == null) {
          ContractGrpc.getContractConfigMethod = getContractConfigMethod =
              io.grpc.MethodDescriptor.<bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq, bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply.getDefaultInstance()))
              .setSchemaDescriptor(new ContractMethodDescriptorSupplier("ContractConfig"))
              .build();
        }
      }
    }
    return getContractConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContractStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContractStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContractStub>() {
        @java.lang.Override
        public ContractStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContractStub(channel, callOptions);
        }
      };
    return ContractStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContractBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContractBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContractBlockingStub>() {
        @java.lang.Override
        public ContractBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContractBlockingStub(channel, callOptions);
        }
      };
    return ContractBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContractFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContractFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContractFutureStub>() {
        @java.lang.Override
        public ContractFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContractFutureStub(channel, callOptions);
        }
      };
    return ContractFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 契约
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void addContract(bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddContractMethod(), responseObserver);
    }

    /**
     */
    default void addContractV2(bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddContractV2Method(), responseObserver);
    }

    /**
     */
    default void contractConfig(bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Contract.
   * <pre>
   * 契约
   * </pre>
   */
  public static abstract class ContractImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContractGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Contract.
   * <pre>
   * 契约
   * </pre>
   */
  public static final class ContractStub
      extends io.grpc.stub.AbstractAsyncStub<ContractStub> {
    private ContractStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContractStub(channel, callOptions);
    }

    /**
     */
    public void addContract(bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addContractV2(bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddContractV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void contractConfig(bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq request,
        io.grpc.stub.StreamObserver<bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Contract.
   * <pre>
   * 契约
   * </pre>
   */
  public static final class ContractBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContractBlockingStub> {
    private ContractBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContractBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty addContract(bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply addContractV2(bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddContractV2Method(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply contractConfig(bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Contract.
   * <pre>
   * 契约
   * </pre>
   */
  public static final class ContractFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContractFutureStub> {
    private ContractFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContractFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addContract(
        bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply> addContractV2(
        bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddContractV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply> contractConfig(
        bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CONTRACT = 0;
  private static final int METHODID_ADD_CONTRACT_V2 = 1;
  private static final int METHODID_CONTRACT_CONFIG = 2;

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
        case METHODID_ADD_CONTRACT:
          serviceImpl.addContract((bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_CONTRACT_V2:
          serviceImpl.addContractV2((bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply>) responseObserver);
          break;
        case METHODID_CONTRACT_CONFIG:
          serviceImpl.contractConfig((bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq) request,
              (io.grpc.stub.StreamObserver<bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply>) responseObserver);
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
          getAddContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq,
              com.google.protobuf.Empty>(
                service, METHODID_ADD_CONTRACT)))
        .addMethod(
          getAddContractV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.contract.v1.ContractRpcProto.AddContractReq,
              bilibili.polymer.contract.v1.ContractRpcProto.AddContractReply>(
                service, METHODID_ADD_CONTRACT_V2)))
        .addMethod(
          getContractConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReq,
              bilibili.polymer.contract.v1.ContractRpcProto.ContractConfigReply>(
                service, METHODID_CONTRACT_CONFIG)))
        .build();
  }

  private static abstract class ContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContractBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.polymer.contract.v1.ContractRpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Contract");
    }
  }

  private static final class ContractFileDescriptorSupplier
      extends ContractBaseDescriptorSupplier {
    ContractFileDescriptorSupplier() {}
  }

  private static final class ContractMethodDescriptorSupplier
      extends ContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContractMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContractGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContractFileDescriptorSupplier())
              .addMethod(getAddContractMethod())
              .addMethod(getAddContractV2Method())
              .addMethod(getContractConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
