package com.cursojava.colecciones;

public class ISBN {
	private int eanPrefix;
	private int registrationGroup;
	private int registrant;
	private int publication;
	private int checkDigit;

	
	public ISBN() {
		this.eanPrefix = (int) (Math.random() * 1000);
		this.registrationGroup = (int)(Math.random() * 100);
		this.registrant = (int)(Math.random() * 100000);
		this.publication = (int)(Math.random() * 100);
		this.checkDigit =(int)(Math.random() * 10);
	}
	

	public String isbnNumber() {
		return String.format(
				"%03d-%02d-%05d-%02d-%d", 
				eanPrefix,registrationGroup, registrant, publication, checkDigit);
		
	}

}
