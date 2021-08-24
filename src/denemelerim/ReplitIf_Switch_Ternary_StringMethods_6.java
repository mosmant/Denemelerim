package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_6 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim yazmas�n� isteyin, ad�n uzunlu�u 3 olmal�d�r. Ard�ndan,
		 * ad�n ayn� karakterlere sahip olup olmad���n� kontrol edin.
		 * 
		 * Eger ayn� karakterlere sahipse
		 * 
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * 
		 * Eger ayni kaakterlere sahip degilse
		 * 
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * 
		 * Ternary kullanin.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("l�tfen bir isim giriniz: ");
		String name = scan.nextLine();
		
		char ch1 = name.charAt(0);
		char ch2 = name.charAt(1);
		char ch3 = name.charAt(2);
		
		String result =  name.length()==3 ? ((ch1!=ch2 && ch1!=ch3 && ch2!=ch3)?"Dizenin benzersiz karakterleri var":"isim ayni karakterlere sahiptir."):"ad�n uzunlu�u 3 olmal�d�r";
		System.out.println(result);
		

	}

}
