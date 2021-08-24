package denemelerim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IsimlerEkleme {
	static Scanner scan= new Scanner(System.in);
	static List<String> isimler = new ArrayList<>();
	
	
	public static void main(String[] args) {
		isimler.add("ahmet");
		isimler.add("ali");
		menu();

	}

	private static void menu() {
		boolean cikilsinMi=false;
		while (!cikilsinMi) {		
		
			
		
		System.out.println("l�tfen se�eneklerden birini se�iniz"+"\n1-ekleme\n2-silme\n3-g�ncelleme\n4-listeme\n5-s�ral� listeleme\n6-��k��");
		String islem=scan.nextLine();
		
		switch (islem) {
		case "1":ekle();
			break;
		case "2":sil();
			break;
		case "3":guncelle();
			break;
		case "4":listele();
			break;
		case "5":siraliListele();
			break;
		case "6":
			System.out.println("��k�� yap�l�yor");
			cikilsinMi=true;
			break;
			

		default:
			System.out.println("uygun bir se�enek se�mediniz!");
			break;
		}
		}
		
	}

	private static void siraliListele() {
		Collections.sort(isimler);
		listele();
		
		
	}

	private static void listele() {
		for (int i = 0; i < isimler.size(); i++) {
			System.out.println((i+1)+"- "+ isimler.get(i));
		}
		
		
		// System.out.println(isimler); bu �ekilde yaparsak aarray �eklinde yazd�r�r.
		
	}

	private static void guncelle() {
		listele();
		System.out.println("yukar�daki listeden g�ncellemek istedi�iniz eleman�n numaras�n� giriniz");
		String siraNo1 = scan.nextLine();
		int yeniSira= Integer.parseInt(siraNo1);
		System.out.println("girmek istedi�iniz ismi yaz�n�z : ");
		String yeniIsim=scan.nextLine();
		isimler.set(yeniSira-1, yeniIsim);		
		
	}

	private static void sil() {
		listele();
		System.out.println("yukar�daki listeden silmek istedi�iniz eleman�n numaras�n� giriniz");
		//int s�raNo = scan.nextInt();
		//scan.nextLine(); // scan.nextInt(); sorunu var burada....
		String siraNo1 = scan.nextLine();
		int yeniSira= Integer.parseInt(siraNo1);
		
		isimler.remove(yeniSira-1);
		
	}

	private static void ekle() {
		System.out.println("girmek istedi�iniz ismi yaz�n�z !");
		String isim = scan.nextLine();
		isimler.add(isim);
	}

}
