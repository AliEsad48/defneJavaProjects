package JavaReplıtSorulari;

import java.util.Scanner;

public class Scanner8 {
    public static void main(String[] args) {
        //Girilen zamanı saniyeye çeviren bir program yazınız.
        //Örnek Çıktı:
        //1 saat 10 dakika 50 saniye ==>
        //4250 saniye

       Scanner scan = new Scanner(System.in);

        int saat= scan.nextInt();
        int dk= scan.nextInt();
        int sny= scan.nextInt();

        System.out.println(((saat*60*60)+(dk*60)+(sny)) +" saniye");
    }
}
