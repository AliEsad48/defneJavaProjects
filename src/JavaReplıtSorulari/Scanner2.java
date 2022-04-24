package JavaReplıtSorulari;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        //Ornek Cikti :
        //Alan: 9
        //Cevre: 12

        Scanner scan = new Scanner(System.in);

        int sayi= scan.nextInt();

        System.out.print("Alan:" + (sayi*sayi)+ "\nCevre:"+(sayi*4) );

    }
}
