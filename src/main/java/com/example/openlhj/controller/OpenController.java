package com.example.openlhj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenController {

    @GetMapping("/home")
    public String main(){

        return "안녕하세요. 서버 테스트 입니다.d";
    }
}
