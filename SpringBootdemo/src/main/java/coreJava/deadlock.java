package coreJava;

public class deadlock {
 
	public static void main (String []args) {
	    String resource1 = "ratan jaiswal";  
	     String resource2 = "vimal jaiswal";  
		Runnable r1  = ()->{
		    synchronized (resource1) {  
		           System.out.println("Thread 1: locked resource 1");  
		  
		           try { Thread.sleep(100);} catch (Exception e) {}  
		  
		           synchronized (resource2) {  
		            System.out.println("Thread 1: locked resource 2");  
		           }  
		         }  
			
		};
		
	Thread t3 = new Thread(()-> {
		System.out.println("lambda");
	});
t3.start();
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = () -> {
			
			synchronized (resource2) {
			System.out.println("Thread 2: locaked resource 2");	
			
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			synchronized(resource1) {
				 System.out.println("Thread 2: locked resource 1");  
			}
			}
		};
		
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
