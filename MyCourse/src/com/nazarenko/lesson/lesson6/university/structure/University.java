package com.nazarenko.lesson.lesson6.university.structure;

import com.nazarenko.lesson.lesson6.university.people.Staff;
import com.nazarenko.lesson.lesson6.university.people.Student;
import com.nazarenko.lesson.lesson6.university.people.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class University implements Structure {
    public static final University UNIVERSITY;
    private final String UNIVERSITY_NAME = "Royal University of Nazarenko"; // aka RUN
    private static final HashSet<Faculty> faculties = new HashSet<>();
    private static final ArrayList<Staff> staff = new ArrayList<>();
    private static final ArrayList<Teacher> teachers = new ArrayList<>();
    private static final ArrayList<Student> students = new ArrayList<>();

    /**
    * A private Constructor prevents any other class from
    * instantiating.
    */
    private University(){}

    /**
    * The Static initializer constructs the instance at class
    * loading time; this is to simulate a more involved
    * construction process (it it were really simple, you'd just
    * use an initializer)
    */
    static {
        UNIVERSITY = new University();
    }

    private String getUniversityName() {
        return UNIVERSITY_NAME;
    }

    static void addFacultyToUniversity(Faculty newFaculty) {
        faculties.add(newFaculty);
    }

    private String[] listOfFacultiesOfUniversity() {
        String[] print = new String[faculties.size()];
        int id = 0;
        for (Faculty faculty : faculties) {
            print[id] = ++id + ". " + faculty.getFacultyName();
        }
        return print;
    }

    public static void addStaffToUniversity(Staff newStaff) {
        staff.add(newStaff);
    }

    private String[] listOfStaffOfUniversity() {
        String[] print = new String[staff.size()];
        int id = 0;
        for (Staff staff : staff) {
            print[id] = ++id + ". " + staff.getFirstName() + " " + staff.getLastName() + " (" + staff.getProfessionName() + ", SSN: " + staff.getSOCIAL_SECURITY_NUMBER() + ")";
        }
        return print;
    }

    public static void addTeacherToUniversity(Teacher newTeacher) {
        teachers.add(newTeacher);
    }

    private String[] listOfTeachersOfUniversity() {
        String[] print = new String[teachers.size()];
        int id = 0;
        for (Teacher teacher : teachers) {
            print[id] = ++id + ". " + teacher.getFirstName() + " " + teacher.getLastName() + " (" + teacher.getAcademicRank() + ", SSN: " + teacher.getSOCIAL_SECURITY_NUMBER() + ")";
        }
        return print;
    }

    public static void addStudentsToUniversity(Student newStudent) {
        students.add(newStudent);
    }

    private String[] listOfStudentsOfUniversity() {
        String[] print = new String[students.size()];
        int id = 0;
        for (Student student : students) {
            print[id] = ++id + ". " + student.getFirstName() + " " + student.getLastName() + " (id: " + student.getStudentId() + ", SSN: " + student.getSOCIAL_SECURITY_NUMBER() + ")";
        }
        return print;
    }

    @Override
    public void printStructure() {
        System.out.println("Faculties of " + getUniversityName() + ":\n" +
                " " + Arrays.toString(UNIVERSITY.listOfFacultiesOfUniversity()) + "\n" +
                "Students: " + Arrays.toString(UNIVERSITY.listOfStudentsOfUniversity()) + "\n" +
                "Teachers: " + Arrays.toString(UNIVERSITY.listOfTeachersOfUniversity()) + "\n" +
                "Staff: " + Arrays.toString(UNIVERSITY.listOfStaffOfUniversity()));
    }

    @Override
    public String toString() {
        return "University{" +
                "UNIVERSITY_NAME='" + UNIVERSITY_NAME + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(UNIVERSITY_NAME, that.UNIVERSITY_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UNIVERSITY_NAME);
    }
}
