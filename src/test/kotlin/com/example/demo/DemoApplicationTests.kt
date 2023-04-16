package com.example.demo

import org.mockito.kotlin.mock

class DemoApplicationTests {

	interface Person

	fun contextLoads() {
		val mock:Person = mock {  }
		println(mock)
	}

}
