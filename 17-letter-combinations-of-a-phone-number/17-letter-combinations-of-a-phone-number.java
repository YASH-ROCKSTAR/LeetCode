class Solution {
    ArrayList<String> ans;
    static String mapp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        ans=new ArrayList<>();
        int index=0;
        solve(digits,index,new StringBuilder());
        return ans;
    }
    public void solve(String str1,int index,StringBuilder str2){
        
        if(index==str1.length()){
            if(str2.length()>0){
                ans.add(str2.toString());
            }
            return;
        }
        int digit=str1.charAt(index)-'0';
        for(char letter:mapp[digit].toCharArray()){
            str2.append(letter);
            solve(str1,index+1,str2);
            str2.deleteCharAt(str2.length()-1);
        }
    }
}