package main.MenuForSelectingActions;

import main.Read_file_book_data;

import java.util.*;


public class MenuForSelectingActions {
    Read_file_book_data read_file_book_data = new Read_file_book_data();
    List<String> bookMagazin = read_file_book_data.file_reader();
    String ANSI_BLUE = "\u001B[34m";
    Map<Integer, String> map = new HashMap<>();

     public void createdListForSelectingActionsForAdmin() {
        map.put(1, "View all information about available books in the store");
        map.put(2, "Add a new book to the list");
        map.put(3, "Remove a book from the list by serial number");
        map.put(4, "Change the number of books in stock");
        map.put(5, "Find a book by unique code");
        map.put(6, "Find a book by its title");
        map.put(7, "Exit:( Good bye!");
         System.out.println("\n"+ map);
    }
    public void createdListForSelectingActionsForUser() {
         map.put(1, "View all information about available books in the store");
         map.put(2, "Find a book by unique code");
         map.put(3, "Find a book by its title");
         map.put(4, "Exit:( Good bye!");
        System.out.println(map);
    }

    public void showListForSelectingActions() {
        for (String str:bookMagazin) {
            System.out.println(str);
        }
     }

    public int selectingAnItemFromTheList() {
        System.out.println(ANSI_BLUE + "Please select the item corresponding to the action you want to take: ");
        return new Scanner(System.in).nextInt();
    }


    }


