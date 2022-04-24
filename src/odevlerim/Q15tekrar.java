package odevlerim;

public class Q15tekrar {
    public static void main(String[] args) {
         /*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
        int arr[]={2,6,4,8,2,6,3};

        if ((arr[0]==arr[arr.length-1])){
            System.out.println("ilk ve son karakterler esıttır");

        }else{
            System.out.println("ılk ve son karakterler esıt degıldır");
        }
    }
}
