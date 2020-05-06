package proxy.designpattern.test;

public class MainProxy {

	public static void main(String[] args) {
		System.out.println("In main proxy::::");
		String fileName="test";
		Image image=new ProxyImage(fileName);
		image.displayImage();
		image.displayImage();
	}

}
