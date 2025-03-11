package org.example.first;

import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    private final Scanner scanner;
    private final PrintStream out;

    public FirstTask(InputStream input, PrintStream out) {
        this.scanner = new Scanner(input, StandardCharsets.UTF_8);
        this.out = out;
    }

    private static float findMaxValue(float[] array) {
        float maxValue = Float.MIN_VALUE;

        for (float value : array) {
            if (Math.abs(value) > maxValue) {
                maxValue = Math.abs(value);
            }
        }
        return maxValue;
    }

    public void firstTask() {
        out.println("===== First Task =====");

        Random random = new Random();

        out.print("Введите количество элементов массива (n >= 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            out.println("Массив пуст.");
        }

        float[] array = new float[n];

        out.println("Сгенерированный массив:");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextFloat() * 300 - 147;
            out.println(array[i]);
        }

        float maxValue = findMaxValue(array);
        out.println("Максимальное значение по модулю в массиве: " + maxValue);
        out.println();
    }
}
