class Solution {
    public String getPermutation(int n, int k) {
        //her given n=3 in first example 
        //and so we have have generate a no when will be ther for n=3
        // for that when we take out permutation of of that number so we have to take kth permuation from that 
        //so here we will be generating number from n for which we have to find kth permutation
        //so from there we store number in list and getiing what will be permuatution for rest of string if we take one string from that 
        // like in 123 we take 1+{2,3} as permutation from which we can generate 2 perumatation 
        //so we have to find the for rest of element also like 2+{1,3} and 3+{1,2}
        //that why fact is 2 in first time
        //so ans contians 123 and we take one string empty to stopre kth permutation
        //and as we are following 0th based indexing so we kept k reduced by 1
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
            //now doing k/fact for first time that is 2/2=1 so element at 1 index is 2 so add in string
            //{2} and and removing that element from list so that list size get reduced to get exact element
            //checking if size of liost is zero then break beacuse in thatg point of time we canniot gett any element from there
            arr=arr+ans.get(k/fact);
            ans.remove(k/fact);
            if(ans.size()==0){
                break;
            }
            //after that restroing k so that we get second eleemnt of permutation
            //k=2%2=0 so now k=0
            k=k%fact;
            // and now also reducing rest element perumation size as before and now only one eleemnt is left in permutation to som also reducing fact size fact=2/2=1 like two element in list is left 
            // so taking 1+{2}-no of permutataion is 1 and 2+{1}-no of permuation is one 
            // so fact size is recduce to one
            //now again get k/fact element that is 0 th index element that is 1 now string contians {2,1} and remove that element and again all steps happen.  so now k=0 and fact=1 and adding element {2,1,3}
            fact=fact/ans.size();
        }
        return arr;
    }
}