package by_aqa_q1822_final_task.MenuForSelectingActions;

import by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.User;


public class MenuForSelectingActionsUser implements MenuForSelectingActions,SelectingAnItemFromTheList {
    @User
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
        SelectingAnItemFromTheList.super.selectingAnItemFromTheList();
        return 0;
    }
}
