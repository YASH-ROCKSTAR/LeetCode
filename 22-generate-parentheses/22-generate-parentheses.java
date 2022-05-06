class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        generate(n,n,"",li);
        return li;
    }
    public void generate(int open,int close,String str,List<String> res){
        if(open==0 && close==0){
            res.add(str);
            return;
        }
        if(open>0){
            String ob=str+"(";
            generate(open-1,close,ob,res);
        }
        if(close>open){
            String cb=str+")";
            generate(open,close-1,cb,res);
        }
    }
}