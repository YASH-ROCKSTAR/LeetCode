/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> li=new ArrayList<>();
        
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return li;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> arr=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                arr.add(temp.val);
                
                for(Node c:temp.children){
                    q.offer(c);
                }
            }li.add(arr);
        }
        return li;
    }
}