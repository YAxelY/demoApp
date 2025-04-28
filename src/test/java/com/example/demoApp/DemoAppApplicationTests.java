package com.example.demoApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
void shouldFail() {
    assertTrue(false); // Test volontairement cassé
}

}
