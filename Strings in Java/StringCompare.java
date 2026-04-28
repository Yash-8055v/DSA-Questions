

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony"; // It points to the s1
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(s2 == s3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(s2.equals(s3)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
