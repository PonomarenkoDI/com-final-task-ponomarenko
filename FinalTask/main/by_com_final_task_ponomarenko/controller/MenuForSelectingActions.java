package main.by_com_final_task_ponomarenko.controller;

import main.by_com_final_task_ponomarenko.controller.annotationAdminAndUser.Admin;
import main.by_com_final_task_ponomarenko.controller.annotationAdminAndUser.User;
import main.by_com_final_task_ponomarenko.dao.Read_file_book_data;

import java.util.*;

public class MenuForSelectingActions {
    private Read_file_book_data read_file_book_data = new Read_file_book_data();
    private List<String> bookMagazin = read_file_book_data.file_reader();
    private String ANSI_BLUE = "\u001B[34m";
    private Map<Integer, String> map = new HashMap<>();

    @Admin
    public void createdListForSelectingActionsForAdmin() {
        map.put(1, "View all information about available books in the store");
        map.put(2, "Add a new book to the list");
        map.put(3, "Remove a book from the list by serial number");
        map.put(4, "Change the number of books in stock");
        map.put(5, "Find a book by unique code");
        map.put(6, "Find a book by its title");
        map.put(7, "Exit:( Good bye!");
        showListForSelectingActions();
    }

    @User
    public void createdListForSelectingActionsForUser() {
        map.put(1, "View all information about available books in the store");
        map.put(2, "Find a book by unique code");
        map.put(3, "Find a book by its title");
        map.put(4, "Exit:( Good bye!");
        showListForSelectingActions();
    }

    public void showBookMagazin() {
        for (String str : bookMagazin) {
            System.out.println(str);
        }
    }

    public int selectingAnItemFromTheList() {
        System.out.println(ANSI_BLUE + "Please select the item corresponding to the action you want to take: ");
        return new Scanner(System.in).nextInt();
    }

    public void showListForSelectingActions() {
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.println(i + "." + map.get(i));

        }
    }

}


