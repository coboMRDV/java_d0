package com.cursojava.colecciones;

public class Libro {
	private ISBN isbnGenerator = new ISBN();
	private final String autor;

	private final String titulo;
	private final String ISBN;

	public Libro(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
		ISBN = isbnGenerator.isbnNumber();
	}

	public Libro(String autor, String titulo, String ISBN) {
		this.autor = autor;
		this.titulo = titulo;
		this.ISBN = ISBN;
	}

	public String getIsbnNumber() {
		return ISBN;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		return true;
	}

	//	public boolean equals(Object obj) {
	//		boolean r = false;
	//		
	//		if (obj instanceof Libro) {
	//			if (this.ISBN.equals(((Libro) obj).ISBN)) {
	//				r = true;
	//			}
	//		}
	//		return r;
	//	}
		
	 		
		@Override
		public String toString() {
			
			return String.format("%-18s |%-20s |%-14s", titulo, autor, ISBN);
		}

}
