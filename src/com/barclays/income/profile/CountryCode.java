package com.barclays.income.profile;

import com.barclays.income.savings.ExemptionsForIndia;
import com.barclays.income.savings.ExemptionsForUSA;
import com.barclays.income.savings.SavingScheme;
import com.barclays.income.tax.calculator.BaseIncomeTaxCalculator;
import com.barclays.income.tax.calculator.IncomeTaxCalculatorForIndia;
import com.barclays.income.tax.calculator.IncomeTaxCalculatorForUSA;

public enum CountryCode {
	INDIA {
		@Override
		public BaseIncomeTaxCalculator getCalculator() {
			return new IncomeTaxCalculatorForIndia();
		}

		@Override
		public SavingScheme getSavingScheme() {
			return new ExemptionsForIndia();
		}
	},
	USA {
		@Override
		public BaseIncomeTaxCalculator getCalculator() {
			return new IncomeTaxCalculatorForUSA();
		}

		@Override
		public SavingScheme getSavingScheme() {
			return new ExemptionsForUSA();
		}
	};
    public abstract BaseIncomeTaxCalculator getCalculator();
    
    public abstract SavingScheme getSavingScheme();
    
}
