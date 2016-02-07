package com.codurance.xstartup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @RequestMapping("/")
  public String answerQuestion(@RequestParam("q") String question) {
    System.out.println("Got question " + question);
    return "Hal";
  }

}
