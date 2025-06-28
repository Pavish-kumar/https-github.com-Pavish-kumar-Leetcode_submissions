class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        List<Character> l=new ArrayList<>(m.keySet());
        Collections.sort(l,(a,b)->m.get(b)-m.get(a));
        StringBuilder res=new StringBuilder();
        for(char c:l){
            res.append(String.valueOf(c).repeat(m.get(c)));
        }
        return res.toString();
    }
}