import java.util.Random;

public class Quickkki {
    public static void main(String[] args){
        Random rand = new Random();
        int[]  array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Before");
        printArray(array);
        quickSorti(array, 0, array.length - 1);
        System.out.println("After");
        printArray(array);
    }
    //lovest  4 7 8 3 pivot 4 5 highest
    private static void quickSorti(int[] array, int lowestIndex, int highestIndex){
        if(lowestIndex >= highestIndex){
            return;
        }
        int pivot = array[highestIndex];
        int low = lowestIndex;
        int high = highestIndex;
        while(low<high){
            while (low<high && array[low] <= pivot){
                low++;
            }
            while (low<high && array[high] >= pivot){
                high--;
            }
            swap(array, low, high);
        }
        swap(array, low, highestIndex);
        quickSorti(array,lowestIndex,low-1);
        quickSorti(array,low+1, highestIndex);

    }
    private static void swap(int[] array, int low, int high){
        int term = array[low];
        array[low] = array[high];
        array[high] = term;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }

}
