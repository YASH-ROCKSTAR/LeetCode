class Solution {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i+=2*k){
            int l=i , j=Math.min(i+k-1,ch.length-1);
               while(l<j){
                   char temp=ch[l];
                   ch[l]=ch[j];
                   ch[j]=temp;
                   l++;
                   j--;
               }
        }
        return new String(ch);
        
    }
}