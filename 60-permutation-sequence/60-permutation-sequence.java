class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            ans.add(i);
        }
        ans.add(n);
        String arr="";
        k=k-1;
        while(true){
            arr=arr+ans.get(k/fact);
            ans.remove(k/fact);
            if(ans.size()==0){
                break;
            }
            
            k=k%fact;
            fact=fact/ans.size();
        }
        return arr;
    }
}