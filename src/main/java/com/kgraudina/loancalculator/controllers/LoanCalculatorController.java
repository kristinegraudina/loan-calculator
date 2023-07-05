package com.kgraudina.loancalculator.controllers;

import com.kgraudina.loancalculator.model.LoanObject;
import com.kgraudina.loancalculator.service.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoanCalculatorController {

    LoanObject loanObject = new LoanObject();

    @Autowired
    private LoanServiceImpl loanServiceImpl;

    @RequestMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("loanObject", loanObject);
        return "home";
    }

    @RequestMapping(value = "/home", params = "calculate", method = RequestMethod.POST)
    public String calculate(@ModelAttribute("loanObject") LoanObject loanObject, Model model) {
        model.addAttribute("results", loanServiceImpl.calculateLoanPayment(loanObject));
        return "home";
    }
}
