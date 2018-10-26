package info.icedsoul.thriftrpcserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ThiftrpcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThiftrpcServerApplication.class, args);
    }
}
