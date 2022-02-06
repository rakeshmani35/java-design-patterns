package com.structral.state.toturialpoint;

/**
 * https://www.youtube.com/watch?v=mYNf5kgfrWc
 * 
 * @author rakes
 *
 */

public class StateDPDemo {

	public static void main(String[] args) {

		Context context = new Context();

		StartState start = new StartState();
		start.doAction(context);
		System.out.println(context.getState().toString());

		StopState stop = new StopState();
		stop.doAction(context);
		System.out.println(context.getState().toString());
	}

}
