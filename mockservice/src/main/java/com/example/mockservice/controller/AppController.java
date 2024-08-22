package com.example.mockservice.controller;

import com.example.mockservice.model.PostRequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/app/v1")
public class AppController {

    @GetMapping("/getRequest")
    public ResponseEntity<String> getRequest(@RequestParam int id, @RequestParam String name) throws InterruptedException, IOException {
        if (id <= 10 || name.length() <= 5) {
            String reason = (id <= 10 ? "ID must be greater than 10. " : "") + (name.length() <= 5 ? "Name length must be greater than 5." : "");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(reason);
        }

        if (id > 10 && id < 50) {
            Thread.sleep(1000);
        } else {
            Thread.sleep(500);
        }

        String content = Files.lines(Paths.get("src/main/resources/getAnswer.txt")).collect(Collectors.joining("\n"));
        content = content.replace("{name}", name).replace("{id}", String.valueOf(id));
        return ResponseEntity.ok(content);
    }

    @PostMapping("/postRequest")
    public ResponseEntity<String> postRequest(@RequestBody PostRequestBody body) throws IOException {
        if (!StringUtils.hasText(body.getName()) || !StringUtils.hasText(body.getSurname())) {
            String reason = (!StringUtils.hasText(body.getName()) ? "Name cannot be empty. " : "") + (!StringUtils.hasText(body.getSurname()) ? "Surname cannot be empty." : "");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(reason);
        }

        if (body.getAge() == null) {
            body.setAge(123);
        }

        String content = Files.lines(Paths.get("src/main/resources/postAnswer.txt")).collect(Collectors.joining("\n"));
        content = content.replace("{name}", body.getName())
                .replace("{surname}", body.getSurname())
                .replace("{age}", String.valueOf(body.getAge()))
                .replace("{age}*2", String.valueOf(body.getAge() * 2));
        return ResponseEntity.ok(content);
    }
}
