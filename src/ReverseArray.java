public class ReverseArray {
    public static void main(String[] args){
        int[] array = {2,5,8,4,5,8,9};
        int pocetak = 0;
        int kraj = array.length - 1;

        while(pocetak <= kraj){
            swapp(array, pocetak,kraj);
            pocetak++;
            kraj--;
        }
        printArray(array);

    }
    private static void swapp(int[] array, int pocetak,int kraj){
        int term = array[pocetak];
        array[pocetak] = array[kraj];
        array[kraj] = term;
    }
    private static void printArray(int[] array) {
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
