package replıtIEngılıshQuestion;

import java.util.Scanner;

public class ENG_For_while_4 {

    public static void main(String[] args) {
        /*
        Write a return method that accepts an integer as input and calculates factorial and prints like output.

Input : 6

Output: 6!=65432*1=720
         */
        faktorial();
    }
       public static void faktorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi :");
        int sayi = scanner.nextInt();
        int faktorial=1;
           System.out.print(sayi+" !="+sayi);
        while (sayi>0){


            faktorial*=sayi;
            sayi--;
            if(sayi!=1&&sayi!=0){
                System.out.print(sayi);
            }

        }
        System.out.println("*1 = "+faktorial);

    }

}
