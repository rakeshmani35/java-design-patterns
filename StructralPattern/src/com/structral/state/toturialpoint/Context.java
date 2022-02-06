package com.structral.state.toturialpoint;

/**
 * when state is changed to 'start' or 'stop', context will changed
 * 
 * @author rakes
 *
 */
public class Context {

	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;

	}

	public State getState() {
		return state;
	}
}
