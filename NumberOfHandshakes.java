import java.util.Scanner;

class NumberOfHandshakes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int numberOfStudents=sc.nextInt();
		System.out.println("Maximum number of handshakes among "+numberOfStudents+" students is "+(numberOfStudents*(numberOfStudents-1))/2);
	}
}
