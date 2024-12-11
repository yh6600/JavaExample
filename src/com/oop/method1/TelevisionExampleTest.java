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
		//myTv 참조 변수가 가리키는 객체의 getChannel()이 호출되고 getChannel()은 return 문장을 이용하여서 객체가 가지고 있는 변수 channel 값을 반환한다. 
		//이값은 변수 ch에 저장된다.
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 : "+ch);
		//위의 소스에서 getChannel() 앞에 붙은 int 는 바로 int 형 데이터를 반환한다는 것을 의미한다.
		//값이 반환되면 이값을 변수에 저장하여 여러 가지 용도로 사용할 수 있음.
		
		//인수 값을 매개 변수에 전달하는 방식  218page 
		TelevisionExample testTv = new TelevisionExample();
		testTv.setChannel(15); //인수값 
		int testCh = testTv.getChannel();
		System.out.println("testCh : "+testCh);
	}
}
