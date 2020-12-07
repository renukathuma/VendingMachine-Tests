package com.vm;

import java.math.BigDecimal;

/**
 * Takes a doller amount and breaks it into coins.
 */
public class Change 
{
	Change(BigDecimal amount)
	{
		calculate(amount.multiply(new BigDecimal(100)).intValue());
	}
	void calculate(int amount)
	{
		int currentAmount = amount;
		while(currentAmount>=25)
		{
			quarters++;
			currentAmount-=25;
		}
		while(currentAmount>=10)
		{
			dimes++;
			currentAmount-=10;
		}
		while(currentAmount>=5)
		{
			nickles++;
			currentAmount-=5;
		}
		while(currentAmount>=1)
		{
			pennies++;
			currentAmount-=1;
		}
	}
	int quarters = 0;
	int dimes = 0;
	int nickles = 0;
	int pennies = 0;
	public String toString()
	{
		return String.format("[Quarters=%d, Dimes=%d, Nickels=%d, Pennies=%d]", quarters,dimes,nickles,pennies);
	}
	public int getQuarters() {
		return quarters;
	}
	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}
	public int getDimes() {
		return dimes;
	}
	public void setDimes(int dimes) {
		this.dimes = dimes;
	}
	public int getNickles() {
		return nickles;
	}
	public void setNickles(int nickles) {
		this.nickles = nickles;
	}
	public int getPennies() {
		return pennies;
	}
	public void setPennies(int nickles) {
		this.pennies = pennies;
	}
}
