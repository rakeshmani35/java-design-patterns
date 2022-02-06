package com.asynchronous.callback;

public class B {

	private OnGeekEventListener mListener; // listener field 
	  
    // setting the listener 
    public void registerOnGeekEventListener(OnGeekEventListener mListener) 
    { 
        this.mListener = mListener; 
    } 
  
    // My Asynchronous task 
    public void doGeekStuff() 
    { 
    	
    	// An Async task always executes in new thread 
    	new Thread(new Runnable() {
			
			@Override
			public void run() {
				// perform any operation 
                System.out.println("Performing operation in Asynchronous Task"); 
                
                // check if listener is registered. 
                if (mListener != null) { 
  
                    // invoke the callback method of class A 
                    mListener.onGeekEvent(); 
                } 
				
			}
		}).start();
    	 System.out.println("Asynchronous Task not blocked code %%%%%%%%%%%"); 
    } 
}
