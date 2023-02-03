package com.xworkz.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTset {

	@Test
	public void test() {
		JUnit unit = new JUnit();
		int output = unit.square(5);
		assertEquals(25, output);
	}

}
