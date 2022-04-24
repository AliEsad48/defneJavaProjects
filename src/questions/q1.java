package questions;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String cumle=scan.next();

        System.out.println("lutfen bır harf gırınız");
        String harf=scan.next().substring(0,1);
        int sayac=0;

        String arr[]=cumle.split("");
        Arrays.sort(arr);

        for(String each:arr

        ) {
            if(each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        System.out.println("girdiginiz metin istediginiz harf"+ sayac);




    }
}
