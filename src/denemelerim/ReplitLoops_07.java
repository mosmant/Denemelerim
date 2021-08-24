package denemelerim;

import java.util.Scanner;

public class ReplitLoops_07 {

	public static void main(String[] args) {
		/*
		 * Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
		 * Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi
		 * bir say� M�kemmel Say� olarak bilinir.
		 * Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir.
		 * 
		 * ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input a digit : ");
		int num = scan.nextInt();
		int sum=0;
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				sum+=i;
			}	
			
		}
		
		if (sum==num) {
			System.out.print(num+" Mukemmel Sayidir.");
		}else {
			System.out.print(num+" Mukemmel Sayidir degildir.");
		}
		
	}

}
