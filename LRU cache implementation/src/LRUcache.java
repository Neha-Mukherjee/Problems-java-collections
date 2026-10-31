import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache {
    private LinkedHashMap<Integer, String> cache = new LinkedHashMap<>(3, 0.75f, true) {

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
            return size() > 3;

        }
    };

    public void put(int key, String value) {
        cache.put(key, value);
    }
    public String get(int key) {
        return cache.get(key);
    }
    public String remove(int key) {
        return cache.remove(key);
    }
    public void displayCache() {
        System.out.println(cache);
    }

}
