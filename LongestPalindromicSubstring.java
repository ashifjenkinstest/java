package logics;

public class LongestPalindromicSubstring {

    public static void main(String asfda[]){
        findLongestPalindromicSubstring("geeksskeeg");




    }


    static void findLongestPalindromicSubstring(String str){

        int arrp[][] = new int[str.length()][str.length()];
        int maxLen = 0;
        String pal = null;
        for(int i = 0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(j>=i){
                    arrp[i][j] = checkPalindrome(str.substring(i,j+1));
                    if(arrp[i][j] ==1){
                        //System.out.println(str.substring(i,j+1));
                        int length = str.substring(i, j + 1).length();
                        if(length > maxLen){
                            maxLen = length;
                            pal = new String((str.substring(i,j+1)));
                        }
                    }

                    //System.out.println(str.substring(i,j) +"i=" + i +"j= " + j);
                }
            }

        }

        /*

        for(int i = 0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                System.out.print( "[" + arrp[i][j] + "] ");
            }
            System.out.println();
        }


         */
        System.out.print(pal + "\n" + maxLen);

    }

    static int checkPalindrome(String str){
        //System.out.println(str);
        for(int i = 0,j=str.length()-1;i<=j;i++,j--){
            //System.out.println(str.charAt(i) +" "+str.charAt(j));
            if(str.charAt(i)!=str.charAt(j))
                return 0;
        }

        return  1;
    }
}
