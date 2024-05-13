package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @RequestMapping("say-hello")
    public String  sayHello(){
        return "Hello! Hey keep going and move closer";
    }


    @RequestMapping("say-hello-html")
    public String sayHelloHtml(){
        String html = """
                <html>
                    <head>
                    <title>My First HTML Page</title>
                    </head>
                    <body>
                        <h1>MY FIRST SPRINGBOOT HTML PAGE</h1>
                    </body>
                </html>
                """;

        return html;
    }
}
