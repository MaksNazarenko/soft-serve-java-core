package com.nazarenko.lesson.lesson6.university.lesson;

import com.nazarenko.lesson.lesson6.university.people.Teacher;

import java.util.Objects;

public class Lesson {
    private LessonsList lessonsName;
    private Teacher teacher;

//    Lesson(LessonsList lessonsList) {
//        this.lessonsName = lessonsList;
//    }

    Lesson(LessonsList lessonsList, Teacher teacher){
        this.lessonsName = lessonsList;
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return lessonsName == lesson.lessonsName &&
                Objects.equals(teacher, lesson.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessonsName, teacher);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
