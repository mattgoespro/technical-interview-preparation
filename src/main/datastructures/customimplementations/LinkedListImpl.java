package datastructures.customimplementations;

public class LinkedListImpl {
  static class Node {
    int data;
    Node next = null;

    public Node(int data) {
      this.data = data;
    }

    void appendToTail(int d) {
      Node end = new Node(d);
      Node n = this;
      while (n.next != null) {
        n = n.next;
      }
      n.next = end;
    }
  }
}
