import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : 
                System.out.println(a + b);
                break;
            case '-' : 
                System.out.println(a - b);
                break;
            case '*' : 
                System.out.println(a * b);
                break;
            case '/' : 
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case '%' : 
                if (b != 0) {
                    System.out.println(a % b);
                } else {
                    System.out.println("Cannot modulo by zero.");
                }
                break;
            default : 
                System.out.println("My calculator is not that advanced.");
        }

        sc.close();
    }
}
