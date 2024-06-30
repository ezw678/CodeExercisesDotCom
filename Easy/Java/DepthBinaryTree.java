// Write a method that returns the maximum depth of a binary tree. The maximum depth
// is the number of nodes from the root (inclusive) until the furthest node (inclusive).

public class DepthBinaryTree {
  static TreeNode root;

  public static void main(String[] args) {
    root = new TreeNode();
    root.addLeft(new TreeNode());
    root.addRight(new TreeNode());
    root.left().addLeft(new TreeNode());

    System.out.println(depthBinaryTree(root));
    // output: 3
  }

  public static Integer depthBinaryTree(TreeNode node) {
    if (node == null) return 0;

    return 1 + Math.max(depthBinaryTree(node.left()), depthBinaryTree(node.right()));
  }

}

class TreeNode {
  private TreeNode _left;
  private TreeNode _right;

  public TreeNode () {
    _left = _right = null;
  }

  public TreeNode right () {
    return this._right;
  }

  public TreeNode left () {
    return this._left;
  }

  public void addRight (TreeNode node) {
    this._right = node;
  }

  public void addLeft (TreeNode node) {
    this._left = node;
  }
}
