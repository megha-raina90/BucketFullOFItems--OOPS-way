package com.cts.bucket;
import java.util.Scanner;

import com.cts.bucket.Apple;

public class executor {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter apple  auantity ");
		System.out.println(" enter bananaQuantity");
		int bananaQuantity = s.nextInt();
		int appleQuantity = s.nextInt();
		
		Apple a = new Apple();
		a.setQuantity(appleQuantity);
		Banana b = new Banana();
		b.setQuantity(bananaQuantity);
		BucketOftems g = new BucketOftems();
		g.calculateBucketPrice(a, b);
		System.out.println(g.calculateBucketPrice(a, b));

	}
}
