package proxy.designpattern.test;

public class RealImage implements Image{
private String fileName;


public RealImage(String fileName) {
	this.fileName=fileName;
	loadImageFromDisk();
}

	private void loadImageFromDisk() {
		System.out.println("The image name is: "   + fileName);
}
	@Override
	public void displayImage() {
		System.out.println("The file name is: "   + fileName);
		
	}

}
