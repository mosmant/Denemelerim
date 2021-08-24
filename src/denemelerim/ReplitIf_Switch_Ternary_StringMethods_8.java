package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_8 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasýndan
		 * oluþan yeni bir String yazdýrýn
		 * 
		 * Kullanicidan alinan isim uzunluðu en az 2 olacaktýr.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */
		
		Scanner scan = new Scanner (System.in);
		
		String name = scan.nextLine();
		
		if (name.length()>=3) {
            System.out.println(name.substring(name.length()-2)+name.substring(name.length()-2)+name.substring(name.length()-2));
        } else {
        	System.out.println("girilen kelime : "+name);
		}

}
}