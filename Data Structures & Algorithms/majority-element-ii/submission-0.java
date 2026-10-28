class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer, Integer> m = new HashMap<>();
            for(int e : nums){
                m.merge(e, 1, Integer::sum);
            }

            List<Integer> rez = new ArrayList<>();
        
            for(var e : m.entrySet()){
                int val = e.getValue();
                if(val > (nums.length/3)){
                    rez.add(e.getKey());
                }
            }

  
        return rez;
    }
}