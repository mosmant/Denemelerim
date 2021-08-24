package denemelerim;

import java.util.Scanner;

public class Deneme_05_reverse {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("LÜTFEN KELÝME GÝRÝNÝZ: ");
		String kelime = scan.nextLine();
		String tersKelime = "";
		
		for (int i = kelime.length(); i > 0; i--) {
			tersKelime+=kelime.substring(i-1, i).toUpperCase();
			
		}System.out.println("kelime : "+ kelime.toUpperCase() + "\ntersten yazýlýþý : "+ tersKelime);
		
		
	}

}
