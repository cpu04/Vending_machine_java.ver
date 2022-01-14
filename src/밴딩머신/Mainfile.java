package 밴딩머신;

import java.util.Scanner;

public class Mainfile {

	public static void main(String[] args) {
		while(true) {
			int coin = 0;
			int ans = 0;
			int abc = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("금액을 입력해주세요.");
			coin = sc.nextInt();
			System.out.println("음료를 선택해주세요.");
			System.out.println("1. 사과주스 : 500원");
			System.out.println("2. 오렌지 주스 : 700원");
			System.out.println("3. 포도 주스 : 1200원");
			ans = sc.nextInt();
			
			switch (ans) {
			case 1:
				if(coin == 500) {
					System.out.println("사과주스가 나왔습니다. 안녕히가세요.");
					break;
				} else if (coin > 500) {
					System.out.println("사과주스가 나왔습니다.");
					abc = coin - 500;
					System.out.println("거스름돈은 " +abc+"원 입니다.");
					break;
				} else {
					System.out.println("잔액이 부족합니다. 금액을 반환합니다.");
					break;
				}
			case 2:
				if(coin == 700) {
					System.out.println("오렌지 주스가 나왔습니다. 안녕히가세요");
					break;
				} else if (coin > 700) {
					System.out.println("오렌지 주스가 나왔습니다.");
					abc = coin - 700;
					System.out.println("거스름돈은 " +abc+"원 입니다.");
					break;
				} else {
					System.out.println("잔액이 부족합니다. 금액을 반환합니다.");
					break;
				}
			case 3:
				if(coin == 1200) {
					System.out.println("포도주스가 나왔습니다. 안녕히가세요");
					break;
				} else if (coin > 1200) {
					System.out.println("포도주스가 나왔습니다.");
					abc = coin - 1200;
					System.out.println("거스름돈은 " +abc+"원 입니다.");
					break;
				} else {
					System.out.println("잔액이 부족합니다. 금액을 반환합니다.");
					break;
				}
			default: 
				System.out.println("잘못된 값입니다.");
				break;
			}
		}

	}

}
