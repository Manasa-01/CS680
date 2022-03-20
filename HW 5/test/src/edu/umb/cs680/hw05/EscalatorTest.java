package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw05.Escalator;

class EscalatorTest {

	@Test
	public void getInstanceReturnIdenticalInstance() {
		Escalator expected = Escalator.getInstance();
		Escalator actual = Escalator.getInstance();
		assertSame(expected, actual);
	}
	
	@Test
	public void getInstanceReturnNonNullValue() {
		assertNotNull(Escalator.getInstance());
	}

	@Test
    public void EscalatorCheck() {
	Escalator escalator = Escalator.getInstance();
	State expected = null;
	escalator.disableSensor();
	escalator.moveSteps();
	expected = Stopped.getInstance();
	assertSame(expected, escalator.getState());
	}

}