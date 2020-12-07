package com.vm;

import com.vm.VendingMachine;
import junit.framework.TestCase;

import java.math.BigDecimal;

/**
 * 	1)
 * As an employee of a soda company I would like to be able to stock it with
 * product. Done when I can stock the machine with product.
 **/
public class test_product_stocking_reset_scenarios extends TestCase
{
	public void test_validate_product_stocking() throws Exception {
		VendingMachine vm = new VendingMachine();

		assertEquals(0,vm.getProduct("Coke").getCansInTube());
		vm.stock("Coke",10);
		assertEquals(10,vm.getProduct("Coke").getCansInTube());

		assertEquals(0,vm.getProduct("Pepsi").getCansInTube());
		vm.stock("Pepsi",10);
		assertEquals(10,vm.getProduct("Pepsi").getCansInTube());
		
		assertEquals(0,vm.getProduct("Soda").getCansInTube());
		vm.stock("Soda",10);
		assertEquals(10,vm.getProduct("Soda").getCansInTube());

	}

	public void test_validate_product_stock_reset() throws Exception {
		VendingMachine vm = new VendingMachine();

		assertEquals(0,vm.getProduct("Coke").getCansInTube());
		vm.stock("Coke",10);
		assertEquals(10,vm.getProduct("Coke").getCansInTube());

		vm.reset();
		assertEquals("INSERT COINS",vm.getMessage());
		assertEquals(BigDecimal.ZERO,vm.getBalance());
		assertEquals("[Quarters=0, Dimes=0, Nickels=0, Pennies=0]",vm.getChangeReturnString());

	}
	
	public void test_validate_post_stocking_message() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.stock("Coke",1);
		assertEquals("1 Coke loaded.\n9 spots left.",vm.getMessage());
	}

	public void test_validate_stock_full_1() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.stock("Coke",10);
		assertEquals("The Coke tube is full.\n10 cans available.",vm.getMessage());
	}

	public void test_validate_stock_full_2() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.stock("Coke",100);
		assertEquals("The Coke tube is full.\n10 cans available.",vm.getMessage());
	}

	public void test_validate_stock_full_3() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		vm.stock("Coke",1);
		assertEquals("The Coke tube is full.\n10 cans available.",vm.getMessage());
	}
	
}
