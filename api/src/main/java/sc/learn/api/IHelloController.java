package sc.learn.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 *
 * @auther xh
 * @date 4/10/19 5:26 PM
 */


public interface IHelloController {

    @GetMapping("/hello")
    String hello(@RequestParam String name);
}
