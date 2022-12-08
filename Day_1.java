import java.util.*;

public class Day_1 {
    public static void main(String[] args) {
        System.out.println("1.Addition\n");
        System.out.println("2.Subtraction\n");
        System.out.println("3.Multiplication\n");
        System.out.println("4.Division\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch(choice) {
            case 1 : System.out.printf("Summation %d \n",a+b);
            break;
            case 2 : System.out.printf("Subraction %d",a-b);
            break;
            case 3 : System.out.printf("Multiplication %d",a*b);
            break;
            case 4 : System.out.printf("Division %d",a/b);
            break;
            default : System.out.printf("invalid");
        }
    }
}
