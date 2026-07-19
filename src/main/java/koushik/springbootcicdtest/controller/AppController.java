package koushik.springbootcicdtest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class AppController {
    @GetMapping()
    public String helloWorld() {
        return "Hello World from Koushik";
    }

    @GetMapping("/info")
    public ResponseEntity<Map<String,String>> getInfo(){
        Map<String,String> map = new HashMap<>();
        map.put("App Name","Spring-Boot-CICD-Test");
        map.put("Developer","Koushik Saha");
        return ResponseEntity.ok(map);
    }
}
