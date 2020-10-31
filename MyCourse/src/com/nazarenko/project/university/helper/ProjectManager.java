package com.nazarenko.project.university.helper;

import com.nazarenko.project.university.structure.University;

import static com.nazarenko.project.university.structure.University.UNIVERSITY;

public abstract class ProjectManager {

    static final String CONTROL_PANEL = "What do you want?\n" +
            "   1 – display all info of RUN;\n" +
            "   2 – add faculty;\n" +
            "   3 – add department;\n" +
            "   4 – add group;\n" +
            "   5 – add student;\n" +
            "   6 – add teacher;\n" +
            "   7 – add staff;\n" +
            "   8 – add course;\n" +
            "   9 – add course to student;\n" +
            "   10 – add grade to student;\n" +
            "   11 – print student's grades;\n" +
            "   12 – sort student's grades;\n" +
            "   0 – exit.\n> ";

    public static boolean manager() {

        while (true) {
            System.out.print(CONTROL_PANEL);
            int operation = MyScanner.scanInt();
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
                Helper.addCourseToStudent();
            } else if(operation == 10) {
                Helper.addGrateToStudent();
            } else if(operation == 11) {
                Helper.printGrades();
            } else if(operation == 12) {
                Helper.sortStudentGrades();
            }
            else if(operation == 0) {
                break;
            } else {
                System.out.println("\nYou've provided wrong option.\n");
            }
        }
        return true;
    }

}
