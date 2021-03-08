package inheritances;

import java.util.Scanner;

public class FriendListManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Friend[] friends = new Friend[10];
		ComFriend[] comfriends = new ComFriend[10];
		UnivFriend[] univfriends = new UnivFriend[10];
		String name = null;
		String phone = null;
		String department = null;
		String major = null;

		while (true) {
			System.out.println("=========친구리스트관리=========");
			System.out.println("1. 친구 추가 ");
			System.out.println("2. 학교친구 추가 ");
			System.out.println("3. 회사친구 추가 ");
			System.out.println("4. 전체목록 ");
			System.out.println("5. 친구이름 검색 ");
			System.out.println("6. 종료");
			System.out.println("=============================");
			System.out.print("번호선택 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			if (select == 1) {
				System.out.print("이름: ");
				name = sc.nextLine();
				System.out.print("번호: ");
				phone = sc.nextLine();
				friends[Friend.friendIndex] = new Friend(name, phone);
				Friend.friendIndex++;
			} else if (select == 2) {
				System.out.print("이름: ");
				name = sc.nextLine();
				System.out.print("번호: ");
				phone = sc.nextLine();
				System.out.print("부서: ");
				department = sc.nextLine();
				comfriends[ComFriend.friendIndex] = new ComFriend(name, phone, department);
				ComFriend.friendIndex++;
			} else if (select == 3) {
				System.out.print("이름: ");
				name = sc.nextLine();
				System.out.print("번호: ");
				phone = sc.nextLine();
				System.out.print("학과: ");
				major = sc.nextLine();
				univfriends[UnivFriend.friendIndex] = new UnivFriend(name, phone, major);
				UnivFriend.friendIndex++;
			} else if (select == 4) {
				System.out.println("친구");
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println(friend.toString());

						System.out.println("회사친구");
						for (ComFriend comfriend : comfriends) {
							if (comfriend != null) {
								System.out.println(comfriend.toString());

								System.out.println("대학친구");
								for (UnivFriend univfriend : univfriends) {
									if (univfriend != null) {
										System.out.println(univfriend.toString());
									}
								}
							}
						}
					}
				}
			} else if (select == 5) {
				System.out.print("이름: ");
				name = sc.nextLine();
			
				for (int i=0; i<Friend.friendIndex; i++) {
					if (name.equals(friends[i].name) && friends[i].name != null) {
						System.out.println("이름: " + friends[i].name + ", 번호: " + friends[i].phone);
						break;
					}
				}
				
				for (int i=0; i<ComFriend.friendIndex; i++) {
					if (name.equals(comfriends[i].name) && comfriends[i].name != null) {
						System.out.println("이름: " + comfriends[i].name + ", 번호: " + comfriends[i].phone + ", 부서: " + comfriends[i].department);
						break;
					}
				}
				for (int i=0; i<UnivFriend.friendIndex; i++) {
					if (name.equals(univfriends[i].name) && univfriends[i].name != null) {
						System.out.println("이름: " + univfriends[i].name + ", 번호: " + univfriends[i].phone+ ", 학과: " + univfriends[i].major);
						break;
					}
				}
			}else if(select == 6) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
