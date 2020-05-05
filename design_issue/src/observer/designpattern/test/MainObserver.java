package observer.designpattern.test;

public class MainObserver {

	public static void main(String[] args) {
		Subject sub=new Subject();
		Observer obs1=new FirstObserver(sub);
		sub.registerObserver(obs1);
		obs1.getStatusFromSubject();
		
		sub.setItem(100);
		obs1.getStatusFromSubject();
	}

}
