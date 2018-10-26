package info.icedsoul.springbootgrpcclient.Service;

import info.icedsoul.springbootgrpccommon.DemoProtobuf;
import info.icedsoul.springbootgrpccommon.DemoServiceGrpc;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
    @GrpcClient("SpringBoot-gRPC-Server")
    private Channel channel;

    public String demoFunction(String name){
        DemoServiceGrpc.DemoServiceBlockingStub stub = DemoServiceGrpc.newBlockingStub(channel);
        DemoProtobuf.DemoOutput response = stub.demoFunction(DemoProtobuf.DemoInput.newBuilder().setKey(name).build());
        return response.getKey();
    }
}
