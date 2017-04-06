package com.statice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ImageDemo {

	static {
		System.out.println(" static in block");
	}
	
	public static ImageDemo() {
		System.out.println(" constr");
	}
	static class Image {
		
		String imageName;
		private int width;
		private int height;
		
		Image(String imageName, int width,int height) {
			this.imageName = imageName;
			this.width=width;
			this.height=height;
		}
		
		@Override
		public String toString() {
			return "Name : " + imageName + " width :" + width + " Height :" + height;
		}
	}
	
	class InnerImage {
		String imageName;
		InnerImage() {};
		
		InnerImage(String imageName) {
			this.imageName = imageName;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Name :" + this.imageName;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageDemo.Image[] image= new Image[2];
		
		image[0] = new ImageDemo.Image("test1", 10, 20);
		image[1] = new Image("test2", 30, 20);
			
		List<Image> lists = (List<Image>) Arrays.asList(image);
		
		for (Image list : lists) {
			System.out.println(list);
		}
		
		InnerImage innerImage = new ImageDemo().new InnerImage();
		
		System.out.println(innerImage.toString());
	}

}
