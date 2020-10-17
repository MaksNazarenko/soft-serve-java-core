package com.nazarenko.project.university;

import com.nazarenko.project.university.screator.InstanceCreator;
import com.nazarenko.project.university.lesson.Course;
import com.nazarenko.project.university.lesson.LessonsList;
import com.nazarenko.project.university.people.AcademicRank;
import com.nazarenko.project.university.people.Staff;
import com.nazarenko.project.university.people.Student;
import com.nazarenko.project.university.people.Teacher;
import com.nazarenko.project.university.screator.MyScanner;
import com.nazarenko.project.university.structure.Department;
import com.nazarenko.project.university.structure.Faculty;
import com.nazarenko.project.university.structure.Group;

import java.time.LocalDate;

import static com.nazarenko.project.university.structure.University.UNIVERSITY;

public class MyUniversity {

    static final String CONTROL_PANEL = "What do you want?\n" +
            "   1 – display all info of RUN;\n" +
            "   2 – add faculty;\n" +
            "   3 – add department;\n" +
            "   4 – add group;\n" +
            "   5 – add student;\n" +
            "   6 – add teacher;\n" +
            "   7 – add staff;\n" +
            "   8 – add course;\n" +
            "   9 – ;\n" +
            "   0 – exit.\n> ";

    public static void main(String[] args) {
        System.out.println("Welcome to Royal University of Nazarenko!\n");

//      testTries();
        manager();

        System.out.println("\nWill see you in future!");
    }


    private static boolean manager() {

        while (true) {
            System.out.print(CONTROL_PANEL);
            int operation = MyScanner.scanInt();
            MyScanner.scanEmptyEater(); //to eat \n after scanInt
            if (operation == 1) {
                UNIVERSITY.printStructure();
            } else if(operation == 2) {
                InstanceCreator.createFaculty();
            } else if(operation == 3) {
                InstanceCreator.createDepartment();
            } else if(operation == 4) {
                InstanceCreator.createGroup();
            } else if(operation == 5) {
                InstanceCreator.createStudent();
            } else if(operation == 6) {
                InstanceCreator.createTeacher();
            } else if(operation == 7) {
                InstanceCreator.createStaff();
            } else if(operation == 8) {
                InstanceCreator.createCourse();
            } else if(operation == 9) {

            }
            else if(operation == 0) {
                break;
            } else {
                System.out.println("\nYou've provided wrong option.\n");
            }
        }
        return true;
    }



    private static void testTries() {
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


        Student student1 = new Student("Maks", "Naz", LocalDate.of(2000, 1,01), "Ukraine");
        Student student2 = new Student("Kostia", "Kostia", LocalDate.of(2000,01,01), "Ukraine");
        Teacher teacher1 = new Teacher("Mike", "Dzig", LocalDate.of(2000, 02, 02), "Ükraine", LocalDate.of(2020, 9, 15), 100500, AcademicRank.LECTURER);
        Student student3 = new Student("Vasia", "Pupkin", LocalDate.of(2000,01,01), "Ukraine");
        Staff staff1 = new Staff("Staf", "Stafych", LocalDate.of(1980, 12, 31), "Ukraine", LocalDate.of(2000, 05, 15), 10, "Fizruk");
        UNIVERSITY.printStructure();

        group.addStudentToGroup(student1);
        group.addStudentToGroup(student1);
        group.addStudentToGroup(student2);
        group.setGroupCurator(teacher1);
        group.printStructure();
        System.out.println("---");

        Course course = new Course("Top course!", LessonsList.PROGRAMMING, teacher1);
        course.setTeacherOfPractices(teacher1);
        Course course2 = new Course("Second course!", LessonsList.DATA_BASES, teacher1);
        group.addCourseToGroup(course2);


        group.addCourseToGroup(course);
        group.printStructure();
        System.out.println("student1"+student1.getCourses());
        System.out.println("student2"+student2.getCourses());
        System.out.println("hi"+student3.getCourses());


        Teacher teacher2 = new Teacher("random", "rand", LocalDate.of(2000, 02, 02), "Ükraine", LocalDate.of(2020, 9, 15), 1, AcademicRank.LECTURER);

        teacher2.addGradeToStudent(course, student1, 4.4f);
        teacher1.addGradeToStudent(course, student1, 2.2f);
        student1.printAllGrades();

        teacher1.addGradeToStudent(course, student1, 3.3f);
        teacher1.addGradeToStudent(course, student1, 5.0f);
        teacher1.addGradeToStudent(course, student1, 4.4f);
        teacher1.addGradeToStudent(course, student1, 1.7f);
        teacher1.addGradeToStudent(course, student1, 3.3f);
        teacher1.addGradeToStudent(course, student1, 1.1f);
        teacher1.addGradeToStudent(course, student1, 0.1f);
        teacher1.addGradeToStudent(course, student1, 3.8f);

        student1.printAllGrades();

        student1.sortGradesInCourse(course, "ascending");
        System.out.println("after ascending sort");
        student1.printAllGrades();
        student1.sortGradesInCourse(course, "descending");
        System.out.println("after descending sort");
        student1.printAllGrades();

        teacher1.addGradeToStudent(course2, student1, 1.7f);
        teacher1.addGradeToStudent(course2, student1, 3.3f);
        teacher1.addGradeToStudent(course2, student1, 1.1f);
        student1.printAllGrades();
        student1.printGradesOfCourse(course);

        UNIVERSITY.printStructure();

        UNIVERSITY.printStructure();

        //Faculty faculty1 = instanceCreator.createFaculty();
        Course course1 = InstanceCreator.createCourse();
        System.out.println(course1.getCOURSE_NAME());
        System.out.println(course1.getTeacherOfPractices());
        System.out.println(course1.getTeacherOfLectures());
        UNIVERSITY.printStructure();

//        StudentCreator studentCreator = new StudentCreator();
//        Student studentX = studentCreator.createStudent();
//        System.out.println(studentX.toString());
//        System.out.println(studentX.getLastName());
//        System.out.println(studentX.getSOCIAL_SECURITY_NUMBER());
//        System.out.println(studentX.getCOUNTRY_OF_BIRTH());
//        System.out.println(studentX.getYEAR_OF_BIRTH());
//        System.out.println(studentX.getStudentId());

    }
}