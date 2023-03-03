package Ashwani;

class Customer_1 {
private int accountNumber;   //instance variable
private String accountName;  //instance variable
private double accountBalance;   //instance variable
public int getAccountNumber() {//getter to read the data
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {//setter to write the data
	this.accountName = accountName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
void withDrawAmount() {//user define method
	double balance= accountBalance-1000;
	System.out.println("balanve after withdraw amount  "+balance);
}
}
public class Customer{
public static void main(String[] args) {
Customer_1 c1 = new Customer_1();
//customer1 details
c1.setAccountNumber(63539);
c1.setAccountName("jai kishan");
c1.setAccountBalance(200);
System.out.println("Account Holder name is :"+c1.getAccountName());
System.out.println("Account number is :"+c1.getAccountNumber());
System.out.println("Withdraw Amount is :"+c1.getAccountBalance());
c1.withDrawAmount();
System.out.println(); // for space
//customer2 details
c1.setAccountName("Ashwani"); 
c1.setAccountNumber(30051);
c1.setAccountBalance(234);

System.out.println("Account Holder name is :"+c1.getAccountName());
System.out.println("Account number is :"+c1.getAccountNumber());
System.out.println("Account Balance is :"+c1.getAccountBalance());
c1.withDrawAmount();
}
}
