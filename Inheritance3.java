package com.myexamples;

class Father//Base
{
	 public void house()
	 {
		 System.out.println("Have Own 2BHK House.");		 
	 }	
}
class Son extends Father //Derived
{
	public void car()
	{
		System.out.println("Have Own Audi Car.");
		
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Son o=new Son();
       o.car();
       o.house();
       }

}
