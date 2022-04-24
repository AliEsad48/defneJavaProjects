package odevlerim;

import java.util.Arrays;
import java.util.Collections;

public class Q14tekrar {
    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */



        String str = "Congratulations";

        String harfler[] = str.split("");// splitle parcaladık
        System.out.println(Arrays.toString(harfler));
        Collections.reverse(Arrays.asList(harfler));//degisen veriyi tersten yazdırdık

        System.out.println(Arrays.toString(harfler).replaceAll("o", "i").replaceAll("a",
                "i").replaceAll("u", "i"));//replaceall ile istenen harfleri degistirdik




    }


}










