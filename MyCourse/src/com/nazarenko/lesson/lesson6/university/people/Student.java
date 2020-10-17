package com.nazarenko.lesson.lesson6.university.people;

import com.nazarenko.lesson.lesson6.university.lesson.Course;
import com.nazarenko.lesson.lesson6.university.structure.Group;
import com.nazarenko.lesson.lesson6.university.structure.University;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Student extends Human implements Teachable {
    private Group group;
    private static int countOfStudents;
    private final int studentId;
    private HashSet<Course> courses = new HashSet<>();
    private HashMap<Course, ArrayList<Float>> grades = new HashMap<Course, ArrayList<Float>>();

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth) {
        super(firstName, lastName, dateOfBirth, countryOfBirth);
        this.studentId = ++countOfStudents;
        University.addStudentsToUniversity(this);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public int getStudentId() {
        return studentId;
    }

    public void addCourseToStudent(Course newCourse) {
        this.courses.add(newCourse);
    }

    boolean addGrade(Course course, Float newGrade) {
        ArrayList<Float> gradesByCourse = this.grades.get(course);
        if(gradesByCourse == null) {
            gradesByCourse = new ArrayList<Float>();
            gradesByCourse.add(newGrade);
        } else {
            gradesByCourse.add(newGrade);
        }
        this.grades.put(course, gradesByCourse);
        return true;
    }

    private HashMap<Course, ArrayList<Float>> getGrades() {
        return this.grades;
    }

    private ArrayList<Float> getGrades(Course course) {
        return this.grades.get(course);
    }

    public boolean sortGradesInCourse(Course course, String order) {
        ArrayList<Float> toSort = grades.get(course);
        int arrSize = toSort.size();
        if (order.equals("ascending")) {
            for(int i = 1; i < arrSize; i++) {
                for(int j = 0; j < arrSize; j++) {
                    Float tmp;
                    if (toSort.get(j) > toSort.get(i)) {
                        tmp = toSort.get(j);
                        toSort.set(j, toSort.get(i));
                        toSort.set(i, tmp);
                    }
                }
            }
        } else if (order.equals("descending")) {
            for(int i = 1; i < arrSize; i++) {
                for(int j = 0; j < arrSize; j++) {
                    Float tmp;
                    if (toSort.get(j) < toSort.get(i)) {
                        tmp = toSort.get(j);
                        toSort.set(j, toSort.get(i));
                        toSort.set(i, tmp);
                    }
                }
            }
        } else {
            return false;
        }
        this.grades.remove(course);
        this.grades.put(course, toSort);
        return true;
    }

    public void printAllGrades(){
        System.out.print(this.getFirstName() + " " + this.getLastName() + "' grades: ");
        System.out.println(this.getGrades());
    }

    public void printGradesOfCourse(Course course){
        System.out.print(this.getFirstName() + " " + this.getLastName() + "' grades of " + course.getCOURSE_NAME() + ": ");
        System.out.println(this.getGrades(course));
    }

    public HashSet<Course> getCourses() {
        return courses;
    }

    @Override
    public boolean isTeachable() {
        System.out.println("Yes, I'm a student.");
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }


}
