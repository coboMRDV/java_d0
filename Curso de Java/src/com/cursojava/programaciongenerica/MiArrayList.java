package com.cursojava.programaciongenerica;

public class MiArrayList {
	private Object[] datosElemento;
	private int i = 0;
	
	public MiArrayList(int z) {
		datosElemento = new Object[z];
	}
	
	public Object getObject(int i) {
		return datosElemento[i];
	}
	
	public void  addObject(Object o){
		datosElemento[i] = o; 
		i++;
	}
	
	
}
