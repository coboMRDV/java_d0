package com.cursojava.accesoficheros.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
	public static void main(String[] args) {
		ReadWriteFile rw = new ReadWriteFile();
		rw.write("May the force be with you");
		rw.read();
	}
}

/**
 * 
 * @author Cobo
 *
 */
class ReadWriteFile{
	private String path;
	private FileReader reader;
	private FileWriter writer;
	
	/**
	 * 
	 */
	public ReadWriteFile() {
		path = "c:/Users/Cobo/Dropbox/javaProgramTest.txt";
		
	}
	
	/**
	 * 
	 */
	public void write(String text) {
		try {
			writer = new FileWriter(path);
			for(int i = 0; i < text.length(); i ++) {
				writer.write(text.charAt(i));
			}
			writer.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public void read() {
		
		try {
			reader = new FileReader(path);
			
			int character = reader.read();
			
			while(character != -1) {
				System.out.print((char)character);
				character = reader.read();
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}