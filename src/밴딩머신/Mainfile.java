package ����ӽ�;

import java.util.Scanner;

public class Mainfile {

	public static void main(String[] args) {
		while(true) {
			int coin = 0;
			int ans = 0;
			int abc = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�ݾ��� �Է����ּ���.");
			coin = sc.nextInt();
			System.out.println("���Ḧ �������ּ���.");
			System.out.println("1. ����ֽ� : 500��");
			System.out.println("2. ������ �ֽ� : 700��");
			System.out.println("3. ���� �ֽ� : 1200��");
			ans = sc.nextInt();
			
			switch (ans) {
			case 1:
				if(coin == 500) {
					System.out.println("����ֽ��� ���Խ��ϴ�. �ȳ���������.");
					break;
				} else if (coin > 500) {
					System.out.println("����ֽ��� ���Խ��ϴ�.");
					abc = coin - 500;
					System.out.println("�Ž������� " +abc+"�� �Դϴ�.");
					break;
				} else {
					System.out.println("�ܾ��� �����մϴ�. �ݾ��� ��ȯ�մϴ�.");
					break;
				}
			case 2:
				if(coin == 700) {
					System.out.println("������ �ֽ��� ���Խ��ϴ�. �ȳ���������");
					break;
				} else if (coin > 700) {
					System.out.println("������ �ֽ��� ���Խ��ϴ�.");
					abc = coin - 700;
					System.out.println("�Ž������� " +abc+"�� �Դϴ�.");
					break;
				} else {
					System.out.println("�ܾ��� �����մϴ�. �ݾ��� ��ȯ�մϴ�.");
					break;
				}
			case 3:
				if(coin == 1200) {
					System.out.println("�����ֽ��� ���Խ��ϴ�. �ȳ���������");
					break;
				} else if (coin > 1200) {
					System.out.println("�����ֽ��� ���Խ��ϴ�.");
					abc = coin - 1200;
					System.out.println("�Ž������� " +abc+"�� �Դϴ�.");
					break;
				} else {
					System.out.println("�ܾ��� �����մϴ�. �ݾ��� ��ȯ�մϴ�.");
					break;
				}
			default: 
				System.out.println("�߸��� ���Դϴ�.");
				break;
			}
		}

	}

}
