package decorator.designpattern.test;

public class VerticalWindow  extends WindowDecorator{

	public VerticalWindow(Window window) {
		super(window);
		// TODO Auto-generated constructor stub
	}
	
	public void displayWindow() {
		super.displayWindow();
		verticalWindow();
	}
	public void verticalWindow() {
		System.out.println("This is horizontal window");
	}

}
