package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_4_TR {

	public static void main(String[] args) {
		/*
		 * Char de�i�ken yan�t�n�n de�erini test eden ve a�a��daki i�lemleri
		 * ger�ekle�tiren bir switch ifadesi yaz�n:
		 * 
		 * yan�t a ise,
		 * 
		 * "Talebiniz i�leniyor" mesaj� yazd�r�l�r
		 * 
		 * yan�t b ise,
		 * 
		 * "yine de ilgilendi�iniz i�in te�ekk�r ederiz" mesaj� yazd�r�l�r yan�t c ise,
		 * 
		 * "�zg�n�z, �u anda herhangi bir yard�m yok" mesaj� yazd�r�l�r
		 * 
		 * ba�ka herhangi bir yan�t de�eri i�in,
		 * 
		 * "Ge�ersiz giri�, l�tfen tekrar deneyin!" yazd�r�l�r
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose 1 character\na\nb\nc\n");
		char ch = scan.nextLine().charAt(0);

		switch (ch) {
		case 'a':
			System.out.println("Talebiniz i�leniyor");

			break;
		case 'b':
			System.out.println("yine de ilgilendi�iniz i�in te�ekk�r ederiz");
			break;
		case 'c':
			System.out.println("�zg�n�z, �u anda herhangi bir yard�m yok");
			break;

		default:
			System.out.println("Ge�ersiz giri�, l�tfen tekrar deneyin!");
			break;
		}

	}

}
