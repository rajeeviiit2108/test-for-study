package proxy.designpattern.test;

public class MainProxy {

	public static void main(String[] args) {
		String fileName="test";
		Image image=new ProxyImage(fileName);
		image.displayImage();
		image.displayImage();
	}

}
