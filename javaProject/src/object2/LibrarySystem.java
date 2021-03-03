package object2;

import java.util.Scanner;

import bankSystem.Account;

public class LibrarySystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] bookList = new Book[10];
		Member[] user = new Member[3];
		String title = null;
		String name = null;
		String Id = null;

		while (true)
			System.out.println("====================================----===================");
		System.out.println("1)도서정보입력 2)회원정보등록 3) 도서대여 4) 도서반납 5)도서목록 9)종료");
		System.out.println("===========================================================");
		System.out.print("선택 >>");

		int select = 0;
		select = sc.nextInt();

		if (select == 1) {
			String writer = null;
			String publisher = null;
			int price = 0;
			System.out.println("도서제목을 입력하세요");
			title = sc.nextLine();
			System.out.println("저자을 입력하세요");
			writer = sc.nextLine();
			System.out.println("출판사을 입력하세요");
			publisher = sc.nextLine();
			System.out.println("가격을 입력하세요");
			price = sc.nextInt();
			bookList[Book.bookListindex] = new Book(title, writer, publisher, price);

			Book.bookListindex++;

		} else if (select == 2) {
			name = sc.nextLine();
			user[Member.userindex].setName(name);
			Id = sc.nextLine();
			user[Member.userindex].setId(Id);
			Member.userindex++;

		} else if (select == 3) {
			title = sc.nextLine();
			for (int i = 0; i < Book.bookListindex; i++) {
				if (bookList[i].equals(title)) {
					user[i].rent(bookList[i]);
				} else {
					System.out.println("해당하는 도서가 없습니다.");
				}
			}
		} else if (select == 4) {
			name = sc.nextLine();
			title = sc.nextLine();
			for (int i = 0; i < Member.userindex ; i++) {
			if(user[i].getName().equals(name) || user[i].getRentBooks().equals(title)) {
				user[Member.userindex].overdue();
			}	
		 else {
			System.out.println("해당하는 도서가 없습니다.");
		}
	}
}

// 1. 도서정보입력(제목, 저자, 출판사, 가격) 2. 회원정보(이름 아이디) 배열길이 5개(빌릴수있는 책갯수) 인스턴스 디폴트값으로
// 직접입력 3. 도서대여 (책제목을 배열안에서 찾아서 회원이 가지고잇는 배열에 rent 메소드이용 담음
// 4. 도서반납 ( overdue 이용 책제목 비교 반납) 5. 도서목록(getinfo)
/*
 * Book book1 = new Book("자바", "저자1","출판사1",1000); Book book2 = new Book("자바2",
 * "저자2","출판사2",2000); Book book3 = new Book("자바3", "저자3","출판사3",3000); Book
 * book4 = new Book("자바4", "저자4","출판사4",4000); Book book5 = new Book("자바5",
 * "저자5","출판사5",5000); Book book6 = new Book("자바6", "저자6","출판사6",6000);
 */
