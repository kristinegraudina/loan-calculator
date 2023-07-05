package com.kgraudina.loancalculator.model;

public class LoanObject {
    private double loanAmount;
    private float interestRate;
    private int loanTime;

    public LoanObject() {
    }

    public LoanObject(Double loanAmount, Float interestRate, Integer loanTime) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTime = loanTime;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(int loanTime) {
        this.loanTime = loanTime;
    }
}
