package questions;

import java.util.Scanner;

public class odevtekra1 {
    public static void main(String[] args) {
          /*
   Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
   değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
           1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

   Sesli harfler: a,e,i,o,u   //{ 'a','e','i','o','u'};
   Test Data:
   a

   Beklenen Çıktı:
   a harfi sesli harfdir.

   Test Data:
   d

   Beklenen Çıktı:
   d harfi sesiz harftir.

   Test Data:
   we  yada %

   Beklenen Çıktı:
   Yanlis karakter girdiniz!

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String girilenVeri= scanner.next();

        char girilenHarf=girilenVeri.length()<2? girilenVeri.charAt(0) : '-';
        char[] sesliHarfler={ 'a','e','i','o','u'};
        boolean sesliHarfMi=false;
        boolean harfMi=girilenHarf >=97 && girilenHarf<=122 ?true:false;

        for (int i = 0; i <sesliHarfler.length; i++) {

            if(sesliHarfler[i]==girilenHarf){
                sesliHarfMi=true;
                break;
            }
        }
        if(harfMi&&sesliHarfMi){
            System.out.println(girilenHarf+"sesli harftir");

        }else if (harfMi== true && sesliHarfMi==false) {
            System.out.println(girilenHarf + "sessiz harftir");

        }
        else System.out.println("yanliş karakter girdiniz");

        }






    }
