package com.cursojava.ejercicios.video43;

public class Sucursal {
//	Propiedades
	int numSucursal;
	String direccion;
	String ciudad;
	
//	Constructor
	/**
	 * Construye un objeto de la clase sucursal
	 * @param numSucursal numero de la sucursal 
	 * @param direccion dirección del envío
	 * @param ciudad del envío
	 */
	public Sucursal(int numSucursal, String direccion, String ciudad) {
		this.numSucursal = numSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	
//	Metodos Setters
	/**
	 * Calcula el precio según prioridad
	 * 0 | 1 | 2  -  Normal | Alta | Urgente
	 * Pondré un precio dependiendo del peso
	 * 3€ - kg
	 * El precio aumenta en 10 euros si la prioridad es alta
	 * El precio aumenta en 20 euros si la prioridad es urgente
	 * 
	 * @param paquete ParaEnvio paquete para enviar
	 */
	public double getPrecio(Paquete paquete) {
		double precioInicial = paquete.peso * 3;
		double precioFinal = precioInicial;;
		
			switch (paquete.prioridad) {
		case 0:
			precioFinal = precioInicial;
			break;
			
		case 1:
			precioFinal += 10;
			break;
			
		case 2:
			precioFinal = precioInicial + 20;
			break;
				
		default:
			break;
		}
		return precioFinal;
	}
	
	
//	Metodos Getters
	/**
	 * Devuelve el número de sucursal
	 * @return int numero sucursal
	 */
	public int getNumSucursal() {
		return numSucursal;
	}
	
	/**
	 * Devuelve la dirección
	 * @return String dirección
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Devuelve la ciudad
	 * @return String ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	
	/**
	 * Crear un String con un formato adecuando
	 * para mostrar por consola
	 * @param paquete del envío
	 * @return String con los datos
	 */
	public String getDatos(Paquete paquete) {
		return 
				"==========Datos Sucursal=========\n" +
				"Nº Sucursal:\t" + numSucursal + "\n" +
				"Direccion:\t" + direccion + "\n" +
				"Ciudad:\t\t" + ciudad + "\n" +
				"==========Datos Paquete==========\n" +
				"Nº Referencia:\t" + paquete.referencia + "\n" +
				"Peso:\t\t" + paquete.peso + "kg\n" +
				"Prioridad:\t" + paquete.getPrioridad() + "\n" +
				"Precio:\t\t" + getPrecio(paquete) + "€\n" +
				"=================================\n";
				
	}
	
	
	
}
