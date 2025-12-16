// SinglyLinkedListDemo.java
class SNode {
  int data;
  SNode next;

  SNode(int d) {
    data = d;
    next = null;
  }
}

class SinglyLinkedList {
  private SNode head;

  // append at end
  void append(int val) {
    SNode node = new SNode(val);
    if (head == null) {
      head = node;
      return;
    }
    SNode cur = head;
    while (cur.next != null)
      cur = cur.next;
    cur.next = node;
  }

  // insert at start
  void insertAtStart(int val) {
    SNode node = new SNode(val);
    node.next = head;
    head = node;
  }

  // delete first node (if exists)
  void deleteFirst() {
    if (head == null)
      return;
    head = head.next;
  }

  // print traversal
  void traversePrint() {
    SNode cur = head;
    if (cur == null) {
      System.out.println("List is empty");
      return;
    }
    StringBuilder sb = new StringBuilder();
    while (cur != null) {
      sb.append(cur.data);
      if (cur.next != null)
        sb.append(" -> ");
      cur = cur.next;
    }
    System.out.println(sb.toString());
  }
}

public class SinglyLinkedListDemo {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    // Q1: Create 5 → 10 → 15 → 20 and print
    list.append(5);
    list.append(10);
    list.append(15);
    list.append(20);
    System.out.print("Q1 Traversal: ");
    list.traversePrint(); // expected: 5 -> 10 -> 15 -> 20

    // Q2 operations:
    // Insert 3 at start
    list.insertAtStart(3);
    System.out.print("After insert 3 at start: ");
    list.traversePrint(); // expected: 3 -> 5 -> 10 -> 15 -> 20

    // Delete first node
    list.deleteFirst();
    System.out.print("After delete first node: ");
    list.traversePrint(); // expected back to: 5 -> 10 -> 15 -> 20
  }
}
