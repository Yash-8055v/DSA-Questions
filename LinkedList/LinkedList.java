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
  public static int size;

  // Adding Node at start
  public void addFirst(int data) {
    // step 1: create new node
    Node newNode = new Node(data);
    size++;

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
    size++;

    if(head == null) {
      head = tail = newNode;
      return;
    }

    // step 2: 
    tail.next = newNode;

    // step 3: 
    tail = newNode;
  }

  // Add Node at middle
  public void add(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node prev = head;
    int i = 0;

    while(i < idx - 1) {
      prev = prev.next;
      i++;
    }

    newNode.next = prev.next;
    prev.next = newNode;
  }

  // Remove first in LL
  public int removeFirst() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    }else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  // Remove last in LL
  public int removeLast() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    }else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    Node prev = head;
    for(int i = 0; i < size - 2; i++ ) {
      prev = prev.next;
    }

    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  // Iterative Search for a key
  public int itrSearch(int key) {
    Node temp = head;
    int i = 0;

    while (temp != null) {
      if (temp.data == key)  {
        // key found
        return i;
      }
      temp = temp.next;
      i++;
    }

    // key not found
    return -1;
  }

  // Recursive Search
  public int helper(Node head, int key){
    if (head == null) {
      return -1;
    }

    if (head.data == key) {
      return 0;
    }

    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }

    return idx + 1;  
  }

  public int recSearch(int key) {
    return helper(head, key);
  }

  // Reverse a LL 
  public void reverseLL() {
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    head = prev;

  }

  // Delete nth node from end
  public void deleteNthFromEnd(int n) {
    // calculate size of LL
    int sz = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      sz++;
    }

    if (n == sz) {
      head = head.next; // if nth node is first one
      return; 
    }

    int i = 1;
    int itoFind = sz - 1;
    Node prev = head;
    while (i < itoFind) {
      prev = prev.next;
      i++;
    }
    
    prev.next = prev.next.next;
    return;
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