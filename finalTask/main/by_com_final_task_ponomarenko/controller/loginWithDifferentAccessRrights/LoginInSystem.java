package main.by_com_final_task_ponomarenko.controller.loginWithDifferentAccessRrights;

import main.by_com_final_task_ponomarenko.service.realisationListForSelectingActions.RealisationListForSelectingActionsForAdmin;
import main.by_com_final_task_ponomarenko.service.realisationListForSelectingActions.RealisationListForSelectingActionsForUser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginInSystem {
    private RealisationListForSelectingActionsForAdmin realisationListForSelectingActionsForAdmin = new RealisationListForSelectingActionsForAdmin();
    private RealisationListForSelectingActionsForUser realisationListForSelectingActionsForUser = new RealisationListForSelectingActionsForUser();

    private int passwordAdmin = 1234;
    private int passwordUser = 5555;

    public void methodForLoginInSystemAdmin() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter password: ");
            int i = sc.nextInt();
            if (passwordAdmin == i) {
                System.out.println("Welcome, Admin!");
                realisationListForSelectingActionsForAdmin.cycleForAdmin();

            } else if (passwordUser == i) {
                System.out.println("Welcome, User!");
                realisationListForSelectingActionsForUser.cycleForUser();
            } else {
                System.out.println("Error! Password incorrect!");
                methodForLoginInSystemAdmin();
            }
        } catch (NumberFormatException | InputMismatchException e){
            System.err.println(e.getMessage() + " This is not number");
            methodForLoginInSystemAdmin();
        }
    }
}
