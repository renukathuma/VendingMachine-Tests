package com.vm;

import com.vm.VendingMachine;
import junit.framework.TestCase;

/**
 * 4)
 * 
 * As a user of the vending machine I need to be able to collect my remaining
 * balance at any point. Done when pressing the "Coin Return" button returns the
 * minimal number of coins to the user, equal to the user balance, from an infinite
 * supply of quarters, dimes and nickels.
 */
public class test_balance_collection_scenarios extends TestCase {
	public void test_simple() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.returnChange();
		assertEquals("[Quarters=0, Dimes=0, Nickels=0, Pennies=0]",vm.getChangeReturnString());
	}
	
	public void test_simple_2() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.insertMoney("0.25");
		vm.returnChange();
		assertEquals("[Quarters=1, Dimes=0, Nickels=0, Pennies=0]",vm.getChangeReturnString());
	}
	public void test_simple_3() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.insertMoney("0.04");
		vm.returnChange();
		assertEquals("[Quarters=0, Dimes=0, Nickels=0, Pennies=4]",vm.getChangeReturnString());
	}
}
