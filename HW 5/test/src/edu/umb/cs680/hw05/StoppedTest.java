package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import edu.umb.cs680.hw05.Escalator;
import edu.umb.cs680.hw05.StandBy;
import edu.umb.cs680.hw05.StandBy;
import edu.umb.cs680.hw05.Stopped;

import org.junit.jupiter.api.Test;

class StoppedTest {

	@Test
	public void getInstanceReturnIdenticalInstance() {
		Stopped stopped1 = Stopped.getInstance();
		Stopped stopped2 = Stopped.getInstance();
		assertSame(stopped1,stopped2);
	}
	
	@Test
    public void TestStartButtonPushed() {
	Escalator escalator = Escalator.getInstance();
	escalator.changeState(Stopped.getInstance());
	Stopped stopped = Stopped.getInstance();
	stopped.startButtonPushed();
	assertSame(StandBy.getInstance(), escalator.getState());
	}
	
	@Test
	void TestStopButtonPushed() {
		Escalator escalator = Escalator.getInstance();
		escalator.changeState(Stopped.getInstance());
		Stopped stopped = Stopped.getInstance();
		stopped.stopButtonPushed();
		assertSame(Stopped.getInstance(), escalator.getState());
	}
	
	 @Test
	void TestMotionDetected() {
		Escalator escalator = Escalator.getInstance();
		escalator.changeState(Stopped.getInstance());
		Stopped stopped = Stopped.getInstance();
		stopped.motionDetected();
		assertSame(Stopped.getInstance(), escalator.getState());
	}

	 public void TestmotionNotDetected() {
		 Escalator escalator = Escalator.getInstance();
		 escalator.changeState(Stopped.getInstance());
		 Stopped stopped = Stopped.getInstance();
		 stopped.motionNotDetected();
		 assertSame(escalator.getState(), Stopped.getInstance()); 
	 }
}