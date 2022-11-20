package by_aqa_q1822_final_task.RealisationListForSelectingActions;

import by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.Admin;
import by_aqa_q1822_final_task.MenuForSelectingActions.SelectingAnItemFromTheList;
import by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodAddNewBook;
import by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodChangeAmountBooksOnShelf;
import by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodDeletBook;
import by_aqa_q1822_final_task.Read_file_book_data;

@Admin
public class RealisationListForSelectingActionsForAdmin implements SelectingAnItemFromTheList {
    private static boolean endFlag = true;

    @Override
    public int selectingAnItemFromTheList() {
        return SelectingAnItemFromTheList.super.selectingAnItemFromTheList();
    }

    public void ImplementationListForSelectingActionsAdmin() {
        int theItem = selectingAnItemFromTheList();
        Read_file_book_data read_file_book_data = new Read_file_book_data();
        MethodAddNewBook methodAddNewBook = new MethodAddNewBook();
        MethodChangeAmountBooksOnShelf methodChangeAmountBooksOnShelf = new MethodChangeAmountBooksOnShelf();
        MethodDeletBook methodDeletBook = new MethodDeletBook();
        switch (theItem) {
            case 1: {
                read_file_book_data.file_reader();
                break;
            }
            case 2:{
                methodAddNewBook.methodAddedNewBook();
                break;
            }
            case 3:{
                methodDeletBook.methodDeletedBook();
                break;
            }
            case 4:{
                methodChangeAmountBooksOnShelf.changeAmountBooksOnShelf();
                break;
            }
            case 9: {
                endFlag = false;
            }

        }
    }
}