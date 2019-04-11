package sc.learn.consumer.eureka.consumereureka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @auther xh
 * @date 4/10/19 4:14 PM
 */
@RestController
@RequestMapping("/ce")
public class InvokeEchoServiceController {
    @Autowired
    private HelloController helloController;

    @GetMapping("/echo")
    public String echo(@RequestParam String name) {
        return helloController.hello(name);
    }

}
