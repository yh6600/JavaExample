package com.oop.method1;

public class TelevisionExampleTest {
	public static void main(String[] args) {
		
		//24.12.05	212page
		TelevisionExample myTv = new TelevisionExample();
		myTv.channel = 71;
		myTv.volume = 42;
		myTv.onOff = true;
		myTv.print();
		
		TelevisionExample yourTv = new TelevisionExample();
		yourTv.channel = 17;
		yourTv.volume = 24;
		yourTv.onOff = true;
		yourTv.print();
		
		//24.12.06 216page 
		//myTv ���� ������ ����Ű�� ��ü�� getChannel()�� ȣ��ǰ� getChannel()�� return ������ �̿��Ͽ��� ��ü�� ������ �ִ� ���� channel ���� ��ȯ�Ѵ�. 
		//�̰��� ���� ch�� ����ȴ�.
		int ch = myTv.getChannel();
		System.out.println("���� ä���� : "+ch);
		//���� �ҽ����� getChannel() �տ� ���� int �� �ٷ� int �� �����͸� ��ȯ�Ѵٴ� ���� �ǹ��Ѵ�.
		//���� ��ȯ�Ǹ� �̰��� ������ �����Ͽ� ���� ���� �뵵�� ����� �� ����.
		
		//�μ� ���� �Ű� ������ �����ϴ� ���  218page 
		TelevisionExample testTv = new TelevisionExample();
		testTv.setChannel(15); //�μ��� 
		int testCh = testTv.getChannel();
		System.out.println("testCh : "+testCh);
	}
}
