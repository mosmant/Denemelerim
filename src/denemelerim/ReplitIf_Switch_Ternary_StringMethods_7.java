package denemelerim;

import java.util.Scanner;

public class ReplitIf_Switch_Ternary_StringMethods_7 {

	public static void main(String[] args) {
		// isim1 �ift say�da karakter i�eriyorsa,

		// ikinci kelimeyi ilk ad�n ortas�na yerle�tirin

		// ilk kelime tek sayida karakter iceriyorsa

		// �isim1, isim2 ye eklenemiyor� yazd�r�n

		// �rne�in:
		// isim1= mehmet
		// isim2= ahmet
		// Yazd�r ==> mehahmetmet

		// isim1= memet
		// isim2= ahmet
		// Yazd�r ==> isim1, isim2 ye eklenemiyor
		
		Scanner scan = new Scanner(System.in);
		
		String isim1 = scan.nextLine();
		String isim2 = scan.nextLine();
		
		if (isim1.length()%2==0) {
			System.out.println(isim1.substring(0, isim1.length()/2)+isim2+isim1.substring(isim1.length()/2));
			
		}else {
			System.out.println("isim1, isim2 ye eklenemiyor");
		}

	}

}
