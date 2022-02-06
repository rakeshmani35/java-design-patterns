package com.asynchronous.callback;

public class AsynchronousCall {

	public static void main(String[] args) {
		
		B b = new B(); 
        OnGeekEventListener a = new A(); 
        b.registerOnGeekEventListener(a); 
        b.doGeekStuff(); 
	}

}
