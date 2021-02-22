package bankSystem;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		String accNum;
		String name;
		int balance;
	
		
		while(true) {
			
			System.out.println("=========은행 업무 관리 프로그램=========");
			System.out.println("1. 계좌등록 ");
			System.out.println("2. 입금 ");
			System.out.println("3. 잔액조회 ");
			System.out.println("4. 모든 계좌 조회 ");
			System.out.println("5. 프로그램 종료");
			System.out.println("===================================");
			System.out.print("원하는 번호 입력 : ");
			
			ch = sc.nextInt();
			
			if(ch == 1) {
				Account account = new account[5]
				System.out.println("계좌등록합니다.");
				System.out.print("이름 : ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.print("계좌번호 : ");
				accNum = sc.nextLine();
				
				Account account[index] = new Account(accNum,name,balance);
				
				System.out.println("성공적으로 등록되었습니다.");
				index++;
				
			}else if(ch == 2) {
				System.out.print("입금하실 계좌번호 : ");
				 sc.nextLine();
		    	 accNum = sc.nextInt();
		    	 if(accNum.equals(??)) {
		    		 System.out.print("입금하실 금액 : ");
			    	 money = sc.nextInt();
			    	 balance[i] =+ money
		    	 }
			    			
		    }
			}else if(ch == 3) {
				System.out.println("조회하실 계좌번호 : ");
				 sc.nextLine();
		    	 accNum = sc.nextLine();
		    	 if(accNum.equals(??)) {
				System.out.println("잔액 : " + balance);
	 
				
			}else if(ch== 4){
				System.out.println("모든계좌조회");
				System.out.println("이름 : ");
				sc.nextLine();
		    	name = sc.nextLine();
		    	for(int i=0;i<10; i++) {
		    		account[i] = name
		    	}

				
				
			}else {
				break;
			}
		}

	System.out.println("이용해주셔서 감사합니다.");

}

	/*
	 * 
	 * 
	 * 
	 * int selecNum = scan.nextInt();
	 * 
	 * int inputMoney = 0 ; int inputNum = 0;
	 * 
	 * String[] Names = new String[10] ; int[] accountNum = new int[10] ; int[]
	 * balance= new int[10];
	 * 
	 * 
	 * switch (selecNum) { case 1: System.out.println("계좌를 등록합니다.");
	 * System.out.print("이름 : "); while(for(i=0; Names[i] == null, i<10; i++)) {
	 * Names[i] = scan.next(); System.out.print("계좌번호 : "); accountNum[i] =
	 * scan.nextInt(); System.out.println("성공적으로 등록되었습니다."); break;
	 * 
	 * case 2: System.out.print("입력하실 계좌번호 : "); inputNum = scan.nextInt();
	 * System.out.print("입금하실 금액 : "); inputMoney = scan.nextInt(); for(i=0; i>10,
	 * inputNum == accountNum[i]; i++) balance[i] += inputMoney; break;
	 * 
	 * case 3: System.out.print("잔액조회 계좌번호 : "); inputNum = scan.nextInt(); for(i=0;
	 * i>10, inputNum == accountNum[i]; i++) System.out.print(balance[i]); break;
	 * 
	 * case 4:{ System.out.println("모든계좌조회 "); for(i=0; Names[i] != null, i<10; i++)
	 * System.out.print((i+1)+"번째 : "+ Names[i]+"," + accountNum[i]+"," +
	 * balance[i]); break;
	 * 
	 * case 5: System.out.println("이용해주셔서 감사합니다."); break;
	 * 
	 * 
	 * }}}
	 * 
	 */

}
