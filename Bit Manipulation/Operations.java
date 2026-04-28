public class Operations {
    
    public static int getIthBit(int num, int i){
        int bitMask = 1 << i;
        if((num & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int num, int i){
        int bitMask = 1 << i;
        return num | bitMask;

    }

    public static int clearIthBit(int num, int i){
        int bitMask = ~(1 << i);
        return num & bitMask;

    }

    public static int updateIthBit(int num, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(num, i);
        // }else{
        //     return setIthBit(num, i);
        // }

        // Other approach
        num = clearIthBit(num, newBit);
        int BitMask = newBit << i;
        return num | BitMask; 
    }

    public static int clearIBits(int num, int i){
        int BitMask = (~0) << i;
        return num & BitMask;
    }

    public static void main(String[] args) {
        
       System.out.println( getIthBit(10, 1));
       System.out.println(setIthBit(10, 2));
       System.out.println(clearIthBit(10, 1));
       System.out.println(updateIthBit(10, 2, 0));
    }
}
