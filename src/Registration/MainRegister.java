package Registration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainRegister {
    public static void main(String[] args) {
        menu();
    
    }
    
    private static void menu() {
        Scanner scan = new Scanner(System.in);
        String islem;
        Registration userReg = new Registration();  // registration class�ndan bir obje crate ettik 
        List<User> register = null; // register ad�nda arraylist declare ettik null assign ettik
        boolean cikilsinMi = false;  // boolean variable � while looptan ��k�� i�in kullanmak �zere create ettik
       
        
        while (!cikilsinMi) {  //  while loop boolean �zerinde �al��acak true olunca lopp sonlanacak.
            System.out.println("L�tfen Ekleme i�in 1\nListeleme i�in 2\n�ansl� ki�i bulma 3\n��k�� 4");
            islem = scan.nextLine(); // switch te kullan�lma �zere String olu�turduk
            switch (islem) {
            case "1":
                register = userReg.register(); // yukarda register arraylistine register methodunu assisgn ettik
                break;
            case "2":
                userReg.listele(register);  //listele methodunu getirdik
                break;
            case "3":
                userReg.printHappyUsers(register); // �anl�lar methodunu getirdik
                break;
            case "4":
                cikilsinMi = true; // ��k�� i�in bunlar� kulland�k
                break;
            default:
                System.out.println("Yanl�� bir de�er girdiniz");
                break;
            }
        }
    }
}