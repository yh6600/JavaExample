package com.example.loop;


public class ExampleFor1 {

	public static void main(String[] args) {
		// 24.11.22 
		//������ ����1
		for (int i = 0; i <= 10; i++) { 
			  System.out.println("i1 :"+i);
		  }
		//������ ����2
		for (int i = 2; i > 0; i--) {
			System.out.println("i2 :"+ i);
		}
		for (int i = 5; i > 0; i--) { 
			  System.out.println("example 2"); 
			  }
		//������ ���ҽ�ų�� 1�� �ƴ� �ٸ����� ����Ҽ����ִ�. i+=4 �� ������� 0,4,8 �϶��� ȣ��Ǿ� 3���ݺ��ȴ�. -> i���ǽ��� < 10���� ���صξ��⶧��.
		for (int i = 0; i < 10; i+= 4) {
			System.out.println("i�������� �ƴ� �������ϰ� �Ҵ��������� ����ŭ ���");
		}
		//�޸������ڷ� ���� ������ �ʱ�ȭ ���� 
		for (int i = 0,sum = 0; i < 10; i++) {
			 sum += i;
			 System.out.println("sum : "+sum); 
		 }
		//for �ݺ�ó���� �������� ���� 
		//while �̳� for ������ ���� �ݺ�ó���� ������ ���ٸ� null ����(null statement)�� ����ϴ°͵� ����. ���̾��� null �ƴ�
		for (int i = 0; i<10; i++) {
			;
		}
		
		//���ѷ��� ����
		/*
		 * for(; ;) { System.out.println("���ѷ���"); }
		 */
	}

}
