package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_1 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		 * program yazýn (BMI)
		 * 
		 * IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		 * 
		 * BMI 18,5'in altýndaysa zayýfsýnýz
		 * 
		 * BMI 18,5 ile 25 arasýnda ise kilonuz idealdir
		 * 
		 * BMI 25-30 arasýndaysa þiþmansýnýz
		 * 
		 * BMI 30'dan büyük veya eþitse, obez
		 * 
		 * Input:
		 * 
		 * Output:
		 * 
		 * Agirlik : 71
		 * 
		 * Boy : 1,72
		 * 
		 * BMI : 23.99945916711736
		 * 
		 * Zayifsiniz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Please input height (cm) : ");

		double height = scan.nextDouble(); // boy cm olarak istenmiþ.

		double heightMt = height / 100; // boyu metreye çevirdim.

		System.out.print("Please input Weight (kg) : ");

		double weight = scan.nextDouble();

		double bmi = weight / (heightMt * heightMt);

		System.out.println("Agirlik : " + weight);

		System.out.println("Boy : " + heightMt); // boy mt olarak yazdýrýlacak.

		System.out.println("BMI : " + bmi);

		if (bmi < 18.5) {
			System.out.println("Zayifsiniz.");
		}else if (bmi>=18.5 && bmi<25) {
			System.out.println("kilonuz idealdir");
		}else if (bmi>=25 && bmi<30){
			System.out.println("þiþmansýnýz");
		}else {
			System.out.println("obez");
		}

	}

}
