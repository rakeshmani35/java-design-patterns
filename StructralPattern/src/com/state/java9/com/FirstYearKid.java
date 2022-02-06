package com.state.java9.com;

public class FirstYearKid implements KidState {

	@Override
	public void play() {
		System.out.println("Play in Cradle");
	}

	@Override
	public void eat() {
		System.out.println("Drink Milk");
	}

}
