public class Main {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger1.log("First log message.");

        logger logger2 = logger.getInstance();
        logger2.log("Second log message.");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (singleton confirmed).");
        } else {
            System.out.println("Different logger instances (singleton failed).");
        }
    }
}
