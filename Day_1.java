import java.util.*;

public class Day_1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b&&a>c) {
            System.out.println("a is greater than b and c");

        } else if(b>a&&b>c) {
            System.out.println("b id greater than a and c");
        } else if(c>a&&c>b) {
            System.out.println("c is greater than a and b");
        }

    }
}