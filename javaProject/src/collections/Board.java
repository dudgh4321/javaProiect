package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Board {
	String subject;
	String content;
	String writer;

	@Override
	public String toString() {
		return "boards [ subject =" + subject + ", content = " + content + ", writer = " + writer + "]";
	}

	Board() {
	}

	Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public static void main(String[] args) {
		ArrayList<Board> boards = new ArrayList<Board>();
//		boards= new LinkedList<>();

		Board b1 = new Board();
		b1.subject = "test";
		b1.content = "content";
		b1.writer = "writer";

		Board b2 = new Board("java", "very good", "user2");
		Board b3 = new Board("javascript", "good", "user1");
		Board b4 = new Board("aaajavavv", "bad", "user3");
		
		boards.add(b4);
		boards.add(b3);
		boards.add(b2);
		boards.add(b1);

		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).subject.indexOf("java") != -1) {
				System.out.println(boards.get(i));
			}
		}
	}
}

//		
//		String searchStr = "java";
//		for (int i=0;i<boards.size(); i++) {
//			if(boards.get(i).subject.equals(searchStr)) {
//				System.out.println(boards.get(i));
//			}
//		}
//	}
//
//}
