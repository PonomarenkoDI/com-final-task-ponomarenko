package by_aqa_q1822_final_task.MenuForSelectingActions;

import java.util.HashMap;
import java.util.Map;


public interface MenuForSelectingActions {
    Map<Integer, String> map = new HashMap<>();

     default void createdListForSelectingActionsForAdmin() {
        map.put(1, "View all information about available books in the store");
        map.put(2, "Add a new book to the list");
        map.put(3, "Remove a book from the list by serial number");
        map.put(4, "Change the number of books in stock");
        map.put(5, "Find a book by unique code");
        map.put(6, "Find a book by its title");
        map.put(7, "Calculate the total number of books available in the store");
        map.put(8, "Exit:( Good bye!");
    }
    default void createdListForSelectingActionsForUser() {
         map.put(1, "View all information about available books in the store");
         map.put(2, "Find a book by unique code");
         map.put(3, "Find a book by its title");
         map.put(4, "Calculate the total number of books available in the store for purchase");
         map.put(5, "Exit:( Good bye!");
    }

    default void showListForSelectingActions() {
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.println(i + "." + map.get(i));
        }
    }
}
