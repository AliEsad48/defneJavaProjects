package questions;

public class q2 {
    public static void main(String[] args) {
          /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

        int sayi=5;
        char karakter='*';
        for (int i = 0; i <=sayi; i++) {
            for (int j = i; j <sayi; j++) {
               // System.out.println(karakter);
                System.out.print(" ");

            }
            for (int j = 0; j < i ; j++) {
                System.out.print(karakter);

            }
            System.out.println();

        }
    }
}
