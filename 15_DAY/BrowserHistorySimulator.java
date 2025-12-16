// BrowserHistorySimulator.java
class DNode {
  String url;
  DNode prev, next;

  DNode(String u) {
    url = u;
    prev = next = null;
  }
}

class BrowserHistory {
  private DNode current;

  // visit a new page: add at end after current, and make it current
  void visit(String url) {
    DNode node = new DNode(url);
    if (current == null) {
      current = node;
      return;
    }
    // drop forward history
    current.next = null;
    node.prev = current;
    current.next = node;
    current = node;
  }

  // go back 1 page
  boolean back() {
    if (current != null && current.prev != null) {
      current = current.prev;
      return true;
    }
    return false; // no back available
  }

  // go forward 1 page
  boolean forward() {
    if (current != null && current.next != null) {
      current = current.next;
      return true;
    }
    return false; // no forward available
  }

  String getCurrent() {
    return current == null ? "No pages visited" : current.url;
  }

  // utility: print full history from head to tail, indicating current
  void printFullHistory() {
    // find head
    if (current == null) {
      System.out.println("[empty history]");
      return;
    }
    DNode head = current;
    while (head.prev != null)
      head = head.prev;
    // iterate and print
    DNode it = head;
    StringBuilder sb = new StringBuilder();
    while (it != null) {
      if (it == current)
        sb.append("[").append(it.url).append("]"); // mark current
      else
        sb.append(it.url);
      if (it.next != null)
        sb.append(" -> ");
      it = it.next;
    }
    System.out.println(sb.toString());
  }
}

public class BrowserHistorySimulator {
  public static void main(String[] args) {
    BrowserHistory bh = new BrowserHistory();

    // Flow example:
    bh.visit("Google");
    bh.visit("YouTube");
    bh.visit("LinkedIn");
    System.out.print("Visited: ");
    bh.printFullHistory(); // Current at LinkedIn

    // Back -> Current: YouTube
    bh.back();
    System.out.println("After Back -> Current: " + bh.getCurrent());
    bh.printFullHistory();

    // Back -> Current: Google
    bh.back();
    System.out.println("After Back -> Current: " + bh.getCurrent());
    bh.printFullHistory();

    // Forward -> Current: YouTube
    bh.forward();
    System.out.println("After Forward -> Current: " + bh.getCurrent());
    bh.printFullHistory();

    // Additional demo: visit new page after going back (drops forward history)
    bh.visit("StackOverflow");
    System.out.println("After visiting StackOverflow (drops forward history): " + bh.getCurrent());
    bh.printFullHistory();
  }
}
