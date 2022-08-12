package com.xworkz.runnable;


public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My Thread is Running");
		}
	}

	
	public static void main(String[] args) {
		MyThread obj=new MyThread();
		Thread t=new Thread();
		t.start();
}
}



/*

 persistance.xml(conn.prppertise)
 -->
 EMF interface
 -->
 EM is also interface
 -->
 Entity (CRUD Operation)
 
 EntityManager(CRUD)
 EntityTransaction
 Query
 criteria



EntityTransaction tx=manager.getTransaction();
tx.begin();

manager.persist(entity)
tx.commit()
manager..close();
factroy.close(); 


*/