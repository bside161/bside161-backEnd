package com.sys.login.social;

import com.sys.login.social.config.properties.AppProperties;
import com.sys.login.social.config.properties.CorsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        CorsProperties.class,
        AppProperties.class
})

public class ConnectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectApplication.class, args);
    }

}
