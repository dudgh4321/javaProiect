package object2;

public class Member {
	public static int usersindex = 0;
	private String id;
	private String name;
	public Book[] rentBooks = new Book[5];

	public Member(String name, String id) {

		this.name = name;
		this.id = id;
	}

	public Member(String name, String id, Book[] rentBooks) {
		super();
		this.name = name;
		this.id = id;
		this.rentBooks = rentBooks;
	}

	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}

	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getTitle().equals(book.getTitle()))
				rentBooks[i] = null;
			break;

		}
	}

	public void getBookInfo() {
		System.out.print("멤버이름: " + id + ",  책 이름: ");
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null)
				System.out.print(rentBooks[i].getTitle() + "/");

		}
		System.out.println();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Book[] getRentBooks() {
		return rentBooks;
	}

	public void setRentBooks(Book[] rentBooks) {
		this.rentBooks = rentBooks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
