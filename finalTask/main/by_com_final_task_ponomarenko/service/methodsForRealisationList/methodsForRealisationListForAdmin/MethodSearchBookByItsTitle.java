package main.by_com_final_task_ponomarenko.service.methodsForRealisationList.methodsForRealisationListForAdmin;

import main.by_com_final_task_ponomarenko.dao.Read_file_book_data;
import main.by_com_final_task_ponomarenko.controller.annotationAdminAndUser.Admin;

import java.util.List;
import java.util.Scanner;

@Admin
public class MethodSearchBookByItsTitle extends Read_file_book_data {
    private Read_file_book_data read_file_book_data = new Read_file_book_data();
    private List<String> bookMagazin = read_file_book_data.file_reader();
    private int i = 0;

    public void methodSearchBookByTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter title book for search: ");
        String title = sc.nextLine();

        for (String tit : bookMagazin) {
            if (tit.contains(title)) {
                System.out.println(tit);
            } else if (i == 0) {
                System.out.println("Error! No book with this title");
            }
            i++;
        }
        read_file_book_data.fileWriter();
    }
}
