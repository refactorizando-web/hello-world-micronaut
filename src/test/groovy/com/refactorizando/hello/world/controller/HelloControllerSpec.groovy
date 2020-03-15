package com.refactorizando.hello.world.controller

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification


class HelloControllerSpec extends Specification {


    @Shared @AutoCleanup
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    void "test hello world"() {
        given:
        HelloClient client = embeddedServer.applicationContext.getBean(HelloClient)

        expect:
        client.hello("Iván") == "Hello Iván"
    }
}