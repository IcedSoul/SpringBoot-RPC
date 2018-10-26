package info.icedsoul.thriftrpcserver.Thrift;

import info.icedsoul.thriftrpcserver.Service.DemoServiceImpl;
import info.icedsoul.thriftrpccommon.DemoService;
import lombok.extern.java.Log;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TTransportFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Log
public class ThriftServer{

    @Value("${thrift.port}")
    private int port;
    @Value("${thrift.minWorkerThreads}")
    private int minThreads;
    @Value("${thrift.maxWorkerThreads}")
    private int maxThreads;

    private TBinaryProtocol.Factory protocolFactory;
    private TTransportFactory tTransportFactory;

    @Autowired
    private DemoServiceImpl demoServiceImpl;

    public void init(){
        protocolFactory = new TBinaryProtocol.Factory();
        tTransportFactory = new TTransportFactory();
    }

    public void start(){
        try {
            DemoService.Processor processor = new DemoService.Processor<DemoService.Iface>(demoServiceImpl);
            init();
            TServerTransport tServerTransport = new TServerSocket(port);
            TThreadPoolServer.Args tArgs = new TThreadPoolServer.Args(tServerTransport);
            tArgs.processor(processor);
            tArgs.protocolFactory(protocolFactory);
            tArgs.transportFactory(tTransportFactory);
            tArgs.minWorkerThreads(minThreads);
            tArgs.maxWorkerThreads(maxThreads);

            TServer server = new TThreadPoolServer(tArgs);
            log.info("ThriftRPC start success on port: " + port);
            server.serve();
        } catch (TTransportException e){
            log.info("ThriftRPC start failed.");
        }

    }

}
