package by_aqa_q1822_final_task.MenuForSelectingActions;

import by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.Admin;


public class MenuForSelectingActionsAdmin implements MenuForSelectingActions,SelectingAnItemFromTheList {
    @Admin
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
        SelectingAnItemFromTheList.super.selectingAnItemFromTheList();
        return 0;
    }
}