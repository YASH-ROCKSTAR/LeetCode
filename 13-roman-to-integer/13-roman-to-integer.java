class Solution {
    public int romanToInt(String s) {
        int a,b;
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            a=getvalue(s.charAt(i));
            b=getvalue(s.charAt(i+1));
            
            if(a<b) res-=a;
            else{
                res+=a;
            }
        }
        
        res+=getvalue(s.charAt(s.length()-1));
        return res;
    }
    public int getvalue(char p){
        if(p=='I') return 1;
        else if(p=='V') return 5;
        else if(p=='X') return 10;
        else if(p=='L') return 50;
        else if(p=='C') return 100;
        else if(p=='D') return 500;
        else return 1000;
        
    }
}