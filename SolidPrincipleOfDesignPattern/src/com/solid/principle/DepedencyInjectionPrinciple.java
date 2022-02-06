package com.solid.principle;

import java.util.Optional;

interface Keyboard {
}

class StandardKeyboard implements Keyboard {

}

class Monitor {

}

// non-DIP
class Windows98Machine {

	private final StandardKeyboard keyboard;
	private final Monitor monitor;

	public Windows98Machine() {

		monitor = new Monitor();
		keyboard = new StandardKeyboard();

	}

}

// DIP
class Windows98MachineDI {

	private final Keyboard keyboard;
	private final Monitor monitor;

	public Windows98MachineDI(Keyboard keyboard, Monitor monitor) {
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
}

public class DepedencyInjectionPrinciple {

	public static void main(String[] args) {

		Optional op;
	}

}
