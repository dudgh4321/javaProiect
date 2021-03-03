package object2;

public class Member {
	public static int userindex = 0;
	private String Id;
	private String name;
	private Book[] rentBooks = new Book[5];
	public Member(){
		
	}

	public Member(String id, String name, Book[] rentBooks) {
		super();
		Id = id;
		this.name = name;
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
		System.out.print("멤버이름: " + Id + ",  책 이름: ");
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null)
				System.out.print(rentBooks[i].getTitle() + " ");
			else
				System.out.println();

		}
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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
