package Ashwani;

import java.util.Scanner;  
public class Sum_odd { // main class
	public static void main(String[] args) {   //main method
		int sum=0;  
	Scanner sc=new Scanner(System.in);  //for taking value from user
	 System.out.println("Enter a number"); //entering the name
	 int n=sc.nextInt();
	 for(int i=1; i<=n; i++){   //for loop
			if(i%2!=0){
				sum=sum+i; 
			}
		}
		System.out.println("The Sum of Odd Numbers is :"+sum); //printing the sum here
	}	 
	 }
	
