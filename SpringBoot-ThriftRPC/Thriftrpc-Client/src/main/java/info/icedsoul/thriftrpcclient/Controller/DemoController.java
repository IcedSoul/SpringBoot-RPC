package info.icedsoul.thriftrpcclient.Controller;


import info.icedsoul.thriftrpcclient.Thrift.DemoClient;
import info.icedsoul.thriftrpcclient.Util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
@Api(value = "测试类",description = "用来测试")
public class DemoController {

    @Autowired
    private DemoClient demoClient;

    @ApiOperation(value = "测试",notes = "测试",response = Response.class)
    @PostMapping("/test")
    public Response test(@RequestParam String name){
        try {
            demoClient.open();
            log.info("------------调用结果-------" + demoClient.getDemoServiceClient().demoFunction(name));
            return new Response(1,"调用成功",demoClient.getDemoServiceClient().demoFunction(name));
        }catch (Exception e){
            return new Response(-1,"调用失败",null);
        }finally {
            demoClient.close();
        }

    }
}
