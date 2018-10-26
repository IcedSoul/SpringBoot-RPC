package info.icedsoul.springbootgrpcclient.Controller;

import info.icedsoul.springbootgrpcclient.Service.DemoService;
import info.icedsoul.springbootgrpcclient.Util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试类",description = "用来测试")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @ApiOperation(value = "测试",notes = "测试",response = Response.class)
    @PostMapping("/test")
    public Response test(@RequestParam String name){
        System.out.printf("------------" + demoService.demoFunction(name));
        return new Response(1,"调用成功",demoService.demoFunction(name));
    }
}
