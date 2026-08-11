
public class Temp {
    // public static  String smallestPalindrome(String s) {
    //     StringBuilder sb = new StringBuilder("");
    //     PriorityQueue<Character> pq = new PriorityQueue<>();
        
        
        
    //     for(int i = 0; i < s.length() / 2; i++) {
    //         pq.add(s.charAt(i));
    //     }

    //     while(!pq.isEmpty()){
    //         sb.append(pq.remove());
    //     }
        
        
    //     String result = sb.toString();
    //     String reverse = sb.reverse().toString();
        

    //     if(s.length() % 2 == 0) {
    //         result += reverse;
    //     } else {
    //         result += s.charAt(s.length() / 2);
    //         result += reverse;
    //     }

    //     return result;

    // }

   

    // public static HashSet<Integer> removeSuspisiousMethods(int invocations[][], int k, int n) {
    //     HashSet<Integer> opSet = new HashSet<>();
    //     HashSet<Integer> susMethodSet = new HashSet<>();

    //     for(int i = 0; i < n; i++) {
    //         opSet.add(i);
    //     }

    //     findSuspisiousMethod(k, invocations, opSet, susMethodSet);


    // }

    // static void findSuspisiousMethod(int k,int invocations[][], HashSet<Integer> opSet, HashSet<Integer> susMethodSet){
    //     susMethodSet.add(k);
    //     int method = k;
    //     for (int[] el : invocations) {
    //         if(el[1] == k){
    //             method = el[1];
    //             susMethodSet.add(method);
    //         }
    //     }
    //     findSuspisiousMethod(method, invocations, opSet, susMethodSet);
    // }

    // TC: O(t . log10 n)
    // log10 n => no of digits in n
    // t => max no of rec steps
    public static int smallestDivisibleDigitProduct(int n, int t){
        if (n == 0) return 0;
        int copy = n, prod = 1;
        while(copy > 0) {
            int digit = copy % 10;
            
            copy /= 10;
            prod *= digit;
        }

        if(prod % t == 0) {
            return n;
        }

        return smallestDivisibleDigitProduct(n+1, t);
    }

    public static void main(String[] args) {
        // String str = "daccad";
        // System.out.println(smallestPalindrome(str));

        // int n = 5, k = 0;
        // int invocations[][] = {{1,2}, {0,2}, {0,1}, {3,4} };

        // System.out.println(removeSuspisiousMethods(invocations, k, n));

        int n = 15, t = 3;
        System.out.println(smallestDivisibleDigitProduct(n, t));
    }
}
