package sc.learn.provider.eureka.providereureka.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sc.learn.api.IHelloController;

/**
 * TODO
 *
 * @auther xh
 * @date 4/10/19 5:33 PM
 */
@RestController
public class HelloController implements IHelloController {
    @Override
    public String hello(@RequestParam String name) {
        return ">>>hello:" + name;
    }
}
