package coreJava;

public class Singleton {
	
	private static  Singleton instance = null;
	
	private Singleton() {	
	}
	
//	public static synchronized Singleton getInstance() {
//		
//		if (instance == null) {
//			instance =  new Singleton();
//		}
//		return instance;
//	}

	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
}
