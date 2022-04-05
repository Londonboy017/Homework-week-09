package hwweek09.calculate;

public class Calculator {

    //instance method
    public void addition(int a, int b) {

        System.out.println("Addition of two numbers : " + (a + b));//print addition result
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of two numbers : " + (a - b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of two numbers : " + (a * b));
    }

    public void division(int a, int b) {
        //use try - catch for Arithmetic Exception
        try {
            System.out.println("Division of two numbers : " + (a / b));
        } catch (ArithmeticException e) {
           // e.printStackTrace();//error message
            System.out.println("Error: >> "+e);
        }
    }
    public void calculateResult(int a, int b, char symbol) {
        //calling method if condition fulfilled via if-else
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else System.out.println("Please enter valid symbol +,-,*, /");
    }
}

