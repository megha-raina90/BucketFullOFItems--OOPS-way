package com.cts.bucket;
import com.cts.bucket.Apple;

public class BucketOftems {
	

	
public int calculateBucketPrice(Apple a, Banana b)
{
	 int totalPrice=0;
	totalPrice=totalPrice+(b.getQuantity()*b.getPrice())+(a.getQuantity()*a.getPrice());
	
	return totalPrice;
	
}
}
