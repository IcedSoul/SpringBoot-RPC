package info.icedsoul.springbootgrpccommon;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: demo.proto")
public final class DemoServiceGrpc {

  private DemoServiceGrpc() {}

  public static final String SERVICE_NAME = "demo.DemoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput,
      info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput> getDemoFunctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "demoFunction",
      requestType = info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput.class,
      responseType = info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput,
      info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput> getDemoFunctionMethod() {
    io.grpc.MethodDescriptor<info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput, info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput> getDemoFunctionMethod;
    if ((getDemoFunctionMethod = DemoServiceGrpc.getDemoFunctionMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getDemoFunctionMethod = DemoServiceGrpc.getDemoFunctionMethod) == null) {
          DemoServiceGrpc.getDemoFunctionMethod = getDemoFunctionMethod = 
              io.grpc.MethodDescriptor.<info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput, info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "demo.DemoService", "demoFunction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput.getDefaultInstance()))
                  .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("demoFunction"))
                  .build();
          }
        }
     }
     return getDemoFunctionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoServiceStub newStub(io.grpc.Channel channel) {
    return new DemoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DemoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DemoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DemoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void demoFunction(info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput request,
        io.grpc.stub.StreamObserver<info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getDemoFunctionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDemoFunctionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput,
                info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput>(
                  this, METHODID_DEMO_FUNCTION)))
          .build();
    }
  }

  /**
   */
  public static final class DemoServiceStub extends io.grpc.stub.AbstractStub<DemoServiceStub> {
    private DemoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoServiceStub(channel, callOptions);
    }

    /**
     */
    public void demoFunction(info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput request,
        io.grpc.stub.StreamObserver<info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDemoFunctionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DemoServiceBlockingStub extends io.grpc.stub.AbstractStub<DemoServiceBlockingStub> {
    private DemoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput demoFunction(info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput request) {
      return blockingUnaryCall(
          getChannel(), getDemoFunctionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DemoServiceFutureStub extends io.grpc.stub.AbstractStub<DemoServiceFutureStub> {
    private DemoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput> demoFunction(
        info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput request) {
      return futureUnaryCall(
          getChannel().newCall(getDemoFunctionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEMO_FUNCTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEMO_FUNCTION:
          serviceImpl.demoFunction((info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoInput) request,
              (io.grpc.stub.StreamObserver<info.icedsoul.springbootgrpccommon.DemoProtobuf.DemoOutput>) responseObserver);
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

  private static abstract class DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return info.icedsoul.springbootgrpccommon.DemoProtobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DemoService");
    }
  }

  private static final class DemoServiceFileDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier {
    DemoServiceFileDescriptorSupplier() {}
  }

  private static final class DemoServiceMethodDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DemoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DemoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoServiceFileDescriptorSupplier())
              .addMethod(getDemoFunctionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
