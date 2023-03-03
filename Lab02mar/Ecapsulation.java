package Ashwani;


public class Encapsulation {
public static void main(String[] args) {
	Library m=new Library();   //object
	m.setBookId(101);    //setting value in bookId
	m.setBookName("Java");   //setting value in BookName
	m.setBookAuthor("Suman Wadhwa");    //setting value in AuthorName
	System.out.println("Book ID is: "+m.getBookId());  //getting the value of bookId
	System.out.println("Name of Book is: "+m.getBookName()); //getting the value of BookName
	System.out.println("Author Name is: "+m.getBookAuthor()); //getting the value of AuthorName
    m.addbook();
    m.dispansebook();

}
}
