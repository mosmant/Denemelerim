package denemelerim;

import java.util.Scanner;

public class deneme_06_KelimeOyunu {
	static Scanner scan = new Scanner (System.in);
	static int oyuncu =1 ;
	static String kelime;
	static String ekleme;
	static int puan1=0;
	static int puan2=0;
	
	public static void main(String[] args) {
		/*
		 * Iki kisinin oynayacagi bir kelime oyunu uretelim Kurallar 
		 * 1.Adým- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
		 *
		 * 2.Adým- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini
		 * sorun. * 2. oyuncu Eger kelimeyi kabul ederse 1.oyuncuya kelimedeki harf
		 * sayisi kadar puan ekleyin ve 3.adima gecin * girilen kelimeyi kabul etmezse
		 * "gecersiz kelime" yazdirin ve hangi oyuncunun kazandigini yazip oyunu
		 * bitirin.
		 *
		 * 3.Adým- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun * devam
		 * etmek isterse kelimeye eklemek istedigi string'i ve basa mi sona mi
		 * ekleyecegini sorun aldiginiz string'i kelimeye ekleyip 2.adima gidin
		 *
		 * * Devam etmek istemezse "Oyun bitti" yazin kullanicilarin puanlarini ve
		 * kazanan oyuncuyu yazdirin
		 */
	
		System.out.println(oyuncu +".Oyuncu Lütfen Kelimenizi giriniz:");
		kelime= scan.next();
		System.out.println(oyuncu+".oyuncunun girdiði kelime : "+kelime);
		oyuncuDegistir();
		onayAl();
		
	}

	public static void onayAl() {
		System.out.println(oyuncu+". oyuncu kelimeyi kabul ediyor musunuz.");
		System.out.println("EVET ÝSE <E>\nHAYIR ÝSE <H>");
		char kabul =scan.next().toUpperCase().charAt(0);
		if (kabul == 'E') {
			if (oyuncu ==1) {
				puan2+=kelime.length();
			}else {
				puan1+=kelime.length();
			}
		oyunaDevamEdecekMi();
		}else {
			System.err.println("GEÇERSÝZ KELÝME GÝRDÝNÝZ...");
		}
		oyunuBitir();
		
		
	}

	public static void oyunuBitir() {
		System.out.println("*** OYUN BÝTTÝ ***");
		System.out.println("1. OYUNCU PUANI : "+ puan1);
		System.out.println("2. OYUNCU PUANI : "+ puan2);
		if (puan1>puan2) {
			System.out.println("KAZANAN 1. OYUNCU");
		}else if(puan1<puan2) {
			System.out.println("KAZANAN 2. OYUNCU");
		}else {
			System.out.println("OYUN BERABERE BÝTTÝ");
		}
	}

	public static void oyunaDevamEdecekMi() {
		System.out.println("OYUNA DEVAM EDECEK MÝSÝNÝZ...");
		System.out.println("EVET ÝSE <E>\\nHAYIR ÝSE <H> ");
		char devam=scan.next().toUpperCase().charAt(0);
		if (devam=='E') {
			kelimeEkle();
		}else {
			oyunuBitir();
		}
			
	}

	public static void kelimeEkle() {
		System.out.println("LÜTFEN KELÝME EKLEYÝNÝZ...");		
		ekleme=scan.next();
		System.out.println("KELÝMEYÝ BAÞA EKLEMEK ÝÇÝN <B>SONA ÝSE <S> ");
		char basSon=scan.next().toUpperCase().charAt(0);
		if (basSon == 'B') {
			kelime=ekleme+kelime;
		}else {
			kelime=kelime+ekleme;
		}
		oyuncuDegistir();
		onayAl();
	}

	public static void oyuncuDegistir() {
		if (oyuncu==1) {
			oyuncu =2;
		}else {
			oyuncu =1;
		}
		
	}

}
