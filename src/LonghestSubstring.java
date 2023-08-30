import java.util.HashSet;
import java.util.Set;

public class LonghestSubstring {
    public static void main(String[] args){
        String jk = "pwwkew";
        Set<Character> sett = new HashSet<>();

        int j = 0;
        int longest = 0;
        for(int i = 0; i<jk.length() - 1; i++){
            while (!sett.contains(jk.charAt(i))) {
                sett.add(jk.charAt(i));
                longest++;
            }


        }
        System.out.println(j);
    }
}
