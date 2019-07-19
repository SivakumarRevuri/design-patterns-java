package com.shiv.creational;

// final - to avoid inheritance
public class SingletonExample {
	
	// crating a private static variable, so we can access directly by class name
	private static SingletonExample object = null;
	
	// if class constructor is private, child class won't get created. 
	private SingletonExample() {
		
	}
	
	// to avoid EGAR Object creation, checking null reference 
	public static SingletonExample getObject() {
		if (object == null) {
			object = new SingletonExample();
		}
		return object;
	}
}
