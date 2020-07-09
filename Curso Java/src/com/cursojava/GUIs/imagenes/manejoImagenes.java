package com.cursojava.GUIs.imagenes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class manejoImagenes {

	public static void main(String[] args) {
		
		new Frame();
		
	}

}


class Frame extends JFrame{
	
	public Frame() {
		this.setSize(840, 439);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
//		this.setExtendedState((JFrame.MAXIMIZED_BOTH));
		
		this.add(new Panel());
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}


class Panel extends JPanel{
	public Panel() {
//		this.setBackground(new Color(255, 255, 255));
		this.setBackground(new Color(40, 40, 40));
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
//		File miImagen = new File("paisaje.jpg");

		File miImagen = new File("src/com/cursojava/GUIs/imagenes/bee.png");
		try {
			Image img = (Image)ImageIO.read(miImagen);
			g.drawImage(img, 0, 0, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se encontró la archivo");
		}
		
	}
}



