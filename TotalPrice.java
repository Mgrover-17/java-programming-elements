import java.util.Scanner;

class TotalPrice{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int unitPrice=sc.nextInt();
		int quantity=sc.nextInt();
		System.out.println("The total purchase price is INR "+(unitPrice*quantity)+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}

		