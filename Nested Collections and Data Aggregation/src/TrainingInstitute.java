import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TrainingInstitute {
    private Map<String,Map<Integer, Set<String>>> departments = new HashMap<>();

    public void addStudent(String department , int studentId){
        departments.putIfAbsent(department, new HashMap<>());
        departments.get(department).putIfAbsent(studentId , new HashSet<>());
    }

    public void assignCourse(String department , int studentId,String course){
        if(!departments.containsKey(department)||!departments.get(department).containsKey(studentId)){
            System.out.println("student not found");
            return;
        }
        boolean added = departments.get(department).get(studentId).add(course);
        if(added){
            System.out.println("course assigned");

        }
        else{
            System.out.println("course already exists");
        }


        }
    public void displayStudents(String department){
        Map<Integer, Set<String>> students = departments.get(department);
        if(students==null){
            System.out.println("department not found");
        return;
        }
        students.forEach((id,courses)-> System.out.println("Student: "+id+" courses: "+courses));
    }
    public Set<Integer> findStudentByCourse(String course){
        Set<Integer> result = new HashSet<>();
        departments.forEach((department , students)->{
            students.forEach((studentId,courses)->{
                if(courses.contains(course)){
                    result.add(studentId);
                }
            });
        });
        return result;
    }
    public void countStudents(){
        departments.forEach((department , students)->{
            System.out.println(department + ":" + students.size());
        });
    }
    private Set<String> getCourses(String department,int studentId){
        return departments.get(department).get(studentId);
    }
    public Set<String> commonCourses(String department ,int student1,int student2){
        Set<String> common = new HashSet<>(getCourses(department,student1));
        common.retainAll(getCourses(department,student2));
        return common;
    }
    public Set<String> differentCourses(String department ,int student1,int student2){
        Set<String> different = new HashSet<>(getCourses(department,student1));
        different.removeAll(getCourses(department,student2));
        return different;
    }
    public Set<Integer> findStudentsWithRequiredCourse(String department ,Set<String> requiredCourses){
        Set<Integer> result = new HashSet<>();
        Map<Integer, Set<String>> students = departments.get(department);
        if(students==null){
            return result;
        }
        students.forEach((studentId,courses)->{
            if(courses.containsAll(requiredCourses)){
                result.add(studentId);
            }
        });
        return result;
    }
}
