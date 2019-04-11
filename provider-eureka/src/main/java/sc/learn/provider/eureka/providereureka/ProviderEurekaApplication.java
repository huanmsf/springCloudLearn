package sc.learn.provider.eureka.providereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderEurekaApplication.class, args);
    }

}
