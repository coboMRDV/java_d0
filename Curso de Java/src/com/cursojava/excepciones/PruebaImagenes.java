package com.cursojava.excepciones;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5993533698876181142L;

	public Frame() {
		this.setSize(640, 426);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8272909611068087269L;
	BufferedImage img;

	public Panel() {
		this.setBackground(new Color(40, 40, 40));

		try {
			img = ImageIO.read(new File("src/img/starfish.png"));
//			img = ImageIO.read(new File("src/img/starfish.pngx"));

		} catch (IOException e) {
			System.out.print("Something went wrong. ");
			System.out.println(e.getMessage());

		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		int height = this.getHeight();
		int width = this.getWidth();

		if (img != null) {

			for (int i = 0; i <= width; i += img.getWidth()) {
				for (int j = 0; j <= height; j += img.getHeight()) {

					g2d.drawImage(img, i, j, null);
				}

			}
		} else {
			this.setFont(new Font("InputMono", Font.BOLD, 28));
			g2d.setColor(new Color(100, 40, 40));
			g2d.drawString("No se encontró la imagen", 100, 200);
		}

	}
}