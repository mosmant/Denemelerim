package denemelerim;

import java.util.Scanner;

public class Deneme_03 {

	public static void main(String[] args) {
		// Interview Question Kullanicidan 50�den kucuk bir sayi isteyin ve girilen
		// sayinin faktoryel�ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan =new Scanner (System.in);
		System.out.print("l�tfen 10'dan k���k 1 tam say� giriniz:");
		int num = scan.nextInt();
		int faktoryel=1;
		
		System.out.print(num+ "!=");
		for (int i = num; i>=1; i--) {
			faktoryel= faktoryel*i;
			System.out.print(i);
			if (i!=num+1) {
				System.out.print("*");
			}
		}System.out.println("="+faktoryel);
		

	}

}
