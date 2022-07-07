class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            while(i<j && !vowel(arr[i])) i++;
            while(i<j && !vowel(arr[j])) j--;
            
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
    public boolean vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            return true;
        
        return false;
    }
}