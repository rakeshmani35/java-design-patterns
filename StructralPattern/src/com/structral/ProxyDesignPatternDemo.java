package com.structral;

interface image {
	void display();
}

class RealImage implements image {

	private String fileName;

	public RealImage(String filename) {
		this.fileName = filename;
		loadFromDisk();
	}

	@Override
	public void display() {
		System.out.println("Displaying...real image...." + fileName);
	}

	public void loadFromDisk() {
		System.out.println("loading..real image....." + fileName);
	}
}

class ProxyImage implements image {

	private String filename;
	private RealImage realimage;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if (realimage == null) {
			realimage = new RealImage(filename);
		}
		realimage.display();
	}

}

public class ProxyDesignPatternDemo {

	public static void main(String[] args) {
		String filename = "test_10mb.jpg";
         ProxyImage image = new ProxyImage(filename);
         image.display();
         
         System.out.println("");
         image.display();
	}

}
