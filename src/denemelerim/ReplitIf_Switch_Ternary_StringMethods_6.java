package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_6 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim yazmasýný isteyin, adýn uzunluðu 3 olmalýdýr. Ardýndan,
		 * adýn ayný karakterlere sahip olup olmadýðýný kontrol edin.
		 * 
		 * Eger ayný karakterlere sahipse
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
		
		System.out.println("lütfen bir isim giriniz: ");
		String name = scan.nextLine();
		
		char ch1 = name.charAt(0);
		char ch2 = name.charAt(1);
		char ch3 = name.charAt(2);
		
		String result =  name.length()==3 ? ((ch1!=ch2 && ch1!=ch3 && ch2!=ch3)?"Dizenin benzersiz karakterleri var":"isim ayni karakterlere sahiptir."):"adýn uzunluðu 3 olmalýdýr";
		System.out.println(result);
		

	}

}
