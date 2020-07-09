package com.cursojava.ejercicios.video65;

public class UsoCocheMoto {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche(80);
		Coche coche2 = new Coche(110);
		
		Moto moto1 = new Moto(50);
		Moto moto2 = new Moto(40);
		
		Vehiculo[] vehiculos = new Vehiculo[4];
		vehiculos[0] = coche1;
		vehiculos[1] = coche2;
		vehiculos[2] = moto1;
		vehiculos[3] = moto2;
		
		for(int i = 0; i < vehiculos.length; i ++) {
			System.out.println(
					"El vehículo " + (i + 1) + " Tiene " + vehiculos[i].plazas() + " plazas");
		}
		
		System.out.println();
		System.out.println("Coche 1");
		coche1.frenar(20);
		System.out.println("[Plazas]: " + coche1.plazas());
		System.out.println("[Velocidad actual]: " + coche1.getVelocidadActual());
		System.out.println();
		
		System.out.println("Coche 2");
		coche2.acelerar(20);
		System.out.println("[Plazas]: " + coche2.plazas());
		System.out.println("[Velocidad actual]: " + coche2.getVelocidadActual());
		coche2.frenar(50);
		System.out.println("[Velocidad actual]: " + coche2.getVelocidadActual());
		System.out.println();
		
		System.out.println("Moto 1");
		moto1.acelerar(50);
		System.out.println("[Plazas]: " + moto1.plazas());
		System.out.println("[Velocidad actual]: " + moto1.getVelocidadActual());
		System.out.println();
		
		System.out.println("Moto 2");
		moto2.acelerar(120);
		System.out.println("[Plazas]: " + moto2.plazas());
		System.out.println("[Velocidad actual]: " + moto2.getVelocidadActual());
		
		

	}

}

