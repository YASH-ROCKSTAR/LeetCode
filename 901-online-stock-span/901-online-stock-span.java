class StockSpanner {
    ArrayList<Integer> li;
    Stack<Integer> st=new Stack<>();
    int i;
    public StockSpanner() {
        li=new ArrayList<>();
        st=new Stack<>();
        i=0;
    }
    public int next(int price) {
        int c=0;
        li.add(price);
        while(st.size()>0 && price>=li.get(st.peek())){
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