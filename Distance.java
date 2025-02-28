import java.util.Scanner;

class Distance{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter distance in kms: ");
		double kilometers=sc.nextDouble();
		System.out.println("The total miles is : "+ kilometers*0.621371+" mile for the given "+kilometers+" km");
	}
}


