package com.synchronous.callback;

public class B {

	private OnGeekEventListener mListener; // listener field

	// setting the listener
	public void registerOnGeekEventListener(OnGeekEventListener mListener) {
		this.mListener = mListener;
	}

	// my synchronous task
	public void doGeekStuff() {
		// perform any operation
		System.out.println("Performing callback before synchronous Task");

		if (mListener != null) {
			mListener.onGeekEvent();
		}
		
		System.out.println("synchronous Task blocked code  &&&&&&&&&&&"); 
	}
}
