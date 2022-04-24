package questions;

import java.util.Scanner;

public class Q02_Char {

    /*
TASK :
 Kullanicidan bir character girmesini isteyiniz
 Character harf ise kucuk harf olup olmadigini kontrol ediniz
 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
 Harf degilse ekrana "Harf degil" yazdiriniz
97:a  122:z ascii değeri
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir karakter giriniz: ");
        char character = scanner.next().charAt(0);
        if ((character <= 122 && character >= 97)) {

            System.out.println("Kucuk Harf");

        } else if ((character >= 65 && character <= 90)) {
            System.out.println("Buyuk Harf");
        } else System.out.println("Harf Değil");
    }

}
