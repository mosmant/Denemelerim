package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_5_TR {

	public static void main(String[] args) {
		/*
		 * Bir aydaki gün sayýsýný hesaplayan bir Java programý yazýnýz.
		 * 
		 * INPUT:
		 * 
		 * Ay Numarasi:
		 * 
		 * 2
		 * 
		 * Yil :
		 * 
		 * 2016
		 * 
		 * OUTPUT :
		 * 
		 * Subat 2016 29 Gundur.
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int month = scan.nextInt();

		int year = scan.nextInt();

		switch (month) {
		case 1:System.out.println("Ocak "+year+" 31 Gundur");

			break;
		case 2:
			if (year%4==0) {
				System.out.println("Subat "+year+" 29 Gundur");
			}else
				System.out.println("Subat "+year+" 28 Gundur");
			break;
		case 3:System.out.println("Mart "+year+" 31 Gundur");

			break;
		case 4:System.out.println("Nisan "+year+" 30 Gundur");

			break;
		case 5:System.out.println("Mayýs "+year+" 31 Gundur");

			break;
		case 6:System.out.println("Haziran "+year+" 30 Gundur");

			break;
		case 7:System.out.println("Temmuz "+year+" 31 Gundur");

			break;
		case 8:System.out.println("Agustos "+year+" 31 Gundur");

			break;
		case 9:System.out.println("Eylul "+year+" 30 Gundur");

			break;
		case 10:System.out.println("Ekim "+year+" 31 Gundur");

			break;
		case 11:System.out.println("Kasým "+year+" 30 Gundur");

			break;
		case 12:System.out.println("Aralýk "+year+" 31 Gundur");

			break;

		default:
			break;
		}

	}

}
