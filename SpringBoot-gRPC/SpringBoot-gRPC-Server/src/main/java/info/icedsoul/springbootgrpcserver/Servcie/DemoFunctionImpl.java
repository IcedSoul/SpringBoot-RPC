package info.icedsoul.springbootgrpcserver.Servcie;

import info.icedsoul.springbootgrpccommon.DemoProtobuf;
import info.icedsoul.springbootgrpccommon.DemoServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@GrpcService(DemoServiceGrpc.class)
public class DemoFunctionImpl extends DemoServiceGrpc.DemoServiceImplBase {
    @Override
    public void demoFunction(DemoProtobuf.DemoInput request, StreamObserver<DemoProtobuf.DemoOutput> responseObserver){
        final DemoProtobuf.DemoOutput.Builder outputBuilder = DemoProtobuf.DemoOutput.newBuilder().setKey("Hello "+ request.getKey());
        responseObserver.onNext(outputBuilder.build());
        responseObserver.onCompleted();
    }
}
