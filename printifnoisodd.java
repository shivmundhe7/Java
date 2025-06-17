import java.util.*;

public class printifnoisodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("The Number Is Even");
        } else {
            System.out.println("The Number Is Odd");
        }
        sc.close();
    }
}
