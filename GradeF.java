public class Database {
    public static String password = "admin123";  // Hardcoded credentials
    
    public static void connect() {
        // SQL injection vulnerability
        String query = "SELECT * FROM users WHERE pass = '" + password + "'";
    }
}
