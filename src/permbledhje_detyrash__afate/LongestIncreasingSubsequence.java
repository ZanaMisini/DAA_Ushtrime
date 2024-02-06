package permbledhje_detyrash__afate;


//Detyra 20. Duke pasur parasysh një varg numrash të plotë, shkruani një funksion që gjen
//        gjatësinë e nënrenditjes më të gjatë në rritje. Një nënsekuencë është një sekuencë elementësh që
//        shfaqen në të njëjtin rend në vargun origjinal, por jo domosdoshmërisht në mënyrë të
//        njëpasnjëshme. Funksioni duhet të kthejë gjatësinë e nënsekuencës më të gjatë në rritje. Për
//        shembull, për vargun [10, 9, 2, 5, 3, 7, 101, 18], nënsekuenca më e gjatë në rritje është [2, 3, 7,
//        101] dhe gjatësia e saj është 4.

public class LongestIncreasingSubsequence {

    public static void main(String[] zanamaemira) {
        int[] nums = {10, 19, 2, 1, -30, -70, -101, -180};
        int result = longesIncreasingSubsequenceAdjecent(nums);
        System.out.println(result);
    }
    public static int longestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j] /*&& dp[i] < dp[j]+1*/){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    //dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for(int i : dp){
            if(i > max)
                max = i;
        }

        return max;
    }

    //nqs kerkesa thote qe numrat te jene te njepasnjeshem
    public static int longesIncreasingSubsequenceAdjecent(int[] array){
        int current = 1;
        int maxLen = 1;
        for(int i=0; i<array.length-1; i++){
            if(array[i] < array[i+1]){
                current++;
                maxLen = Math.max(current, maxLen);
            }
            else
                current = 1;
        }
        return maxLen;
    }

}


