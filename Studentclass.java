package Method;

public class Studentclass {  
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Studentclass(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    Studentclass s1 = new Studentclass(101,"Ashwani");  
	    Studentclass s2 = new Studentclass(102,"Jai Kishan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}  
