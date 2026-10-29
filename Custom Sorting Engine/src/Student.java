public class Student implements Comparable<Student>{
    private Long studentId;
    private String name;
    private double marks;
    private Long age;
    private String department;

    public Student(Long studentId, String name, double marks, Long age, String department) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.age = age;
        this.department = department;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getname() {
        return name;
    }


    public double getMarks() {
        return marks;
    }

    public Long getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name=" + name + ", marks=" + marks + ", age=" + age + ", department=" + department + '}';

    }
    @Override
    public int compareTo(Student student) {
        return this.studentId.compareTo(student.studentId);
    }
}
