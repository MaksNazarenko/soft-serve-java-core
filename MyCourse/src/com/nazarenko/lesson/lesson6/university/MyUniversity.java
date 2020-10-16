package com.nazarenko.lesson.lesson6.university;

import com.nazarenko.lesson.lesson6.university.people.AcademicRank;
import com.nazarenko.lesson.lesson6.university.people.Staff;
import com.nazarenko.lesson.lesson6.university.people.Student;
import com.nazarenko.lesson.lesson6.university.people.Teacher;
import com.nazarenko.lesson.lesson6.university.structure.Department;
import com.nazarenko.lesson.lesson6.university.structure.Faculty;
import com.nazarenko.lesson.lesson6.university.structure.Group;

import java.time.LocalDate;

import static com.nazarenko.lesson.lesson6.university.structure.University.UNIVERSITY;

public class MyUniversity {

    static final String MAIN_MENU = "Press:\n" +
            "   1 – create students list;\n" +
            "   2 – display info of all students;\n" +
            "   3 – display info of students in certain group;\n" +
            "   0 – exit.\n> ";

    public static void main(String[] args) {

//        System.out.println("Program starting...\n");
//
//        manager();
//
//        System.out.println("\nProgram ends.");




        Faculty faculty = new Faculty("IASA");
        Department department = new Department("SAD", faculty);
        Group group = new Group("My first group", department);
        System.out.println("1");
        UNIVERSITY.printStructure();

        System.out.println("2");
        faculty.printStructure();

        System.out.println("3");
        department.printStructure();

        System.out.println("4");
        group.printStructure();


        Student student1 = new Student("Maks", "Naz", LocalDate.of(2000,01,01), "Ukraine");
        Student student2 = new Student("Kostia", "Kostia", LocalDate.of(2000,01,01), "Ukraine");
        Teacher teacher1 = new Teacher("Mike", "Dzig", LocalDate.of(2000, 02, 02), "Ükraine", LocalDate.of(2020, 9, 15), 100500, AcademicRank.LECTURER);
        Student student3 = new Student("Vasia", "Pupkin", LocalDate.of(2000,01,01), "Ukraine");
        Staff staff1 = new Staff("Staf", "Stafych", LocalDate.of(1980, 12, 31), "Ukraine", LocalDate.of(2000, 05, 15), 10, "Fizruk");
        UNIVERSITY.printStructure();
    }
/*
    private static boolean manager() {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[0];

        while (true) {
            System.out.print(MAIN_MENU);
            int operation = scanner.nextInt();
            if (operation == 1) {
                students = groupCreator();
            } else if(operation == 2) {
                displayInfoOfAllStudents(students);
            } else if(operation == 3) {
                displayInfoOfGroup(students);
            }
            else if(operation == 0) {
                break;
            } else {
                System.out.println("\nYou've provided wrong option.\n");
            }
        }
        return true;
    }

    private static Student studentCreator() { //builder pattern
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("First name:\n> ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Last name:\n> ");
        student.setLastName(scanner.nextLine());

        System.out.print("Year of birth (yyyy-mm-dd):\n> ");
        student.setYearOfBirth(LocalDate.parse(scanner.next()));

        System.out.print("Country of birth:\n> ");
        scanner.nextLine(); // to take \n after .nextInt
        student.setCountryOfBirth(scanner.nextLine());

        System.out.print("Group number:\n> ");
        //student.setGroupNumber(scanner.nextInt()); //.set...

        System.out.println("Student successfully added.\n");
        return student;
    }

    private static Student[] groupCreator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write amount of students:\n> ");
        Student[] students = new Student[scanner.nextInt()];

        System.out.println("Input info of all students:");
        for(int i = 0; i < students.length; i++) {
            System.out.println("Adding student number " + (i + 1) + "...");
            students[i] = studentCreator();
        }
        return students;
    }

    private static boolean displayInfoOfStudent(Student student) {
        System.out.println("ID: " + student.getStudentId() + " " + student.getFirstName() + " " + student.getLastName() + ": ");
        System.out.println("    Has born in " + student.getYearOfBirth() + " in " + student.getCountryOfBirth());
        System.out.println("    Student of " + student.getGroupNumber() + " group");
        System.out.println("Grades: " + student.getGrades());
        return true;
    }

    private static void displayInfoOfAllStudents(Student[] group) {
        int index = 0;

        if(group.length == 0) {
            System.out.println("\nThere is no students yet. Please, add a student(-s).\n");
        } else {
            System.out.println("Students info:");
            for (Student student : group) {
                ++index;
                System.out.print(index + ". " );
                displayInfoOfStudent(student);
            }
        }
        System.out.println("\n");
    }

    private static void displayInfoOfGroup(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        Student[] group = new Student[students.length];

        System.out.print("Write number of a group to display students of it:\n> ");
        int groupNumber = scanner.nextInt();
        int index = 1;
        for (Student student : students) {
            if(student.getGroupNumber() == groupNumber) {
                System.out.print(index + ". ");
                displayInfoOfStudent(student);
                index++;
            }
        }
        System.out.println("\n");
    }
*/
}