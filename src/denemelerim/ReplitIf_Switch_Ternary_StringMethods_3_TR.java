package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_3_TR {

	public static void main(String[] args) {
		/*
		Verilen iki say�n�n (s�f�rdan b�y�k veya s�f�ra e�it) toplam�n� hesaplayan ve yazd�ran bir Java program� yaz�n.
		
		Verilen tamsay�lar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazd�r�n.

		Ornek:

		INPUT      :  

		25

		46

		OUTPUT :

		Numaralarin Toplami:

		71       
		*/
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please input 2 integer :");
		
		long num1 = scan.nextLong();
		
		long num2 = scan.nextLong();
		
		
		if (num1>999999999 || num2>999999999 || num1+num2>999999999) {
			
			System.out.println("OverFlow");
			
		}else {
			System.out.println("Numaralarin Toplami:");
			System.out.println(num1+num2);
		
		}
		
	}

}
