package sc.learn.provider.eureka.providereureka.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import sc.learn.api.EchoService;

/**
 * TODO
 *
 * @auther xh
 * @date 4/10/19 4:05 PM
 */
@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(@RequestParam String name) {
        System.out.printf("echo:%s\n", name);
        return "echo:" + name;
    }
}
