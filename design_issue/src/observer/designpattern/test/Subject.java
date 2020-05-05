package observer.designpattern.test;

import java.util.ArrayList;
import java.util.List;

public class Subject {
private List<Observer> observerList=new ArrayList<>();
private int item;

public void setItem(int item) {
	this.item = item;
	updateStatus();
}


public int getItem() {
	System.out.println("The item is " + item);
	return item;
}


public void registerObserver(Observer obs) {
	observerList.add(obs);
}

public void deRegisterObserver(Observer obs) {
	observerList.remove(obs);
}
private void updateStatus() {
	for(Observer obs:observerList) {
		obs.getStatusFromSubject();
	}
}
	
}
