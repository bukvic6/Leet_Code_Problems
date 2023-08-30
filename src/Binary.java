import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary {
    public static void main(String[]  args){
        int array[] = new int[100];
        int target = 42;
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        int index = binarySearch(array,target);
        if(index == -1){
            System.out.println("element now found");
        }
        else{
            System.out.println(index);
    }}

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int middle = low + (high - low)/2;
            int middlenumber = array[middle];
            if (middlenumber == target) return middlenumber;
            else if (target<middlenumber) high = middle - 1;
            else if (target>middlenumber) low = middle + 1;
        }
        return -1;

    }
}
