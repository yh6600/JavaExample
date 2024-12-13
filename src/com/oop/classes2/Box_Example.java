package com.oop.classes2;

public class Box_Example {
		//24.12.13	279page
	
		int width,height,length;
		int volume;
		
		Box_Example(int w,int l,int h){
			width = w;
			length = l;
			height = h;
			volume = w * l * h;
		}
	
		Box_Example whosLargest(Box_Example box1 ,Box_Example box2){
			if(box1.volume > box2.volume)
				return box1;
			else
				return box2;
			
		}
	
}
