package JavaReplıtSorulari;

import java.util.Scanner;

public class Switch_Ternary_Stringmethods {
    public static void main(String[] args) {

        //Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan
        // ve yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        //Ornek:
        //INPUT :
        //25
        //46
        //OUTPUT :
        //Numaralarin Toplami:
        //71


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        String sayi1=scan.next();

        String sayi2=scan.next();

        int toplam=Integer.parseInt(sayi1)+Integer.parseInt(sayi2);

        String top=String.valueOf(toplam);
        if (sayi2.length()<10||sayi1.length()<10||top.length()<10) {

            System.out.println("Numaralarin toplami : \n" + toplam);

        }else System.out.println("OverFlow");

    }

}








