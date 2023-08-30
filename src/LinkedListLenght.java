import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;

public class LinkedListLenght {
    public static void main(String[]  args){
        List<String> list = new LinkedList<>();

        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");
        System.out.println(list);

        int size = list.size();
        System.out.println(size);
    }




}
