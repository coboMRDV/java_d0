package com.cursojava.repaso.manejoimagenes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManejoImagenes {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {

	public Panel() {
		this.setBackground(new Color(40, 40, 40));

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		int height = this.getHeight();
		int width = this.getWidth();

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/img/starfish.png"));

			for (int i = 0; i <= width; i += 20) {
				for (int j = 0; j <= height; j += 20) {

					g2d.drawImage(img, i, j, null);
				}
			}

		} catch (IOException e) {
			System.out.println("No se pudo cargar la imagen");
			System.out.println(e.getMessage());
		}

	}
}