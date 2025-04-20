// Thread class that increments a value and prints it repeatedly

public class IncrementThread extends Thread {
    private int currentValue;
    private final int incrementStep;
    private final int delayMillis;

    // Constructor to initialize the thread values
    public IncrementThread(int start, int step, int delay) {
        this.currentValue = start;
        this.incrementStep = step;
        this.delayMillis = delay;
    }

