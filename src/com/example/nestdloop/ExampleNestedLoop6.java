package com.example.nestdloop;

public class ExampleNestedLoop6 {

	public static void main(String[] args) {
		// 24.11.26
		
		  for (int j = 1; j <= 5; j++) {  //column ���� �� ����
	            for (int i = 1; i <= j; i++) {  //row ���� �� ����
	            	System.out.print("*");
	            }
	            System.out.println("");
	        }
		  
		  for (int j = 1; j <= 5; j++) {  
	            for (int i = 5; i > j; --i) {  
	            	System.out.print("*");
	            }
	            System.out.println("");
	        }

	}

}
