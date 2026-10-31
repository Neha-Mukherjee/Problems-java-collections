import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          TrainingInstitute institute = new TrainingInstitute();
        institute.addStudent("CSE", 101);
        institute.addStudent("CSE", 102);
        institute.addStudent("ECE", 103);

        institute.assignCourse("CSE", 101, "Java");
        institute.assignCourse("CSE", 101, "SQL");
        institute.assignCourse("CSE", 101, "Python");

        institute.assignCourse("CSE", 102, "Java");
        institute.assignCourse("CSE", 102, "Python");
        institute.assignCourse("CSE", 102, "HTML");

        institute.assignCourse("ECE", 103, "Java");

        // Duplicate test
        institute.assignCourse("CSE", 101, "Java");
        institute.displayStudents("CSE");
        System.out.println(institute.findStudentByCourse("Java"));

        institute.countStudents();
        System.out.println(
                institute.commonCourses("CSE", 101, 102));

        // Difference
        System.out.println(
                institute.differentCourses("CSE", 101, 102));

        // Additional challenge
        Set<String> required = Set.of("Java", "Python");

        System.out.println(
                institute.findStudentsWithRequiredCourse(
                        "CSE", required));
    }
    }

