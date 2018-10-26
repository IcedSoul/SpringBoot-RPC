package info.icedsoul.thriftrpcclient.Thrift;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoClientConfig {
    @Bean(initMethod = "init")
    public DemoClient demoClient(){
        DemoClient demoClient = new DemoClient();
        return demoClient;
    }
}
