package ru.agniaendie.productfinderservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductFinderServiceApplication

fun main(args: Array<String>) {
	runApplication<ProductFinderServiceApplication>(*args)
}
