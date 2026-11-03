package com.marcusdev.marcus_primeira_aplicacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//Criando uma classe REST, esta receberá e enviará respostas as solicitações do cliente
@RestController
//Criando um endpoint HTTP. A rota de acesso para essa classe
@RequestMapping("/hello-world")
public class HelloWorldController   {

    //Criando um método para esta classe
    @GetMapping
    public String HelloWorld(){
        return "Hello World!!";
    }

}
