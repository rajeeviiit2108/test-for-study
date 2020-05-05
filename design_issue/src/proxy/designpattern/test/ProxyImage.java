package proxy.designpattern.test;

public class ProxyImage implements Image{

	private String fileName;
	private RealImage image;
	
	public ProxyImage(String fileName) {
		this.fileName=fileName;
	}
	
	
	@Override
	public void displayImage() {
		if(image==null) {
			image=new RealImage(fileName);
		}
		image.displayImage();
	}
	

}
