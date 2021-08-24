package denemelerim;

import java.util.Scanner;

public class ReplitLoops_09 {

	public static void main(String[] args) {
		// Kullan�c�n�n girdi�i say�y� tersine �eviren bir java program� yaz�n�z.
		// (Mulakat Sorusu)

		// Input  :1238

		// Output :Girilen Numananin Tersi: 8321
		
		Scanner scan = new Scanner (System.in);
		System.out.println("please input a digit : ");
		int num = scan.nextInt();
		
		int reverseNumber= reverseMethod(num);		
		System.out.println("Girilen Numananin Tersi: "+reverseNumber);
		scan.close();
		}

	private static int reverseMethod(int num) {
		int temp;
		int result=0;
		while (num>0) {
			temp=num%10;
			num/=10;
			result=result*10+temp;
		}
		return result;
	}

		

	}


