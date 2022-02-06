package com.strategy;

//https://refactoring.guru/design-patterns/strategy/java/example#:~:text=Strategy%20is%20a%20behavioral%20design,delegates%20it%20executing%20the%20behavior.
/**
 * Dummy credit card class.
 */
public class CreditCard {

	private int amount;
	private String number;
	private String date;
	private String cvv;

	CreditCard(String number, String date, String cvv) {
		this.amount = 100_000;
		this.number = number;
		this.date = date;
		this.cvv = cvv;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
}
