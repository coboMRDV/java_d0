package com.cursojava.BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizaTabla {

	public static void main(String[] args) {
		try {
			// 1. CREAR CONEXION
			Connection miCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
			
			// 2. CREAR STATEMENT
			Statement miSt = miCon.createStatement();
			
			// 3. CREAR INSTRUCCIÓN SQL
//			String inSql = "INSERT INTO PRODUCTOS (NOMBREARTICULO, PRECIO) VALUES('Balón de baloncesto','25')";
//			String inSql = "UPDATE PRODUCTOS SET NOMBREARTICULO = 'Escalera plegable' WHERE CODIGOARTICULO = '40'";
			String inSql = "DELETE FROM PRODUCTOS WHERE CODIGOARTICULO = '40'";
			
			// 4. EJECUTAR SQL
			miSt.executeUpdate(inSql);
			
			System.out.println("Operación realizada correctamente");
			miCon.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
