package observer.designpattern.test;

public class FirstObserver extends Observer{
	Subject sub;
	
	public FirstObserver(Subject sub) {
		this.sub=sub;
	}
	@Override
	public void getStatusFromSubject() {
		System.out.println("The updated item");
		sub.getItem();
		
	}

}
