package main.by_com_final_task_ponomarenko.service.methodsForRealisationList.methodsForRealisationListForAdmin;

import main.by_com_final_task_ponomarenko.controller.annotationAdminAndUser.Admin;
import main.by_com_final_task_ponomarenko.dao.Read_file_book_data;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@Admin
public class MethodDeletBook extends Read_file_book_data {
    private Read_file_book_data read_file_book_data = new Read_file_book_data();
    private List<String> bookMagazin = read_file_book_data.file_reader();

    public void methodDeletedBook() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the number of the book you want to delete: ");
            int books = sc.nextInt();

            try {
                bookMagazin.remove(books - 1);
            } catch (IndexOutOfBoundsException exception) {
                System.err.println(exception.getMessage());
            }
            read_file_book_data.fileWriter();
        } catch (NumberFormatException | InputMismatchException e){
            System.err.println(e.getMessage() + " This is not number");
            methodDeletedBook();
        }
    }

}