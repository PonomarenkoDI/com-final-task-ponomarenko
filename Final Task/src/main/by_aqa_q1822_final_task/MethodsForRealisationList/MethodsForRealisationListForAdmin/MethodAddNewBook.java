package by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin;

import by_aqa_q1822_final_task.Read_file_book_data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class MethodAddNewBook {
    public void methodAddedNewBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter all information to add a new book to the list");
        String addedNewBook = sc.nextLine();

        String filePath = "D:\\DZ\\com-final-task-ponomarenko\\Final Task\\src\\resources\\file_book_data.txt";
        String text = "\n" + addedNewBook;

        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
