package com.oop.classes;

public class Television_Exam {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television_Exam(int a,int b,boolean c){
		channel = a;
		volume = b;
		onOff = c;
	}

	@Override
	public String toString() {
		return "Television_Exam [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
	
	
}
