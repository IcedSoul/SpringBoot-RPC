package info.icedsoul.dubboclient.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import info.icedsoul.dubboapi.Service.DemoService;
import info.icedsoul.dubboclient.Util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试类",description = "用来测试")
@Log
public class DemoController {

//    @Reference(version = "1.0.0",application = "dubbo-client",url = "dubbo://localhost:20880")
    @Reference(interfaceClass = DemoService.class)
    private DemoService demoService;

    @ApiOperation(value = "测试",notes = "测试",response = Response.class)
    @PostMapping("/test")
    public Response test(@RequestParam String name){
        log.info("------------" + demoService.getName(name));
        return new Response(1,"调用成功",demoService.getName(name));
    }
}
