package denemelerim;

import java.util.Scanner;

public class Deneme_04_Palindrome {

	public static void main(String[] args) {
		// Soru 9 ) Interview Question=Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
		// palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan= new Scanner (System.in);
		System.out.print("lütfen bir kelime giriniz:");
		String kelime = scan.nextLine();
		String tersKelime ="";
		
		
		for (int i = 0; i < kelime.length(); i++) {
			tersKelime+=kelime.substring(kelime.length()-1-i, kelime.length()-i);
		}
		if (kelime.equals(tersKelime)) {
			System.out.println("kelime palindromiktir...");
		}else {
			System.out.println("kelime palindromikt deðildir.");
		}

	}

}
