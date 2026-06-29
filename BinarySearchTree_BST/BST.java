package BinarySearchTree_BST;

import java.util.ArrayList;

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

  // Delete a node in BST
  // TC: O(H)
  public static Node findInorderSuccessor(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }


  public static Node delete(Node root, int val) {
    if (root.data < val) {
      root.right = delete(root.right, val);
    }else if (root.data > val) {
      root.left = delete(root.left, val);
    }else {
      // case 1: leaf node
      if (root.left == null && root.right == null) {
        return null;
      }

      // case 2: single child
      if (root.left == null) {
        return root.right;
      }else if (root.right == null) {
        return root.left;
      }

      // case 3: two children
      Node IS = findInorderSuccessor(root.right);
      root.data = IS.data;
      root.right = delete(root.right, IS.data);
    }

    return root;
  }

  // Print in Range
  public static void printInRange(Node root, int k1, int k2) {
    if (root == null) {
      return;
    }

    if (root.data >= k1 && root.data <= k2) {
      printInRange(root.left, k1, k2);;
      System.out.print(root.data + " ");
      printInRange(root.right, k1, k2);
    }else if(root.data < k1) {
      printInRange(root.left, k1, k2);
    }else {
      printInRange(root.right, k1, k2);
    }
  }


  // Root to Leaf Paths
  public static void printPath(ArrayList<Integer> path) {
    for(int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + " -> ");
    }
    System.out.println("Null");
  }
  public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
    if(root == null) {
      return;
    }

    if(root.left == null && root.right == null) {
      printPath(path);
    }

    path.add(root.data);
    printRoot2Leaf(root.left, path);
    printRoot2Leaf(root.right, path);
    path.remove(path.size() - 1);
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  // Check valid BST
  public static boolean isValidBST(Node root, Node min, Node max) {
    if (root == null) {
      return true;
    }

    if (min != null && root.data <= min.data) {
      return false;
    }

    else if (max != null && root.data >= max.data) {
      return false;
    }

    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
  }

  // Mirror a BST
  // TC: O(n) , SC: O(H)
  public static Node mirrorBST(Node root) {
    if (root == null) {
      return null;
    }

    Node temp = root.left;
    root.left = root.right;
    root.right = temp;
    mirrorBST(root.left);
    mirrorBST(root.right);
    return root;
  }

  // Sorted array to Balanced BST
  // TC: O(n)
  public static Node createBST(int[] arr, int st, int ed) {
    if (st > ed) {
      return null;
    }

    int mid = (int) (st+ed)/2;

    Node root = new Node(arr[mid]);

    root.left = createBST(arr, st, mid-1);
    root.right = createBST(arr, mid+1, ed);

    return root;
  }
  
  // Convert BST to balanced BST
  // TC: O(n)
  public static void getInorder(Node root, ArrayList<Integer> inorder) {
    if (root == null) {
      return;
    }

    getInorder(root.left, inorder);
    inorder.add(root.data);
    getInorder(root.right, inorder);
  }

  public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
    if(st > end) {
      return null;
    }

    int mid = (st+end)/2;
    Node root = new Node(inorder.get(mid));
    root.left = createBST(inorder, st, mid-1);
    root.right = createBST(inorder, mid+1, end);
    return root;
  }
  public static Node balanceBST(Node root) {
    // inorder seq - O(n)
    ArrayList<Integer>  inorder = new ArrayList<>();
    getInorder(root, inorder);

    // sorted inorder -> balanced BST - O(n)
    root = createBST(inorder, 0, inorder.size() - 1);
    return root;
  }

  public static void main(String[] args) {
    int values[] = {3, 5, 6, 8, 10, 11, 12, 13};
    // Node root = null;

    // for(int i = 0; i < values.length; i++) {
    //   root = insert(root, values[i]);
    // }

    // inorder(root);

    // System.out.println("\n" + search(root, 3));
    // paths(root);

    // mirrorBST(root);
    Node root = createBST(values, 0, values.length-1);
    inorder(root);
  }
}
