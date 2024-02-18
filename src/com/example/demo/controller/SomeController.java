package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class SomeController {

    @GetMapping("/test")
    public List<String> getSomeInformation() throws Exception{
        List<Integer> integerList = new ArrayList<>();
        for (int i=1; i< Integer.MAX_VALUE; i++) {
            integerList.add(i);
            System.out.println(i);
            Thread.sleep(200);
        }
        List<String> list = List.of(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString());
        return list;
    }
}
