package com.example.array;

public class ExampleMainParameter {

	public static void main(String[] args) {
		// 169page 24.11.27
		//Run - Run Configuration - Argument ���� �μ����� ����.
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(" " + args[i]);
			}
			
			if (args[0].equals("-h")) {
				System.out.println("HELP");
			}
		}
	}

}
