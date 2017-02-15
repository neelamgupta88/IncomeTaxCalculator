package com.barclays.income.tax.calculator;

import com.barclays.income.profile.IncomeProfile;

public interface BaseIncomeTaxCalculator {
	
	double calculateTax(IncomeProfile profile);

}
