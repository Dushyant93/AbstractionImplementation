package com.car.abstractionImpl;

public class TestFactoryPattern {

	public static void main(String[] args) {
		CarFactory.buildEngine(EngineType.PETROL);
		CarFactory.buildEngine(EngineType.DIESEL);
		CarFactory.buildEngine(EngineType.CNG);
	}
}
