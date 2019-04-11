package sc.learn.provider.eureka.providereureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sc.learn.api.EchoService;

/**
 * TODO
 *
 * @auther xh
 * @date 4/10/19 4:29 PM
 */
@RestController
@RequestMapping("/pe")
public class EchoServiceController {
    @Autowired
    private EchoService echoService;

    @GetMapping("/echo")
    public String echo(@RequestParam String name) {
        return echoService.echo(name);
    }
}
