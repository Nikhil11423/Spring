package com.xworkz.thread;

public class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {	
		System.out.println("Nikhil");
		}
	}

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		obj.start();
		 {
				for(int i=1;i<=5;i++) {	
				System.out.println("Srinath");
				}
			}
		
	}
}