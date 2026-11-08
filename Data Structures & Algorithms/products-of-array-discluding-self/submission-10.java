class Solution {
    public int[] productExceptSelf(int[] nums) {

        int zerVal =0;
        int mul = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){ mul *= nums[i];
            }else{
                zerVal++;
            }
        
           
        }

        for(int i = 0; i<nums.length; i++){
            if(zerVal>1){
                nums[i]=0;
            }else if(zerVal == 1){
                if(nums[i]==0){nums[i] = mul;
                }
                else nums[i]=0;
                
            }else{
                nums[i] = mul / nums[i];
            }
            
        }
        return nums;
    }
}  
