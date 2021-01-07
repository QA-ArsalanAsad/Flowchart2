package com.qa.main;

public class Flows {
	public void modularOfA() {
		for (int a=100; a<=200; a++) {
			System.out.println(a);
			
			if(a%2==0==true) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
				
		}
	
	
	}
	
	
	public void numberPrint () {
		for (int num=1; num<=10; num++) {
			for (int numOfPrints=1; numOfPrints<=10; numOfPrints++) {
				System.out.println(num);
			}
	
		}
		
	}
	
	// will come back to this problem with nick
	public void numberPrint2() {
		for (int num=1; num<=10; num++) {
			for (int numOfPrints2=num; numOfPrints2==num; numOfPrints2+=num)
			System.out.println(num);
			
		}
			
	}
}


