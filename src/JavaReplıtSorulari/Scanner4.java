package JavaReplıtSorulari;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        //Kullanıcıya günde ne kadar çay içtiğini ve
        // ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        //1 şeker = 1.7 gr
        //Örnek Çıktı:
        //Yılda 12.41 kg şeker kullanıyor.

        Scanner scan = new Scanner(System.in);

        double cay=scan.nextDouble();
        double seker=scan.nextDouble();
        double sekerGr=((seker*cay*1.7*365)/1000)/2;

        System.out.println("1 Yilda " +  sekerGr + " kg seker kullaniyor.");

    }
}
