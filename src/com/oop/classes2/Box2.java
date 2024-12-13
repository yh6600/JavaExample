package com.oop.classes2;

public class Box2 {

		int width,length,height;

		Box2(int w, int l , int h){
			width = w ;
			length = l;
			height = h;
		}
		
		public boolean isSameBox(Box2 box2_1) {
			if(box2_1.width == width &&box2_1.length == length &&box2_1.height ==height) 
				return true;
			else
				return false;
		}
}
