import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public static void main (String args[]){
        String  sentence = "I am John Doe";
        System.out.println(sentence.split(" ").length);
        for(int i = sentence.length()-1;i > -1 ; i--){
            System.out.print(sentence.charAt(i));
        }


    }
}
