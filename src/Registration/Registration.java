package Registration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Registration {
    
    
    /*
     * TODO Bu uygulama kulanýcýlarýn bir ArrayListe kayýt zamanýný da alarak
     * ekleyen ve sonrasýnda her dakikanýn ilk 10 saniyesinde kaydolmuþ olanlarý
     * þanslý kullanýcý olarak ekrana yazdýran bir uygulamadýr.Bunun için; 
     * 1- Bir
     * user class oluþturun fields: name , registerDate (LocalDateTime cinsinden) 
     * 2-
     * Registration isminde bir class oluþturun ve register isminde bir metod
     * ekleyerek Kullanýcýdan user ismini alarak ArrayList e ekleyin ve bu list i
     * return edin. 
     * 3- Registration classý na ayný zamanda kendine verilen
     * ArrayListteki userlardan her dakikanýn ilk 10 saniyesinde kaydolmuþlarý
     * yazdýran printHappyUsers isminde bir metod daha ekleyiniz. Ýpucu Çalýþacak
     * main metodu aþaðýdaki gibi olmalýdýr. 
     * public static void main(String[] args)
     * { Registration userReg = new Registration(); ArrayList<User> register =
     * userReg.register(); userReg.printHappyUsers(register);
     * 
     */
	
	List<User>users=new ArrayList<>(); // users adýnda array list create ettik
	
    public Registration() {
        // TODO Auto-generated constructor stub
    }
    
    public List<User> register(){ // register methodunu create ettik. 
    	//bu methoddan kullanýcýdan ismini girmesini enter tuþuna basar basmaz alacaðý DateTime verileri
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
        String isim=scan.nextLine();
        User user=new User(isim, LocalDateTime.now());// user isminde obje create ettik. parametre isim ve zaman
        users.add(user);
        return users;
    }
    
    public void listele(List<User>users) {
        for (User each : users) {
            System.out.println("Adi: "+each.name+" kayit zamani "+each.registerDate);
        }
    }
    public void printHappyUsers(List<User> users) {
        for (User each : users) {
            if (each.registerDate.getSecond()<10) {
                System.out.println("Þanslý kiþisiniz "+each.name+" 5 kilo bal kazandiniz");
            }
        }
        
    }
    
    
}