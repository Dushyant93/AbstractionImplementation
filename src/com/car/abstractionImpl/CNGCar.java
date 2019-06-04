package com.car.abstractionImpl;

public class CNGCar extends Car{

	public CNGCar() {
		super(EngineType.CNG);
		stop(EngineType.CNG.toString());
	}
	
	@Override
	void stop(String engine) {
		System.out.println("Hey "+engine+" car stop now you have gone too far!!!");
	}

}
