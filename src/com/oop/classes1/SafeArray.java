package com.oop.classes1;

public class SafeArray {
	//24.12.09 248page 
	private int a [];
	public int length;
	
	// ????�? �?기�?? a배�?? index ?�기?? length �? 매�?�??? size�? ???��?? ?��???��???? �?체�???��?? ?��??�??��? ?�기?? 길�?��???
	public SafeArray(int size) {
		a = new int[size];
		length =size;
	}
	// �??????? int ?? get method ?? 매�?�??? index ???? 
	// index �??? 0보�?? ??거�?? �????? && index�??? length 보�?? ?��?? a배�?��?? ?�기�? index�????? �?????�? 0?��???? ????�? ???????? -1?? 리�?��??
	public int get(int index) {
		if(index >= 0 && index < length) {
			System.out.println("???��?? ?��?��?? �??? " +index);
			return a[index];
		}
		System.out.println("X");
		return -1;
	}
	// put method 배�??a?? ?��?��?? ?�기?? 배�?��?? �??? ?????��?? 매�?�??? index(?�기),value(�?) ????  
	public void put(int index, int value) {
		if(index >= 0 && index< length) {
			a[index] = value;
			System.out.println("value: "+value+" a[index] : "+a[index]+" index :"+index);
			System.out.println();
		} else
			System.out.println("??못�?? ?��?��?? "+index); // index ?? ?�기(�???)�? �??? 
		
	}

}
