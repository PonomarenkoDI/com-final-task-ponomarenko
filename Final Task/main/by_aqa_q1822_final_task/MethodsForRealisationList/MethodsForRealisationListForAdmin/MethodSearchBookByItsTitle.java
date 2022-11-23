package main.by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin;

import main.by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.Admin;
import main.by_aqa_q1822_final_task.Read_file_book_data;

import java.util.List;
import java.util.Scanner;
@Admin
public class MethodSearchBookByItsTitle extends Read_file_book_data {
    Read_file_book_data read_file_book_data = new Read_file_book_data();
    List<String> bookMagazin = read_file_book_data.file_reader();
    int i =0;

    public void MethodSearchBookByTitle (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter title book for search: ");
        String title = sc.nextLine();

        for (String tit:bookMagazin) {
            if (tit.contains(title)) {
                System.out.println(tit);
            }
           else if (i==0) {
                System.out.println("Error! No book with this title");
            }
           i++;
        }
        read_file_book_data.fileWriter();
    }
}
