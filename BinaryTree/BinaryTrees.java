package BinaryTree;

import java.util.HashMap;
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

    // Level Order Traversal
    // TC: O(n)
    public static void levelOrder(Node root) {
      if (root == null) {
        return;
      }

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while (!q.isEmpty()) {
        Node currNode = q.remove();
        if (currNode == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;
          }else {
            q.add(null);
          }
        }else{
          System.out.print(currNode.data + " ");
          if (currNode.left != null) {
            q.add(currNode.left);
          }
          if (currNode.right != null) {
            q.add(currNode.right);
          }
        }

      }

      
    }

    

  }

  
 // Height of a tree
    public static int height(Node root){
      if(root == null) {
        return 0;
      }

      int lh = height(root.left);
      int rh = height(root.right);
      return Math.max(lh, rh) + 1;


    }

    // Diameter of a tree Approach 1: TC: O(n^2)
    public static int diameter(Node root) {
      if (root == null) {
        return 0;
      }

      int leftDiam = diameter(root.left);
      int leftHt = height(root.left);
      int rightDiam = diameter(root.right);
      int rightHt = height(root.right);

      int selfDiam = leftHt + rightHt + 1;

      return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }


    // Diameter of a tree Approach 2: TC: O(n)
    static class  Info {
    
      int diam;
      int ht;

      public Info(int diam, int ht) {
        this.diam = diam;
        this.ht = ht;
      }


    }
    public static Info diameter2(Node root) {

      if (root == null) {
        return new Info(0, 0);
      }

      Info leftInfo = diameter2(root.left);
      Info rightInfo = diameter2(root.right);

      int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);

      int ht = Math.max(leftInfo.ht, rightInfo.ht);

      return new Info(diam, ht);
    }


    // Subtree of another Tree
    
    public static boolean isIdentical(Node node, Node subRoot) {
      if (node == null && subRoot == null) {
        return true;
      } else if (node == null || subRoot == null || node.data != subRoot.data)  {
        return false;
      }

      if (!isIdentical(node.left, subRoot.left)) {
        return false;
      }

      if (!isIdentical(node.right, subRoot.right)) {
        return false;
      }

      return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
      if (root == null) {
        return false;
      }

      if (root.data == subRoot.data) {
        if (isIdentical(root, subRoot)) {
          return true;
        }
      }

      
      

      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Top View of a Tree
    static class Info2 {
      Node node;
      int hd;

      public Info2(Node node, int hd) {
        this.node = node;
        this.hd = hd;
      }
    }

    public static void topView(Node root) {
      // level order 
      Queue<Info2> q = new LinkedList<>();
      HashMap<Integer, Node> map = new HashMap<>();

      int min = 0, max = 0; 
      q.add(new Info2(root, 0));
      q.add(null);

      while (!q.isEmpty()) {
        Info2 curr = q.remove();
        if (curr == null) {
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        } else {
          if (!map.containsKey(curr.hd)) {
          map.put(curr.hd, curr.node);
        }

        if (curr.node.left != null) {
          q.add(new Info2(curr.node.left, curr.hd - 1));
          min = Math.min(min, curr.hd-1);
        }

        if (curr.node.right != null) {
          q.add(new Info2(curr.node.right, curr.hd+1));
          max = Math.max(max, curr.hd+1);
        }
        }

        
      }

      for(int i = min; i <= max; i++) {
        System.out.print(map.get(i).data + " ");
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
