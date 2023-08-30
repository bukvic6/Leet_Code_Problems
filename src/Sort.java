public class Sort {
    public static void main(String[] args){
        System.out.println(factorijel(2));


    }
    public static long factorijel (long n){
        //
        long factorijel = 1;
        while (n>0){
            factorijel = factorijel * n;
            n--;
        }
        return  factorijel;

    }
}
