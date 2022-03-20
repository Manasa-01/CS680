package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import edu.umb.cs680.hw05.Escalator;
import edu.umb.cs680.hw05.StandBy;
import edu.umb.cs680.hw05.StandBy;
import edu.umb.cs680.hw05.Stopped;

import org.junit.jupiter.api.Test;

class StandByTest {

	@Test
	public void getInstanceReturnIdenticalInstance() {
		StandBy standby1 = StandBy.getInstance();
		StandBy standby2 = StandBy.getInstance();
		assertSame(standby1,standby2);
	}
	
	@Test
    public void TestStartButtonPushed() {
	Escalator escalator = Escalator.getInstance();
	escalator.changeState(StandBy.getInstance());
	StandBy standBy = StandBy.getInstance();
	standBy.startButtonPushed();
	assertSame(Operating.getInstance(), escalator.getState());
	}
	
	@Test
	void TestStopButtonPushed() {
		Escalator escalator = Escalator.getInstance();
		escalator.changeState(StandBy.getInstance());
		StandBy standBy = StandBy.getInstance();
		standBy.stopButtonPushed();
		assertSame(Stopped.getInstance(), escalator.getState());
	}
	
	 @Test
	void TestMotionDetected() {
		Escalator escalator = Escalator.getInstance();
		escalator.changeState(StandBy.getInstance());
		StandBy standBy = StandBy.getInstance();
		standBy.motionDetected();
		assertSame(Operating.getInstance(), escalator.getState());
	}

	 public void TestmotionNotDetected() {
		 Escalator escalator = Escalator.getInstance();
		 escalator.changeState(StandBy.getInstance());
		 StandBy standBy = StandBy.getInstance();
		 standBy.motionNotDetected();
		 assertSame(escalator.getState(), StandBy.getInstance()); 
	 }
}