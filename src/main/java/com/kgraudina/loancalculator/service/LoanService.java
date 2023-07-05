package com.kgraudina.loancalculator.service;

import com.kgraudina.loancalculator.model.LoanObject;

import java.util.Map;

public interface LoanService {
    Map<String, String> calculateLoanPayment(LoanObject loanObject);
}
