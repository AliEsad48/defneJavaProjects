package questions;

import java.util.Scanner;

public class odevtekrar3 {
    public static void main(String[] args) {
        /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
        1*1=1
        2*2=4
        3*3=9
        4*4=16
           +
           -----
            30


     */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birden buyuk bir tam sayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;

        if(sayi>1){
            for (int i = 1; i <=sayi ; i++) {
                toplam+=i*i;

            }
            System.out.println("toplam="+toplam);

        }else{
            System.out.println("lütfen 1 den büyük bir sayi giriniz");
        }
    }
}
