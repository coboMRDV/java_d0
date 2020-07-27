package com.cursojava.BBDD;

import java.sql.*;

public class ConectaGestion {

	public static void main(String[] args) {
		try {
			// 1. CREAR CONEXION
			Connection miCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
			// 2. CREAR STATEMENT
			Statement miSt = miCon.createStatement();
			// 3. EJECUTAR INSTRUCCIÓN SQL
			ResultSet r = miSt.executeQuery("Select * from productos");
			// 4. LEER EL RESULTSET
			while (r.next()) {
				System.out.println(
						r.getString("CODIGOARTICULO") + " " + 
				r.getString("NOMBREARTICULO") + " " +
				r.getString("PRECIO")		
						);
			}
			
			r.close();
			miCon.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
