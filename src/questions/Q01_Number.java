package questions;

import java.util.Scanner;

public class Q01_Number {

    /*
     TASK :
    Kullanicidan bir sayi aliniz
    Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number=scan.nextInt();
        if (number>=0){

            if (number<10) {

                System.out.println("Rakam");
            }else System.out.println("Pozitif sayı");

        }else if(number<0){
            System.out.println("Negatif Sayi");
        }
    }
}
