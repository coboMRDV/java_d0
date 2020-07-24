package com.cursojava.repaso.threads;

public class SincronizaHilos {

	public static void main(String[] args) {
		Hilo t0 = new Hilo();
		Hilo t1 = new Hilo(t0);
		Hilo t2 = new Hilo(t1);
		
		t0.start();
		t1.start();
		t2.start();
		
		
		System.out.println("Hemos terminado las tareas");
	}
}

class Hilo extends Thread{
	private Thread t;
	
	
	public Hilo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Hilo(Thread t) {
		this.t = t;
	}
		
	public void run(){
		if(t != null) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 20; i ++) {
			System.out.printf("Ejecutando hilo %s\n", getName());
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


