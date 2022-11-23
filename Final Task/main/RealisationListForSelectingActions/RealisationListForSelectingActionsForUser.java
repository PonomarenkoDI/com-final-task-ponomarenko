package main.RealisationListForSelectingActions;

import main.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.User;
import main.MenuForSelectingActions.MenuForSelectingActions;
import main.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodSearchBookByItsTitle;
import main.MethodsForRealisationList.MethodsForRealisationListForAdmin.MethodSearchBookByUniqueCode;

@User
public class RealisationListForSelectingActionsForUser extends MenuForSelectingActions {
    private boolean endFlag = true;

    RealisationListForSelectingActionsForUser realisationListForSelectingActionsForUser = new RealisationListForSelectingActionsForUser();
    MethodSearchBookByUniqueCode methodSearchBookByUniqueCode = new MethodSearchBookByUniqueCode();
    MethodSearchBookByItsTitle methodSearchBookByItsTitle = new MethodSearchBookByItsTitle();
    MenuForSelectingActions menuForSelectingActions = new MenuForSelectingActions();
//    public void cycleForUser (){
//        do {
//            realisationListForSelectingActionsForUser.ImplementationListForSelectingActionsUser();
//        } while (realisationListForSelectingActionsForUser.endFlag);
//    }

    public void ImplementationListForSelectingActionsUser() {
        menuForSelectingActions.createdListForSelectingActionsForUser();
        int theItem = selectingAnItemFromTheList();
        switch (theItem) {
            case 1: {
                menuForSelectingActions.showListForSelectingActions();
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
