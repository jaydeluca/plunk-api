package com.roughnecks.plunkgame

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class PlunkGameApplication

fun main(args: Array<String>) {
    runApplication<PlunkGameApplication>(*args)
}
