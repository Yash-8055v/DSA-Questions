package BinarySearchTree_BST;



public class BST {
  
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
    
  }
  // Build a BST
  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }

    if (root.data > val) {
      // left subtree
      root.left = insert(root.left, val);
    } else {
      // right subtree
      root.right = insert(root.right, val);
    }

    return root;
  }

  // Search in BST 
  // TC: O(H) height of a tree
  public static boolean search(Node root, int key) {

    if (root == null) {
      return false;
    }

    if (root.data == key) {
      return true;
    }

    if (root.data > key) {
      // search in left subtree
      return search(root.left, key);
    } else {
      // search in right subtree
      return search(root.right, key);
    }
    
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String[] args) {
    int values[] = {5, 1, 3, 4, 2, 7};
    Node root = null;

    for(int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }

    inorder(root);

    System.out.println("\n" + search(root, 3));
  }
}
