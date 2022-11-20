package by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin;

import by_aqa_q1822_final_task.Read_file_book_data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MethodDeletBook {
    Read_file_book_data read_file_book_data = new Read_file_book_data();
    public void methodDeletedBook() {
        MethodDeletBook methodDeletBook = new MethodDeletBook();
        List<String> bookMagazin = methodDeletBook.read_file_book_data.file_reader();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the book you want to delete");
        int books = sc.nextInt();

        try {
            bookMagazin.remove(books-1);
        } catch (IndexOutOfBoundsException exception) {
            System.err.println(exception.getMessage());
        }

            BufferedWriter bufferedWriter = null;
            try {
                bufferedWriter = new BufferedWriter(new FileWriter("D:\\DZ\\com-final-task-ponomarenko\\Final Task\\src\\resources\\file_book_data.txt"));
                for (String str1 : bookMagazin
                ) {
                    bufferedWriter.write(str1);
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedWriter.flush();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

    public static void main(String[] args) {
        MethodDeletBook methodDeletBook = new MethodDeletBook();
        methodDeletBook.methodDeletedBook();
    }

}