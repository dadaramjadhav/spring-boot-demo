package com.accenture;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest {

	@Test
	void test() {
		assertEquals(10, new Arithmetic().add(5, 5));
	}

}
