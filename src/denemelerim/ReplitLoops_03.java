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
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazýniz.(mülakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a s
		 */

		/*
		 * String str1 = "Javaisalsoeasy"; char[] ch = str1.toCharArray(); //
		 * toCharArray methodu herhangi stringi Arraya çevirir. Arrays.sort(ch); //
		 * burada a'dan z ye kadar sýralama yaptýk. //(bunun nedeni Arrayda ayný olanlar
		 * arka arkaya yazýlsn diye) List<Character> uniqueChars = new ArrayList<>();//
		 * burada yinelenen karakterleri içine atacaðým bir List oluþturdum.
		 * 
		 * 
		 * for (int i = 0; i < ch.length-1; i++) { // index ile çalýþtýðým için ve
		 * //ch[i]== ch[i+1] burada son deðeri kontrol ederken //12+1 inci index
		 * kullandýðým için lenght -1 yazdým. if (!uniqueChars.contains(ch[i]) &&
		 * ch[i]== ch[i+1] ) {// burada !uniq... olan kýsýmda sonucumuz //sadece
		 * tekrarlanmayan elementler olacaktýr // && ch[i]== ch[i+1] özellikle
		 * arrays.sort yaptýðýmýzda arka arkaya yazdýrdýðýmýz // elementleri avlamak
		 * için kullandýðýmýz yöntemdir. uniqueChars.add(ch[i]); } }
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
