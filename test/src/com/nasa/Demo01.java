package com.nasa;

public class Demo01 {
	
	public static void main(String[] args) {
		getInfos1();
		getInfos2();
	}
	
	public static void getInfos1() {
		System.out.println("learn git!");
	}
	
	public static void getInfos2() {
		int x = 0;
		for(int i = 0; i < 10; i++) {
			x += i;
		}
		System.out.println(x);
	}

}
