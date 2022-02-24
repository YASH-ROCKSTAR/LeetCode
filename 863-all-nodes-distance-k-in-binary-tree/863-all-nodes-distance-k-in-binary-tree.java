/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void marknode(TreeNode root,Map<TreeNode,TreeNode> parenttrack,TreeNode target){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur.left!=null){
                parenttrack.put(cur.left,cur);
                q.offer(cur.left);
            }
            if(cur.right!=null){
                parenttrack.put(cur.right,cur);
                q.offer(cur.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        marknode(root,parent,root);
        Map<TreeNode,Boolean> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(target);
        visited.put(target,true);
        int dis=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(dis==k) break;
            dis++;
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                if(current.left!=null && visited.get(current.left)==null){
                    q.offer(current.left);
                    visited.put(current.left,true);
                }
                if(current.right!=null && visited.get(current.right)==null){
                    q.offer(current.right);
                    visited.put(current.right,true);
                }
                if(parent.get(current)!=null && visited.get(parent.get(current))==null){
                    q.offer(parent.get(current));
                    visited.put(parent.get(current),true);
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            res.add(curr.val);
        }
        return res;           
    }
}