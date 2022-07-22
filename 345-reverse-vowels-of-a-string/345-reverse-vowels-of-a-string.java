class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            while(i<j && !vowel(c[i])) i++;
            while(i<j && !vowel(c[j])) j--;
            
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return String.valueOf(c);
    }
    public boolean vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
        
    }
}