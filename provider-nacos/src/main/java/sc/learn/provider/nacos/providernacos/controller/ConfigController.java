package sc.learn.provider.nacos.providernacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @auther xh
 * @date 4/11/19 9:31 AM
 */
@RestController
@RequestMapping("/pn")
@RefreshScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/config")
    public boolean config() {
        return useLocalCache;
    }
}