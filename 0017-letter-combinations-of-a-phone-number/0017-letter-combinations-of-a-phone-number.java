class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<String>();
        }
        List<String> ans=new ArrayList<>();
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        helper(ans,0,new StringBuilder(""),digits,map);
        return ans;
    }
    private void helper(List<String> ans,int i,StringBuilder sol,String digits,Map<Character,String> map){
        if(sol.length()==digits.length()){
            ans.add(new String(sol));
            return;
        }
        String letter=map.get(digits.charAt(i));
        for(char c:letter.toCharArray()){
            sol.append(c);
            helper(ans,i+1,sol,digits,map);
            sol.deleteCharAt(sol.length()-1);
        }
    }
}