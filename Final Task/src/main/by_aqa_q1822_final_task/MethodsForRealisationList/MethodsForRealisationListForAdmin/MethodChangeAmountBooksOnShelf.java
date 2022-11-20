package by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin;

import by_aqa_q1822_final_task.Read_file_book_data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MethodChangeAmountBooksOnShelf {
    Read_file_book_data read_file_book_data = new Read_file_book_data();

    public void changeAmountBooksOnShelf() {
        MethodChangeAmountBooksOnShelf methodChangeAmountBooksOnShelf = new MethodChangeAmountBooksOnShelf();
        List<String> book = methodChangeAmountBooksOnShelf.read_file_book_data.file_reader();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the book in which you want to change the number of books on the store:");
        int amountBooks = sc.nextInt();
        String s = book.get(amountBooks-1);
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

        book.set(amountBooks-1, afterChanges);

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("D:\\DZ\\com-final-task-ponomarenko\\Final Task\\src\\resources\\file_book_data.txt"));
            for (String str1 : book
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
        MethodChangeAmountBooksOnShelf methodChangeAmountBooksOnShelf = new MethodChangeAmountBooksOnShelf();
        methodChangeAmountBooksOnShelf.changeAmountBooksOnShelf();
    }
}