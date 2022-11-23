package main.by_aqa_q1822_final_task.RealisationListForSelectingActions;

import main.by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.User;
import main.by_aqa_q1822_final_task.MenuForSelectingActions.MenuForSelectingActions;
import main.by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodSearchBookByItsTitle;
import main.by_aqa_q1822_final_task.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodSearchBookByUniqueCode;
import main.by_aqa_q1822_final_task.Read_file_book_data;

@User
public class RealisationListForSelectingActionsForUser implements MenuForSelectingActions {
    private static boolean endFlag = true;
    MethodSearchBookByUniqueCode methodSearchBookByUniqueCode = new MethodSearchBookByUniqueCode();
    MethodSearchBookByItsTitle methodSearchBookByItsTitle = new MethodSearchBookByItsTitle();
    MenuForSelectingActionsUser menuForSelectingActionsUser = new MenuForSelectingActionsUser();

    @Override
    public void createdListForSelectingActionsForUser() {
        MenuForSelectingActions.super.createdListForSelectingActionsForUser();
    }

    @Override
    public void showListForSelectingActions() {
        MenuForSelectingActions.super.showListForSelectingActions();
    }

    @Override
    public int selectingAnItemFromTheList() {
        return MenuForSelectingActions.super.selectingAnItemFromTheList();
    }

    public void ImplementationListForSelectingActionsUser() {
        int theItem = selectingAnItemFromTheList();
        Read_file_book_data read_file_book_data = new Read_file_book_data();
        switch (theItem) {
            case 1: {
                read_file_book_data.file_reader();
                break;
            }
            case 2:{
                methodSearchBookByUniqueCode.MethodSearchBookUniCode();
                break;
            }
            case 3: {
                methodSearchBookByItsTitle.MethodSearchBookByTitle();
                break;
            }
            case 4: {
                endFlag = false;
            }

        }
    }
}
