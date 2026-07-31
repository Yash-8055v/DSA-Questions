
import java.util.PriorityQueue;

public class Temp {
    public static  String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        PriorityQueue<Character> pq = new PriorityQueue<>();
        
        
        
        for(int i = 0; i < s.length() / 2; i++) {
            pq.add(s.charAt(i));
        }

        while(!pq.isEmpty()){
            sb.append(pq.remove());
        }
        
        
        String result = sb.toString();
        String reverse = sb.reverse().toString();
        

        if(s.length() % 2 == 0) {
            result += reverse;
        } else {
            result += s.charAt(s.length() / 2);
            result += reverse;
        }

        return result;

    }

    public static void main(String[] args) {
        String str = "daccad";
        System.out.println(smallestPalindrome(str));
    }
}
