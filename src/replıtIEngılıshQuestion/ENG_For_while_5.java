package replıtIEngılıshQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ENG_For_while_5 {
    public static void main(String[] args) {
        /*
        Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
         */
        List<Integer> liste = new ArrayList<>();
        int sayi, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("sayiyi giriniz :");
        sayi = scan.nextInt();
        System.out.println("cift syialarin listesini:");
        i = 0;
        while (i <= sayi) {
            if (i % 2 == 0) {
                liste.add(i);


            }
            i = i + 1;
        }

        ListIterator itr = liste.listIterator();
        while (itr.hasNext()) {
            itr.next();
        }
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");

        }
    }
}
