public class _450_Delete_Node_in_a_BST {
	public static TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) return null;
		if (key > root.val) root.right = deleteNode(root.right, key);
		else if (key < root.val) root.left = deleteNode(root.left, key);
		else {
			// 1. leaf node
			if (root.left == null && root.right == null) return null;
			// 2. 1 child
			else if (root.left != null && root.right == null) return root.left;
			else if (root.left == null && root.right != null) return root.right;
			// 3. 2 child
			else {
				TreeNode leftMostNode = findLeftMostNode(root.right, root);
				root.val = leftMostNode.val;
			}
		}
		
		return root;
	}

	private static TreeNode findLeftMostNode(TreeNode root, TreeNode parent) {
		TreeNode pre = parent, cur = root;
		while(cur.left != null) {
			pre = cur;
			cur = cur.left;
		}
		deleteNode(pre, cur.val);
		return cur;
	}
}
