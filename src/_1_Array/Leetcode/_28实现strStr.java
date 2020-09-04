package _1_Array.Leetcode;

public class _28实现strStr {

    public static void main(String[] args) {
        String haystack = "aaaaa", needle = "ba";
        System.out.println(new _28实现strStr().strStr(haystack, needle));

    }

    public int strStr(String haystack, String needle) {
        if (needle.length()==0 ){
            return 0;
        }

        int hay=0;
        int nee=0;
        int nelen=needle.length();
        while (hay<(haystack.length()-nelen+1)){
            while ( hay<haystack.length()-nelen+1 && haystack.charAt(hay)!=needle.charAt(nee)){
                hay++;
            }

            if (hay<haystack.length()-nelen+1 &&haystack.substring(hay,hay+nelen).equals(needle)){
                return hay;
            }else {
                hay++;
            }
        }

        return -1;

    }
}
