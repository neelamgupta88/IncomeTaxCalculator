package com.barclays.income.tax.tester;

import com.barclays.income.profile.CountryCode;
import com.barclays.income.profile.IncomeProfile;

public class BasicIncomeTaxCalculatorTester {

	public static void main(String[] args) {
		testToCalculateTaxForIndia();
		
		testToCalculateTaxForUSA();

	}
	
	public static void testToCalculateTaxForIndia(){
		IncomeProfile profile1 = new IncomeProfile(1500000, CountryCode.INDIA);
		double tax = profile1.getCountry().getCalculator().calculateTax(profile1);
		System.out.println(tax);
	}
	
	public static void testToCalculateTaxForUSA(){
		IncomeProfile profile1 = new IncomeProfile(1500000, CountryCode.USA);
		double tax = profile1.getCountry().getCalculator().calculateTax(profile1);
		System.out.println(tax);
	}

}
