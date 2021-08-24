package denemelerim;

import java.util.Scanner;

public class ReplitLoops_01 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim ve bir karakter girmesini isteyin, ardýndan döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandýðýný kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */

		Scanner scan = new Scanner(System.in);

		String name, ch1;

		int count = 0;

		System.out.println("Bir cümle giriniz: ");

		name = scan.nextLine();

		System.out.println("Bir harf giriniz: ");

		ch1 = scan.next();

		for (int i = 0; i < name.length() ; i++)

		{

			if (name.substring(i, i + 1).equals(ch1))

				count++;

		}

		System.out.println("Number of a = " + count);

	}

}
