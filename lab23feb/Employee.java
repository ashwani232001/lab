package Ashwani;


class Manager{
	
	int IncremenSalary() {  
		return 0;
	}
}

class Devloper extends Manager{
	
	int IncremenSalary() {  
		return 5;
	}
}

public class Employee extends Devloper {
	int IncremenSalary() { 
		return 6;
	
}

	public static void main(String[] args) {
	
		Manager m=new Manager();
		System.out.println("Increment salary of manger is : "+m.IncremenSalary());
		
		Devloper d =new Devloper();
		System.out.println("Increment salary of Devloper is : "+d.IncremenSalary());
		
		Employee e =new Employee();
		System.out.println("Increment salary of employee is : "+e.IncremenSalary());

	}

}
