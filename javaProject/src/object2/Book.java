package object2;

public class Book {
	public static int bookListindex = 0;
	private String title;
	private String writer;
	private String publisher;
	private int price;

	public Book(String title, String writer, String publisher, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
