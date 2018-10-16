
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swapnil
 */
public class main {
    public static void main(String[] args) throws IOException {
        // Reading input from file
        Scanner sc = new Scanner(new File("data1.txt"));
        String s;   // To capture line from file

        // Creating a new 2-3 tree
        TwoThreeTree tree = new TwoThreeTree();

        // File Processing starts here
        OUTER:
        while (true) {

            // Read line from file
            s = sc.nextLine();
            // Split commands and values
            String[] tokens = s.split(" ");
            String command = tokens[0];

            switch (command) {
                // Case Insert
                case "I": {
                    // Get value to be inserted
                    int value = Integer.parseInt(tokens[1]);
                    // Try to insert the value and return result                    
                    boolean success = tree.insert(value);
                    if (success) {
                        // If the value was inserted
                        System.out.printf("Key %s inserted\n", value);
                    } else {
                        // If insertion fails
                        System.out.printf("Key %s already exists\n", value);
                    } // end of if else
                    break;
                } // end of case I

                // Case Delete
                case "D": {
                    // Get value to be deleted
                    int value = Integer.parseInt(tokens[1]);
                    // Try to delete the value and return result
                    boolean success = tree.remove(value);
                    if (success) {
                        // If the value was deleted
                        System.out.printf("Key %s deleted\n", value);
                    } else {
                        // If deletion fails
                        System.out.printf("Key %s doesn't exist\n", value);
                    } // end of if else
                    break;
                } // end of case D

                // Case Search
                case "S": {
                    // Get the value to be searched
                    int value = Integer.parseInt(tokens[1]);
                    // Try to find the value and return result
                    boolean success = tree.search(value);
                    if (success) {
                        // If the search finds the key
                        System.out.printf("Key %s found\n", value);
                    } else {
                        // If the key wasn't found
                        System.out.printf("Key %s doesn't exist\n", value);
                    } // end of if else
                    break;
                } // end of case S

                // Case KeyOrderList
                case "K":
                    // Print keys in order
                    tree.keyOrderList();
                    break;

                // Case BFSList
                case "B":
                    // Print keys in level Order
                    tree.bfsList();
                    break;

                // Case Height
                case "H":
                    // Get height of the tree
                    int height = tree.height();
                    // Print height
                    System.out.printf("Height %s\n", height);
                    break;

                // Case number of nodes
                case "M":
                    // Get the number of nodes
                    int size = tree.numberOfNodes();
                    // Print the number of nodes in the tree
                    System.out.printf("Size %s\n", size);
                    break;

                // Case end
                case "E":
                    // Break the loop
                    break OUTER;
                default:
                    break;
            } // switch ends here
        } // end of while loop

        

    } // end of main
}
