// Count the number of leaf nodes in a binary tree

public class CountLeafNodes {
  static TreeNode root;

  public static void main(String[] args) {
    root = new TreeNode();
    root.addLeft(new TreeNode());
    root.addRight(new TreeNode());
    root.left().addLeft(new TreeNode());

    System.out.println(countLeafNodes(root));
    // output: 2
  }

  public static Integer countLeafNodes(TreeNode node) {
    if (node == null) return 0;

    if (node.left() == null && node.right() == null)
      return 1;

    return countLeafNodes(node.left()) + countLeafNodes(node.right());
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
