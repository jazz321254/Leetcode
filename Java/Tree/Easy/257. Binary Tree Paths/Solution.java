/**
 * 解題思路：
 * 利用DFS往下遞歸找出所有的path 
 * PS 注意要將重複的path踢除
 */

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new ArrayList<>();
        return DFSPathString(root, "", new ArrayList<>());
    }
    
    public List<String> DFSPathString(TreeNode root, String path, List<String> ls) {
        if (root == null) return null;
        path = (path.equals("")) ? String.valueOf(root.val) : path + "->" + String.valueOf(root.val);
        if (root.left == null && root.right == null) {
            if (!ls.contains(path))
                ls.add(path);
        }
        DFSPathString(root.left, path, ls);
        DFSPathString(root.right, path, ls);
        return ls;
    }
}