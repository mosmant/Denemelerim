package denemelerim;

import java.util.Scanner;

public class ReplitLoops_01 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim ve bir karakter girmesini isteyin, ard�ndan d�ng�leri
		 * kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =�John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */

		Scanner scan = new Scanner(System.in);

		String name, ch1;

		int count = 0;

		System.out.println("Bir c�mle giriniz: ");

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
