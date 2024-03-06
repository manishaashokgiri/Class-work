package com.myexamples;

import java.util.Scanner;

class Student
{
	int phy,maths,bio;
	Scanner sc=new Scanner(System.in);
	public void getInfo()
	{
		System.out.println("enter a marks of student in physics,maths and bio:");
		phy=sc.nextInt();
		maths=sc.nextInt();
		bio=sc.nextInt();
	}
	public void setInfo() {
		if(maths>85 && bio>85) {
			System.out.println(" you can choose either Engineer or medical field");
		}
		else if(bio>85){
			System.out.println("He/She is a  Medical Student");
		}
		else if(maths>85) {
			System.out.println("He/She is a  Engineer Student");
		}
	}
}

public class ClassMarks {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.getInfo();
		obj.setInfo();		

	}

}
