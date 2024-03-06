
package com.myexamples;

import java.util.Scanner;

class AddDemo1
{
	int a,b,sum;
	Scanner sc=new Scanner(System.in);
	public void inputNum()
	{
		System.out.println("Emter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		
	}
	
}
class Result extends AddDemo1
{
	public void display()
	{
		sum=a+b;
		System.out.println("The sum is"+sum);
		
	}
}

public class SingleInheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Result obj=new Result();
    obj.inputNum();
    obj.display();
	}

}

