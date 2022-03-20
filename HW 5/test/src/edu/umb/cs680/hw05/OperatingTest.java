package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;
import edu.umb.cs680.hw05.Escalator;
import edu.umb.cs680.hw05.Operating;
import edu.umb.cs680.hw05.StandBy;
import edu.umb.cs680.hw05.Stopped;

import org.junit.jupiter.api.Test;

class OperatingTest {
	
	@Test
	public void getInstanceReturnIdenticalInstance() {
		Operating operating1 = Operating.getInstance();
		Operating operating2 = Operating.getInstance();
		assertSame(operating1,operating2);
	}
	
	@Test
    public void TestStartButtonPushed() {
	Escalator escalator = Escalator.getInstance();
	escalator.changeState(Operating.getInstance());
	Operating operating = Operating.getInstance();
	operating.startButtonPushed();
	assertSame(Operating.getInstance(), escalator.getState());
	}
	
	@Test
	void TestStopButtonPushed() {
		Escalator escalator = Escalator.getInstance();
		escalator.changeState(Operating.getInstance());
		Operating operating = Operating.getInstance();
		operating.stopButtonPushed();
		assertSame(Stopped.getInstance(), escalator.getState());
	}
	
	 @Test
	void TestMotionDetected() {
		Escalator escalator = Escalator.getInstance();
		escalator.changeState(Operating.getInstance());
		Operating operating = Operating.getInstance();
		operating.motionDetected();
		assertSame(Operating.getInstance(), escalator.getState());
	}

	 public void TestmotionNotDetected() {
		 Escalator escalator = Escalator.getInstance();
		 escalator.changeState(Operating.getInstance());
		 Operating operating = Operating.getInstance();
		 operating.motionNotDetected();
		 assertSame(escalator.getState(), StandBy.getInstance()); 
	 }

}
