package com.myexamples;
import java.util.Scanner;


class Tax
{
	
	double income;
	Scanner sc=new Scanner(System.in);
	public void getIncome() {
		System.out.println("Enter gross annual income:");
		income=sc.nextInt();
	}
	public void calTax() {
		double tax;
		
		if(income <=100000) {
			tax=0;
		}else if(income >100000 && income<=500000) {
			tax=1000+(0.1*(income-100000));
		}
		else if(income>500000 && income<=800000) {
			tax=5000+(0.2*(income-500000));
		}
		else{
			tax=10000+(0.3*(income-800000));
		}
		System.out.println("Tax payable by salaried person is"+tax);
	}
}
public class ClassIncomeTax
{
	public static void main(String[] args) {
		Tax t=new Tax();
		
		t.getIncome();
		t.calTax();
	}

}
