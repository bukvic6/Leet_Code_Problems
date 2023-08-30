import java.util.Random;

public class merge {
    public static void main(String[] args){
        Random rand = new Random();
        int[]  array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Before");
        printArray(array);
        mergesort(array);
        System.out.println("After");
        printArray(array);
    }
    private static void mergesort(int[] array){
        int inputLenght = array.length;
        if(inputLenght < 2){
            return;
        }
        int mid = inputLenght / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[inputLenght - mid];
        for(int i = 0; i < mid; i++){
            leftHalf[i] = array[i];
        }
        for(int i = mid; i < inputLenght; i++){
            rightHalf[i - mid] = array[i];
        }
        mergesort(leftHalf);
        mergesort(rightHalf);
        merge(array, leftHalf,rightHalf);


    }
    private static void merge (int[] inputArray, int[] leftHalf,int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0,j=0,k=0;
        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            } else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    private static void printArray(int[] array) {
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
