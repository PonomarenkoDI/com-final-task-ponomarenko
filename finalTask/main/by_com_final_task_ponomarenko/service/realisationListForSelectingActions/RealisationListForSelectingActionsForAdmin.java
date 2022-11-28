package main.by_com_final_task_ponomarenko.service.realisationListForSelectingActions;


import main.by_com_final_task_ponomarenko.controller.annotationAdminAndUser.Admin;
import main.by_com_final_task_ponomarenko.controller.MenuForSelectingActions;
import main.by_com_final_task_ponomarenko.service.methodsForRealisationList.methodsForRealisationListForAdmin.*;

@Admin
public class RealisationListForSelectingActionsForAdmin extends MenuForSelectingActions {
    private boolean endFlag = true;
    private MethodAddNewBook methodAddNewBook = new MethodAddNewBook();
    private MethodChangeAmountBooksOnShelf methodChangeAmountBooksOnShelf = new MethodChangeAmountBooksOnShelf();
    private MethodDeletBook methodDeletBook = new MethodDeletBook();
    private MethodSearchBookByUniqueCode methodSearchBookByUniqueCode = new MethodSearchBookByUniqueCode();
    private MethodSearchBookByItsTitle methodSearchBookByItsTitle = new MethodSearchBookByItsTitle();
    private MenuForSelectingActions menuForSelectingActions = new MenuForSelectingActions();

    public void cycleForAdmin() {
        RealisationListForSelectingActionsForAdmin realisationListForSelectingActionsForAdmin = new RealisationListForSelectingActionsForAdmin();
        do {
            realisationListForSelectingActionsForAdmin.implementationListForSelectingActionsAdmin();
        } while (realisationListForSelectingActionsForAdmin.endFlag);
    }

    public void implementationListForSelectingActionsAdmin() {
        menuForSelectingActions.createdListForSelectingActionsForAdmin();
        int theItem = selectingAnItemFromTheList();
        switch (theItem) {
            case 1: {
                menuForSelectingActions.showBookMagazin();
                System.out.println();
                break;
            }
            case 2: {
                methodAddNewBook.methodAddedNewBook();
                break;
            }
            case 3: {
                methodDeletBook.methodDeletedBook();
                break;
            }
            case 4: {
                methodChangeAmountBooksOnShelf.changeAmountBooksOnShelf();
                break;
            }
            case 5: {
                methodSearchBookByUniqueCode.methodSearchBookUniCode();
                break;
            }
            case 6: {
                methodSearchBookByItsTitle.methodSearchBookByTitle();
                break;
            }
            case 7: {
                endFlag = false;
            }
            default: {
                showErrorForAdmin();
                implementationListForSelectingActionsAdmin();
            }

        }
    }
    private void showErrorForAdmin (){
        System.err.println("Wrong poin menu");
    }
}