package test;

public class Pgdc {

	public static void main(String[] args) { 
		int a = 9;
		int b = 6;


		System.out.println(diviseur(a, b));
		System.out.println(diviseurV2(a, b));

	}

	private static int diviseur(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
			return a;
		}
	}

	private static int diviseurV2(int a, int b) {
		int i = 1;
		boolean trouve = false;
		int div = 0;

		if (a < b) {
			while (!trouve) {
				if (i <= b && a % i == 0 && b % i == 0) {
					div = i;
				}
				if(i == b){
					trouve = true;
				}
				i++;

			}

		} else {
			while (!trouve) {
				if (i <= a && a % i == 0 && b % i  == 0) {
					div = i;
				}
				if(i == a){
					trouve = true;
				}
				i++;

			}
		}

		return div;

	}
}
