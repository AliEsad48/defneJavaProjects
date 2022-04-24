package intquestıon;

import java.util.Scanner;

public class interviewsoru3 {
    public static void main(String[] args) {

        /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi=scan.nextInt();

        boolean asalMı=true;
        if(sayi>=2){
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    asalMı=false;
                    break;

                }

            }
            if (asalMı)
                System.out.println("sayi asaldir");
            else System.out.println("sayi asal degildir");
        }


    }


}
