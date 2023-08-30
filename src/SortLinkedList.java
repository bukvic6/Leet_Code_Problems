import org.w3c.dom.Node;

public class SortLinkedList {
    public static void main(String[] args){
     int[] arr1 = { 1,2,5,9};
     int[] arr2 = { 4,6,9,10};
     printList(merge(arr1, arr2));


    }
    private static void printList(int[]  listToPrint){
        for(int i = 0; i < listToPrint.length; i++){
            System.out.println(listToPrint[i]);
        }
    }
    private static int[] merge(int[] arr1, int[] arr2){
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        int[] newSorted = new int[arr1Size+arr2Size];
        int i = 0, j = 0, k = 0;

        while (i < arr1Size && j < arr2Size){
            if(arr1[i]<arr2[j]){
                newSorted[k] = arr1[i];
                i++;
            } else{
                newSorted[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1Size){
            newSorted[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2Size){
            newSorted[k] = arr2[j];
            j++;
            k++;
        }
        return newSorted;

    }
}
