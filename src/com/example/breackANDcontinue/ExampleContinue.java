package com.example.breackANDcontinue;


public class ExampleContinue {

	public static void main(String[] args) {
		// 24.11.26
		
		// ���ڿ��� ������� �ݺ��ϸ� ���� 'n'�� ��Ÿ���� Ƚ���� ī����.
		// ���� ������ ���ڰ� n�� �ƴϸ� continue ���� ���Ͽ� ������ ������ �κ��� �����ϰ� �������� ó��.
		// ���� ���ڰ� 'n'�̸� ���� ī��Ʈ�� ������.
		
		String s = "no news is good news";
		int n = 0;
		System.out.println("���ڿ� ���� ��������: "+s.length());
		for(int i = 0; i < s.length(); i++) {
			System.out.println("  : "+s.charAt(i));
			if (s.charAt(i) != 'n') {
				continue;
			}
			n++;
		}
		System.out.println("���忡�� �߰ߵ� n �� ���� :"+n);
		
	}

}
