package com.state.java9.com;

public class Kid {

	// state of Object Kid represented by field 'age'
	private int age;

	private KidState kidstate;

	public Kid(int age) {
		this.setAge(age);
	}

	// Behavior of kid - play, eat
	public void play() {
		kidstate.play();
	}

	public void eat() {
		kidstate.eat();
	}

	public void setAge(int age) {
		this.age = age;

		if (age == 1) {
			kidstate = new FirstYearKid();
		} else if (age == 2) {
			kidstate = new SecondYearKid();
		} else if (age == 3) {
			kidstate = new ThirdYearKid();
		} else if (age == 4) {
			kidstate = new FourthYearKid();
		} else {
			kidstate = new FirstYearKid();
		}
	}
}
