public class Fib {
    public static void main(String[] args){
        printFibonachui(10);
    }
    public static void printFibonachui(int num){
        int a = 0;
        int b = 1;
        int counter = 0;

        while (counter < num){
            System.out.println(a + ", ");
            int term = b + a;
            a = b;
            b = term;
            counter = counter + 1;
        }


    }
}
