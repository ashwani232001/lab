package Ashwani;

class Library{
	private int bookId;
	private String bookName;
	private String bookAuthor;
	
	void addbook() {
		System.out.println("Add new book here :"+bookName);
	}
	void dispansebook() {
		System.out.println("dispansebook");
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
}
