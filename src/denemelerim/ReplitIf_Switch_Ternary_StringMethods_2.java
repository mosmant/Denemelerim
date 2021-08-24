package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_2 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output :
		 * 
		 * Name : J*** W****
		 * 
		 * CCN : **** **** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("Please input your name: ");
		String name = scan.nextLine();
		System.out.print("Please input your surname: ");
		String surname = scan.nextLine();
		System.out.print("Please input your Credit Card no : ");
		String CCN = scan.nextLine();
		
		String nameOrg= name.toUpperCase().charAt(0)+name.substring(1).replaceAll("\\w", "*");
		String surnameOrg= surname.toUpperCase().charAt(0)+surname.substring(1).replaceAll("\\w", "*");
		String CCNOrg= "**** **** **** " + CCN.substring(12);
		
		System.out.println("Name : "+ nameOrg +" "+surnameOrg );
		System.out.println("CCN : "+CCNOrg );
		
		
		
	}

}
