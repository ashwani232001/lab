	package Lab23Mar;

import java.util.Scanner;

public class ThrowAssi {
	public static void addTwoPositives() {
  public static void addTwoPositives() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two positive Numbers");
		try {
			try {
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a<0 && b<0) {
					System.out.println("Sum is: "+(a+b));
				}
				else {
					System.out.println("Negatives are not allowed");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("All Connections are closed");
		}
		}
	public static void main(String[] args) {
		addTwoPositives();}}
		
		
}
