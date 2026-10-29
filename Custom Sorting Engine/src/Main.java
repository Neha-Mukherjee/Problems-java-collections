import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

       studentList.add(new Student(105L, "Rahul", 85.5, 21L, "CSE"));
        studentList.add(new Student(102L, "Priya", 92.0, 20L, "ECE"));
       studentList.add(new Student(108L, "Amit", 78.5, 22L, "CSE"));
        studentList.add(new Student(101L, "Sneha", 92.0, 19L, "IT"));
        studentList.add(new Student(110L, "Arjun", 85.5, 21L, "ECE"));
        studentList.add(new Student(103L, "Neha", 88.0, 20L, "CSE"));
        studentList.add(new Student(107L, "Karan", 78.5, 23L, "IT"));
       studentList.add(new Student(104L, "Ananya", 95.0, 20L, "ECE"));
      studentList.add(new Student(109L, "Riya", 88.0, 19L, "IT"));
        studentList.add(new Student(106L, "Vikram", 85.5, 22L, "CSE"));
        sortingService sortingService = new sortingService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nChoose sorting option:");
            System.out.println("1. Sort by Student ID (Ascending)");
            System.out.println("2. Sort by Name (Alphabetical)");
            System.out.println("3. Sort by Marks (Descending)");
            System.out.println("4. Sort by Age (Ascending)");
            System.out.println("5. Sort by Department, then Marks");
            System.out.println("6. Sort by Marks, then Name");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Collections.sort(studentList);
                    break;
                case 2:
                    sortingService.sortAlphabetically(studentList);
                    break;
                case 3:
                    sortingService.marksDescendingOrder(studentList);
                    break;
                case 4:
                    sortingService.ageAscendingOrder(studentList);
                    break;
                case 5:
                    sortingService.chainSort(studentList);
                    break;
                case 6:
                    sortingService.chainSort2(studentList);
                    break;
                case 0:
                    System.out.println("Exiting");
                    continue;
                default :
                    System.out.println("Invalid choice");
                    continue;
            }
            studentList.forEach(System.out::println);
        }while(choice != 0);
        sc.close();








      //  System.out.println(studentList);
    }

}