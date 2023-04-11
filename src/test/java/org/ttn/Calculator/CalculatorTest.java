package org.ttn.Calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void calTest1() {
		App obj = new App();
		assertEquals(15,obj.add(10, 5));
	}
	
	@Test
	public void calTest2() {
		App obj = new App();
		assertEquals(8,obj.sub(17,9));
	}
	
	@Test
	public void calTest3() {
		App obj = new App();
		assertEquals(30,obj.mul(5, 6));
	}
	
	@Test
	public void calTest4() {
		App obj = new App();
		assertEquals(9,obj.div(81, 9));
	}
}
