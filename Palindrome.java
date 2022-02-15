package logics;

public class Palindrome {

    public static void main(String skdf[]){
        System.out.println(isPalindrome("AADDAa".toUpperCase()));


    }

    public static Boolean isPalindrome(String str){

        for(int i = 0,j=str.length()-1;i<=j;i++,j--){
            //System.out.println(str.charAt(i) +" "+str.charAt(j));
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }

        return  true;


    }
}
