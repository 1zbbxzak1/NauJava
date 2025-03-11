package org.example.second;

import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SecondTask {
    private final Scanner scanner;
    private final PrintStream out;

    public SecondTask(InputStream input, PrintStream out) {
        this.scanner = new Scanner(input, StandardCharsets.UTF_8);
        this.out = out;
    }

    private static ArrayList<Double> mergeSort(ArrayList<Double> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        ArrayList<Double> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Double> right = new ArrayList<>(list.subList(mid, list.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private static ArrayList<Double> merge(ArrayList<Double> left, ArrayList<Double> right) {
        ArrayList<Double> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }
        return result;
    }

    public void secondTask() {
        out.println("===== Second Task =====");

        Random random = new Random();

        out.print("Введите количество элементов массива (n >= 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            out.println("Массив пуст.");
        }

        ArrayList<Double> list = new ArrayList<>();

        out.println("Сгенерированный список:");
        for (int i = 0; i < n; i++) {
            double x = random.nextDouble() * 1000 - 45;
            list.add(x);

            out.println(x);
        }

        list = mergeSort(list);

        out.println("Отсортированный список:");
        for (double d : list) {
            out.println(d);
        }
        out.println();
    }
}
