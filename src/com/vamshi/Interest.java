/*
 * @author KUSA VAMSHI
 * 
 */

/*
 * This program is to find simple interest and compound interest
 * 
 */
package com.vamshi;
public class Interest {
	double principal_amount,no_of_years,rate_of_interest,simpleinterest,compoundinterest;	
	Interest(double principal_amount, double no_of_years, double rate_of_interest)
    {	           
	    this.principal_amount = principal_amount;
	    this.no_of_years = no_of_years;
	    this.rate_of_interest = rate_of_interest;
	}
	double simpleInterest()
    {		           
		simpleinterest=(principal_amount*no_of_years*rate_of_interest)/100;
	    return (simpleinterest);
	}
	double compoundInterest()
	{
		compoundinterest=principal_amount*Math.pow(1.0+rate_of_interest/100.0,no_of_years)-principal_amount;
		return compoundinterest;
	}
}
