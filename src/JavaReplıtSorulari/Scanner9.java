package JavaReplıtSorulari;

import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args) {
        //Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek
        // için bir Java programı yazın
        //INPUT:
        //Dakika sayısı: 3456789
        //OUTPUT :
        //3456789 dakika yaklaşık 6 yıl 210 gündür

        /* Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

                INPUT:

        Dakika sayısı: 3456789

        OUTPUT :

        3456789 dakika yaklaşık 6 yıl 210 gündür*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir dakika giriniz");
        int dakika=scan.nextInt();
        int yil=(dakika/60/24)/365;//dakikayı 60 abolup saati bulduk saati 24 bolduk gunu bulduk
        // gunude 365 bolup yılı bulduk
        int gun=((dakika/60/24)%365);//

        System.out.println(yil);
        System.out.println(gun);




    }
}


