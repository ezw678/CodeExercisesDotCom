// A binary tree is complete when all levels apart from the last are filled and all
// leaf nodes in the last level are aligned to the left. Write a method that checks
// if a binary tree is complete.
// TreeNode API methods: node.left() and node.right().

public class IsCompleteTree {
  static TreeNode root;

  public static void main(String[] args) {
    root = new TreeNode();
    root.addLeft(new TreeNode());
    root.addRight(new TreeNode());
    root.left().addLeft(new TreeNode());
    root.right().addLeft(new TreeNode());
    // N(N1(N11,),N2(N21))

    System.out.println(isCompleteTree(root));
    // output: false
  }

  public static Boolean isCompleteTree(TreeNode node) {
    if (node == null) return true;

    int totalNodes = getTotalNodes(node);

    return isCompleteTree(node, 0, totalNodes);
  }

  static boolean isCompleteTree(TreeNode node, int index, int totalNodes) {
    if (node == null) return true;

    if (index >= totalNodes)
      return false;

    return isCompleteTree(node.left(), 2 * index + 1, totalNodes) &&
           isCompleteTree(node.right(), 2 * index + 2, totalNodes);
  }

  static int getTotalNodes(TreeNode node) {
    if (node == null) return 0;

    return 1 + getTotalNodes(node.left()) + getTotalNodes(node.right());
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
