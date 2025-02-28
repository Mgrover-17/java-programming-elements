class PenDistribution{
	public static void main(String[] args){
		int pens=14;
		int students=3;
		int penPerStudent=pens/students;
		int remainingPens=pens%students;
		System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pens not distributed is "+remainingPens);
	}
}
