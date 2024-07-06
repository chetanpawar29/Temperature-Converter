package com.cognifyz.temperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
	//method for to convert Fahrenheit to Celsius
	public static void fahrenheitToCelsius(double fValue){
		double Cresult = (fValue-32)*5/9;
		System.out.println("\t"+fValue+"F into Celsius is : "+Math.round(Cresult*10.0)/10.0+"C");
	}
		
	//method for to convert Celsius to Fahrenheit
	public static void celsiusToFahrenheit(double CValue){
		double Fresult = (CValue * 9/5)+32;
		System.out.println("\t"+CValue+"C into Fahrenheit is : "+Math.round(Fresult*10.0)/10.0+"F");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n ----->>> Welcome to Temperature Converter <<<----- \n");
	do{	
		System.out.println("\t1. Fahrenheit to Celsius");
		System.out.println("\t2. Celsius to Fahrenheit");
		System.out.print("\tEnter Your Choise (1 or 2): ");
		
		int choise = sc.nextInt();
		    
		if(choise == 1)
		{
			System.out.println();
		    System.out.println("-->You choise to convert Fahrenheit to Celsius<--\n");
		    System.out.print("\tEnter Fahrenheit value : ");
		    double fValue = sc.nextDouble();
		    fahrenheitToCelsius(fValue);
		    }else if(choise == 2)
		    {
		    	System.out.println();
		    	System.out.println("-->You choise to convert Celsius to Fahrenheit<--/n");
		    	System.out.print("\tEnter Celsius value : ");
		    	double CValue = sc.nextDouble();
		    	celsiusToFahrenheit(CValue);
		    }else{
		    	System.out.println();
		    	System.out.println("\tInvalid Choise! Try Again.");
		  }
		char ch;
		System.out.print("\n\tDo you want to continue (y/n): ");
		ch = sc.next().charAt(0);
		if(ch=='N' || ch=='n')
		{
			System.out.println("\n\tExit");
			break;
		}
		
	   }while(true);
	}
}
