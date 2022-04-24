package JavaReplıtSorulari;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // Kullanıcıdan üç basamaklı bir sayı girmesini ve
        // bu sayının basamaklarının toplamını bulmasını isteyin.
        //Örnek Çıktı:
        //Verilen tamsayının rakamları toplamı 10'dur.

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        int toplam=0;

        for (int i = 0; i <=03; i++) {
            toplam+=sayi%10;//burda 10 na bolumunden kalanları topladık
            sayi=sayi/10;//burda sayının 10 bolduk


        }
        System.out.println("Verilen tamsayinin rakamlari toplami "+toplam+"'dur.");

    }
    /*	Scanner scan=new Scanner(System.in);//2. yol

		int sayi=scan.nextInt();

		int rakamlarToplami = 0;
		int rakam = 0;

		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;
		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

		rakam = sayi % 10;
		rakamlarToplami += rakam;
    sayi/=10;

    	rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

		System.out.println("Verilen tamsayinin rakamlari toplami " +  rakamlarToplami + "'dur."); */



   }


