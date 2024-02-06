package permbledhje_detyrash__afate;

//Detyra 19. Duke pasur parasysh një varg numrash të plotë, shkruani një funksion që gjen
//        nënvargun e ngjitur me shumën më të madhe. Nënvargu duhet të jetë i ngjitur, që do të thotë se
//        elementët duhet të jenë në një sekuencë dhe nuk mund të ndahen. Funksioni duhet të kthejë
//        shumën e nënvargut. Për shembull, për vargun [-2, 1, -3, 4, -1, 2, 1, -5, 4], shuma maksimale e
//        nënvargut është 6 (nënvargu është [4, -1, 2, 1] ).
public class MaxSubarraySum {
    public static void main(String[] zanamaemira) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3, 7};
        int result = maxSubArraySum(array);
        int resultNon = maxSubArraySumNonConsecutive(array);

        System.out.println("Maximum Subarray Sum (consecutive numbers): " + result);
        System.out.println("Maximum Subarray Sum (non-consecutive numbers): " + resultNon);


    }

    public static int maxSubArraySum(int[] nums){
        if(nums == null || nums.length == 0)
            return -1;

        int current = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            current = Math.max(nums[i], nums[i] + current);
            maxSum = Math.max(maxSum, current);
        }
        return maxSum;
    }
    //nqs numrat nuk duhet te jene te njepasnjeshem
    public static int maxSubArraySumNonConsecutive(int[] nums){
        if(nums == null || nums.length == 0)
            return -1;

        int n = nums.length;
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-1] + nums[i-1]);
        }

        int max = 0;
        for(int i : dp){
            if(max < i)
                max = i;
        }
        return max;
    }
}