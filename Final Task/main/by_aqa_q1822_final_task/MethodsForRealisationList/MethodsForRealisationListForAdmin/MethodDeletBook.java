package main.by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin;

import main.by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.Admin;
import main.by_aqa_q1822_final_task.Read_file_book_data;

import java.util.List;
import java.util.Scanner;
@Admin
public class MethodDeletBook extends Read_file_book_data {
    Read_file_book_data read_file_book_data = new Read_file_book_data();
    List<String> bookMagazin = read_file_book_data.file_reader();

    public void methodDeletedBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the book you want to delete");
        int books = sc.nextInt();

        try {
            bookMagazin.remove(books-1);
        } catch (IndexOutOfBoundsException exception) {
            System.err.println(exception.getMessage());
        }
        read_file_book_data.fileWriter();
    }

}