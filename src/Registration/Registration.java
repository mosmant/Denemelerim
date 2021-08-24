package Registration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Registration {
    
    
    /*
     * TODO Bu uygulama kulan�c�lar�n bir ArrayListe kay�t zaman�n� da alarak
     * ekleyen ve sonras�nda her dakikan�n ilk 10 saniyesinde kaydolmu� olanlar�
     * �ansl� kullan�c� olarak ekrana yazd�ran bir uygulamad�r.Bunun i�in; 
     * 1- Bir
     * user class olu�turun fields: name , registerDate (LocalDateTime cinsinden) 
     * 2-
     * Registration isminde bir class olu�turun ve register isminde bir metod
     * ekleyerek Kullan�c�dan user ismini alarak ArrayList e ekleyin ve bu list i
     * return edin. 
     * 3- Registration class� na ayn� zamanda kendine verilen
     * ArrayListteki userlardan her dakikan�n ilk 10 saniyesinde kaydolmu�lar�
     * yazd�ran printHappyUsers isminde bir metod daha ekleyiniz. �pucu �al��acak
     * main metodu a�a��daki gibi olmal�d�r. 
     * public static void main(String[] args)
     * { Registration userReg = new Registration(); ArrayList<User> register =
     * userReg.register(); userReg.printHappyUsers(register);
     * 
     */
	
	List<User>users=new ArrayList<>(); // users ad�nda array list create ettik
	
    public Registration() {
        // TODO Auto-generated constructor stub
    }
    
    public List<User> register(){ // register methodunu create ettik. 
    	//bu methoddan kullan�c�dan ismini girmesini enter tu�una basar basmaz alaca�� DateTime verileri
        Scanner scan =new Scanner(System.in);
        System.out.println("L�tfen adinizi giriniz");
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
                System.out.println("�ansl� ki�isiniz "+each.name+" 5 kilo bal kazandiniz");
            }
        }
        
    }
    
    
}