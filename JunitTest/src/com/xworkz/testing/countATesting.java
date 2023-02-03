package com.xworkz.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATesting {

	@Test
	public void test() {
		JUnit test = new JUnit();
		int output = test.count("alphabet");
		assertEquals(2, output);
	}

}
