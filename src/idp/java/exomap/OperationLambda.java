package idp.java.exomap;

public class OperationLambda {
	public static void main(String[] args) {
		Operation ad = (a, b) -> a + b;
		System.out.println(ad.operation(2, 5));
		
		Operation mult = (a, b) -> a * b;
		System.out.println(mult.operation(2, 5));
	}
	
	interface Operation
	{
		int operation(int a, int b);
	}

}
