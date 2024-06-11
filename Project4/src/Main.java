import java.util.List;
import java.lang.*;

/**
 * Main class to demonstrate the usage of MakeSortedListFromUserInput and ListOfLinks classes.
 * @author Obrie Scarbrough
 * @version 1.0
 * @since 6/1/2024
 */
public class Main {
    /**
     * Main method to run the program.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        MakeSortedListFromUserInput userInput = new MakeSortedListFromUserInput();
        ListOfLinks linked = new ListOfLinks();
        List<Integer> returnedList;
        userInput.getIntFromUser();
        userInput.sortList();
        returnedList = userInput.getList();
        System.out.println(linked.CreateLinkedList(returnedList));
    }
}