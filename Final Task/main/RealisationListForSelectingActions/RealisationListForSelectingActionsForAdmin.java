package main.RealisationListForSelectingActions;


import main.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.Admin;
import main.MenuForSelectingActions.MenuForSelectingActions;
import main.MethodsForRealisationList.MethodsForRealisationListForAdmin.*;

@Admin
public class RealisationListForSelectingActionsForAdmin extends MenuForSelectingActions {
    private boolean endFlag = true;
    MethodAddNewBook methodAddNewBook = new MethodAddNewBook();
    MethodChangeAmountBooksOnShelf methodChangeAmountBooksOnShelf = new MethodChangeAmountBooksOnShelf();
    MethodDeletBook methodDeletBook = new MethodDeletBook();
    MethodSearchBookByUniqueCode methodSearchBookByUniqueCode = new MethodSearchBookByUniqueCode();
    MethodSearchBookByItsTitle methodSearchBookByItsTitle = new MethodSearchBookByItsTitle();
    MenuForSelectingActions menuForSelectingActions = new MenuForSelectingActions();

    public void cycleForAdmin() {
        RealisationListForSelectingActionsForAdmin realisationListForSelectingActionsForAdmin = new RealisationListForSelectingActionsForAdmin();
        do {
            realisationListForSelectingActionsForAdmin.ImplementationListForSelectingActionsAdmin();
        } while (realisationListForSelectingActionsForAdmin.endFlag);
    }

    public void ImplementationListForSelectingActionsAdmin() {
        menuForSelectingActions.createdListForSelectingActionsForAdmin();
        int theItem = selectingAnItemFromTheList();
        switch (theItem) {
            case 1: {
                menuForSelectingActions.showBookMagazin();
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
                methodSearchBookByUniqueCode.MethodSearchBookUniCode();
                break;
            }
            case 6: {
                methodSearchBookByItsTitle.MethodSearchBookByTitle();
                break;
            }
            case 7: {
                endFlag = false;
            }

        }
    }
}