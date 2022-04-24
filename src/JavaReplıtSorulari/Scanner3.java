package JavaReplıtSorulari;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        //Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
        //Örnek Çıktı:
        //Alan: 32
        //Çevre: 24

        Scanner scan = new Scanner(System.in);

        int kisaKenar= scan.nextInt();
        int uzunKenar= scan.nextInt();

        System.out.print("Alan:" + (kisaKenar*uzunKenar)+ "\nCevre:"+(kisaKenar*2+uzunKenar*2) );

    }
}



