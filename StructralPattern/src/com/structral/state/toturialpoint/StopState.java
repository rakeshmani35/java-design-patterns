package com.structral.state.toturialpoint;

public class StopState implements State{

	@Override
	public void doAction(Context context) {

		System.out.println("Player in stop state....");
		context.setState(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stop State";
	}

}
