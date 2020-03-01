package com.refactorizando.hello.world.controller;

@Controller("/hello")
public class HelloController {

  @Get("/{name}")
  public String hello(String name) {
    return "Hello " + name;
  }

}
