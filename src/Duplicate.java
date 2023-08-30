import java.util.ArrayList;
import java.util.List;

public class Duplicate {
    public static void main(String[] args){
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("Combination");
        printDuplicateCharacters("Java");
    }

    private static void printDuplicateCharacters(String combination) {
        char[] charArray = combination.toCharArray();
        StringBuilder ff = new StringBuilder();
        for(int i = 0; i < charArray.length; i++){
            String rr = String.valueOf(charArray[i]);
            String j = combination.replaceFirst(rr,"");
            if (j.contains(rr)){
                ff.append(rr);
            }
        }
        System.out.println(ff);

    }
}
