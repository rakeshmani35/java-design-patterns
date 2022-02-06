package com.strategy;

//https://refactoring.guru/design-patterns/strategy/java/example#:~:text=Strategy%20is%20a%20behavioral%20design,delegates%20it%20executing%20the%20behavior.
public interface PayStrategy {

	boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
