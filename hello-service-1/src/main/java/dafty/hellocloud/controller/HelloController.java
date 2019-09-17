package dafty.hellocloud.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

	private static
	Logger log = LoggerFactory.getLogger(HelloController.class); 
	
	@Value("${service1.value1}")
	private String serviceValue;
	
    @GetMapping("/hello")
    public ResponseEntity<String> hello(HttpServletRequest request) {
    	log.debug("X-Request-Origin={}", request.getHeader("X-Request-Origin"));
        return ResponseEntity.ok().body(serviceValue);
    }
}