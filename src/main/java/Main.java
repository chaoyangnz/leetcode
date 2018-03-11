import java.util.*;

public class Main {

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char task : tasks) {
            map.put(task, map.get(task) == null? 1 : map.get(task) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry);
        }
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

    }
}
