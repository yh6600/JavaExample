package com.oop.inheritance;

public class Animal {

	//24.12.27	309page
	private int weight;
	private String picture;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public void eat() {
		System.out.println("eat() 호출");
	}
	public void sleep() {
		System.out.println("sleep() 호출 ");
	}
}
