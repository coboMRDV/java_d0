package com.cursojava.ejercicios.video145;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EscrituraArchivo {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	private JTextArea txtArea;
	private JButton btnWrite, btnRead, btnDelete;

	public Frame() {
		createFrame();
	}

	public void createFrame() {
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(40, 40, 40));
		this.setLayout(new BorderLayout(3, 3));

		txtArea = new JTextArea();
		txtArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		txtArea.setText("Hola alumnos de Java!!");
		this.add(txtArea, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel();
		this.add(buttonPanel, BorderLayout.SOUTH);

		btnWrite = new JButton("Escribir");
		btnDelete = new JButton("Borrar");
		btnRead = new JButton("Leer");
		
		btnWrite.addActionListener(new ButtonActionHandler());
		btnDelete.addActionListener(new ButtonActionHandler());
		btnRead.addActionListener(new ButtonActionHandler());

		buttonPanel.add(btnWrite);
		buttonPanel.add(btnDelete);
		buttonPanel.add(btnRead);
		
}

	private class ButtonActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton buttonClicked = (JButton) e.getSource();

			switch (buttonClicked.getText()) {
			case "Escribir":
				writeFile();
				break;
			case "Borrar":
				clearTextArea();
				break;
			case "Leer":
				readFile();
				break;
default:
				break;
			}
		}
		
		public void writeFile() {

			FileWriter fileWriter;
			
			try {
				fileWriter = new FileWriter("c:/users/cobo/dropbox/testfolder/fichero_escritura.txt");
				fileWriter.write(txtArea.getText());
				fileWriter.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}
		
				
		public void readFile() {
			try {
				BufferedReader reader = 
						new BufferedReader(
								new FileReader("c:/users/cobo/dropbox/testfolder/fichero_escritura.txt"));
				
				String textToShow = "";
				String line = reader.readLine();
				while(line != null) {
					textToShow += line;
					line = reader.readLine();
				}
				txtArea.setText(textToShow);
				reader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		public void clearTextArea() {
			txtArea.setText("");
		}
		

	}
}
