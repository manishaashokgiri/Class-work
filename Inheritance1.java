package com.myexamples;
import java.util.Scanner;
class Car
{
	String brand;
	String color;
	int year;
	Scanner sc=new Scanner(System.in);
	public void inputCar()
	{
		System.out.println("Car details are given below:");
		System.out.println("Enter car brand name:");
		brand=sc.nextLine();
		System.out.println("Enter car color:");
		color=sc.nextLine();
		System.out.println("Enter manufacture year of car:");
		year=sc.nextInt();	
	}
}
class Details extends Car
{
   public void display()
   {
	   System.out.println("This is car details of "+brand+"\n"+"It has color "+color+"and manufacture year is "+year);
   }
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Details obj=new Details();
       obj.inputCar();
       obj.display();
	}

}
