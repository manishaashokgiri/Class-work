package com.myexamples;

import java.util.Scanner;
class Teacher
{
	int tid;
	String tname;
	double salary;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		
		System.out.println("Enter Teacher ID:");
		tid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter  Teacher Name:");
		tname=sc.nextLine();
		System.out.println("Enter Salary:");
		salary=sc.nextDouble();	
	}
}
class HRA extends Teacher{
	double salaryHRA=0;
	public void calculate() {
		salaryHRA=salary+0.12*(salary);
		System.out.println(" your HRA added salary is:"+salaryHRA);
	}
}
public class ScienceTeacher extends HRA{
	int bonus=5000;
	double totalSal;
	public void finalsal()
	{
		totalSal=salaryHRA+bonus;
		System.out.println("The final salary given to you is"+totalSal);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  ScienceTeacher obj=new ScienceTeacher();
      obj.accept();
      obj.calculate();
      obj.finalsal();
      
	}

}







