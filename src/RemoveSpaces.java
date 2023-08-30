public class RemoveSpaces {
    public static void main(String[] args){
        String word  = "Ahaa nana ha";

        System.out.println(removeSpace(word));
    }
    public static String removeSpace(String word){
        StringBuilder output = new StringBuilder();
        for(int i=0; i<word.length();i++){
            char ch = word.charAt(i);
            if(!Character.isWhitespace(ch)){
                output.append(ch);
            }

        }
        return  output.toString();
    }
}
