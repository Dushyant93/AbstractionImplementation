package com.car.abstractionImpl;

public class CarFactory {

	public static Car buildEngine(EngineType engineType){
		Car car = null;
		switch(engineType) {
		case PETROL:
			car = new PetrolCar();
			break;
		case DIESEL:
			car = new DieselCar();
			break;
		case CNG:
			car = new CNGCar();
			break;
		default:
			
		}
		return car;
	}
}
