package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Обработчик GET-запросов /getrequest с обязательным параметром count
    @GetMapping("/getrequest")
    public String getRequest(@RequestParam("count") int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append("Iteration ").append(i + 1).append("\n");
        }
        return result.toString();
    }

    // Обработчик POST-запросов /postrequest принимающий тело JSON
    @PostMapping("/postrequest")
    public String postRequest(@RequestBody MyRequestBody requestBody) {
        return "Received id: " + requestBody.getId();
    }
}

// Класс для маппинга JSON тела запроса
class MyRequestBody {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
