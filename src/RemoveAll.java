import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveAll {
    public static void main(String[] args){
        List<Integer> primes = new ArrayList<Integer>();

        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);  //duplicate
        primes.add(7);
        primes.add(11);

        Set<Integer> newSet = new LinkedHashSet<>(primes);
        primes.clear();
        primes.addAll(newSet);
        System.out.println(primes);



    }
}
