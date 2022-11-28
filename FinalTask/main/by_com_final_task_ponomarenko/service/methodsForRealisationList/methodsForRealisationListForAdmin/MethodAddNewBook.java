package main.by_com_final_task_ponomarenko.service.methodsForRealisationList.methodsForRealisationListForAdmin;


import main.by_com_final_task_ponomarenko.controller.annotationAdminAndUser.Admin;
import main.by_com_final_task_ponomarenko.dao.Read_file_book_data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

@Admin
public class MethodAddNewBook extends Read_file_book_data {
    private Read_file_book_data read_file_book_data = new Read_file_book_data();

    public void methodAddedNewBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter all information to add a new book to the list: ");
        String addedNewBook = sc.nextLine();

        String filePath = System.getProperty("user.dir") + "\\Final Task\\resources\\file_book_data.txt";
        String text = "\n" + addedNewBook;

        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
        read_file_book_data.fileWriter();
    }

}
