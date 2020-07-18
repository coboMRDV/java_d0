package com.cursojava.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RecuperaObjeto {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream objectInputStream = 
					new ObjectInputStream(
							new FileInputStream(
									"c:/users/cobo/dropbox/TestFolder/serializedOjectTest.dat"));
			
			Empleado[] arrObj = (Empleado[])objectInputStream.readObject();
			
			for (int i = 0; i < arrObj.length; i++) {
				System.out.println(arrObj[i].toString());
			}
			
			objectInputStream.close();
	 
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
