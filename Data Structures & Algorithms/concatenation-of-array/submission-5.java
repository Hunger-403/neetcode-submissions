class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int[] rez = new int[n*2];
        for(int i =0; i<n;i++){
            rez[i]=nums[i];
            rez[i+n]=nums[i];
        }
        return rez;
    }
}