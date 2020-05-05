package singleton.designpattern.test;

public class SingletonMain {
private static SingletonMain myInstance=null;

	public static void main(String[] args) {
		SingletonMain  sm1=new SingletonMain();
		SingletonMain  sm2=new SingletonMain();
		sm1.getInstance();
		sm2.getInstance();
	}
	
public SingletonMain getInstance() {
	
	if(myInstance==null) {
		System.out.println("first myinstance check");
	synchronized (SingletonMain.class) {
		System.out.println("second myinstance check");
		if(myInstance==null) {
			System.out.println("third myinstance check");
			myInstance=new SingletonMain();
		}
	}
	}
	return myInstance;
}

private SingletonMain() {
	
}


}
