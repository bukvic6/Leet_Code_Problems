public class palindrome {
    public static void main(String[] args){
        String word = "anna";
        System.out.println(check(word));


    }
    public static boolean check (String word){
        StringBuilder strinng = new StringBuilder();
        for(int i = word.length(); i >= 0; i--){
            System.out.println(word.length());
            System.out.println(word.length() -1);
            strinng.append(i);
        }
        if (word.equals(strinng)){
            return true;
        }else
            return false;

    }

}
