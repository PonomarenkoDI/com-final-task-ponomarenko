package main.RealisationListForSelectingActions;

import main.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.User;
import main.MenuForSelectingActions.MenuForSelectingActions;
import main.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodSearchBookByItsTitle;
import main.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodSearchBookByUniqueCode;
import main.MethodsForRealisationList.MethodsForRealisationListForUser.MethodSearchBookByTitle_User;
import main.MethodsForRealisationList.MethodsForRealisationListForUser.MethodSearchBookByUniqueCode_User;

@User
public class RealisationListForSelectingActionsForUser extends MenuForSelectingActions {
    private boolean endFlag = true;

    private MethodSearchBookByTitle_User methodSearchBookByTitle_user = new MethodSearchBookByTitle_User();
    private MethodSearchBookByUniqueCode_User methodSearchBookByUniqueCode_user = new MethodSearchBookByUniqueCode_User();
    private MenuForSelectingActions menuForSelectingActions = new MenuForSelectingActions();

    public void cycleForUser() {
        RealisationListForSelectingActionsForUser realisationListForSelectingActionsForUser = new RealisationListForSelectingActionsForUser();
        do {
            realisationListForSelectingActionsForUser.implementationListForSelectingActionsUser();
        } while (realisationListForSelectingActionsForUser.endFlag);
    }

    public void implementationListForSelectingActionsUser() {
        menuForSelectingActions.createdListForSelectingActionsForUser();
        int theItem = selectingAnItemFromTheList();
        switch (theItem) {
            case 1: {
                menuForSelectingActions.showBookMagazin();
                System.out.println();
                break;
            }
            case 2: {
                methodSearchBookByUniqueCode_user.methodSearchBookUniCode();
                break;
            }
            case 3: {
                methodSearchBookByTitle_user.methodSearchBookByTitle();
                break;
            }
            case 4: {
                endFlag = false;
            }
            default: {
                showErrorForUser();
                implementationListForSelectingActionsUser();
            }

        }
    }

    private void showErrorForUser() {
        System.err.println("Wrong poin menu");
    }
}
