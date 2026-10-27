class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length <=1) return nums;

        int m = nums.length/2;
        int[] fP = new int[m];
        int[] sP = new int [nums.length-m];
        for (int i = 0; i < m; i++) fP[i] = nums[i];
        for (int i = m; i < nums.length; i++) sP[i - m] = nums[i];
        return merge(sortArray(fP), m, sortArray(sP), nums.length-m);

        
    }
    public int[] merge(int[] a1, int len1, int[] a2,int len2){
        int j = 0;
        int k = 0;
        int i = 0;
        int[] result = new int[len1 + len2];
       
        while((i < len1) && (j < len2)){
            if(a1[i] <= a2[j]) result[k++] = a1[i++];
            else result[k++] = a2[j++];
        }
        while(i < len1) result[k++] = a1[i++];
        while(j < len2) result[k++] = a2[j++];
        return result;
    }
}