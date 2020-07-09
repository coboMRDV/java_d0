package com.cursojava.ejercicios.video47;

public class UsoColegio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Colegio SanJavier = new Colegio("San Javier", 200);
		Colegio Cervantes = new Colegio("Cervantes", 300);
		
		SanJavier.nuevoAlumno("Juan", 8.5);
		SanJavier.nuevoAlumno("Sara", 9);
		
//		System.out.println(SanJavier.getDatosAlumno("Juan"));
		
		Cervantes.nuevoAlumno("Ana", 5);
		Cervantes.nuevoAlumno("Antonio", 7);
		Cervantes.nuevoAlumno("María", 3);
			
		Cervantes.expulsaAlumno("Antonio");
		
		Cervantes.setNotaMedia("María",  8);
			
		
		System.out.println(Cervantes.getTodosAlumnos());
		
	}

}
