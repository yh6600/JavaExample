package com.oop.classes3;

class localInner{
		private int data = 30; //
		
		void dispaly() {
			final String msg = "������ ������ ���� "; 
			
			class Local{
				void printMsg() {
					System.out.println(msg + data);
				}
			}
			
			Local obj = new Local();
			obj.printMsg();
		}
		
}


public class Local_InnerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		localInner obj = new localInner();
		obj.dispaly();
		
	}

}
