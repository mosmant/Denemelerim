package denemelerim;

import java.util.Scanner;

public class ReplitLoops_02 {

	public static void main(String[] args) {
		// Kullan�c�dan 2 tamsay� girmesini ve ard�ndan GCD (En B�y�k Ortak B�len) ve
		// LCM'yi (En K���k Ortak Kat) bulmas�n� isteyin.
		/*
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti:
		 * 
		 * 30 ve 40 icin GCD = 10
		 * 
		 * 30 ve 40 icin LCM = 120
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 2 tamsay� giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int GCD = 0;
		int LCM=0;
		for (int i = 1; i < num1 && i < num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				GCD = i;
			}
			LCM = (num1 * num2) / GCD;
		}
		System.out.println("30 ve 40 icin GCD = " + GCD);
		System.out.println("30 ve 40 icin LCM = " + LCM);

	}

}
