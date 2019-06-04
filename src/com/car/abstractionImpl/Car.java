package com.car.abstractionImpl;

abstract public class Car {

	private EngineType engineType = null;
	
	public Car(EngineType engineType) {
		this.engineType = engineType;
		start(engineType.toString());
	}
	
	public void start(String engine){
		System.out.println("Hey start my journey with "+engine+" car engine");
	}
	
	abstract void stop(String engine);
	
	public EngineType getEngineType() {
		return engineType;
	}
	
	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}
}
