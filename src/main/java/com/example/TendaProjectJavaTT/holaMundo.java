package com.example.TendaProjectJavaTT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holaMundo")
public class holaMundo {

    @GetMapping("/hola")
    public String holaMundo(){
        String a= "a1";
        String b = "b2";
        String c = a + b;
        return "Hola Mundo, empezando con spring boot.. mi codigo es:" + c;
    }

    @GetMapping("/hola2")
    public String holaMundoDos(){
        String a= "a1";
        String b = "b2";
        String c = a + b;
        return "Estoy en mi página dos";
    }
}
