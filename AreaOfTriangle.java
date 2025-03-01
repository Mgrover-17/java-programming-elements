import java.util.Scanner;

class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		double area=0.5*base*height;
		double areaInInches=area/(2.54*2.54);
		System.out.println("Area of traingle in sq cms and sq inches is "+area+" and "+areaInInches);
	}
}

		