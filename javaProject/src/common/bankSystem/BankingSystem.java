package bankSystem;

import java.util.Scanner;

public class BankingSystem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BankAccount[] ac = new BankAccount[5];
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		String accNum;
		String name;
		int money = 0;
		
		
		while(true) {
			
			System.out.println("=========���� ���� ���� ���α׷�=========");
			System.out.println("1. ���µ�� ");
			System.out.println("2. �Ա� ");
			System.out.println("3. �ܾ���ȸ ");
			System.out.println("4. ��� ���� ��ȸ ");
			System.out.println("5. ���α׷� ����");
			System.out.println("===================================");
			System.out.print("���ϴ� ��ȣ �Է� : ");
			
			ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("���µ���մϴ�.");
				System.out.print("�̸� : ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.print("���¹�ȣ : ");
				accNum = sc.nextLine();
				
				ac[BankAccount.Index] = new BankAccount(name,accNum,0);
				
				
				System.out.println("���������� ��ϵǾ����ϴ�.");
				BankAccount.Index++;
				
			}else if(ch == 2) {
				
				
				
			}else if(ch == 3) {
				
				
			}else if(ch== 4){
				System.out.println("��������ȸ");
				
				
			}else {
				break;
			}
		}
	
	
	System.out.println("�̿����ּż� �����մϴ�.");
	
		
		
	}
	
	/*
	
	
	
	int selecNum = scan.nextInt();	
	
	int inputMoney = 0 ;
	int inputNum = 0;
	
	String[] Names = new String[10] ;
	   int[] accountNum = new int[10] ;
	   int[] balance= new int[10];	

		
	switch (selecNum) {
		case 1:
			System.out.println("���¸� ����մϴ�.");
			System.out.print("�̸� : ");
			while(for(i=0; Names[i] == null, i<10; i++)) {
				 Names[i] = scan.next();
			System.out.print("���¹�ȣ : ");
			 accountNum[i] = scan.nextInt();
			System.out.println("���������� ��ϵǾ����ϴ�.");
		    break;
		
	    case 2:
	    	System.out.print("�Է��Ͻ� ���¹�ȣ : ");
	    	 inputNum = scan.nextInt();
	    	System.out.print("�Ա��Ͻ� �ݾ� : ");
	    	 inputMoney = scan.nextInt();
	    	 for(i=0; i>10, inputNum == accountNum[i]; i++)
	    		 			balance[i] += inputMoney;
	    	break;
	    
	    case 3:
	    	System.out.print("�ܾ���ȸ ���¹�ȣ : ");
	    	 inputNum = scan.nextInt();
	    	 for(i=0; i>10, inputNum == accountNum[i]; i++)
	    		 		System.out.print(balance[i]);
	    	break;
	    
	    case 4:{
	    	System.out.println("��������ȸ ");
	    	for(i=0; Names[i] != null, i<10; i++)
	    	System.out.print((i+1)+"��° : "+ Names[i]+"," + accountNum[i]+"," + balance[i]);
	    	break;
	    
	    case 5:
	    	System.out.println("�̿����ּż� �����մϴ�.");
	    	break;


	    }}}

	*/
	
	
}
	