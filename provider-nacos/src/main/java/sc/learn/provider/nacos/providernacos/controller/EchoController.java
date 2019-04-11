package sc.learn.provider.nacos.providernacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @auther xh
 * @date 4/11/19 9:36 AM
 */
@RestController
@RequestMapping("/pn")
@RefreshScope
public class EchoController {
    @Value("${sys.user.name:null}")
    private String user;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return user + "Hello : " + name;
    }

    @GetMapping(value = "/echo")
    public String echo(@RequestParam String name) {
        return user + "Echo : " + name;
    }
}
