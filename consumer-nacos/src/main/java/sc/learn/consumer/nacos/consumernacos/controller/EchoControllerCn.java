package sc.learn.consumer.nacos.consumernacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @auther xh
 * @date 4/11/19 9:48 AM
 */
@RestController
@RequestMapping("/cn")
@RefreshScope
public class EchoControllerCn {

    private final RestTemplate restTemplate;
    @Value("${sys.user.name:null}")
    private String user;

    @Autowired
    public EchoControllerCn(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/hello")
    public String echo(@RequestParam String name) {
        return restTemplate.getForObject("http://nacos-provider/pn/hello?name=" + name, String.class);
    }

    @Autowired
    private HelloController2 helloController2;
    @Autowired
    private HelloController helloController1;

    @GetMapping(value = "/hello1")
    public String echo1(String name) {
        return user + helloController1.hello(name);
    }

    @GetMapping(value = "/hello2")
    public String echo2(String name) {
        return user + helloController2.hello(name);
    }
}
