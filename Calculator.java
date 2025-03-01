import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		float number1=sc.nextFloat();
		float number2=sc.nextFloat();
		float add=number1+number2;
		float subtract=number1-number2;
		float multiply=number1*number2;
		float division=number1/number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+add+" , "+subtract+" , "+multiply+" , "+" and "+division);
	}
}