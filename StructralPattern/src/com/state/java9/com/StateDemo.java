package com.state.java9.com;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kid kid = new Kid(2);
		kid.eat();
		kid.play();
		
		kid.setAge(4);
		kid.eat();
		kid.play();
	}

}
