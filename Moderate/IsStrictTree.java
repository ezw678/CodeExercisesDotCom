// Strict Binary Tree Check
// A binary tree is strict when all nodes have either two or zero child nodes.
// Write a method that checks if a binary tree is strict.
// TreeNode API methods: node.left() and node.right().

public class IsStrictTree {
  static TreeNode root;

  public static void main(String[] args) {
    root = new TreeNode();
    root.addLeft(new TreeNode());
    root.addRight(new TreeNode());
    root.left().addLeft(new TreeNode());
    root.left().addRight(new TreeNode());
    // N(N1(N11,N12),N2)

    System.out.println(isStrictTree(root));
    // output: true
  }

  public static Boolean isStrictTree(TreeNode node) {
    if (node == null)
      return true;

    if ((node.left() == null && node.right() != null) || (node.left() != null && node.right() == null))
      return false;

    return isStrictTree(node.left()) && isStrictTree(node.right());
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

