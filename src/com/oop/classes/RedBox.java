package com.oop.classes;

public class RedBox {
	//24.12.11	257page 
	
	private String color;
	private int width;
	private int heigth;
	private int lenght;
	private int volume;

	//������ �ʱ�ȭ 
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
	
	// ���翡�� �ڽ��� ���Ǹ� ���ϴ� ���� �����ڿ� �־�ΰ� getVolume �޼ҵ忡�� volume ���� ��ȯ �޴� �������� ����. 
	/* ex) ���翡�� ����� ��� 
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
