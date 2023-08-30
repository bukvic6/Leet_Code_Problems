public class Vowel {
    public static void main(String[] args){
        System.out.println(checkIfContains("ll"));
    }
    public static String checkIfContains(String word){
        if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o")){
            return "Word contains vowel";
        } else{
            return "Word does not contains vowel";
        }

    }
}
