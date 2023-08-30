public class Insertion {
    public static void main(String[] args) {
        int[] array = { 3,4,7,-11,9,49};

        for(int i = 1; i < array.length; i++){
            int term = array[i];
            int j = i-1;
            // index 0
            //3>1
            while(j>= 0 && array[j] > term){
                // 3 -> ind 1
                array[j+1]=array[j];
                j--;
            }
            //ind 0 -> 1

            array[j+1] = term;

        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }


}
