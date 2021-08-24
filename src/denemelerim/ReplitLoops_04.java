package denemelerim;

import java.util.Scanner;

public class ReplitLoops_04 {

	public static void main(String[] args) {
		// Girdi olarak bir tamsayý kabul eden ve faktöriyel hesaplayan programi yazýniz.

		//Input : 6

		//Output: 6!=65432*1=720
		
		Scanner scan = new Scanner (System.in);
		System.out.print("bir tamsayý giriniz : ");
		int num =scan.nextInt();
		factorial(num);
		
		
		
	}

	private static void factorial(int num) {
		System.out.print(num+"!=");
		int result=1;
		for (int i = num; i > 1; i--) {
			System.out.print(i+"*");
			result*=i;
		}
		System.out.print("1="+result);
	}

}
