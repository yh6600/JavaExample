package com.example.examloop;


public class ExamLotto {

	public static void main(String[] args) {
		// 24.11.26 147page
		//���� ���� �о �߸𸣰ھ �ش俹�� ��������.
		
		int odds = 1; // Ȯ�� 
		final int n = 45; //�ζ� �� ���� 
		final int k =6; // �ζ� ��ȣ ���� 
		for(int i = 1; i <= k; i++) {
			odds = odds * (n - i + 1) / i;
		}
			System.out.println("�ζ� 1�� Ȯ�� : 1/" + odds);
	}

}
