package sc.learn.consumer.eureka.consumereureka.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sc.learn.api.IHelloController;

/**
 * TODO
 *
 * @auther xh
 * @date 4/10/19 5:34 PM
 */
@FeignClient(value = "provider-eureka")
public interface HelloController {
    @GetMapping("/pe/echo")
    String hello(@RequestParam(value = "name") String name);

}