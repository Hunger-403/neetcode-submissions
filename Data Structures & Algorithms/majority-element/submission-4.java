class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(nums[i])){
                m.merge(nums[i],1, Integer::sum);
            }else{
                m.put(nums[i], 1);
            }
        }
        int value = 0;
        int max = 0;
        for (var e : m.entrySet()) {
        if(e.getValue() > max){
            max = e.getValue();
            value = e.getKey();
        }
        

    }
    return value;
    }
}