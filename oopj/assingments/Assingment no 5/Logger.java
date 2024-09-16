public class Logger {
    // Singleton instance
    private static Logger instance;

    // StringBuilder to hold the log messages
    private StringBuilder logMessages;

    // Private constructor to prevent instantiation
    private Logger() {
        logMessages = new StringBuilder();
    }

    // Method to get the single instance of Logger
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to add a log message
    public void log(String message) {
        // Add timestamp to log message
        String timestampedMessage = String.format("[%tF %<tT] %s", System.currentTimeMillis(), message);
        logMessages.append(timestampedMessage).append(System.lineSeparator());
    }

    // Method to get all log messages
    public String getLog() {
        return logMessages.toString();
    }

    // Method to clear all log messages
    public void clearLog() {
        logMessages.setLength(0); // Clears the StringBuilder
    }

    // Example usage of the Logger class
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger = Logger.getInstance();
        
        // Log messages
        logger.log("This is an info message.");
        logger.log("This is a warning message.");
        logger.log("This is an error message.");
        
        // Get and print log messages
        System.out.println("Log messages:");
        System.out.println(logger.getLog());
        
        // Clear log messages
        logger.clearLog();
        
        // Print the log after clearing
        System.out.println("Log messages after clearing:");
        System.out.println(logger.getLog());
    }
}
