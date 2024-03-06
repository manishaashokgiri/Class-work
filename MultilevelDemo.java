package com.myexamples;

import java.util.Scanner;

class one
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	Public void accept()
	{
		System.out.println("Enter three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
}
class Second extends one
{
	double avg;
	public void calc()
	{
		avg=(a+b+c)/3.0;
	}
}
class Third extends Second
{
	public void display()
	{
		System.out.println("the average of three numbers are:"+avg);
	}
}
public class MultilevelDemo {
		public static void main(String[] args){
		// TODO Auto-generated method stub
        Third obj=new Third();
        obj.accept();
        obj.calc();
        obj.display();
	}

}
