public class plusOne {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int lastOne = arr.length - 1;
        System.out.println(lastOne);
        if(arr[lastOne]< 9){
            arr[lastOne] = arr[lastOne] + 1;
        }
        else{
            int[] newArr = new int[arr.length + 1];
            int last = newArr.length - 1;
            while(arr[lastOne] == 9){
                newArr[last] = 0;
                lastOne--;
            }
            System.out.println();
        }
        System.out.println(arr);
    }
}
