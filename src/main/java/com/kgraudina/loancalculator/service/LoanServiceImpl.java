package com.kgraudina.loancalculator.service;

import com.kgraudina.loancalculator.model.LoanObject;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoanServiceImpl implements LoanService {
    private static final int MONTHS_IN_A_YEAR = 12;

    @Override
    public Map<String, String> calculateLoanPayment(LoanObject loanObject) {
        float monthlyInterestRate = (loanObject.getInterestRate() / 100) / MONTHS_IN_A_YEAR;
        int numberOfPayments = loanObject.getLoanTime() * MONTHS_IN_A_YEAR;

        double monthlyPayment = loanObject.getLoanAmount() * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) / ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1));

        final Map<String, String> results = new HashMap<>();
        results.put("monthlyPayment", NumberFormat.getCurrencyInstance().format(monthlyPayment));
        results.put("totalPayment", NumberFormat.getCurrencyInstance().format(monthlyPayment * numberOfPayments));
        return results;
    }
}
