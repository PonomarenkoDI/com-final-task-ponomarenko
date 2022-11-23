package main.by_aqa_q1822_final_task.RealisationListForSelectingActions;


import main.by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.Admin;
import main.by_aqa_q1822_final_task.MenuForSelectingActions.MenuForSelectingActions;
import main.by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin.*;
import main.by_aqa_q1822_final_task.Read_file_book_data;

@Admin
public class RealisationListForSelectingActionsForAdmin implements MenuForSelectingActions {
    private static boolean endFlag = true;
    Read_file_book_data read_file_book_data = new Read_file_book_data();
    MethodAddNewBook methodAddNewBook = new MethodAddNewBook();
    MethodChangeAmountBooksOnShelf methodChangeAmountBooksOnShelf = new MethodChangeAmountBooksOnShelf();
    MethodDeletBook methodDeletBook = new MethodDeletBook();
    MethodSearchBookByUniqueCode methodSearchBookByUniqueCode = new MethodSearchBookByUniqueCode();
    MethodSearchBookByItsTitle methodSearchBookByItsTitle = new MethodSearchBookByItsTitle();

    @Override
    public void createdListForSelectingActionsForAdmin() {
        MenuForSelectingActions.super.createdListForSelectingActionsForAdmin();
    }

    @Override
    public void showListForSelectingActions() {
        MenuForSelectingActions.super.showListForSelectingActions();
    }

    @Override
    public int selectingAnItemFromTheList() {
        return MenuForSelectingActions.super.selectingAnItemFromTheList();
    }

    public void ImplementationListForSelectingActionsAdmin() {
        int theItem = selectingAnItemFromTheList();
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
            case 5:{
                methodSearchBookByUniqueCode.MethodSearchBookUniCode();
                break;
            }
            case 6:{
                methodSearchBookByItsTitle.MethodSearchBookByTitle();
                break;
            }
            case 7: {
                endFlag = false;
            }

        }
    }
}