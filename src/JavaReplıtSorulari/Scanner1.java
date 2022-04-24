package JavaReplıtSorulari;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayigiriniz");
        int sayi=scan.nextInt();

       System.out.println((sayi*sayi*sayi)/2);
    }
}
