package com.myexamples;

public class OverloadDemo1 {

	public static double area(double r) {
		return Math.PI*r*r;
	}
	public static double area(double Len,String shape) {
		if("square".equalsIgnoreCase(shape)) {
			return Len*Len;
		}else {
			System.out.println("Invalid shape");
			return -1;
			
		}
	}
	public static double area(double length,double width)
	{
		return length*width;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double circleArea=area(5.0);
		System.out.println("Area of Circle:"+circleArea);
		
		double squareArea=area(4.0,"square");
		System.out.println("Area of square:"+squareArea);
		
		double rectangleArea=area(6.0,0.8);
		System.out.println("Area of Reactangle:"+rectangleArea);
		

		


	}

}
