package cn.com.sinosoft.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = FeignServiceHystrix.class)
public interface FeignService {
    @RequestMapping("/hi")
    public String sayHi(@RequestParam("name") String name);
}
