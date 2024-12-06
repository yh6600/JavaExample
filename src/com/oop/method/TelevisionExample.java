package com.oop.method;

public class TelevisionExample {

	int channel; //채널번호
	int volume; // 볼륨
	boolean onOff; // 전원상태
	
	void print() {
		System.out.println("채널은 : "+channel+" 볼륨은 :"+volume);
	}
	
	//메소드의 반환 값 return 
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
