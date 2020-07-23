package com.cursojava.usothreads;

public class SincronizandoHilos {

	public static void main(String[] args) {
		SincronizaThreads t1 = new SincronizaThreads();
		SincronizaThreads2 t2 = new SincronizaThreads2(t1);
		
		t1.start();
		t2.start();
		
		System.out.println("Hemos terminado las tareas");
		
	}

}


class SincronizaThreads extends Thread{
	
	public void run() {
		for(int i = 0; i < 20 ; i ++) {
			System.out.println("Ejecutando thread: " + getName());
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class SincronizaThreads2 extends Thread{
	
	private Thread thread;
	
	
	public SincronizaThreads2(Thread thread) {
		
		this.thread = thread;
	}

	public void run() {
		try {
			thread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i = 0; i < 20 ; i ++) {
			System.out.println("Ejecutando thread: " + getName());
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
