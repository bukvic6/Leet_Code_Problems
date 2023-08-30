import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMap {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        scores = sortByValue(scores);

    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        List<Integer> values = new ArrayList<>(scores.values());
        Collections.sort(values);
        Map<String, Integer> sv = new HashMap<>();



    }


}
