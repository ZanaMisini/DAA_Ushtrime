package permbledhje_detyrash__afate;

import java.util.Arrays;

//Detyra 20. Duke pasur parasysh një varg numrash të plotë, shkruani një funksion që gjen
//        gjatësinë e nënrenditjes më të gjatë në rritje. Një nënsekuencë është një sekuencë elementësh që
//        shfaqen në të njëjtin rend në vargun origjinal, por jo domosdoshmërisht në mënyrë të
//        njëpasnjëshme. Funksioni duhet të kthejë gjatësinë e nënsekuencës më të gjatë në rritje. Për
//        shembull, për vargun [10, 9, 2, 5, 3, 7, 101, 18], nënsekuenca më e gjatë në rritje është [2, 3, 7,
//        101] dhe gjatësia e saj është 4.

public class LongestIncreasingSubsequence {

    public static void main(String[] zanamaemira) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = longestIncreasingSubsequence(nums);
        System.out.println(result);
    }
    public static int longestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j] && dp[i] < dp[j]+1){
                    dp[i] = dp[j] + 1;
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
}


