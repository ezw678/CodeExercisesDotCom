// Write a method that returns the number of nodes in a binary tree.
// TreeNode API methods: node.left() and node.right().

public class GetNumberOfNodes {
  static TreeNode root;

  public static void main(String[] args) {
    root = new TreeNode();
    root.addLeft(new TreeNode());
    root.addRight(new TreeNode());
    root.left().addLeft(new TreeNode());
    root.right().addLeft(new TreeNode());

    System.out.println(getNumberOfNodes(root));
    // output: 5
  }

  public static Integer getNumberOfNodes(TreeNode node) {
    if (node == null)
      return 0;

    return 1 + getNumberOfNodes(node.left()) + getNumberOfNodes(node.right());
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
