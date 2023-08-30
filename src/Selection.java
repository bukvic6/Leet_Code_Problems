public class Selection {
    public static void main(String[] args){
        int[] intArray = {20,35,-15,7,55,1,-22};
        for(int i = 0;i < intArray.length -1 ; i++){
            int min = i;
            for(int j = i + 1; j < intArray.length ;j++ ){
                if(intArray[min] > intArray[j]){
                    min = j;
                }

            }
            swap(intArray, i, min);
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
