package org.example;

import org.example.first.FirstTask;
import org.example.second.SecondTask;
import org.example.fifth.FifthTask;

public class Main {
    public static void main(String[] args) {
        // Первое задание
        FirstTask firstTask = new FirstTask(System.in, System.out);
        firstTask.firstTask();

        // Второе задание
        SecondTask secondTask = new SecondTask(System.in, System.out);
        secondTask.secondTask();
        // Пятое задание
        int startTime = 10; // для проверки

        FifthTask fifthTask = new FifthTask(System.out, startTime);
        fifthTask.start();
    }
}