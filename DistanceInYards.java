import java.util.Scanner;

class DistanceInYards{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double feet=sc.nextDouble();
		double distInYards=feet/3;
		double distInMiles=distInYards/1760;
		System.out.println("distance in yards and miles is "+distInYards+" and "+distInMiles);
	}
}

		