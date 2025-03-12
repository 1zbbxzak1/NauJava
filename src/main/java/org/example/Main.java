package org.example;

import org.example.fifth.FifthTask;
import org.example.first.FirstTask;
import org.example.fourth.FourthTask;
import org.example.second.SecondTask;
import org.example.third.ThirdTask;


public class Main {
    public static void main(String[] args) {
        // Первое задание
        FirstTask firstTask = new FirstTask(System.in, System.out);
        firstTask.firstTask();

        // Второе задание
        SecondTask secondTask = new SecondTask(System.in, System.out);
        secondTask.secondTask();

        // Третье задание
        ThirdTask thirdTask = new ThirdTask(System.out);
        thirdTask.thirdTask();

        // Четвертое задание
        FourthTask fourthTask = new FourthTask(System.out);
        fourthTask.fourthTaskSync();
        fourthTask.fourthTaskAsync();

        // Пятое задание
        int startTime = 10; // для проверки

        FifthTask fifthTask = new FifthTask(System.out, startTime);
        fifthTask.start();
    }
}