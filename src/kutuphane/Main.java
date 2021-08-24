package kutuphane;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1- Kitap ekleme
		// 2- T�m Kitap listesi (k�t�phanede var olan t�m kitaplar� listeler)
		// 3- Kitap �d�n� verme i�lemi (k�t�phanede olan kitab� �d�n� vermeye yarar.)
		// 4- �d�n� verilen Kitap listesi ()
		// 5- �d�n� verilen kitap teslimi (�d�n� verilen kitab�n teslim al�nmas�yla
		// �d�n� listesinden temizlenmesi.)

		menu();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		String islem = null;

		M01 methodlarial = new M01();
		List<C01> tumKitaplar = null;
		List<C01> oduncKitaplar = null;
		boolean cikilsinMi = false;

		while (!cikilsinMi) {
			System.out.println("1- Kitap ekleme");
			System.out.println("2- T�m Kitap listesi");
			System.out.println("3- Kitap �d�n� verme i�lemi");
			System.out.println("4- �d�n� verilen Kitap listesi");
			System.out.println("5- �d�n� verilen kitap teslimi");
			System.out.println("6- ��k��");
			islem = scan.nextLine();
			switch (islem) {
			
			
			case "1":
				tumKitaplar= methodlarial.ekleme();
				break;
			case "2":
				methodlarial.listeleme(tumKitaplar);
				break;
			case "3":
				oduncKitaplar=methodlarial.oduncVerme();
				break;
			case "4":
				methodlarial.oduncListeleme(oduncKitaplar);
				break;
			case "5":
				oduncKitaplar=methodlarial.oduncTeslim();
				break;
			case "6":
				cikilsinMi=true;
				break;

			default:
				System.out.println("Yanl�� 1 i�lem girdiniz !!!");
				break;
			}
		}

	}

}
