import java.util.List;
import java.util.Stack;

public class Patehenth {
    public static void main(String[] args){
        String str = "()[{}";

        Stack<Character> stak = new Stack<>();
        for(int c = 0; c< str.length();c++){
            if(str.charAt(c) == '(' || str.charAt(c) == '{' || str.charAt(c) == '['){
                stak.push(str.charAt(c));
                System.out.println(stak);
            }
            if(str.charAt(c) == ')' || str.charAt(c) == ']' || str.charAt(c) == '}'){
                if(stak.peek() == str.charAt(c)){
                    System.out.println(stak.peek());
                    stak.pop();
                } else{
                    System.out.println("ne valja");
                }

            }
        }
        System.out.println("okej jee");;
    }
}
