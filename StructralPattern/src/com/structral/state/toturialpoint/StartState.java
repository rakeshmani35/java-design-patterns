package com.structral.state.toturialpoint;

public class StartState implements State{

	@Override
	public void doAction(Context context) {

		System.out.println("Player in start state....");
		context.setState(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Start State";
	}

}
