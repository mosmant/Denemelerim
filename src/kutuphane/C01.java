package kutuphane;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {

	public String kitapAdi;
	public String kitapNo;
	public String isim;
	public String konum;

	LocalDateTime c�k�sSaati;
	LocalDateTime girisSaati;

	C01() {
	}
	// bu Constructor ekleme constructor elemanlar�n� i�erir.
	public C01(String kitapAdi, String kitapNo, String konum, LocalDateTime girisSaati) {
		
		this.kitapAdi = kitapAdi;
		this.kitapNo = kitapNo;
		this.konum = konum;
		this.girisSaati = girisSaati;
	}


	// bu Constructor �d�n� verme constructor elemanlar�n� i�erir.

	public C01(String kitapNo, String isim, LocalDateTime c�k�sSaati) {

		this.kitapAdi = kitapAdi;
		this.kitapNo = kitapNo;
		this.isim = isim;

		this.c�k�sSaati = c�k�sSaati;
	}

}
