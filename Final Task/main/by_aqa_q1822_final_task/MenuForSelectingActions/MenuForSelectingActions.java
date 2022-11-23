package main.by_aqa_q1822_final_task.MenuForSelectingActions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public interface MenuForSelectingActions {
    String ANSI_BLUE = "\u001B[34m";
    Map<Integer, String> map = new HashMap<>();

     default void createdListForSelectingActionsForAdmin() {
        map.put(1, "View all information about available books in the store");
        map.put(2, "Add a new book to the list");
        map.put(3, "Remove a book from the list by serial number");
        map.put(4, "Change the number of books in stock");
        map.put(5, "Find a book by unique code");
        map.put(6, "Find a book by its title");
        map.put(7, "Exit:( Good bye!");
    }
    default void createdListForSelectingActionsForUser() {
         map.put(1, "View all information about available books in the store");
         map.put(2, "Find a book by unique code");
         map.put(3, "Find a book by its title");
         map.put(4, "Exit:( Good bye!");
    }

    default void showListForSelectingActions() {
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.println(i + "." + map.get(i));
        }
    }
    default int selectingAnItemFromTheList() {
        System.out.println(ANSI_BLUE + "Please select the item corresponding to the action you want to take: ");
        return new Scanner(System.in).nextInt();
    }
}
