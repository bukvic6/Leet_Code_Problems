public class ReverseString {
    public static void main(String[] args){
        String str = "1234";
        System.out.println(reverse(str));

    }
    public static String reverse(String str){
        if(str == null){
            throw new IllegalArgumentException("Null is not valid");

        }
        StringBuilder stringg = new StringBuilder();
        char[] cha = str.toCharArray();
        for(int i = cha.length -1; i >= 0; i--){
            stringg.append(cha[i]);
        }
        return stringg.toString();
    }


}
