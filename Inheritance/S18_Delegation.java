// S18. Consider Using Delegation for Special Cases
class Logger {
    void log(String msg) { System.out.println("LOG: " + msg); }
}
class Service {
    private Logger logger = new Logger(); // Delegation
    void doWork() {
        logger.log("Work started");
        System.out.println("Service is working");
        logger.log("Work finished");
    }
    public static void main(String[] args) {
        new Service().doWork();
    }
}
