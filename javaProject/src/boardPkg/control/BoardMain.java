package boardPkg.control;

import java.util.Scanner;

import boardPkg.model.Board;
import boardPkg.model.Service;
import boardPkg.model.impl.ServiceImpl;

public class BoardMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Service service = new ServiceImpl();

		while (true) {
			System.out.println("======================================");
			System.out.println("1.입력 2.수정 3.삭제 4.조회 5.리스트 9.종료");
			System.out.println("======================================");
			System.out.print("선택> ");
			int menu = 0;
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.print("게시글 번호를 입력하세요> ");
				int boardNo = sc.nextInt();
				sc.nextLine();
				System.out.print("게시글 제목을 입력하세요> ");
				String title = sc.nextLine();
				System.out.print("게시글을 입력하세요> ");
				String content = sc.nextLine();
				System.out.print("게시글 작성자를 입력하세요> ");
				String writer = sc.nextLine();
				Board board = new Board(boardNo, title, content, writer, null);
				service.createBoard(board);

			} else if (menu == 2) {
				System.out.print("게시글 번호를 입력하세요> ");
				int boardNo = sc.nextInt();
				sc.nextLine();
				System.out.print("게시글을 입력하세요> ");
				String content = sc.nextLine();
				Board board = new Board(boardNo, null, content, null, null);
				service.modifyBoard(board);

			} else if (menu == 3) {
				System.out.print("게시글 번호를 입력하세요> ");
				int boardNo = sc.nextInt();
				sc.nextLine();
				Board board = new Board(boardNo, null, null, null, null);
				service.removeBoard(board);

			} else if (menu == 4) {
				System.out.print("게시글 번호를 입력하세요> ");
				int boardNo = sc.nextInt();
				sc.nextLine();
				Board board = service.getBoard(boardNo);
				System.out.println(board.toString());

			} else if (menu == 5) {
				Board[] list = service.getBoardList();
				for (Board bo : list) {
					if (bo != null) {
						System.out.println(bo.toString());

					} else if (menu == 9) {
						System.out.println("종료합니다");
						break;
					}

				}

			}

		}
	}
}
