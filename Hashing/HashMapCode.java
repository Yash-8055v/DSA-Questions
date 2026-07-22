import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> { // generic
        private  class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    

    private  int n; //n
    private  int N;
    private LinkedList<Node> buckets[]; //N

    @SuppressWarnings("unchecked")
    public HashMap() {
        this.N= 4;
        this.buckets = new LinkedList[4];
        for(int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % N;
    }

    private int searchInLL(K key, int bi) {
        LinkedList<Node> ll = buckets[bi];
        int di = 0;

        for(int i = 0; i < ll.size(); i++){
            Node node = ll.get(i);
            if(node.key == key) {
                return di;
            }
            di++;
        }
        return -1;
    }

    private void rehash() {
        LinkedList<Node> oldBucket[] = buckets;
        buckets = new LinkedList[N*2];
        N = N*2;
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        for(int i = 0; i < oldBucket.length; i++) {
            LinkedList<Node> ll = oldBucket[i];
            for(int j = 0; j < ll.size(); j++) {
                Node node = ll.remove();
                put(node.key, node.value);
            }
        }
    }

    // TC: O(1)
    public void put(K key, V value) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if(di != -1) {
            Node node = buckets[bi].get(di);
            node.value = value;
        }else {
            buckets[bi].add(new Node(key, value));
            n++;
        }

        double lambda = (double) n/N;
        if(lambda > 2.0) { // threshold value can be anything
            rehash();
        }
    }

    // TC: O(1)
    public boolean containsKey(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if(di != -1) {
            return true;
        }else {
            return false;
        }

    }

    // TC: O(1)
    public V get(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if(di != -1) {
            Node node = buckets[bi].get(di);
            return node.value;
        }else {
            return null;
        }

    }

    // TC: O(1)
    public V remove(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if(di != -1) {
            Node node = buckets[bi].remove(di);
            return node.value;
        }else {
            return null;
        }

    }
    


}

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 200);
        hm.put("china", 30);
        hm.put("US", 100);
        hm.put("UK", 50);
    }
}
