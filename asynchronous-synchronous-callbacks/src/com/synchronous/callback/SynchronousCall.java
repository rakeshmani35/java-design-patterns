package com.synchronous.callback;

public class SynchronousCall {

	public static void main(String[] args) {
	
		B b = new B();
		
		OnGeekEventListener a = new A();
		
		b.registerOnGeekEventListener(a);
		b.doGeekStuff();

	}

}
