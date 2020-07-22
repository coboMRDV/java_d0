package com.cursojava.repaso.streamdatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWriteFile {
	
	public static void main(String[] args) {
		ReadWriteFile.readFile();
		ReadWriteFile.writeFile();
	}
	
	
	public static void readFile() {
		FileInputStream inputStream;
		
		try {
			inputStream = new FileInputStream("c:/users/cobo/dropbox/testFolder/mev.jpg");
			int readByte = inputStream.read();
			while(readByte != -1) {
//				System.out.println(readByte);
				readByte = inputStream.read();
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile() {
		FileOutputStream outputStream;
		ArrayList<Integer> pictureBytes = new ArrayList<Integer>();
		pictureBytes = fillBytesArray();
		try {
			outputStream = new FileOutputStream("c:/users/cobo/dropbox/testfolder/testsubfolder/mev_copy.jpg");
			for(int i = 0; i < pictureBytes.size(); i ++) {
				outputStream.write(pictureBytes.get(i));
			}
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Integer> fillBytesArray(){
		ArrayList<Integer> arr =  new ArrayList<>();
		
		try {
			FileInputStream inputStream = new FileInputStream("c:/users/cobo/dropbox/testfolder/mev.jpg");
			Integer readByte = inputStream.read();
			while(readByte != -1) {
				
				arr.add(readByte);
				readByte = inputStream.read();
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return arr;
	}

}



