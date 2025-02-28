import java.util.Scanner;

class DiscountedFee{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter fee: ");
		int fee=sc.nextInt();
		System.out.print("Enter discount percent: ");
		int discountPercent=sc.nextInt();
		int discountedAmount=(discountPercent*fee)/100;
		int discountedPrice=fee-discountedAmount;
		System.out.println("The discount amount is INR "+discountedAmount+" and final discounted fee is INR "+discountedPrice);
	}
}
