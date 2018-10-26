package info.icedsoul.thriftrpcserver.Service;

import info.icedsoul.thriftrpccommon.DemoService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService.Iface {

    @Override
    public String demoFunction(String name) throws TException {
        return "Hello " + name;
    }
}
