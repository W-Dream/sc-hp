package cn.com.sinosoft.serverhi.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Test {
    @RequestMapping("/test")
    public List<String> test(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        return list;
    }

    @RequestMapping("/doGetControllerOne")
    public String doGetControllerOne(){
        return "123";
    }
}
