
import java.lang.StringBuilder;
public class Javastringbuilder {
    public static void main(String[] args) {
        StringBuilder sbu = new StringBuilder("");
        for(char i = 'a'; i <= 'z'; i++){
            sbu.append(i);
        }
        System.out.println(sbu.length());
    }
}
