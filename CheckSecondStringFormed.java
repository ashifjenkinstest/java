package logics;

public class CheckSecondStringFormed {


    private static final int MAX = 256;

    static public void main(String []args)
    {
        //String str1 = "geekforgeeks";
        //String str2 = "for";

        String str1 = "aaaaaaabbbbbccccd";
        String str2 = "cd";

        if (canMakeStr2(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean canMakeStr2(String str1, String str2) {

        // Create a count array and count frequencies
        // characters in str1.
        int[] count = new int[MAX];
        char []str3 = str1.toCharArray();
        for (int i = 0; i < str3.length; i++)
            count[str3[i]]++;

        // Now traverse through str2 to check
        // if every character has enough counts

        char []str4 = str2.toCharArray();
        for (int i = 0; i < str4.length; i++) {
            if (count[str4[i]] == 0)
                return false;
            count[str4[i]]--;
        }
        return true;
    }
}
