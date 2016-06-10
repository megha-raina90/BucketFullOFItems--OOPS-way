package com.cts.pricecalculator;
import java.util.Scanner;

import com.cts.bo.Apple;
import com.cts.bo.Banana;

public class Executor {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter apple  auantity ");
		System.out.println(" enter bananaQuantity");
		int bananaQuantity = s.nextInt();
		int appleQuantity = s.nextInt();
		
		Apple apple = new Apple();
		apple.setQuantity(appleQuantity);
		Banana banana = new Banana();
		banana.setQuantity(bananaQuantity);
		PriceCalculator priceCal = new PriceCalculator();
		priceCal.calculateBasketPrice(apple, banana);
		System.out.println(priceCal.calculateBasketPrice(apple, banana));

	}
}
