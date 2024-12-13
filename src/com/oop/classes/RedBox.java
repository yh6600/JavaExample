package com.oop.classes;

public class RedBox {
	//24.12.11	257page 
	
	private String color;
	private int width;
	private int heigth;
	private int lenght;
	private int volume;

	//생성자 초기화 
	RedBox(String c,int w,int h, int l){
		color = c;
		width = w;
		heigth = h;
		lenght = l;
	}
	
	public int getVolume() {
		volume = width * heigth * lenght;
		return volume;
	}
	
	@Override
	public String toString() {
		return "RedBox [color=" + color + ", width=" + width + ", heigth=" + heigth + ", lenght=" + lenght +"]";
	}
	
	// 교재에는 박스의 부피를 구하는 값을 생성자에 넣어두고 getVolume 메소드에선 volume 값만 반환 받는 차이점이 있음. 
	/* ex) 교재에서 사용한 방식 
	  	RedBox(String c,int w,int h, int l){
		color = c;
		width = w;
		heigth = h;
		lenght = l;
		volume = width * heigth * lenght;
	}
	
		public int getVolume() {
		return volume;
	}
	   */


	
	
	
}
