package denemelerim;

import java.util.Scanner;

public class ReplitLoops_07 {

	public static void main(String[] args) {
		/*
		 * Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
		 * Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, herhangi
		 * bir sayý Mükemmel Sayý olarak bilinir.
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
