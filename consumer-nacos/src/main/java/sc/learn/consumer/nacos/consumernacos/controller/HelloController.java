package sc.learn.consumer.nacos.consumernacos.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 *
 * @auther xh
 * @date 4/10/19 5:34 PM
 */
@FeignClient(value = "provider-nacos")
public interface HelloController {

    @GetMapping("/pn/hello")
    String hello(@RequestParam(value = "name") String name);


}