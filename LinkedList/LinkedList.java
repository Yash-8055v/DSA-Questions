package LinkedList;

public class LinkedList {
  public static class Node {
  
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  // Adding Node at start
  public void addFirst(int data) {
    // step 1: create new node
    Node newNode = new Node(data);

    if(head == null) {
      head = tail = newNode;
      return;
    }

    // step 2: newNode next = head
    newNode.next = head;

    // step 3: head = newNode
    head = newNode;
  }

  // Adding Node at Last
  public void addLast(int data) {
    // step 1: create new node
    Node newNode = new Node(data);

    if(head == null) {
      head = tail = newNode;
      return;
    }

    // step 2: 
    tail.next = newNode;

    // step 3: 
    tail = newNode;
  }

  // Printing LL
  public void printLL() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
  }
}