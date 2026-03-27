package com.nit.pack2;

public class BankAccount {

	private String name;
	private double pAmt;
	private double timeInMonth;
	private double interestRate;
	private double finalAmt;

	public BankAccount(String name, double pAmt, double timeInMonth, double interestRate) {
		super();
		this.name = name;
		this.pAmt = pAmt;
		this.timeInMonth = timeInMonth;
		this.interestRate = interestRate;
	}

	public double calculateInterestRate() {
		double interest = (pAmt * interestRate) / 100;
		return interest;
	}

	public double cal() {
		double interest = 0;

		if (timeInMonth <= 1)
			interest = calculateInterestRate() * 0.20;
		else if (timeInMonth > 1 && timeInMonth <= 1.5)
			interest = calculateInterestRate() * 0.22;
		else
			interest = calculateInterestRate() * 0.25;
		return interest;
	}

	public double getFinalAmount() {
		finalAmt = pAmt + calculateInterestRate();
		return finalAmt;
	}

	@Override
	public String toString() {

		if (timeInMonth <= 0) {
			return "BankAccount [name=" + name + ", pAmt=" + pAmt + ", timeInMonth=" + timeInMonth + ", interestRate="
					+ this.interestRate + ", finalAmt=" + this.finalAmt + "]";
		} else {
			return "BankAccount [name=" + name + ", pAmt=" + pAmt + ", timeInMonth=" + timeInMonth + ", interestRate="
					+ this.calculateInterestRate() + ", finalAmt=" + this.getFinalAmount() + ", Interest=" + cal() + "]";
		}
	}

}



