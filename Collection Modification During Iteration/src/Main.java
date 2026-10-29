import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       listService service = new listService();
       List<Integer> numbers = service.createList();

       service.removeNumbers(numbers);
       service.reverseTraversal(numbers);
       service.insertafter(numbers,10,99);
       service.compareRemoval();
       service.exception();
        System.out.println();
      System.out.println(numbers);
    }
}