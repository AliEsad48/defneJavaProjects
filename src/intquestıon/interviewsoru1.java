package intquestıon;

import java.util.Arrays;
import java.util.Scanner;

public class interviewsoru1 {
    public static void main(String[] args) {
        /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1

         zor bir soru
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string girirniz");
        String str =scan.nextLine();

        // split()

        String arr[]=str.split("");// her bir karakteri ayırır
        System.out.println(Arrays.toString(arr));

        // arryalerde sıralama soz konusuysa sort aypıyoruz

        Arrays.sort(arr);//sırala
        System.out.println(Arrays.toString(arr));

        // ayni karakterleri sayması ıcın sayac olusturacaz

        int counter=0;

        for (int i = 1; i <arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[i - 1] + "sayisi" + (counter + 1));
                counter = 0; // counter sayac demek


            }
            if (i == arr.length - 1) {// en sona geldıgınde
                System.out.println(arr[i] + "sayisi" + (counter + 1));

            }
        }}}


