package cn.com.sinosoft.servicefeign.ctrl;

import cn.com.sinosoft.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignCtrl {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/hello")
    public String sayHi(@RequestParam("name")String name){
        return feignService.sayHi(name);
    }
}
