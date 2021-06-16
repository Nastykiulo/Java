//Anastasiya Kiulo
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = input.nextInt();             // Read the size of the array from the keyboard and write it to size
        int values[] = new int[size];             // Creating an int array with size size
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {        // Prompt the list from user
            values[i] = input.nextInt();          // Filling the array with elements entered from the keyboard
        }
        // Test isEven()
        System.out.println("\nisEven() method:");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);     // Create a MyInteger object
            System.out.println(value.getValue() + " " + value.isEven());
        }
        // Test isOdd()
        System.out.println("\nisOdd() method:");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);     // Create a MyInteger object
            System.out.println(value.getValue() + " " + value.isOdd());
        }
        // Test isPrime()
        System.out.println("\nisPrime() method:");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);     // Create a MyInteger object
            System.out.println(value.getValue() + " " + value.isPrime());
        }

        // Test isEven(int)
        System.out.println("\nisEven(int) method:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
        }
        // Test isOdd(int)
        System.out.println("\nsOdd(int) method:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
        }
        // Test isPrime(int)
        System.out.println("\nisPrime(int) method:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
        }

        // Test isEven(MyInteger)
        System.out.println("\nisEven(MyInteger) method:");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isEven(value));
        }
        // Test isOdd(MyInteger)
        System.out.println("\nisOdd(MyInteger) method:");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
        }
        // Test isPrime(MyInteger)
        System.out.println("\nisPrime(MyInteger) method:");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
        }

        // Test equals(int)
        System.out.println("\nEnter value to test equals methods: ");
        MyInteger value = new MyInteger(input.nextInt());
        System.out.println("\nequals(int) test if " + value.getValue() +
                " is equal to the specified value:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + value.equals(values[i]));
        }
        // Test equals(MyInteger)
        System.out.println("\nequals(MyInteger) test if " + value.getValue() +
                " is equal to the specified value:");
        for (int i = 0; i < values.length; i++) {
            MyInteger myInteger = new MyInteger(values[i]);
            System.out.println(values[i] + " " + value.equals(myInteger));
        }

        // Test parseInt(char[]) and parseInt(String)
        System.out.println("\nTest parseInt(char[]) and parseInt(String):");

        System.out.print("Enter the length of char array: ");
        int charsize = input.nextInt();             // Read the size of the array from the keyboard and write it to size
        char[] numericCharacters = new char[charsize];  // Creating an char array with size charsize
        System.out.println("Insert array elements:");
        for (int i = 0; i < charsize; i++) {        // Prompt the list from user
                     // Filling the array with elements entered from the keyboard
            String b = input.next();
            numericCharacters[i] = b.charAt(b.length()-1);  //last character from string
        }
        // Create a string
        System.out.print("Enter a String: ");
        String numericString = input.next();        //reading a string
        System.out.print("\'");
        for (int i = 0; i < numericCharacters.length; i++) {
            System.out.print(numericCharacters[i] + "");
        }
        System.out.println("\' + \"" + numericString + "\" = " +
                (MyInteger.parseInt(numericCharacters) +        //parseInt(char[])
                        MyInteger.parseInt(numericString)));    //parseInt(String)
    }
}
