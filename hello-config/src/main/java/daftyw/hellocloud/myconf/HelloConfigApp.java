package daftyw.hellocloud.myconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HelloConfigApp {
	
	// start main 
	public static void main(String[] args) {
		SpringApplication.run(HelloConfigApp.class, args);
	}
}
