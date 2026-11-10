class Solution {
    public String mergeAlternately(String word1, String word2) {
        int L = word1.length();
        int R = word2.length();
        int i =0;
        StringBuilder sb = new StringBuilder();
        while (i<L&&i<R){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        while(i<L){
            sb.append(word1.charAt(i));
            i++;
        }
        while(i<R){
            sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}