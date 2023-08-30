public class RemoveDupl {
    public static void main(String[] args){
        int[] lista = {3,2,6,7,9};
        int val = 3;
        int i = 0;
        int listaLenght = lista.length;
        int largest = lista[lista.length-1];
        int c = 0;
        while(i < listaLenght){
            if(lista[i] == val){
                lista[i] = largest;
                largest = lista[i];
                largest--;
                listaLenght--;
                c++;
            }
            i++;
        }
        System.out.println(c);
        System.out.println("------------------------------");
        //"8,3,5,7,8,2,1,1"


        for(int j = 0; j < lista.length; j++){
            System.out.println(lista[j]);
        }
    }
}
