package JavaReplıtSorulari;

import java.util.Scanner;

public class swıch_ternary_strınhmethod2 {
    public static void main(String[] args) {
        /*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :
John White
1234234534561478
Output : Name :
J*** W****
CCN : **** **** **** 1478
Ilk Harfler Buyuk harf ile baslamalidir.*/

        Scanner scan=new Scanner(System.in);


        String name=scan.nextLine();
        System.out.print(name.substring(0,1).toUpperCase() + name.substring(1,name.indexOf(' '))
                .replaceAll("\\w", "*") + " ");

        System.out.print(name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase().replaceAll(" ","")
                + name.substring(name.indexOf(' ')+2).replaceAll("\\w", "*"));
        System.out.println();



        String CCN= scan.nextLine();
        System.out.println("CCN  : **** **** **** "+CCN.substring(12));






                

            }

        }











