package logics;

public class LCS {

    public static void main(String stsrtp[]) {

        System.out.println(lcsFunc("AGGTAB", "GXTXAYB", "AGGTAB".length(), "GXTXAYB".length()));
        System.out.println(lcsFunc("AATCC", "ACACG", "AATCC".length(), "ACACG".length()));
        System.out.println(lcsFunc("ABCBDAB", "BDCABA", "ABCBDAB".length(), "BDCABA".length()));
    }

    public static int lcsFunc(String s1, String s2, int s1Len, int s2Len) {
        if (s1Len == 0 || s2Len == 0) {
            return 0;
        } else if (s1.charAt(s1Len - 1) == s2.charAt(s2Len - 1)) {
            return 1 + lcsFunc(s1, s2, s1Len - 1, s2Len - 1);
        } else {
            return Math.max(lcsFunc(s1, s2, s1Len - 1, s2Len), lcsFunc(s1, s2, s1Len, s2Len - 1));
        }
    }
}
