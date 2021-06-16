//Anastasiya Kiulo

import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("Hello World!");

        HashMap<String, Element> elements = new HashMap<>();//Java HashMap named elements that uses the String value of a chemical symbol
                                                            // as the key and an instance of the Element class as the value.
        Scanner input = new Scanner(System.in);

        boolean terminate = false;
        do {
            System.out.println("\n\nMenu:");                    //menu
            System.out.printf("%s %15s", "Option", "Action\n\n");
            System.out.printf("Option 1: %45s", "Add a chemical element to the collection.\n");
            System.out.printf("Option 2: %44s", "Search for an element in the collection.\n");
            System.out.printf("Option 3: %42s", "Delete an element from the collection.\n");
            System.out.printf("Option 4: %35s", "Load elements from a text file.\n");
            System.out.printf("Option 5: %44s", "Display the collection sorted by symbol.\n");
            System.out.printf("Option 6: %8s", "Quit\n");
            System.out.print("Select an option number from the following menu:");


            while (!input.hasNextInt()) {                   //don't allow user enter strings/characters
                System.out.println("That not a number!");
                input.next(); // this is important!
            }
            int option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:                 //Option 1 (adding an element)
                    System.out.print("\nEnter the name of the chemical element: ");
                    String name = input.nextLine();
                    System.out.print("Enter the atomic number of the element: ");
                    int atomicNumber = input.nextInt();
                    System.out.print("Enter the atomic weight of the element(the integer and fractional parts are separated by a comma): ");
                    double atomicWeight = input.nextDouble();
                    String key = name.substring(0, 1);      //substring takes first symbol from the name of element

                    Element info1 = new Element(name, atomicNumber, atomicWeight);
                    elements.put(key.toUpperCase(), info1);
                    break;
                case 2:                 //Option 2 Search for an element in the collection
                    if (!elements.isEmpty()) {          //check for empty hash map
                        System.out.print("Enter a chemical symbol you want to find: ");
                        String search = input.nextLine().toUpperCase();
                        //if
                        System.out.println(search + elements.get(search));
                    } else {
                        System.out.println("Your hash map is empty!");
                    }

                    break;
                case 3:                 //Option 3
                    if (!elements.isEmpty()) {      //check for empty hash map
                    System.out.print("Enter a chemical symbol to delete: ");
                    String delete = input.nextLine().toUpperCase();

                    elements.remove(delete);
                    } else {
                System.out.println("Your hash map is empty!");
            }
                    break;
                case 4:                 //Option 4
                    //String file = "elements.txt";      // I use this path for testing the program
                    String file = "(“C:\\Data\\elements.txt”";
                    String line = "";
                    String splitBy = ",";

                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                        while ((line = br.readLine()) != null) {

                            // use comma as separator
                            String[] tempArray = line.split(splitBy);

                            Element info4 = new Element(tempArray[1], Integer.parseInt(tempArray[2]), Double.parseDouble(tempArray[3]));
                            elements.put(tempArray[0], info4);
                            System.out.println(elements.get(tempArray[0]));
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:                  //Option 5
                    if (!elements.isEmpty()) {          //check for empty hash map
                    System.out.println("Before Sorting:");
                    // TreeMap to store values of HashMap
                    TreeMap<String, Element> sorted = new TreeMap<>();

                    // Copy all data from hashMap into TreeMap
                    sorted.putAll(elements);

                    // Display the TreeMap which is naturally sorted
                    for (Map.Entry<String, Element> entry : sorted.entrySet())
                        System.out.println("Key = " + entry.getKey() +
                                ", Value = " + entry.getValue());
                } else {
                    System.out.println("Your hash map is empty!");
                }
                    break;
                case 6:                    //Option 6
                    terminate = true;
                    break;
            }
        }while (terminate == false);
    }
}
