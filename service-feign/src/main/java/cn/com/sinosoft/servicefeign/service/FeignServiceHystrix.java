package cn.com.sinosoft.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService{
    @Override
    public String sayHi(String name) {
       return "您好 "+name+",抱歉，出错了";
    }
}
