package com.oop.classes;

public class TelevisionTest {

	public static void main(String[] args) {
		// 2024.12.05 199 page
		Television tv = new Television(); //객체 생성
		tv.channel = 1;
		tv.volume = 3;
		tv.onOff = true;
		System.out.println("tv의 채널은 : "+tv.channel+" tv의 볼륨은 :"+tv.volume);
		
		// 204page
		
		// 두개의 텔레비전 객체가 있다 가정 하였을때, 각 텔리비전 객체의 채널,볼륨,전원상태가 서로 다름을 알수있음.
		// 각 객체마다 별도의 변수(필드)를 가진다는 점.
		
		Television yourTv = new Television();
		yourTv.channel = 3;
		yourTv.volume = 5;
		yourTv.onOff = true;
		System.out.println("yourTv의 채널은 : "+yourTv.channel+" yourTv의 볼륨은 :"+yourTv.volume);
		

		//참조 변수와 대입 연산
		Television tv1 = new Television();
		Television tv2 = tv1;
		//참조 변수를 복사하면 참조값이 복사되어 동일한 객체를 참조 하게 됨.
		//tv1과 tv2는 서로 다른 객체를 참조하는 거 같지만 실제로는 동일한 객체를 참조하게 됨.
		//tv2에 tv1을 대입하면 tv1에 저장된 참조값이 tv2로 복사됨, 따라서 동일한 참조값이 tv2로 복사된다.
		tv1.channel = 9;
		System.out.println("tv 1 channel: "+tv1.channel + "\ntv 2 channel : "+ tv2.channel);
		
		Television tv3 = new Television();
		tv2 = tv3;
		tv1.channel = 55;
		tv2.channel = 22;
		System.out.println(tv1.channel+" : "+tv2.channel+" : "+tv3.channel);
		
		/*
		 * 자바에서 객체들은 new 연산자에 의하여 heap memory 에서 할당된다고 한다.
		 * 히프 메모리는 컴퓨터에서 사용 가능한 메모리를 모아 놓은 곳이다.
		 * 메모리는 무한하지 않기 때문에 히프 메모리는 언제든지 고갈 될 수 있다, 따라서 자바 시스템에서 사용되지 않는 객체들을 삭제하여 메모리를 확보하는 것 이 필요하다.
		 * 다른 언어에서는 프로그래머가 직접 객체의 삭제를 책임져야 하지만 자바에서는 자동 메모리 수거 시스템을 사용하는데,
		 * 이것을 garbage collection 이라고 한다.
		 * 
		 * 자바의 grbage collection 은 자동으로 이루어진다.
		 * 그렇다면 grbage collection 는 어떻게 객체가 사용되지 않는지 파악하는 것일까?
		 * 모든 객체는 참조 변수를 통해서 만이 사용할 수 있다. 따라서 어떤 객체를 참조하는 변수가 전혀 없다면 그 객체는 없애도 좋은 것임.
		 * 예를 들어 아래의 문장을 생각해봤 을 떄
		 * */
		Television myTV = new Television();
		myTV = null;
		
		//참조 변수에 null이 대입되었기 때문에 생성된 객체를 가리키는 참조 변수는 하나도 남아 있지 않음.
		//이런 경우에는 자바의 GC 가 메모리에서 객체를 제거한다. ->힙 메모리에서 삭제가 된다.
	}

}
