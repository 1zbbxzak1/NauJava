package org.example.fifth;

import org.example.fifth.interfaces.Task;

import java.io.PrintStream;

public class FifthTask implements Task {
    private final PrintStream out;

    private final int startTime;
    private Thread thread;
    private volatile boolean running;

    public FifthTask(PrintStream out, int startTime) {
        this.out = out;
        this.startTime = startTime;
    }

    @Override
    public void start() {
        if (thread != null && thread.isAlive()) {
            return;
        }

        running = true;

        thread = new Thread(() -> {
            int timeLeft = startTime;

            while (timeLeft > 0 && running) {
                out.println("Осталось: " + timeLeft + " секунд");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                timeLeft--;
            }

            if (running) {
                out.println("Таймер завершен");
            }
        });
        thread.start();
    }

    @Override
    public void stop() {
        running = false;

        if (thread != null) {
            thread.interrupt();
        }
    }
}
