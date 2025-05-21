public class Calculator {
    public int divide(int a, int b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        System.out.println(new Calculator().divide(10, 0));  // Throws ArithmeticException
    }
}
