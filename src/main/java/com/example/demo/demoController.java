package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//criar a classe para disparar os eventos para ativar os recursos

@RestController
public class demoController {
    @GetMapping("/") // quando digitar localhost:8080, vai cair na barra; a barra é como o index
    public String index() {
        return "My Aplication SpringBoot!!!!";
    }

    @GetMapping("/api")
    public String api() {
        return "Você chamou a API.";
    }

    @GetMapping("/api/teste")
    public String teste() {
        return "Você chamou a API teste";
    }

    @GetMapping("/horario")
    public String horario() {
        return new Date().toString();
    }

    @PostMapping("/api/valor")
    public String valor(@RequestBody String info) {
        return "INFORMAÇÃO RECEBIDA:" + info;
    }

    @PostMapping("api/validacao")
    public String numero(@RequestBody String valor) {
        if (Integer.parseInt(valor) % 2 == 0)
            return "O número é par!!!!!";
        else
            return "O número é ímpar!!!!";

    }

}
