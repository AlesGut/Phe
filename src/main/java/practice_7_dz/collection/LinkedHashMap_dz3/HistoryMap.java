package practice_7_dz.collection.LinkedHashMap_dz3;

import java.util.LinkedHashMap;
import java.util.Map;

public class HistoryMap {
    private static final int Max_Size = 10;
    private LinkedHashMap<String, Integer> history;

    public HistoryMap() {
        this.history = new LinkedHashMap<>();
    }

    public void addHistory(String page, Integer visitCount) {
        history.put(page, visitCount);
        if (history.size() > 10) {
            String oldest = history.keySet().iterator().next();
            history.remove(oldest);
        }
    }

    public void printHistory() {
        for (Map.Entry<String, Integer> entry : history.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
