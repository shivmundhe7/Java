// Print Reverse Of a Number

public class printrevnumber {
    public static void main(String[] args) {
        int n = 742008;

        while(n > 0) {
            int lastdigit = n % 10;
            System.out.println(lastdigit + " ");
            n = n / 10;
        }
        System.out.println();
    }
}
