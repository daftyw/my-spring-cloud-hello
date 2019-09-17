package dafty.hellocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TestServer
 */
@SpringBootApplication
@EnableEurekaClient
public class Service1ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(Service1ServerApp.class, args);
    }
    
}