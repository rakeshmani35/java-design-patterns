package com.state.java9.com;

public class SecondYearKid implements KidState {

	@Override
	public void play() {
		System.out.println("Play with toys");
	}

	@Override
	public void eat() {
		System.out.println("Eat potato and Drink Milk");
	}

}
