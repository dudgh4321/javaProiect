package objects;

public class Student {

	    String studentNo; 
		int grade;
		int math;
		int eng;
	
		//생성자 : 필드값을 초기화 할때
		public Student(){
			System.out.println("생성자를 호출합니다.");
		}
		Student(String studentNo){
			this.studentNo = studentNo;
		}
		
		public void study(){
			System.out.println("공부합니다.");
		}
		
		public void run() {
			System.out.println("운동을 합니다.");
			
		}
		
		void introduce() {
			System.out.println("학번 " + studentNo+ ", 학년 : " +grade);

		}

	}

