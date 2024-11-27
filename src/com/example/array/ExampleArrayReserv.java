package com.example.array;

import java.util.Scanner;

public class ExampleArrayReserv {

	public static void main(String[] args) {
		// 164page 24.11.27
		final int size = 10;
		int seat[]= new int[size];
		
		while (true) {
			System.out.println("------------------------------");
			//좌석번호 
			for (int i = 0; i < size; i++) {
				System.out.print(i+1+ " ");
			}
			System.out.println("\n------------------------------");
			//좌석 예매 
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i]+" ");
			}
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1) :");
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
				System.out.println("예약되었습니다.");
			}else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println(" seat2 : "+ seat[reservation-1]);
			}
		
		
		}
	
	}

}
