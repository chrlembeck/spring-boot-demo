package de.chrlembeck.springbootdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {

    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloWorld(@RequestParam final String name) {
        return "Hello, " + name + "\n";
    }

    @GetMapping(value = "/hellohtml", produces = MediaType.TEXT_HTML_VALUE)
    public String helloHtml(@RequestParam final String name) {
        return "<html><body><h1>Hello, " + name + "!</h1></body></html>";
    }
}