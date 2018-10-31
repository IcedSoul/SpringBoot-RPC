package info.icedsoul.dubboserver.Service;


import com.alibaba.dubbo.config.annotation.Service;
import info.icedsoul.dubboapi.Service.DemoService;
import org.springframework.stereotype.Component;

//@Service(version = "1.0.0",application = "dubbo-server")
@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String getName(String name) {
        return "I recieve " + name;
    }
}
