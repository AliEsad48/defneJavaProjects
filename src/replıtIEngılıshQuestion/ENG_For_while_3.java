package replıtIEngılıshQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENG_For_while_3 {
    public static void main(String[] args) {
       /* Write a code that returns the duplicate chars in a String array.(interview Question)

        Input :

        String str=“Javaisalsoeasy”

        Output: [a, s]*/


        String str = "Javaisalsoeasy";
        String arr[] = str.split("");
        List<String> duplications = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    if (!duplications.contains(arr[i])) {
                        duplications.add(arr[i]);

                    }
                }


            }


        }
        System.out.println(duplications);
    }

}
