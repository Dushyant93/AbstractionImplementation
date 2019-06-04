package com.car.abstractionImpl;

public class PetrolCar extends Car{

	public PetrolCar() {
		super(EngineType.PETROL);
		stop(EngineType.PETROL.toString());
	}
	
	@Override
	void stop(String engine) {
		System.out.println("Hey "+engine+" car stop now you have gone too far!!!");
	}

}
