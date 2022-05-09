class StockSpanner {
    ArrayList<Integer> li;
    Stack<Integer> st;
    int i;
    public StockSpanner() {
        st=new Stack<>();
        li=new ArrayList<>();
        i=0;
    }
    
    public int next(int arr) {
        int c=0;
        li.add(arr) ;
        while(st.size()>0 && arr>=li.get(st.peek())){
                st.pop();
        }
        if(st.size()==0){
            c=i+1;
        }else{
            c=i-st.peek();
        }
        st.push(i);
        i++;
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
