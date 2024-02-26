package hle.scalamix.controller;

import hle.scalamix.sc.ScalaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {

    @GetMapping
    public String getMsgFromScala() {
        var scalaService = new ScalaService();
        scalaService.hello();
        return "Scala java mix";
    }

}
