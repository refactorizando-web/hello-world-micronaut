package com.refactorizando.hello.world.controller


import com.stratio.sanitas.availability.application.repository.AvailabilityRepository
import com.stratio.sanitas.availability.application.repository.ReasonAffectationRepository
import com.stratio.sanitas.availability.application.repository.TimetableRepository
import com.stratio.sanitas.availability.application.repository.TimetableTimeRangeRuleRepository
import com.stratio.sanitas.availability.application.service.Producer
import com.stratio.sanitas.availability.application.usecase.availability.rules.DeleteTimeRangeRulesInTimetable
import com.stratio.sanitas.availability.domain.TimetableTimeRangeRule
import com.stratio.sanitas.availability.domain.TimetableTimeRangeTypeEnum
import com.stratio.sanitas.availability.domain.ValidPeriodType
import com.stratio.sanitas.availability.infrastructure.utils.ObjectGenerator
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Subject

import javax.validation.Validator
import java.time.LocalDate
import java.time.LocalTime

class HelloControllerSpec extends Specification {


    @Shared @AutoCleanup
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer) // 1

    void "test hello world"() {
        given:
        HelloClient client = embeddedServer.applicationContext.getBean(HelloClient) // 2

        expect:
        client.hello("Iván") == "Hello Iván" // 3
    }
}