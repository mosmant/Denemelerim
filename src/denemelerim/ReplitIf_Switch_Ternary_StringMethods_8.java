package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_8 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim girmesini isteyin ve son 2 harfinin 3 kopyas�ndan
		 * olu�an yeni bir String yazd�r�n
		 * 
		 * Kullanicidan alinan isim uzunlu�u en az 2 olacakt�r.
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