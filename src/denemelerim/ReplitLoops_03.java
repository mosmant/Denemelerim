package denemelerim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReplitLoops_03 {

	public static void main(String[] args) {
		/*
		 * Bir String icerisinde yinelenen karakterleri d�nd�ren bir kod
		 * yaz�niz.(m�lakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=�Javaisalsoeasy�
		 * 
		 * Output: a s
		 */

		/*
		 * String str1 = "Javaisalsoeasy"; char[] ch = str1.toCharArray(); //
		 * toCharArray methodu herhangi stringi Arraya �evirir. Arrays.sort(ch); //
		 * burada a'dan z ye kadar s�ralama yapt�k. //(bunun nedeni Arrayda ayn� olanlar
		 * arka arkaya yaz�lsn diye) List<Character> uniqueChars = new ArrayList<>();//
		 * burada yinelenen karakterleri i�ine ataca��m bir List olu�turdum.
		 * 
		 * 
		 * for (int i = 0; i < ch.length-1; i++) { // index ile �al��t���m i�in ve
		 * //ch[i]== ch[i+1] burada son de�eri kontrol ederken //12+1 inci index
		 * kulland���m i�in lenght -1 yazd�m. if (!uniqueChars.contains(ch[i]) &&
		 * ch[i]== ch[i+1] ) {// burada !uniq... olan k�s�mda sonucumuz //sadece
		 * tekrarlanmayan elementler olacakt�r // && ch[i]== ch[i+1] �zellikle
		 * arrays.sort yapt���m�zda arka arkaya yazd�rd���m�z // elementleri avlamak
		 * i�in kulland���m�z y�ntemdir. uniqueChars.add(ch[i]); } }
		 * 
		 * System.out.println(uniqueChars);
		 * 
		 */
		String str = "Javaisalsoeasy";
		List<String> uniqueList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {

				
			}else {
				uniqueList.add(str.substring(i, i + 1));
			}
		
				
			}
			Set<String> uniqueSet = new HashSet<>();
			uniqueSet.addAll(uniqueList);
			System.out.println(uniqueSet);
				
			}
		

}
