package com.oop.method;

public class TelevisionExample {

	int channel; //ä�ι�ȣ
	int volume; // ����
	boolean onOff; // ��������
	
	void print() {
		System.out.println("ä���� : "+channel+" ������ :"+volume);
	}
	
	//�޼ҵ��� ��ȯ �� return 
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
