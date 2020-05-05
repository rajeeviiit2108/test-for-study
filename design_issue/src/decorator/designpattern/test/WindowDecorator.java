package decorator.designpattern.test;

public abstract class WindowDecorator implements Window {
	
	Window window;
	
	public WindowDecorator(Window window) {
		this.window=window;
	}
	
	@Override
	public void displayWindow() {
		window.displayWindow();
	}

}
