// Perfect Binary Tree Check
// A binary tree is perfect when all levels are complete.
// Write a method that checks if a binary tree is perfect.
// TreeNode API methods: node.left() and node.right().

public class IsPerfectTree {
  static TreeNode root;

  public static void main(String[] args) {
    root = new TreeNode();
    root.addLeft(new TreeNode());
    root.addRight(new TreeNode());
    root.left().addLeft(new TreeNode());
    root.left().addRight(new TreeNode());
    root.left().left().addLeft(new TreeNode());
    root.left().left().addRight(new TreeNode());
    root.right().addLeft(new TreeNode());
    root.right().addRight(new TreeNode());
    // N(N1(N11(N111,N112),N12),N2(N21,N22))

    System.out.println(isPerfectTree(root));
    // output: false
  }

  public static Boolean isPerfectTree(TreeNode node) {
    if (node == null) return true;

    // won't work by itself but more efficient than checking depth is condition met
    if ((node.left() == null && node.right() != null) || (node.left() != null && node.right() == null))
      return false;

    if (leftDepth(node.left()) != rightDepth(node.right()))
      return false;

    return isPerfectTree(node.left()) && isPerfectTree(node.right());
  }

  static int leftDepth(TreeNode node) {
    if (node == null) return 0;

    return 1 + leftDepth(node.left());
  }

  static int rightDepth(TreeNode node) {
    if (node == null) return 0;

    return 1 + rightDepth(node.right());
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
