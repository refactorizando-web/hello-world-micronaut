package com.refactorizando.hello.world.controller

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client('/')
interface HelloClient {

    @Get("/hello/{name}")
    String hello(String name)
}