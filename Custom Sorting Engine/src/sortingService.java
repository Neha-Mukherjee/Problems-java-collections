
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

public class sortingService {

    public void sortAscendingOrder(List<Student> students) {
     Collections.sort(students);

    }
    public void sortAlphabetically(List<Student> students) {
       students.sort((s1,s2)->s1.getname().compareTo(s2.getname()));
    }
    public void marksDescendingOrder(List<Student> students) {
        students.sort((s1,s2)->Double.compare(s2.getMarks(),s1.getMarks()));
    }
    public void ageAscendingOrder(List<Student> students) {
        students.sort((s1,s2)->s1.getAge().compareTo(s2.getAge()));
    }
    public void chainSort(List<Student> students) {
        students.sort(Comparator.comparing(Student::getDepartment).
                thenComparing(Comparator.comparingDouble(Student::getMarks).reversed()));
    }
    public void chainSort2(List<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getMarks).reversed().thenComparing(Student::getname));
    }
}
