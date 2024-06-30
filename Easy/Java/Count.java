// Count the number of nodes in a list.
// ListNode API methods: node.next().

public class Count {
  static ListNode head;

  public static void main(String[] args) {
    head = new ListNode();
    head.addNext(new ListNode());
    head.next().addNext(new ListNode());
    head.next().next().addNext(new ListNode());
    head.next().next().next().addNext(new ListNode());

    System.out.println(count(head));
    // output: 5
  }

  public static Integer count(ListNode node) {
    if (node == null) return 0;

    return 1 + count(node.next());
  }

}

class ListNode {
  private ListNode _next;

  public ListNode () {
    _next = null;
  }

  public ListNode next () {
    return this._next;
  }

  public void addNext (ListNode node) {
    this._next = node;
  }
}

