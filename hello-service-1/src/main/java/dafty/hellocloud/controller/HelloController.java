package dafty.hellocloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Void> hello() {
        return ResponseEntity.ok().body(null);
    }
}