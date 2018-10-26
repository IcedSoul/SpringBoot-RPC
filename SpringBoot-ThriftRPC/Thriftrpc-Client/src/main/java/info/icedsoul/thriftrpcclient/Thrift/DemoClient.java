package info.icedsoul.thriftrpcclient.Thrift;

import info.icedsoul.thriftrpccommon.DemoService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;
import org.springframework.beans.factory.annotation.Value;

public class DemoClient{
    @Value("${thrift.host}")
    private String host;
    @Value("${thrift.port}")
    private int port;

    private DemoService.Client demoServiceClient;
    private TBinaryProtocol protocol;
    private TSocket transport;


    public void init(){
        transport = new TSocket(host,port);
        protocol = new TBinaryProtocol(transport);
        demoServiceClient = new DemoService.Client(protocol);
    }

    public DemoService.Client getDemoServiceClient(){
        return demoServiceClient;
    }


    public void open() throws TTransportException {
        transport.open();
    }

    public void close(){
        transport.close();
    }
}
