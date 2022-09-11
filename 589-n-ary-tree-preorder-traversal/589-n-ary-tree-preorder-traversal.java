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
    List<Integer> li=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        
        if(root==null){
            return li;
        }
        li.add(root.val);
        for(Node c:root.children){
            preorder(c);
        }
        return li;
    }
    
    
}