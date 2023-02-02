import java.util.Scanner;

public class Arithmetic {          //create class

	public static void main(String[] args) {   // main
		 Scanner num= new Scanner(System.in);    // scanner class for take input from user
		   
		  System.out.print("Input first number: ");
		  int num1 = num.nextInt();     //for input integer type variable
		   
		  System.out.print("Input second number: ");
		  int num2 = num.nextInt(); 
		   	 
		  //print the sum (addition), multiply, subtract, divide and remainder of two numbers.		  
		  System.out.println(num1+" + "+num2+" = "+(num1 + num2));
		   
		  System.out.println(num1+" - "+num2+" = "+(num1 - num2));
		   
		  System.out.println(num1+" x "+num2+" = "+(num1 * num2));
		   
		  System.out.println(num1+" / "+num2+" = "+(num1 / num2));
		 
		  System.out.println(num1+" % "+num2+" = "+(num1 % num2));
		 

	}

}
