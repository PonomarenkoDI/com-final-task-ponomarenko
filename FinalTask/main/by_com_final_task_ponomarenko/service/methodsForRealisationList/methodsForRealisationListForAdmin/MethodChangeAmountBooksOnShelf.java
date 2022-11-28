package main.by_com_final_task_ponomarenko.service.methodsForRealisationList.methodsForRealisationListForAdmin;

import main.by_com_final_task_ponomarenko.dao.Read_file_book_data;

import java.util.List;
import java.util.Scanner;

public class MethodChangeAmountBooksOnShelf extends Read_file_book_data {
    private Read_file_book_data read_file_book_data = new Read_file_book_data();
    private List<String> bookMagazin = read_file_book_data.file_reader();

    public void changeAmountBooksOnShelf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the book in which you want to change the number of books on the store: ");
        int amountBooks = sc.nextInt();
        String s = bookMagazin.get(amountBooks - 1);
        String[] array = s.split(",");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new number of books: ");
        String num = scan.nextLine();
        array[5] = num;
        String afterChanges = "";

        for (int i = 0; i < array.length; i++) {

            afterChanges += array[i];
            if (i != array.length - 1) {
                afterChanges += ",";
            }
        }

        bookMagazin.set(amountBooks - 1, afterChanges);

        read_file_book_data.fileWriter();
    }
}