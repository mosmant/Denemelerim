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
        Registration userReg = new Registration();  // registration classýndan bir obje crate ettik 
        List<User> register = null; // register adýnda arraylist declare ettik null assign ettik
        boolean cikilsinMi = false;  // boolean variable ý while looptan çýkýþ için kullanmak üzere create ettik
       
        
        while (!cikilsinMi) {  //  while loop boolean üzerinde çalýþacak true olunca lopp sonlanacak.
            System.out.println("Lütfen Ekleme için 1\nListeleme için 2\nÞanslý kiþi bulma 3\nÇýkýþ 4");
            islem = scan.nextLine(); // switch te kullanýlma üzere String oluþturduk
            switch (islem) {
            case "1":
                register = userReg.register(); // yukarda register arraylistine register methodunu assisgn ettik
                break;
            case "2":
                userReg.listele(register);  //listele methodunu getirdik
                break;
            case "3":
                userReg.printHappyUsers(register); // þanlýlar methodunu getirdik
                break;
            case "4":
                cikilsinMi = true; // çýkýþ için bunlarý kullandýk
                break;
            default:
                System.out.println("Yanlýþ bir deðer girdiniz");
                break;
            }
        }
    }
}