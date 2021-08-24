package kutuphane;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M01 {

	public List<C01> tumListe = new ArrayList<>();
	public List<C01> oduncListe = new ArrayList<>();

	public List<C01> ekleme() {
		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen kitapadini giriniz");
		String kitapAdi = scan.nextLine();

		System.out.println("L�tfen kitapnumarasini giriniz");
		String kitapNo = scan.nextLine();

		System.out.println("L�tfen konumu giriniz");
		String konum = scan.nextLine();

		C01 ekle = new C01(kitapAdi, kitapNo, konum, LocalDateTime.now());
		tumListe.add(ekle);

		return tumListe;
	}

	public void listeleme(List<C01> tumListe) {
		for (C01 each : tumListe) {
			System.out.println("Kitap ad� : " + each.kitapAdi + " Kitap no : " + each.kitapNo + " Konumu : " + each.konum
					+ " Kay�t zaman� : " + each.girisSaati);
		}

	}

	public List<C01> oduncVerme() {
		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen kitap numarasini giriniz");
		String kitapNo = scan.nextLine();

		System.out.println("L�tfen �d�n� alan ki�i ismini giriniz");
		String isim = scan.nextLine();

		C01 OduncVer = new C01(kitapNo, isim, LocalDateTime.now());

		oduncListe.add(OduncVer);

		return oduncListe;
	}

	public void oduncListeleme(List<C01> oduncListe) {
		for (int i = 0; i < oduncListe.size(); i++) {
			System.out.println((i+1)+" "+oduncListe.get(i).kitapNo +" "+oduncListe.get(i).isim + " "+oduncListe.get(i).c�k�sSaati );
			
		}	
		
		
	}
				
	

	public List<C01> oduncTeslim() {
		Scanner scan = new Scanner(System.in);
		oduncListeleme(oduncListe);
		System.out.println("yukar�daki listeden silmek istedi�iniz eleman�n numaras�n� giriniz");
		String siraNo1 = scan.nextLine();
		int yeniSira= Integer.parseInt(siraNo1);
		
		oduncListe.remove(yeniSira-1);

		return oduncListe;
	}

}
