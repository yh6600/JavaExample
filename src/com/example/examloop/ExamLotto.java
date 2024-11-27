package com.example.examloop;


public class ExamLotto {

	public static void main(String[] args) {
		// 24.11.26 147page
		//예제 질문 읽어도 잘모르겠어서 해답예제 보고적음.
		
		int odds = 1; // 확률 
		final int n = 45; //로또 공 개수 
		final int k =6; // 로또 번호 개수 
		for(int i = 1; i <= k; i++) {
			odds = odds * (n - i + 1) / i;
		}
			System.out.println("로또 1등 확률 : 1/" + odds);
	}

}
