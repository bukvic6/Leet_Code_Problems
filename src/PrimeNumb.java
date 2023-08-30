public class PrimeNumb {
    public static void main(String[] args){
        System.out.println(isPrime(13));
        System.out.println(isPrime(14));
        System.out.println(isPrime(0));



    }
    public static String isPrime(int num){
        if (num == 0 || num == 1){
            return "Broj je neparan";
        }
        else if (num == 2 ){
            return " Broj je paran";
        }
        if (num % 2 == 0){
            return "broj je paran";
        }
        return "broj je neparan";

    }
}
