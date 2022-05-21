package edu.umb.cs680.hw13;

import java.util.ArrayList;

public class Car {

	private String make;
    private String model;
    private int year;
    private int mileage;
    private float price;
    private int dominationCount;

    public Car(String model, String make, int mileage, int year, float price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }
    
    public void setDominationCount(ArrayList<Car> cars) {
        this.dominationCount = 0;
        for(Car car : cars) {
        	if(car.getMileage() <= this.getMileage() && car.getPrice() <= this.getPrice() && car.getYear() >= this.getYear()) {
                
                if(this.getPrice() < car.getPrice() || this.getYear() > car.getYear() || this.getMileage() < car.getMileage()) {
                    dominationCount++;
                }
   
            
             }
        	
        }
        
        	
    }
        
        public int getDominationCount() {
            return dominationCount;
        }
        
        public String getMake() {
            return make;
        }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    
    public int getMileage() {
        return mileage;
    }

    public float getPrice() {
        return price;
    }

}