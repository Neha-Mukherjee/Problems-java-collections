//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LRUcache cache = new LRUcache();

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        cache.displayCache();

        cache.get(1);

        cache.displayCache();

        cache.put(4, "D");

        cache.displayCache();
    }
}