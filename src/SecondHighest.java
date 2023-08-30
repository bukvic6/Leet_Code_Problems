public class SecondHighest {
    public static void main(String[] args){
        int[] array = {10,19,6};
        int highest = array[0];
        int secondHiy = 0;

        for(int i = 1; i<array.length; i++){
            int j = array[i];
            if (j > highest) {
                secondHiy = highest;
                highest = j;
            } else if (j > secondHiy){
                secondHiy = j;
            }

        }
        System.out.println(secondHiy);
    }
}
