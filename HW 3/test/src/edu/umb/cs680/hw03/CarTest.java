package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInformation = {car.getMake(),car.getModel(),Integer.toString(car.getYear())};
		return carInformation;
	}
	
	@Test
	void verifyCarEqualityWithMakeModelYear() throws Exception{
		String[] expected = {"Toyota","RAV4","2018"};
		Car actual = new Car("Toyota", "RAV4", 25, 2018, 80000);
		assertArrayEquals(expected,carToStringArray(actual));
	}

}
