package com.example.breackANDcontinue;


public class ExampleContinue {

	public static void main(String[] args) {
		// 24.11.26
		
		// 문자열을 대상으로 반복하며 문자 'n'이 나타나는 횟수를 카운팅.
		// 만약 현재의 문자가 n이 아니면 continue 문에 의하여 루프의 나머지 부분을 생략하고 다음문자 처리.
		// 만약 문자가 'n'이면 문자 카운트를 증가함.
		
		String s = "no news is good news";
		int n = 0;
		System.out.println("문자열 길이 공백포함: "+s.length());
		for(int i = 0; i < s.length(); i++) {
			System.out.println("  : "+s.charAt(i));
			if (s.charAt(i) != 'n') {
				continue;
			}
			n++;
		}
		System.out.println("문장에서 발견된 n 의 개수 :"+n);
		
	}

}
