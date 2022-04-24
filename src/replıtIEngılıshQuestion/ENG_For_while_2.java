package replıtIEngılıshQuestion;

import java.util.Scanner;

public class ENG_For_while_2 {

    public static void main(String[] args) {
         /*
    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz ");
        int sayi1 =30;
        int sayi2 =40;
        int ebob=0;
        int ekok=0;


        for (int i= 1; i <=sayi1 && i<=sayi2; i++) {
            if(sayi1% i == 0 && sayi2% i== 0){

            ebob = i;
            }

        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("GCD for 30 and 40 =" + ebob );
        System.out.println(("LCM for 30 and 40 =" + ekok ));
    }


}
