package pl.tomaszKrawczyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Tomek Krawczyk on 22.02.2018.
 */

@ComponentScan
@EnableAutoConfiguration
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class,args);
    }
}
