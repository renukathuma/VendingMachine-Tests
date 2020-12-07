package com.vm;

import com.vm.VendingMachine;
import junit.framework.TestCase;

/**
 * 2)
 * 
 * As a user of the vending machine I need a way to insert money. Done when the
 * machine will update balance correctly with value of money inserted.
 */
public class test_money_insertion_refund_scenarios extends TestCase {

	public void test_validate_refund_cancel() throws Exception {
		VendingMachine vm = new VendingMachine();
		assertEquals("0.00",vm.getBalanceString());
		vm.insertMoney("0.25");
		vm.cancelAndRefund();
		assertEquals("0.00",vm.getBalanceString());
	}

	public void test_validate_balance_after_insertion() throws Exception {
		VendingMachine vm = new VendingMachine();
		assertEquals("0.00",vm.getBalanceString());
		vm.insertMoney("0.25");
		assertEquals("0.25",vm.getBalanceString());
	}
	
	public void test_validate_message_after_insertion() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.insertMoney("0.50");
		assertEquals("$0.50",vm.getMessage());
		
	}
}
