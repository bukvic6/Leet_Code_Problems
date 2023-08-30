import java.util.Random;


public class quickSort {
    public static void main(String[] args){
        Random rand = new Random();
        int[] numbers = new int[10];
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before: ");
        printArray(numbers);
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("After: ");
        printArray(numbers);
    }
    private static void printArray(int[] numbers){
        for(int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
    private static void quickSort(int[] array,int lowIndex, int highestIndex){
        if(lowIndex >= highestIndex){
            return;
        }
        int pivot = array[highestIndex];
        int left = lowIndex;
        int right = highestIndex;
        while (left < right){
            while (array[left] <= pivot && left < right) {
                left++;
            }
            while(array[right]>= pivot && left <right){
                right--;
            }
            swap(array, left,right);

        }
        swap(array, left, highestIndex);

        quickSort(array, lowIndex, left -1);
        quickSort(array,left +1 , highestIndex);
    }
    private static void swap(int[] array, int indeks1,int index2){
        int temp = array[indeks1];
        array[indeks1] = array[index2];
        array[index2] = temp;
    }
}
