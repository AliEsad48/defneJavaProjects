package JavaReplıtSorulari;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        //Kullanıcıdan bir Float değer girmesini isteyin,
        // bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

        Scanner sacan=new Scanner(System.in);
        float sayi= sacan.nextFloat();
        short sayi1=(short)sayi;
        System.out.println(sayi1);

    }
}
