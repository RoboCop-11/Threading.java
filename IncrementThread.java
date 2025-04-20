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

    // The logic that runs in the thread
    public void run() {
        while (true) {
            System.out.println("Thread " + Thread.currentThread().getId() + " Value: " + currentValue);
            currentValue += incrementStep;
            try {
                Thread.sleep(delayMillis); // Pause for delayMillis milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                break;
            }
        }
    }
}
