//Anastasiya Kiulo
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sentinel = 999;

        Scanner input = new Scanner(System.in);
        int choice = 1;
        while(choice != sentinel){
            System.out.println("Enter your choice: 1: multiplying by 3 \t-1: exit ");
            choice = input.nextInt();
            if(choice == sentinel)
                break;
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            System.out.println("Answer is: " + factorial(num));
            //input.nextInt();
        }

    }

    public static int factorial(int n) {
        int result = 0;
        if (n == 0) {
            return result;
        }
        else if (n > 0) {
            result = 3 + factorial(n - 1);
        } else {
            result = -3 + factorial(n + 1);
        }
        return result;
    }
}
