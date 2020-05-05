package decorator.designpattern.test;

public class HorizontalWindow  extends WindowDecorator{

	public HorizontalWindow(Window window) {
		super(window);
	}

	public void displayWindow() {
		super.displayWindow();
		horizontalWindow();
	}
	public void horizontalWindow() {
		System.out.println("This is horizontal window");
	}
	
}
