package com.oop.classes1;

public class Rectangle {
	
	
		//this() 로 생성자 호출하기	261page
		private int x, y;
		private int width , height;
		
		// this() 를 사용한 다른 생성자 호출은 항상 첫 번째 문장이어야함 --> this.필드 를 먼저 초기화 해주어야한다는 의미 인거같다. 
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
