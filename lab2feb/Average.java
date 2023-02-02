import java.util.Scanner;

public class Average {                        // create class
    public static void main(String[] args) {      // main
        Scanner num =new Scanner(System.in);       // this line for take input from user
        System.out.println("Input first number");
        int a= num.nextInt();
        System.out.println("Input second number");
        int b= num.nextInt();
        System.out.println("Input third number");
        int c= num.nextInt();
        System.out.println("Input fourth number");
        int d= num.nextInt();
        System.out.println("Enter fifth number");
        int e= num.nextInt();

        int sum=(a+b+c+d+e)/5;                           // formula of Average
        System.out.println("Average = "+sum);              // print average of all num
    }
}
