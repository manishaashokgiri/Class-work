package com.myexamples;

import java.util.Scanner;


class Employee
{
	int empId=102;
	String empName;
	double basicSal;
	Scanner sc=new Scanner(System.in);
	public void getInfo()
	{
		System.out.println("Enter Empid and Name");
		empId=sc.nextInt();
		sc.nextLine();
		empName=sc.nextLine();
		System.out.println("Enter your basic salary");
		basicSal=sc.nextDouble();			
	}
	public void showInfo()
	{
		System.out.println("Verify your information:");
		System.out.println("your empid:"+empId);
		System.out.println("your empName:"+empName);
		System.out.println("your Basic Salary:"+basicSal);
	}
	
}

public class ClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee obj=new Employee();
    System.out.println("Information of empid"+obj.empId);
    obj.getInfo();
    obj.showInfo();
    }

}
