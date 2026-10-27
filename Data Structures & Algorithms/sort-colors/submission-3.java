class Solution {
    public void sortColors(int[] nums) {
        
        int len = nums.length;
        for(int next = 0; next <len; next++){
            int curr = next;
            int tmp = nums[next];

            while ((curr>0)&&(tmp<nums[curr-1])){
                nums[curr]= nums[curr-1];
                curr--;
            }
            nums[curr]=tmp;
        }
    }
}