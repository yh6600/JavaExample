package com.example.array;

import java.util.Scanner;

public class ExampleArrayReserv {

	public static void main(String[] args) {
		// 164page 24.11.27
		final int size = 10;
		int seat[]= new int[size];
		
		while (true) {
			System.out.println("------------------------------");
			//�¼���ȣ 
			for (int i = 0; i < size; i++) {
				System.out.print(i+1+ " ");
			}
			System.out.println("\n------------------------------");
			//�¼� ���� 
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i]+" ");
			}
			System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1) :");
			System.out.println();
			Scanner scan =new Scanner(System.in);
			int reservation = scan.nextInt();
			System.out.println("seat @@@ : "+ seat[reservation -1]);
			if (reservation == -1) {
				break;
			}
			else if (seat[reservation-1] == 0) {
				seat[reservation-1] = 1;
				System.out.println(" seat : "+ seat[reservation-1]);
				System.out.println("����Ǿ����ϴ�.");
			}else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
				System.out.println(" seat2 : "+ seat[reservation-1]);
			}
		
		
		}
	
	}

}
