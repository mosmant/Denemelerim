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

	LocalDateTime cýkýsSaati;
	LocalDateTime girisSaati;

	C01() {
	}
	// bu Constructor ekleme constructor elemanlarýný içerir.
	public C01(String kitapAdi, String kitapNo, String konum, LocalDateTime girisSaati) {
		
		this.kitapAdi = kitapAdi;
		this.kitapNo = kitapNo;
		this.konum = konum;
		this.girisSaati = girisSaati;
	}


	// bu Constructor ödünç verme constructor elemanlarýný içerir.

	public C01(String kitapNo, String isim, LocalDateTime cýkýsSaati) {

		this.kitapAdi = kitapAdi;
		this.kitapNo = kitapNo;
		this.isim = isim;

		this.cýkýsSaati = cýkýsSaati;
	}

}
