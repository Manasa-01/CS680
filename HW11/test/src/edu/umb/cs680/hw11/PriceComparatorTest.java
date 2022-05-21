package edu.umb.cs680.hw11;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.LinkedList;



class PriceComparatorTest {

	LinkedList<Car> carList = new LinkedList<Car>();

    @Test
	void CheckPriceComparator() {
    	Car car1 = new Car("hundai", "H", 25, 2016, 100000);
		Car car2 = new Car("VW", "M3", 40,2020, 111000);
		Car car3 = new Car("Toyota", "fortuner", 8,2012, 120000);
		Car car4 = new Car("royal royce", "R",15, 2021, 120000);
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		
		Collections.sort(carList,new MileageComparator());
		assertEquals(25, carList.get(2).getMileage());
		assertEquals(40, carList.get(3).getMileage());
		assertEquals(8, carList.get(0).getMileage());
		assertEquals(15, carList.get(1).getMileage());
		
	}

}
