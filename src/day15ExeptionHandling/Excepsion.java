package day15ExeptionHandling;

public class Excepsion {
	public void findA() {
	    findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		Excepsion e=new Excepsion();
	   e.findA();
	}

}
