package questions;

import java.util.Scanner;

public class halukhcozum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {

            toplam = (i * i) + toplam;

        }
        System.out.println("Sayıların kareleri toplamı: " + toplam);

    }
}


