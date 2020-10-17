package com.nazarenko.lesson.lesson6.university.lesson;

import com.nazarenko.lesson.lesson6.university.people.Teacher;
import com.nazarenko.lesson.lesson6.university.structure.University;

import java.util.Objects;

public class Course {
    private final String COURSE_NAME;
    private final LessonsList LESSON_NAME;
    private Teacher teacherOfLectures;
    private Teacher teacherOfPractices;

    public Course(String COURSE_NAME, LessonsList LESSON_NAME, Teacher teacherOfLectures){
        this.COURSE_NAME = COURSE_NAME;
        this.LESSON_NAME = LESSON_NAME;
        this.teacherOfLectures = teacherOfLectures;
        University.addCourseToUniversity(this);
    }

    public void setTeacherOfLectures(Teacher teacherOfLectures) {
        this.teacherOfLectures = teacherOfLectures;
    }

    public Teacher getTeacherOfLectures() {
        return this.teacherOfLectures;
    }

    public void setTeacherOfPractices(Teacher teacherOfPractices) {
        this.teacherOfPractices = teacherOfPractices;
    }

    public Teacher getTeacherOfPractices() {
        return this.teacherOfPractices;
    }

    public String getCOURSE_NAME() {
        return COURSE_NAME;
    }

    @Override
    public String toString() {
        return COURSE_NAME/* + ": " + LESSON_NAME + ". " +
                "Lecturer is " + teacherOfLectures + ", " +
                "teacher of practice is " + teacherOfPractices*/;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(COURSE_NAME, course.COURSE_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(COURSE_NAME);
    }
}
