public class elseifstmt{
    public static void main(String[] args) {
        int age = 54;
        if(age >= 18) {
            System.err.println("Adult");
        }
        else if(age >=13 && age < 18 ) {
            System.err.println("Teenager");
        }
        else {
            System.err.println("Child");
        }
    }
}