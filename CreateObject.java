public class CreateObject {
 
		// instance variables
			  int a;
			  int b;

			  CreateObject(int aValue, int bValue) {
			    a = aValue;
			    b = bValue;
			  }
			  
	          // Method
			  int add() {
			    return a + b;
			  }
			  
			  public static void main(String[] args) {
				  // Creating object
				  CreateObject obj = new CreateObject(80, 30);
			    int result = obj.add();

			    System.out.println("Result: " + result);
			  }
			}
