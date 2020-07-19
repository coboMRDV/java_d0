package com.cursojava.programaciongenerica;

public class GenericClass<T> {
	
	private T object;
	
	public GenericClass() {
		object = null;
	}
	
	public void setObject(T newValue) {
		object = newValue;
	}
	
	public T getObject() {
		return object;
	}
	
	
		
}
