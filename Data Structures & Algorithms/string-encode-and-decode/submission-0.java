class Solution {

    public String encode(List<String> strs) {
        StringBuilder c = new StringBuilder();
        for(String s : strs){
            for(int i=0; i < s.length(); i++){
                c.append((int)s.charAt(i)).append("!");
            }
            c.append("#");
            
        }
        return c.toString();
    }

    public List<String> decode(String str) {
        
        List<String> rez = new ArrayList<>();
        if (str.isEmpty()) return rez;     
        String[] words = str.split("#", -1);

        for(int i=0; i < words.length-1; i++){
            StringBuilder sb = new StringBuilder();
            if (!words[i].isEmpty()) {
                for (String e : words[i].split("!")) {
                    sb.append((char) Integer.parseInt(e));
                }
            }
            rez.add(sb.toString());
        }
        return rez;
    }
}
