package com.hexa

import io.micronaut.runtime.Micronaut.run
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
            title = "endereco-crud",
            version = "0.0"
    )
)
object Api {
}
fun main(args: Array<String>) {
	run(*args)
}

