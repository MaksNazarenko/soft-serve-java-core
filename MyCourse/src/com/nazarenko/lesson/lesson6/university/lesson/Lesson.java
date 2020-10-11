package com.nazarenko.lesson.lesson6.university.lesson;

import com.nazarenko.lesson.lesson6.university.people.Teacher;

public class Lesson {
    private LessonsList lessonsName;
    private Teacher teacher;

    Lesson(LessonsList lessonsList) {
        this.lessonsName = lessonsList;
    }

    Lesson(LessonsList lessonsList, Teacher teacher){
        this.lessonsName = lessonsList;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
