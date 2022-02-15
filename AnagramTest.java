package logics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class AnagramTest {

    public static void main(String sfa[]){

    System.out.println(isAnagram("SILENT".toLowerCase(Locale.ROOT), "LISTENw".toLowerCase(Locale.ROOT)));

    }

    public static boolean isAnagram(String str1,String str2)
    {

        // Get lengths of both strings
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        List<String> str1cpy = Arrays.asList(str1.split(""));
        List<String> str2cpy = Arrays.asList(str2.split(""));

        Collections.sort(str1cpy);
        Collections.sort(str2cpy);
        if(str1cpy.equals(str2cpy)){
            return true;
        }

        // Compare sorted strings
        return false;

    }
}
