package sc.learn.consumer.nacos.consumernacos.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 *
 * @auther xh
 * @date 4/10/19 5:34 PM
 */
@FeignClient(value = "provider-nacos")
public interface HelloController2 {
    @RequestMapping(value = "/pn/hello", method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

}