package decorator.designpattern.test;

public class DecoratorMain {

	public static void main(String[] args) {
		Window planeWindow=new PlaneWindow();
		planeWindow.displayWindow();
		
		
		Window horWindow=new HorizontalWindow(new PlaneWindow());
		horWindow.displayWindow();
		
		Window verticalWindow=new VerticalWindow(new HorizontalWindow(new PlaneWindow()));
		verticalWindow.displayWindow();
		

	}

}
