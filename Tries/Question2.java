package Tries;

// Q2: Prefix Problem 
// TC: O(L) where L is the length of the longest word
public class Question2 {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    // Function to find the shortest unique prefix
    public static String findPrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';
            
            prefix.append(ch);
            
            // If the character frequency is 1, it means this path is unique
            if (curr.children[idx].freq == 1) {
                return prefix.toString();
            }
            
            curr = curr.children[idx];
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        
        // Step 1: Insert all words into the Trie
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        
        // Step 2: Find and print the shortest unique prefix for each word
        System.out.println("Shortest Unique Prefixes:");
        for (int i = 0; i < arr.length; i++) {
            String prefix = findPrefix(arr[i]);
            System.out.println(arr[i] + " -> " + prefix);
        }
    }
}
