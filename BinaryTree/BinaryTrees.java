package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
  
  static class  Node {
  
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // Build tree preorder
  // TC: O(n)

  static class BinaryTree {
  
    static int idx = -1;
    public static Node buildTree(int nodes[]) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }

      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;


    }

     // preorder traversal
    // TC: O(n)
    public static void preorder(Node root) {

      if (root == null) {
        System.out.print("-1 ");
        return;
      }

      System.out.print(root.data + " ");
      preorder(root.left);
      preorder(root.right);
    } 

    // inorder traversal
    // TC: O(n)
    public static void inorder(Node root) {

      if (root == null) {
        System.out.print("-1 ");
        return;
      }

      inorder(root.left);

      System.out.print(root.data + " ");
      
      inorder(root.right);
    } 

    // postorder traversal
    // TC: O(n)
    public static void postorder(Node root) {

      if (root == null) {
        System.out.print("-1 ");
        return;
      }

      preorder(root.left);
      preorder(root.right);
      System.out.print(root.data + " ");
      
      
    } 

    


  }



  public static void main(String[] args) {
    int nodes[] = {1, 2, 3, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    Node root = BinaryTree.buildTree(nodes);
    // BinaryTree.preorder(root);
    Node root1 = new Node(1);
    root1.left = new Node(2);
    root1.right = new Node(3);
    root1.left.left = new Node(4);
    root1.left.right = new Node(5);
    root1.right.left = new Node(6);
    root1.right.right = new Node(7);

  
  }
}
