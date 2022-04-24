package JavaReplıtSorulari;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

        Scanner scan=new Scanner(System.in);

        double sayi=scan.nextDouble();
        int sayi1=(int)sayi;
        System.out.println(sayi1);
    }
}
