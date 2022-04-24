package replıtIEngılıshQuestion;

import java.util.Scanner;

public class ENG_For_while_1 {
    public static void main(String[] args) {
        /*
           Ask user to enter a name and a character, then check how many times
           the character is repeated in the name using loops in the name
           e.g:
           char ch1= 'a' ;
           String name =“John came late"
           Expected Output: Number of a = 2
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle yada kelime giriniz ");
        String cumle = scan.nextLine();
        int sayac = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == 'a' || cumle.charAt(i) == 'A') {
                sayac++;
            }


        }
        System.out.println("Girilen cumle yada kelimede " + sayac + " tane 'a' harfi vardir.");

    }


}

