package main.by_aqa_q1822_final_task.LoginWithDifferentAccessRrights;


import main.by_aqa_q1822_final_task.RealisationListForSelectingActions.RealisationListForSelectingActionsForAdmin;

import java.util.Scanner;

public class LoginInSystem {
    RealisationListForSelectingActionsForAdmin realisationListForSelectingActionsForAdmin = new RealisationListForSelectingActionsForAdmin();


    int passwordAdmin = 1234;
    int passwordUser = 5555;

    public void methodForLoginInSystemAdmin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter password: ");
        int i = sc.nextInt();
        if (passwordAdmin == i) {
            System.out.println("Welcome, Admin!");
//            realisationListForSelectingActionsForAdmin.createdListForSelectingActionsForAdmin();
//            realisationListForSelectingActionsForAdmin.showListForSelectingActions();
//            realisationListForSelectingActionsForAdmin.selectingAnItemFromTheList();
//            realisationListForSelectingActionsForAdmin.ImplementationListForSelectingActionsAdmin();
        } else {
            System.out.println("Error! Password incorrect!");
            methodForLoginInSystemAdmin();
        }
    }
    public void methodForLoginInSystemUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter password: ");
        int a = sc.nextInt();
        if (passwordUser == a) {
            System.out.println("Welcome, User!");
        } else {
            System.out.println("Error! Password incorrect!");
            methodForLoginInSystemUser();
        }
    }

}
