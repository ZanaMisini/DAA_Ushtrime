package algoritmet_pershtatjes;

                    // This code has been contributed by Amit Khandelwal.
                    // This code has been contributed by Amit Khandelwal.
                    // This code has been contributed by Amit Khandelwal.
                    // This code has been contributed by Amit Khandelwal.
                    // This code has been contributed by Amit Khandelwal.

//The code was taken from: https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
//for extra comments and explanation visit the link above

//TODO: time, space complexity, and explain the algorithm coherently

public class KMP {
    public static void main(String[] zanamaemira){
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        new KMP_String_Matching().KMPSearch(pat, txt);
    }
}
class KMP_String_Matching {
    void KMPSearch(String pat, String txt){
        int M = pat.length();
        int N = txt.length();

        int lps[] = new int[M];
        int j = 0;

        computeLPSArray(pat, M, lps);

        int i = 0;
        while ((N - i) >= (M - j)) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern "
                        + "at index " + (i - j));
                j = lps[j - 1];
            } else if (i < N
                    && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }
    void computeLPSArray(String pat, int M, int lps[]){
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }else{
                if (len != 0) {
                    len = lps[len - 1];
                }else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
