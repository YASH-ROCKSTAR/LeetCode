class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            ans.add(i);
        }
        //adding nth element
        ans.add(n);
        //taking string for storing ans;
        String arr="";
        //we are using 0th based indexing so
        k=k-1;
        while(true){
            //getting k/fact index no into ans string
            arr=arr+ans.get(k/fact);
                //removing that number from array to decrease size
            ans.remove(k/fact);
            //if array is empty then
            if(ans.size()==0){
                break;
            }
            //getting next value from here fro string
            k=k%fact;
            //getting new fact value;
            fact=fact/ans.size();
        }
        return arr;
        
    }
}