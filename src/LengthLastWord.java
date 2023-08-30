public class LengthLastWord {
    public static void main(String[] args){
        String st = "hrr hh rr  ";
        String s = st.strip();
        System.out.println(s);

        StringBuilder newStri = new StringBuilder();
        for(int i=st.length()-1; i>=0; i--){
            if(st.charAt(i) != ' '){
                newStri.append(st.charAt(i));
            } else {
                break;
            }

        }
        System.out.println(newStri);
    }

}
