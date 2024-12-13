package com.oop.classes1;

public class Rectangle {
	
	
		//this() �� ������ ȣ���ϱ�	261page
		private int x, y;
		private int width , height;
		
		// this() �� ����� �ٸ� ������ ȣ���� �׻� ù ��° �����̾���� --> this.�ʵ� �� ���� �ʱ�ȭ ���־���Ѵٴ� �ǹ� �ΰŰ���. 
		Rectangle(int x, int y, int width , int height){
			this.x = x;
			this.y = y;
			this.width = width;
			this.height= height;
		}		
		
		Rectangle(){
			this(0, 0, 1, 1);
		}
		
		Rectangle(int width , int height){
			this(0,0,width,height);
		}

		@Override
		public String toString() {
			return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
		}


		
}
