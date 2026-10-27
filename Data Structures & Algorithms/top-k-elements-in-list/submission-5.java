class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int e : nums) m.merge(e, 1, Integer::sum);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(m.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] rez = new int[k];
        for (int j = 0; j < k; j++) {
            rez[j] = list.get(j).getKey();
        }
        return rez;
    }
}
