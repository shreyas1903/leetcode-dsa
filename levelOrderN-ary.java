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
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ds = new LinkedList<>();
        if(root == null) return ds;
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            ArrayList<Integer> sublist = new ArrayList<>();
            for(int i =0;i < n;i++){
                Node temp = queue.poll();
                queue.addAll(temp.children);
                sublist.add(temp.val);
                
            }
            ds.add(sublist);
            
        }
        return ds;
    }
}
