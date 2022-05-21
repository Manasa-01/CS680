package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;


class ParetoComparatorTest {

	List<Car> carList= new ArrayList<Car>();
	@Test
	public void check_ParetoComparator() {
		


		carList.add(new Car("hundai", "H", 25, 2016, 100000));
		carList.add(new Car("VW", "M3", 40,2020, 111000));
		 
		Collections.sort(carList, (Car car1, Car car2) -> car1.getDominationCount() - car2.getDominationCount());
		 
		 
		 assertEquals(25,carList.get(0).getMileage());
		 assertEquals(40,carList.get(1).getMileage());
		
	}
	
	@Test
	public void checkerror_ParetoComparator() {

		carList.add(new Car("Toyota", "fortuner", 8,2012, 120000));
		carList.add(new Car("royal royce", "R",15, 2021, 120000));
		 
		Collections.sort(carList, (Car car1, Car car2) -> car1.getDominationCount() - car2.getDominationCount());
		 
		 
		 assertNotEquals(15,carList.get(0).getMileage());
		 assertNotEquals(8, carList.get(1).getMileage());
		
	}
}