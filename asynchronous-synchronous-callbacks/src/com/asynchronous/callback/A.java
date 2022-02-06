package com.asynchronous.callback;

public class A implements OnGeekEventListener { 
  
    @Override
    public void onGeekEvent() 
    { 
        System.out.println("Performing callback after Asynchronous Task"); 
        // perform some routine operation 
    } 
    // some class A methods 
}
