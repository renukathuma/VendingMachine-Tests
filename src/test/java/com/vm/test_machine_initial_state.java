package com.vm;

import com.vm.VendingMachine;
import junit.framework.TestCase;

public class test_machine_initial_state extends TestCase
{
	public void test_validateInitialMachineDisplayMessage() throws Exception {
		VendingMachine vm = new VendingMachine();
		assertEquals("Machine Display Message was incorrect","INSERT COINS",vm.getMessage());
	}
}
