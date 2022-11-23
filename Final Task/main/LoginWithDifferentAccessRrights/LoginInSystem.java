package main.LoginWithDifferentAccessRrights;



import main.RealisationListForSelectingActions.RealisationListForSelectingActionsForAdmin;
import main.RealisationListForSelectingActions.RealisationListForSelectingActionsForUser;

import java.util.Scanner;

public class LoginInSystem {
    RealisationListForSelectingActionsForAdmin realisationListForSelectingActionsForAdmin = new RealisationListForSelectingActionsForAdmin();
    RealisationListForSelectingActionsForUser realisationListForSelectingActionsForUser = new RealisationListForSelectingActionsForUser();

    int passwordAdmin = 1234;
    int passwordUser = 5555;

    public void methodForLoginInSystemAdmin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter password: ");
        int i = sc.nextInt();
        if (passwordAdmin == i) {
            System.out.println("Welcome, Admin!");
            realisationListForSelectingActionsForAdmin.ImplementationListForSelectingActionsAdmin();

        } else if (passwordUser == i) {
            System.out.println("Welcome, User!");
            realisationListForSelectingActionsForUser.ImplementationListForSelectingActionsUser();
        } else {
            System.out.println("Error! Password incorrect!");
            methodForLoginInSystemAdmin();
        }
    }
}
