import java.util.*;

public class listService {
    public List<Integer> createList(){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            list.add(i);
        }
        return list;
    }

    public void removeNumbers(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int number = iterator.next();

            if (number%3==0){
                iterator.remove();
            }
        }
    }
    public void reverseTraversal(List<Integer> list){
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous()+" ");
        }
    }
    public void insertafter(List<Integer> list,int selected , int value){
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            if (iterator.next()==selected){
                iterator.add(value);
                return;
            }
        }
        System.out.println("Selected element not found");
    }
    public void compareRemoval(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = list1.listIterator();
        while (iterator.hasNext()){
            if (iterator.next()==3){
                iterator.remove();
            }
        }
        System.out.println("Iterator.remove():"+list1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list2.remove(Integer.valueOf(3));
        System.out.println("Iterator.remove():"+list2);

    }
    public void exception() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = list.iterator();
        try {
            while (iterator.hasNext()) {
                int number = iterator.next();
                if (number == 2) {
                    list.add(6);
                    iterator.next();

                }
            }
        }catch(ConcurrentModificationException e){
            System.out.println("ConcurrentModificationException caught");
        }
    }
}

