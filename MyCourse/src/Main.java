import java.util.Scanner;

import static com.nazarenko.lesson.description.Description.lessonsDescription;
import static com.nazarenko.lesson.manager.Manager.*;

public class Main {
    public static void main(String[] args) {

        mainManager();

    }

    private static void mainManager() {
        Scanner scanner = new Scanner(System.in);

        int lesson = Integer.MIN_VALUE;
        int task;

        while(lesson == Integer.MIN_VALUE) {
            lessonsDescription();

            task = Integer.MIN_VALUE;

            lesson = scanner.nextInt();
            if (lesson == 0) {
                break;
            } else if (lesson == 1) {
                if (lesson1Manager(task) == Integer.MIN_VALUE) {
                    mainManager();
                }
            } else if (lesson == 2) {
                lesson2Manager();
            } else if (lesson == 3) {
                if (lesson3Manager(task) == Integer.MIN_VALUE) {
                    mainManager();
                }
            } else if (lesson == 4) {
                if(lesson4Manager(task) == Integer.MIN_VALUE) {
                    mainManager();
                }
            } else if (lesson == 5) {
                if(lesson4Manager(task) == Integer.MIN_VALUE) {
                    mainManager();
                }
            } else {
                if(lessonIncorrectManager() == Integer.MIN_VALUE) {
                    mainManager();
                }
            }
        }
    }
}

