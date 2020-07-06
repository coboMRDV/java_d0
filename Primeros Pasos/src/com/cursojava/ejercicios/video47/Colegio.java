package com.cursojava.ejercicios.video47;

/**
 * Colegio.java
 * 
 * Ejercicio Curso java
 * 
 * @author Cobo
 *
 */
public class Colegio {
	/**
	 * Propiedades
	 */
	private String nombre;
	private Alumno[] alumnos;
	private static int nAlumno = 1;

	/**
	 * Construye un nuevo colegio
	 * 
	 * El número pasado en numeroAlumnos se usará para establecer la capacidad del
	 * array
	 * 
	 * @param nombre        String nombre del colegio
	 * @param numeroAlumnos int Capacidad del colegio
	 */
	public Colegio(String nombre, int numeroAlumnos) {
		this.nombre = nombre;
		this.alumnos = new Alumno[numeroAlumnos];
	}

	/**
	 * Establece un nuevo nombre para el colegio
	 * 
	 * @param nombre String nuevo nombre
	 */
	public void setNombreColegio(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Establece una nueva nota media para el alumno cuyo nombre se pasa por
	 * parámetro
	 * 
	 * 
	 * @param nombreAlumno String nombre del alumno
	 * @param nuevaNota    double nueva nota
	 */
	public void setNotaMedia(String nombreAlumno, double nuevaNota) {
		boolean encontrado = false;

		int i = 0;
		while (i < alumnos.length && !encontrado) {
			if (alumnos[i] != null && alumnos[i].getNombre().equals(nombreAlumno)) {
				alumnos[i].setNotaMedia(nuevaNota);
			}
			i++;
		}
	}

	/**
	 * Devuelve el nombre del colegio
	 * 
	 * @return String nombre del colegio
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el número de alumno Método static
	 * 
	 * @return int numero de alumno
	 */
	public static int getNalumno() {
		return nAlumno;
	}

	/**
	 * Devuelve los datos del alumno cuyo nombre se pasa como parámetro
	 * 
	 * @param nombreAlumno
	 * @return
	 */
	public String getDatosAlumno(String nombreAlumno) {
		boolean encontrado = false;
		String str = "";

		int i = 0;
		while (i < alumnos.length && !encontrado) {

			if (alumnos[i] != null && alumnos[i].getNombre().equals(nombreAlumno)) {
				encontrado = true;
				Alumno a = alumnos[i];
				String tab = a.getNombre().length() < 7 ? "\t\t\t" : "\t\t";
				str = "" + a.getNumeroAlumno() + "\t|" + a.getNombre() + tab + a.getNotaMedia() + "\t|" + nombre;
			}
			i++;
		}

		return str;
	}
	
	/**
	 * Devuelve un listado de todos los alumnos en un
	 * formato adecuado para ser visualizado por consola
	 * 
	 * @return String listado de datos de alumnos
	 */
	public String getTodosAlumnos() {
		String str = "";

		System.out.println("Nº\t|Nombre\t\t\t|Media\t|Colegio");
		System.out.println("=================================================");

		int i = 0;

		while (i < alumnos.length ) {
			if(alumnos[i] != null) {
				str += getDatosAlumno(alumnos[i].getNombre()) + "\n";
			}
			i++;
		}

		return str;
	}

	/**
	 * Introduce un nuevo alumno en el colegio Cada vez que se introduce un nuevo
	 * alumno se incrementa el contador
	 * 
	 * @param nombre    String nombre del alumno
	 * @param notaMedia double nota media de este alumno
	 */
	public void nuevoAlumno(String nombre, double notaMedia) {
		boolean encontrado = false;
		int i = 0;
		int freeSpot = 0;
		while (i < alumnos.length && !encontrado) {
			if (alumnos[i] == null) {
				freeSpot = i;
				encontrado = true;
			}
			i++;
		}
		alumnos[freeSpot] = new Alumno(nombre, notaMedia);
		nAlumno++;

	}

	/**
	 * Expulsa a un alumno del colegio
	 * 
	 * El método buscará el nombre, y si encuentra el nombre establecera el
	 * contenido del array en ese índice a null
	 * 
	 * @param nombreAlumno
	 */
	public void expulsaAlumno(String nombreAlumno) {
		
					
		boolean encontrado = false;

		int i = 0;
		while(i < alumnos.length && !encontrado) {

			if(alumnos[i].getNombre().equals(nombreAlumno)) {
				encontrado = true;
				alumnos[i] = null;
			}
			
			i++;
		}

		

	}

}
