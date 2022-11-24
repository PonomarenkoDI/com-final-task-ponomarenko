package main.MethodsForRealisationList.MethodsForRealisationListForAdmin;

import main.Read_file_book_data;
import main.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.Admin;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@Admin
public class MethodSearchBookByUniqueCode extends Read_file_book_data {
    Read_file_book_data read_file_book_data = new Read_file_book_data();
    List<String> bookMagazin = read_file_book_data.file_reader();
    int i = 0;

    public void methodSearchBookUniCode() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter unique code book for search: ");
            int unCode = sc.nextInt();

            for (String tit : bookMagazin) {
                if (tit.equals(unCode)) {
                    System.out.println(tit);
                } else if (i == 0) {
                    System.out.println("Error! No book with this unique code");
                }
                i++;
            }
            read_file_book_data.fileWriter();
        } catch (NumberFormatException | InputMismatchException e){
            System.err.println(e.getMessage() + " This is not number");
            methodSearchBookUniCode();
        }
    }
}
