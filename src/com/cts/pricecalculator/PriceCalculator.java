package com.cts.pricecalculator;
import com.cts.bo.Apple;
import com.cts.bo.Banana;

public class PriceCalculator {
	

	
public int calculateBasketPrice(Apple apple, Banana banana)
{
	 int totalPrice=0;
	totalPrice=totalPrice+(banana.getQuantity()*banana.getPrice())+(apple.getQuantity()*apple.getPrice());
	
	return totalPrice;
	
}
}
