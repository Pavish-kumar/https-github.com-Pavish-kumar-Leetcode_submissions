class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] letters=s.toCharArray();
            Arrays.sort(letters);
            String sortedWords=new String(letters);
            if(!map.containsKey(sortedWords)){
                map.put(sortedWords,new ArrayList());
            }
            map.get(sortedWords).add(s);
        }
        return new ArrayList<>(map.values());
    }
}