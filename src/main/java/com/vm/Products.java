package com.vm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Products 
{
	ArrayList<Product> products;
	
	public Products() throws Exception {
		String[] productNames = {"Coke","Pepsi","Soda"};
		products = new ArrayList<Product>();
		BigDecimal coke_price = BigDecimal.valueOf(25.00);
		BigDecimal pepsi_price = BigDecimal.valueOf(25.00);
		BigDecimal soda_price = BigDecimal.valueOf(25.00);



		for(String productName:productNames)
		{
			products.add(
					new Product(
							productName,
							getProductPrice(productName)
							,10 
							,0
							,0
							)
					);
		}
	}

	public BigDecimal getProductPrice(String productName) throws Exception {
		BigDecimal price;
		if(productName.equals("Coke")){
			price = BigDecimal.valueOf(25.00);
		}else if (productName.equals("Pepsi")){
			price = BigDecimal.valueOf(35.00);
		}else if(productName.equals("Soda")){
			price = BigDecimal.valueOf(45.00);
		}else{
			throw  new Exception("Invalid Product");
		}
		return price;
	}
	
	public ArrayList<Product> toList() {
		return products;
	}

	public int size()
	{
		return products.size();
	}
	
	public Product get(String name)
	{
		for(Product product:products)
		{
			if(product.getName().equals(name))
			{
				return product;
			}
		}
		return null;
	}
	
	public Product get(int index)
	{
		return products.get(index);
	}
	
	
}
