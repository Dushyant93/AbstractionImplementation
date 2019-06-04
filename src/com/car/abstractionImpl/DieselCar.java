package com.car.abstractionImpl;

public class DieselCar extends Car{

	public DieselCar() {
		super(EngineType.DIESEL);
		stop(EngineType.DIESEL.toString());
	}
	
	@Override
	void stop(String engine) {
		System.out.println("Hey "+engine+" car stop now you have gone too far!!!");
	}

}
