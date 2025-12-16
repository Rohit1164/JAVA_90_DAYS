class Node {
  int data;
  Node next;
  Node prev;

  Node(int d) {
    data = d;
    next = null;
    prev = null;
  }
}

class LinkedList {
  Node head;
  Node tail; // ← NEW: Tail maintain karna important hai!

  void push(int value) {
    Node newNode = new Node(value);

    newNode.next = head; // new node pointing to old head

    if (head != null) {
      head.prev = newNode; // old head ka prev new node
    } else {
      // list empty thi → newNode hi head & tail dono
      tail = newNode;
    }

    head = newNode; // new node becomes head
  }

  // Forward print
  void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " → ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  // Backward print
  void goBack() {
    Node temp = tail; // START from tail (last node)
    while (temp != null) {
      System.out.print(temp.data + " ← ");
      temp = temp.prev;
    }
    System.out.println("NULL");
  }
}

public class CreateLinkedList {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.push(5);
    list.push(10);
    list.push(15);
    list.push(20);

    System.out.println("Forward: ");
    list.print(); // 20 → 15 → 10 → 5 → NULL

    System.out.println("Backward: ");
    list.goBack(); // 5 ← 10 ← 15 ← 20 ← NULL
  }
}
