package com.myexamples;

import java.util.Scanner;
class User1{
	int sal,res;
	Scanner sc=new Scanner(System.in);
	public void inputSal()
	{
		System.out.println("Enter Salary:");
		sal=sc.nextInt();
		
	}
}
class NewSal extends User1
{
	public void display()
	{
		double bonus=0.0;
		if(sal<50000)
		{
			bonus =sal*0.10;
			double totalSal=sal+bonus;
			System.out.println("The totalsalary with bonus is:"+totalSal);
		}
		else
		{
			System.out.println("The salary remain same without bonus.");
		}
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       NewSal obj=new NewSal();
       obj.inputSal();
       obj.display();
	}

}
