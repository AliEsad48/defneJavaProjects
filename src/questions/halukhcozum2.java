package questions;

import java.util.Scanner;

public class halukhcozum2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(checkPerfectNumber(sayi));
        boolean flag;
        flag = checkPerfectNumber(sayi);
        System.out.println(flag);

        String result = checkPerfectNumber(sayi) ? "Sayi mukemmel sayidir"
                : "Sayi mukemmel sayi degildir";
        System.out.println(result);
    }

    public static boolean checkPerfectNumber(int sayi) {
        int toplam = 0;
        boolean flag = false; // durum kontrolu (acik kapali gibi) "flag ismi bir onem arzetmiyor"
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i; // toplam += i;
            }
        }
        if (toplam == sayi) {
            flag = true;
        }

        return flag;

    }


}


