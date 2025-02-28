class DiscountedPrice{
	public static void main(String[] args){
		int fee=125000;
		int discountPercent=10;
		int discountedAmount=(discountPercent*fee)/100;
		int discountedPrice=fee-discountedAmount;
		System.out.println("The discount amount is INR "+discountedAmount+" and final discounted fee is INR "+discountedPrice);
	}
}
