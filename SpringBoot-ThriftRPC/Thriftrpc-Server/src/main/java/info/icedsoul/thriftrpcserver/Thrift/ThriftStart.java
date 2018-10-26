package info.icedsoul.thriftrpcserver.Thrift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ThriftStart implements ApplicationRunner {

    @Autowired
    ThriftServer thriftServer;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        thriftServer.start();
    }

//    public void
}
