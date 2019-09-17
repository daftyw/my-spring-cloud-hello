package daftyw.hellocloud.springhellocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloGatewayApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloGatewayApp.class, args);
	}

}
