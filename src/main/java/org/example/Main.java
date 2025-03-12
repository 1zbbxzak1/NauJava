package org.example;

import org.example.first.FirstTask;
import org.example.second.SecondTask;
import org.example.fifth.FifthTask;
import org.example.fourth.FourthTask;

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
        // Четвертое задание
        FourthTask fourthTask = new FourthTask(System.out);
        fourthTask.fourthTaskSync();
        fourthTask.fourthTaskAsync();

        FifthTask fifthTask = new FifthTask(System.out, startTime);
        fifthTask.start();
    }
}