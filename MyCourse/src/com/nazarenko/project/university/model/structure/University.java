package com.nazarenko.project.university.model.structure;

import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Staff;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class University {
    public static final University UNIVERSITY;
    private final String UNIVERSITY_NAME = "Royal University of Nazarenko";
    private static final HashSet<Faculty> faculties = new HashSet<>();
    private static final HashSet<Department> departments = new HashSet<>();
    private static final HashSet<Group> groups = new HashSet<>();
    private static final ArrayList<Staff> staff = new ArrayList<>();
    private static final ArrayList<Teacher> teachers = new ArrayList<>();
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final HashSet<Course> courses = new HashSet<>();

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

    public static HashSet<Faculty> getFaculties() {
        return faculties;
    }

    private String[] listOfFacultiesOfUniversity() {
        String[] print = new String[faculties.size()];
        int id = 0;
        for (Faculty faculty : faculties) {
            print[id] = ++id + ". " + faculty.getFacultyName();
        }
        return print;
    }

    static void addDepartmentToUniversity(Department newDepartment) {
        departments.add(newDepartment);
    }

    public static HashSet<Department> getDepartments() {
        return departments;
    }

    private String[] listOfDepartmentsOfUniversity() {
        String[] print = new String[departments.size()];
        int id = 0;
        for (Department department : departments) {
            print[id] = ++id + ". " + department.getDepartmentName();
        }
        return print;
    }

    static void addGroupToUniversity(Group newGroup) {
        groups.add(newGroup);
    }

    public static HashSet<Group> getGroups() {
        return groups;
    }

    private String[] listOfGroupsOfUniversity() {
        String[] print = new String[groups.size()];
        int id = 0;
        for (Group group : groups) {
            print[id] = ++id + ". " + group.getGroupName();
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
            print[id] = ++id + ". " + teacher.getFirstName() + " " + teacher.getLastName() + " (Academic rank:" + teacher.getAcademicRank() + ", SSN: " + teacher.getSOCIAL_SECURITY_NUMBER() + ")";
        }
        return print;
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
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

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addCourseToUniversity(Course newCourse) {
        courses.add(newCourse);
    }

    public static HashSet<Course> getCourses() {
        return courses;
    }

    private String[] listOfCoursesOfUniversity() {
        String[] print = new String[courses.size()];
        int id = 0;
        for (Course course : courses) {
            print[id] = ++id + ". " + course.getCOURSE_NAME();
        }
        return print;
    }

    public void printStructure() {
        System.out.println(getUniversityName() + " structure: \n" +
                "   Faculties: " + Arrays.toString(UNIVERSITY.listOfFacultiesOfUniversity()) + "\n" +
                "   Departments: " + Arrays.toString(UNIVERSITY.listOfDepartmentsOfUniversity()) + "\n" +
                "   Groups: " + Arrays.toString(UNIVERSITY.listOfGroupsOfUniversity()) + "\n" +
                "   Students: " + Arrays.toString(UNIVERSITY.listOfStudentsOfUniversity()) + "\n" +
                "   Teachers: " + Arrays.toString(UNIVERSITY.listOfTeachersOfUniversity()) + "\n" +
                "   Staff: " + Arrays.toString(UNIVERSITY.listOfStaffOfUniversity()) + "\n" +
                "   Courses: " + Arrays.toString(UNIVERSITY.listOfCoursesOfUniversity()));
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
