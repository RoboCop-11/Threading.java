/*
Name: Manan Khanna
PRN: 23070126156
Batch: AIML-B3
*/

public class Main {
    public static void main(String[] args) {
        // Creating and starting two threads with different behavior
        IncrementThread thread1 = new IncrementThread(1, 3, 3000);
        IncrementThread thread2 = new IncrementThread(100, 50, 1000);

        thread1.start();
        thread2.start();
    }
}
