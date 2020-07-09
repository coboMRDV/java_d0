package com.cursojava.GUIs.dibujandoJFrame;

import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujandoEnJFrame {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame extends JFrame{
	
	public Frame() {
		this.setSize(800, 450);
		this.setLocationRelativeTo(null);
		this.add(new Panel());
		
		
//		**** visible ****		//
		this.setVisible(true);
	}
}


class Panel extends JPanel{
	public Panel() {
		this.setBackground(new Color(51, 51, 51));
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(100, 100, 100));
//		g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 28));
//		g.drawString("Testing", 20, 40);
//		g.drawRect(100, 100, 200, 200);
//		g.drawLine(100, 100, 300, 300);
//		g.fillRect(500, 100, 200, 200);
						
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(275, 100, 200, 200);
		BasicStroke stroke =  new BasicStroke(5);
		g2.setPaint(new Color(100, 10, 10));
		g2.setStroke(stroke);
		g2.draw(rectangulo);
		
		g2.setPaint(new Color(80, 80, 80));
		g2.fill(rectangulo);
	}
}	


